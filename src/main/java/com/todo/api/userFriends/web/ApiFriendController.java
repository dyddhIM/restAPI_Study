package com.todo.api.userFriends.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todo.api.userFriends.service.FriendService;
import com.todo.api.userFriends.service.FriendVO;
import com.todo.api.userInfo.service.UserInfoVO;

@RestController
@RequestMapping("/api/todo")
public class ApiFriendController {

	@Autowired
	FriendService friendService;

	// 친구 리스트 조회
	// @RequestMapping(value = "frendsList.do", method = RequestMethod.POST)
	@GetMapping(value = "/friends")
	public ModelAndView userAddSelectList(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO, FriendVO friendVO) throws Exception {
		ModelAndView modelAndView = new ModelAndView("jsonView");
		
		userInfoVO.setUserId("test1");
		friendVO.setUserId(userInfoVO.getUserId());
		
		List<FriendVO> list = friendService.selectFriendList(friendVO);

		modelAndView.addObject("friendList", list);
		
		return modelAndView;
	}

	// 친구요청 대상 리스트 조회
	// 친구 테이블과 유저 테이블 조인하여 친구가 아닌 유저들을 조회 but, 자신은 제외
	// 추가 예정
	
	// 친구요청
	@PostMapping(value = "/friends/friendRequest")
	public ModelAndView friendRequest(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO, FriendVO friendVO) throws Exception {
		ModelAndView modelAndView = new ModelAndView("jsonView");
		
		friendVO.setUserId("tester1");
		friendVO.setFriendId("test6");

		try {
			friendService.insertUserFriendRegist(friendVO);
			modelAndView.addObject("message", "친구요청 성공");
		} catch (Exception e) {
			modelAndView.addObject("message", "친구요청 실패");
			e.printStackTrace();
		}
		
		return modelAndView;
	}

	// 친구요청한 목록
	@GetMapping(value = "/friends/friendsRequests")
	public ModelAndView friendsRequests(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO, FriendVO friendVO) throws Exception {
		ModelAndView modelAndView = new ModelAndView("jsonView");

		userInfoVO.setUserId("tester1");
		friendVO.setUserId(userInfoVO.getUserId());
		friendVO.setFriendRegistAt("AA");
		
		return new ModelAndView("/friend/friendRegist", "registList", friendService.selectFriendRequestAtList(friendVO));
	}
	
	// 친구요청받은 목록
	@GetMapping(value = "/friends/getFriendRequestes")
	public ModelAndView friendsRequestReceives(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO, FriendVO friendVO) throws Exception {
		ModelAndView modelAndView = new ModelAndView("jsonView");

		userInfoVO.setUserId("test6");
		friendVO.setUserId(userInfoVO.getUserId());
		friendVO.setFriendRegistAt("BB");
		
		return new ModelAndView("/friend/getFriendRequestes", "RequestList", friendService.selectFriendRequestAtList(friendVO));
	}
	
	//친구 관리 기능 수행
	@PutMapping(value = "/friends/friendManage")
	public ModelAndView friendManage (@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO, FriendVO friendVO) throws Exception {		
		ModelAndView modelAndView = new ModelAndView("jsonView");
		
		friendVO.setUserId("tester1");
		friendVO.setFriendId("test4");
		friendVO.setStateAt("N");
		
		try {
			if (friendVO.getStateAt()!= null ||friendVO.getStateAt()!="") {
				if(friendVO.getStateAt() == "Y") {
					// 친구요청 이력관리 테이블에 데이터 추가 ("Y")
					friendService.insertUserFriendRegist(friendVO);

					// 친구 테이블에 데이터 추가
					friendService.insertFriend(friendVO);
					modelAndView.addObject("message", "친구요청이 수락되었습니다."); 
				}
				else {
					// 친구요청 이력관리 테이블에 데이터 추가("N")
					friendService.insertUserFriendRegist(friendVO);
					modelAndView.addObject("message", "친구요청이 거절되었습니다."); 
				}
			}
		} catch (Exception e) {
			modelAndView.addObject("message", "친구요청 실패");
			e.printStackTrace();
		}
		
		
		return modelAndView;
	}
	
}
