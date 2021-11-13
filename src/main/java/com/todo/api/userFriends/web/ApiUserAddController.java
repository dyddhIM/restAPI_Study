package com.todo.api.userFriends.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todo.api.userFriends.service.UserAddService;
import com.todo.api.userInfo.service.UserInfoVO;

@RestController
@RequestMapping("/todo/api")
public class ApiUserAddController {

	@Autowired
	UserAddService userAddService;

	// 친구대상자 리스트 조회
	// @RequestMapping(value = "frendsList.do", method = RequestMethod.POST)
	@GetMapping(value = "frendsList.do")
	public ModelAndView userAddSelectList(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();

		List<UserInfoVO> list = userAddService.selectFriendList(userInfoVO);

		modelAndView.addObject("friendList", list);
		modelAndView.setViewName("jsonView");
		return modelAndView;
	}

	// 친구 등록
	@RequestMapping(value = "user/userAdd.do", method = RequestMethod.POST)
	public ModelAndView userRegist(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();

		return modelAndView;
	}

	// 친구 목록 관리
	@RequestMapping(value = "user/userAddSetting.do", method = RequestMethod.POST)
	public ModelAndView userAddSetting(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
}
