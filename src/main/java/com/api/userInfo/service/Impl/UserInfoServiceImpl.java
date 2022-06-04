package com.api.userInfo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.DAO.TodoDao;
import com.api.user.service.UserInfoService;
import com.api.user.service.UserInfoVO;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;
	
	@Override
	public void registUserInfo(UserInfoVO userInfoVO) throws Exception {
		todoDao.insert("userInfoMapper.UserRegistUserInfo", userInfoVO);
	}
	
	@Override
	public UserInfoVO selectUserInfo(String userId) throws Exception {
		return (UserInfoVO) todoDao.selectOne("userInfoMapper.UserInfoSelect", userId);
	}


	@Override
	public void updateUserInfo(UserInfoVO userInfoVO) throws Exception {
		todoDao.update("userInfoMapper.UserInfoUpdate", userInfoVO);
	}


	@Override
	public void userPasswordUpdate(UserInfoVO userInfoVO) throws Exception {
		todoDao.update("userInfoMapper.UserPasswordUpdate", userInfoVO);
		
	}


	@Override
	public UserInfoVO selectUserLogin(UserInfoVO userInfoVO) throws Exception {
		return (UserInfoVO) todoDao.selectOne("userInfoMapper.UserLogin", userInfoVO);
	}

	@Override
	public List<UserInfoVO> selectAllUserIdList() throws Exception {
		return todoDao.list("userInfoMapper.UserIdList","" );
	}

	@Override
	public void deleteUser(String userId) throws Exception {
		todoDao.delete("userInfoMapper.UserDelete", userId);
	}

	@Override
	public void deleteUserInfoUpdate(String userId) throws Exception {
		todoDao.update("userInfoMapper.UserInfoDelete", userId);		
	}


	

}
