package com.todo.api.userFriends.service;

import java.util.List;

import com.todo.api.userInfo.service.UserInfoVO;

public interface FriendService {

	// 친구 등록
	public void userFriendAdd(UserInfoVO userInfoVo) throws Exception;

	// 친구 목록 조회
	public List<UserInfoVO> selectFriendList(UserInfoVO userInfoVO) throws Exception;

	// 친구 관리
	public void updateUserAddSetting(UserInfoVO userInfoVO) throws Exception;
}
