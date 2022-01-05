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
import com.todo.api.userFriends.service.FriendVO;
import com.todo.api.userInfo.service.UserInfoVO;

@RestController
@RequestMapping("/api/todo")
public class ApiFriendController {

	@Autowired
	FriendService friendService;

	// 친구 리스트 조회
	// @RequestMapping(value = "frendsList.do", method = RequestMethod.POST)
	@GetMapping(value = "/frends")
	public ModelAndView userAddSelectList(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();
		
		userInfoVO.setUserId("tester1");
		List<UserInfoVO> list = friendService.selectFriendList(userInfoVO);

		modelAndView.addObject("friendList", list);
		modelAndView.setViewName("jsonView");
		return modelAndView;
	}

	// 친구요청 대상 리스트 조회
	// 친구 테이블과 유저 테이블 조인하여 친구가 아닌 유저들을 조회 but, 자신은 제외
	// 추가 예정
	
	// 친구요청
	@RequestMapping(value = "/friends/friendRequest", method = RequestMethod.POST)
	public ModelAndView friendRequest(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO, FriendVO friendVO) throws Exception {
		friendVO.setUserId("tester1");
		friendVO.setRequestId("test6");
		//friendVO.setStateAt("W");
		
		ModelAndView modelAndView = new ModelAndView();
		try {
			friendService.insertUserFriendRegist(friendVO);
			modelAndView.addObject("message", "친구추가 성공");
		} catch (Exception e) {
			modelAndView.addObject("message", "친구추가 실패"); 
		}
		modelAndView.setViewName("jsonView");
		return modelAndView;
	}

	// 친구요청한 목록
	@RequestMapping(value = "/friends/friendsRequests", method = RequestMethod.GET)
	public ModelAndView friendsRequests(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO, FriendVO friendVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();
		friendVO.setUserId("tester1");
		List<FriendVO> list  = friendService.selectFriendRegistList(friendVO);
		return new ModelAndView("/friend/friendRegist", "registList", friendService.selectFriendRegistList(friendVO));
	}
	
	// 친구요청받은 목록
		@RequestMapping(value = "/friends/getFriendRequestes", method = RequestMethod.GET)
		public ModelAndView friendsRequestReceives(@ModelAttribute("UserInfoVO") UserInfoVO userInfoVO, FriendVO friendVO) throws Exception {
			userInfoVO.setUserId("test6");
			friendVO.setRequestId(userInfoVO.getUserId());
			ModelAndView modelAndView = new ModelAndView();
			return new ModelAndView("/friend/getFriendRequestes", "RequestList", friendService.selectGetFriendsRequeste(friendVO));
		}
}
