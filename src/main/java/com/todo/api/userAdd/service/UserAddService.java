package com.todo.api.userAdd.service;

import java.util.List;

import com.todo.api.VO.UserInfoVO;

public interface UserAddService {

	// 친구 등록
	public void userFriendAdd(UserInfoVO userInfoVo) throws Exception;

	// 친구등록할 대상 조회
	public List<UserInfoVO> selectFriendList(UserInfoVO userInfoVO) throws Exception;

	// 친구 관리
	public void updateUserAddSetting(UserInfoVO userInfoVO) throws Exception;
}
