package com.api.userInfo.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.common.AES128;
import com.api.user.service.UserInfoService;
import com.api.user.service.UserInfoVO;

@RestController
@RequestMapping("/users")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	// 시스템 사용자들의 id조회
	@GetMapping(value = "")
	public List userAllList()throws Exception{
		
		List<UserInfoVO> userIdInfoList = userInfoService.selectAllUserIdList();
		
		return userIdInfoList;
	}
	
	//사용자 등록
	@PostMapping(value = "")
	public Map<String, String> userRegist(@RequestBody UserInfoVO userInfoVO)throws Exception{
		Map<String, String> map = new HashMap();
		
		AES128 aes128 = new AES128(128);
		try {
			
			userInfoVO.setUserPw(aes128.encrypt(userInfoVO.getUserPw()));
			
			userInfoService.registUserInfo(userInfoVO);
			
			map.put("userRegistMessage", "사용자 등록이 완료되었습니다.");
		} catch (Exception e) {
			map.put("userRegistMessage", "회원등록을 실패했습니다.");
			e.printStackTrace();
		}	
		return map;
	}
	
	
	// 유저정보 조회
	@GetMapping(value = "/{userId}")
	public UserInfoVO UserInfoSelect (@PathVariable("userId")String userId) throws Exception {
		
		UserInfoVO userInfoVO = userInfoService.selectUserInfo(userId);
		return userInfoVO;
		
	}
	
	//사용자 정보관리(수정)
	@PutMapping(value = "/{userId}")
	public Map<String, String> UserInfoUpdate (@PathVariable("userId")String userId,
			@RequestBody UserInfoVO userInfoVO) {
		Map<String, String> updateResultMap = new HashMap();
		
		try {
				
			userInfoVO.setUserId(userId);
			
			/*NAEM = #{name},
					CELL_PHONE = #{cellPhone},
					BIRTH_DAY = #{birthDay},
			*/

			userInfoService.updateUserInfo(userInfoVO);
			
			updateResultMap.put("updateResult", "정보수정이 완료되었습니다.");
			
		} catch (Exception e) {			
			updateResultMap.put("updateResult", "정보수정 도중 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return updateResultMap;
		
	}
	
	//사용자 비밀번호 변경
	@PostMapping(value = "/password/{userId}")
	public Map<String, String> UserInfopWUpdate (@PathVariable("userId")String userId, 
				@RequestBody UserInfoVO userInfoVO) {
		Map<String, String> updateResultMap = new HashMap();
		
		AES128 aes128 = new AES128(128);
//		String pass = "";
//		String passAA = "" ; //암호화
//		String passBB = "" ; //복호화
//		pass = "gkgkgk!";
//		passAA = aes128.encrypt(pass); //암호화
//		passBB = passAA;
//		passBB = aes128.decrypt(passBB); //복호화
		
		try {
			userInfoVO.setUserId(userId);
			
			//userInfoVO = userInfoService.selectUserInfo(userId);
			
			
			userInfoVO.setUserPw(aes128.encrypt(userInfoVO.getUserPw()));

			userInfoService.userPasswordUpdate(userInfoVO);
			
			updateResultMap.put("updateResult", "비밀번호 변경이 완료되었습니다.");
			
		} catch (Exception e) {			
			updateResultMap.put("updateResult", "비밀번호 변경 도중 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return updateResultMap;
		
	}
	
	
	// 로그인 시도
	@GetMapping(value = "/singup/{userId}")
	public Map<String, String> userLogin(@PathVariable("userId")String userId,
			@RequestBody UserInfoVO userInfoVO){
		
		Map<String, String> userLoginMap = new HashMap();
		AES128 aes128 = new AES128(128);
		
		try {
			
			userInfoVO.setUserId(userId);
			
			userInfoVO.setUserPw(aes128.encrypt(userInfoVO.getUserPw()));
			userInfoVO = userInfoService.selectUserLogin(userInfoVO);
			
			if(userInfoVO!=null)
				userLoginMap.put("userLoginMessage", "로그인 성공!");
			else
				userLoginMap.put("userLoginMessage", "계정의 정보를 확인해주세요.");
			
		
		} catch (Exception e) {
			userLoginMap.put("userLoginMessage", "로그인 시도중에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return userLoginMap;
		
	}
	
	// 계정탈퇴
	@PatchMapping(value = "/secession/{userId}")
	public String userDelete (@PathVariable("userId")String userId) throws Exception{
		String message = "";
		
		try {
			//userInfoService.deleteUser(userId);
			userInfoService.deleteUserInfoUpdate(userId);
			message = "탈퇴되었습니다";
			
		} catch (Exception e) {
			message = "탈퇴도중 실패했습니다";
			e.printStackTrace();
		}
		return message;
	}
}
