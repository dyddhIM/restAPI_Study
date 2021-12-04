package com.todo.api.userFriends.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDao;
import com.todo.api.userFriends.service.UserAddService;
import com.todo.api.userInfo.service.UserInfoVO;

@Service
public class UserAddServiceImpl implements UserAddService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	@Override
	public void userFriendAdd(UserInfoVO userInfoVo) throws Exception {
		todoDao.insert("", userInfoVo);
	}

	@Override
	public List<UserInfoVO> selectFriendList(UserInfoVO userInfoVO) throws Exception {
		return todoDao.list("friendInfoMapper.selectFriendList", userInfoVO);
	}

	@Override
	public void updateUserAddSetting(UserInfoVO userInfoVO) throws Exception {
		todoDao.update("", userInfoVO);

	}

}
