package com.todo.api.userInfo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDao;
import com.todo.api.userInfo.service.UserInfoVO;
import com.todo.api.userInfo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	@Override
	public void userRegist(UserInfoVO userInfoVO) throws Exception {
		todoDao.insert("userInfoMapper.userRegist", userInfoVO);
	}

	@Override
	public String selectUserIdUseAt(UserInfoVO userInfoVO) throws Exception {
		String IdCheckAt = (String) todoDao.selectOne("userInfoMapper.selectUserIdUseAt", userInfoVO);
		return IdCheckAt;
	}

	@Override
	public UserInfoVO selectUserInfo(UserInfoVO userInfoVO) throws Exception {

		return (UserInfoVO) todoDao.selectOne("userInfoMapper.selectUserInfo", userInfoVO);
	}

	@Override
	public void updateUserInfo(UserInfoVO userInfoVO) throws Exception {
		todoDao.update("userInfoMapper.updateUserInfo", userInfoVO);
	}
}
