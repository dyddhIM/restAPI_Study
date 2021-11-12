package com.todo.api.userAdd.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDao;
import com.todo.api.VO.UserInfoVO;
import com.todo.api.userAdd.service.UserAddService;

@Service
public class UserAddServiceImpl implements UserAddService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	@Override
	public void userFriendAdd(UserInfoVO userInfoVo) throws Exception {
		todoDao.inert("", userInfoVo);
	}

	@Override
	public List<UserInfoVO> selectFriendList(UserInfoVO userInfoVO) throws Exception {
		return todoDao.list("", userInfoVO);
	}

	@Override
	public void updateUserAddSetting(UserInfoVO userInfoVO) throws Exception {
		todoDao.update("", userInfoVO);

	}

}
