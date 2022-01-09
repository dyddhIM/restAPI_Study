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
	public List<FriendVO> selectFriendList(FriendVO friendVO) throws Exception;

	/**
	 *  친구 관리
	 * @param userInfoVO
	 * @throws Exception
	 */
	public void updateUserAddSetting(FriendVO userInfoVO) throws Exception;
	
	/**
	 *  친구테이블에 데이터 추가
	 * @param friendVO
	 * @throws Exception
	 */
	public void insertFriend(FriendVO friendVO) throws Exception;

	/**
	 * 친구 요청
	 * @param friendVO
	 * @throws Exception
	 */
	public void insertUserFriendRegist(FriendVO friendVO) throws Exception;
	
	/**
	 * 친구요청 여부에 따른 목록조회
	 * @param friendVO
	 * @return
	 * @throws Exception
	 */
	public List<FriendVO> selectFriendRequestAtList(FriendVO friendVO) throws Exception;
	
	
	
	
	
	
}
