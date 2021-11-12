package com.todo.api.user.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDao;
import com.todo.api.VO.UserInfoVO;
import com.todo.api.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	@Override
	public List<UserInfoVO> selectList(UserInfoVO userInfoVO) throws Exception {
		return todoDao.list("", userInfoVO);
	}

	@Override
	public void insertUserRegest(UserInfoVO userInfoVO) throws Exception {
		todoDao.inert("userInfoMapper.userRegistInsert", userInfoVO);
	}

	@Override
	public List<UserInfoVO> selectUserInfo(UserInfoVO userInfoVO) throws Exception {

		return todoDao.list("userInfoMapper.uerInfoSelect", userInfoVO);
	}

	@Override
	public String selectUserIdAt(UserInfoVO userInfoVO) throws Exception {
		String at = (String) todoDao.selectOne("userInfoMapper.selectUserIdAt", userInfoVO);
		return at;
	}

}
