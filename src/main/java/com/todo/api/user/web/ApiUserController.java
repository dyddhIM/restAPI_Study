package com.todo.api.user.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todo.api.VO.UserInfoVO;
import com.todo.api.user.service.UserService;

@RestController
@RequestMapping("api")
public class ApiUserController {
	// private static final Logger logger = LoggerFactory.getLogger(ApiUserController.class);

	@Autowired
	private UserService userService;

	// 회원가입
	@RequestMapping(value = "user/userRegist.do", method = RequestMethod.POST)
	public ModelAndView userRegist(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();

		userInfoVO.setUserId("insertTes1111");
		userInfoVO.setPassword("test");
		userInfoVO.setName("테스터");
		userInfoVO.setCellPhone("010-5633-1416");
		userInfoVO.setBirthDay(19971229);

		userService.insertUserRegest(userInfoVO);
		modelAndView.addObject("registMessage", "회원가입을 완료했습니다.");
		modelAndView.setViewName("jsonView");
		return modelAndView;
	}

	// 유저ID 존재여부 조회
	// @RequestMapping(value = "user/selectUserIdAt.do", method = RequestMethod.GET)
	@GetMapping(value = "user/selectUserIdAt.do")
	public ModelAndView selectUserIdAt(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();

		userInfoVO.setUserId("dyddh1253");

		userInfoVO.setChkAt(userService.selectUserIdAt(userInfoVO));

		if (userInfoVO.getChkAt().equals("Y")) {
			modelAndView.addObject("chkMessage", "사용 가능한 ID 입니다.");
		} else {
			modelAndView.addObject("chkMessage", "사용 불가능한 ID 입니다.");
		}
		modelAndView.setViewName("jsonView");

		return modelAndView;
	}

	// 유저 정보 조회
	// @RequestMapping(value = "user/select.do", method = RequestMethod.GET)
	@GetMapping(value = "user/select.do")
	public ModelAndView select(UserInfoVO userInfoVO) throws Exception {

		userInfoVO.setUserId("dyddh1253");
		List<UserInfoVO> list = userService.selectUserInfo(userInfoVO);

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("userInfoSelect", list);
		modelAndView.setViewName("jsonView");

		return modelAndView;
	}
}