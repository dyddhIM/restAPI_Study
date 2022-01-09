package com.todo.api.userFriends.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDao;
import com.todo.api.userFriends.service.FriendService;
import com.todo.api.userFriends.service.FriendVO;
import com.todo.api.userInfo.service.UserInfoVO;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	
	@Override
	public void updateUserAddSetting(FriendVO friendVO) throws Exception {
		todoDao.update("", friendVO);
		
	}

	@Override
	public void insertUserFriendRegist(FriendVO friendVO) throws Exception {
		todoDao.insert("friendInfoMapper.userFriendReigst", friendVO);
	}
	
	@Override
	public void insertFriend(FriendVO friendVO) throws Exception {
		todoDao.insert("friendInfoMapper.insertFriend", friendVO);
	}
	
	@Override
	public List<FriendVO> selectFriendList(FriendVO friendVO) throws Exception {
		return todoDao.list("friendInfoMapper.selectFriendList", friendVO);
	}

	@Override
	public List<FriendVO> selectFriendRequestAtList(FriendVO friendVO) throws Exception {
		return todoDao.list("friendInfoMapper.selectFriendRequestAtList", friendVO);
	}

}
