package com.todo.api.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.api.VO.UserInfoVO;

@Service
public interface UserService {
	public List<UserInfoVO> selectList(UserInfoVO userInfoVO) throws Exception;

	public void insertUserRegest(UserInfoVO userInfoVO) throws Exception;

	public List<UserInfoVO> selectUserInfo(UserInfoVO userInfoVO) throws Exception;

	public String selectUserIdAt(UserInfoVO userInfoVO) throws Exception;

}
