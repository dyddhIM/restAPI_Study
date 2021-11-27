package com.todo.api.userInfo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public void insertUserRegest(UserInfoVO userInfoVO) throws Exception;

	public List<UserInfoVO> selectUserInfo(UserInfoVO userInfoVO) throws Exception;

	public String selectUserIdAt(UserInfoVO userInfoVO) throws Exception;

	public String updateUserInfo(UserInfoVO userInfoVO) throws Exception;

}
