package com.todo.api.userInfo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public void userRegist(UserInfoVO userInfoVO) throws Exception;

	public UserInfoVO selectUserInfo(UserInfoVO userInfoVO) throws Exception;

	public String selectUserIdUseAt(UserInfoVO userInfoVO) throws Exception;

	public void updateUserInfo(UserInfoVO userInfoVO) throws Exception;

}
