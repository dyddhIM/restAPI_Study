package com.todo.api.userFriends.service;

import java.util.List;

import com.todo.api.userInfo.service.UserInfoVO;

public interface FriendService {


	/**
	 * 친구 목록 조회
	 * @param userInfoVO
	 * @return
	 * @throws Exception
	 */
	public List<UserInfoVO> selectFriendList(UserInfoVO userInfoVO) throws Exception;

	/**
	 *  친구 관리
	 * @param userInfoVO
	 * @throws Exception
	 */
	public void updateUserAddSetting(UserInfoVO userInfoVO) throws Exception;

	/**
	 * 친구 요청
	 * @param friendVO
	 * @throws Exception
	 */
	public void insertUserFriendRegist(FriendVO friendVO) throws Exception;
	
	/**
	 * 친구요청목록
	 * @param friendVO
	 * @return
	 * @throws Exception
	 */
	public List<FriendVO> selectFriendRegistList(FriendVO friendVO) throws Exception;
	
	
	/**
	 * 친구요청받은 목록
	 * @param friendVO
	 * @return
	 * @throws Exception
	 */
	public List<FriendVO> selectGetFriendsRequeste(FriendVO friendVO) throws Exception;
	
	
	
}
