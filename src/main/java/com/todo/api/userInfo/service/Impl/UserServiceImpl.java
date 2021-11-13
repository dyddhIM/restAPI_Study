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
	public void insertUserRegest(UserInfoVO userInfoVO) throws Exception {
		todoDao.insert("userInfoMapper.userRegistInsert", userInfoVO);
	}

	@Override
	public String selectUserIdAt(UserInfoVO userInfoVO) throws Exception {
		String IdCheckAt = (String) todoDao.selectOne("userInfoMapper.selectUserIdAt", userInfoVO);
		return IdCheckAt;
	}

	@Override
	public List<UserInfoVO> selectUserInfo(UserInfoVO userInfoVO) throws Exception {

		return todoDao.list("userInfoMapper.uerInfoSelect", userInfoVO);
	}

	@Override
	public String updateUserInfo(UserInfoVO userInfoVO) throws Exception {
		String updateMessage = "";
		todoDao.update("userInfoMapper.userInfoUpdate", userInfoVO);
		return updateMessage;
	}
}
