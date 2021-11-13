package com.todo.api.userInfo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todo.api.userInfo.service.UserInfoVO;
import com.todo.api.userInfo.service.UserService;

@RestController
@RequestMapping("/api/todo")
public class ApiUserInfoController {
	// private static final Logger logger = LoggerFactory.getLogger(ApiUserController.class);

	@Autowired
	private UserService userService;

	// 회원가입
	@PostMapping(value = "/user/userRegist")
	public ModelAndView userRegist(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();

		userInfoVO.setUserId("insertTes1111");
		userInfoVO.setPassword("test");
		userInfoVO.setName("테스터");
		userInfoVO.setCellPhone("010-5633-1416");
		userInfoVO.setBirthDay(971229);

		userService.insertUserRegest(userInfoVO);
		modelAndView.addObject("registMessage", "회원가입을 완료했습니다.");
		modelAndView.setViewName("jsonView");
		return modelAndView;
	}

	// 유저ID 존재여부 조회
	// @RequestMapping(value = "user/selectUserIdAt.do", method = RequestMethod.GET)
	@GetMapping(value = "/user/selectUserIdAt")
	public ModelAndView selectUserIdAt(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView("jsonView");

		userInfoVO.setUserId("dyddh1253");

		userInfoVO.setChkAt(userService.selectUserIdAt(userInfoVO));

		if (userInfoVO.getChkAt().equals("Y")) {
			modelAndView.addObject("chkMessage", "사용 가능한 ID 입니다.");
		} else {
			modelAndView.addObject("chkMessage", "사용 불가능한 ID 입니다.");
		}

		return modelAndView;
	}

	// 유저 정보 조회
	// @RequestMapping(value = "user/select.do", method = RequestMethod.GET)
	@GetMapping(value = "/user/userInfo")
	public ModelAndView selectUserInfo(UserInfoVO userInfoVO) throws Exception {

		userInfoVO.setUserId("dyddh1253");
		List<UserInfoVO> list = userService.selectUserInfo(userInfoVO);

		ModelAndView modelAndView = new ModelAndView("jsonView");

		modelAndView.addObject("userInfoSelect", list);

		return modelAndView;
	}

	@PutMapping(value = "/user/userInfo")
	public ModelAndView updateUserInfo(UserInfoVO userInfoVO) {
		ModelAndView modelAndView = new ModelAndView("jsonView");
		try {
			userInfoVO.setUserId("dyddh1253");
			userInfoVO.setPassword("updatePassword");
			userInfoVO.setName("정보수정");
			userInfoVO.setBirthDay(111111);
			userInfoVO.setCellPhone("111-1111-1111");

			userService.updateUserInfo(userInfoVO);
			modelAndView.addObject("updateMessage", "개인정보 수정이 완료되었습니다.");
			return modelAndView;

		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.addObject("updateMessage", "개인정보 수정에 실패했습니다.");
			return modelAndView;
		}

	}
}