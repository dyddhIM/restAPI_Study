package com.todo.api.userFriends.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todo.api.userFriends.service.FriendService;
import com.todo.api.userInfo.service.UserInfoVO;

@RestController
@RequestMapping("/api/todo")
public class ApiFriendController {

	@Autowired
	FriendService userAddService;

	// 친구 리스트 조회
	// @RequestMapping(value = "frendsList.do", method = RequestMethod.POST)
	@GetMapping(value = "/frends")
	public ModelAndView userAddSelectList(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();
		
		userInfoVO.setUserId("tester1");
		List<UserInfoVO> list = userAddService.selectFriendList(userInfoVO);

		modelAndView.addObject("friendList", list);
		modelAndView.setViewName("jsonView");
		return modelAndView;
	}

	// 친구요청
	@RequestMapping(value = "/friends/friendRequest", method = RequestMethod.POST)
	public ModelAndView friendRequest(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();

		return modelAndView;
	}

	// 친구요청한 목록
	@RequestMapping(value = "friends/friendsRequests", method = RequestMethod.POST)
	public ModelAndView friendsRequests(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
	
	// 친구요청받은 목록
		@RequestMapping(value = "friends/friendsRequestReceives", method = RequestMethod.POST)
		public ModelAndView friendsRequestReceives(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

			ModelAndView modelAndView = new ModelAndView();
			return modelAndView;
		}
}
