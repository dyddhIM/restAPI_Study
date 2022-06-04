package com.api.user.service;

import java.util.List;

public interface UserInfoService {

	public List<UserInfoVO> selectAllUserIdList() throws Exception;
	
	public void registUserInfo(UserInfoVO userInfoVO)throws Exception;

	public UserInfoVO selectUserInfo(String userId) throws Exception;
	
	public void updateUserInfo(UserInfoVO userInfoVO) throws Exception;
	
	public void userPasswordUpdate (UserInfoVO userInfoVO) throws Exception;
	
	public UserInfoVO selectUserLogin(UserInfoVO userInfoVO) throws Exception;
	
	public void deleteUser(String userId) throws Exception;
	
	public void deleteUserInfoUpdate(String userId) throws Exception;
	
}
