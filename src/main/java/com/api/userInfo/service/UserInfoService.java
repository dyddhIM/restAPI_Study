package com.api.userInfo.service;

import java.util.List;

import com.api.userInfo.service.UserInfoVO;

public interface UserInfoService {

	
	/*** 사용자들의 id조회*/
	public List<UserInfoVO> selectAllUserIdList() throws Exception;
	
	/*** 사용자 id 존재여부 체크*/
	public boolean userCheckAt(String userId)throws Exception;
	
	/*** 사용자 등록 */
	public void registUserInfo(UserInfoVO userInfoVO)throws Exception;

	/*** 사용자 정보 조회 */
	public UserInfoVO selectUserInfo(String userId) throws Exception;

	/*** 사용자 정보 수정 */
	public void updateUserInfo(UserInfoVO userInfoVO) throws Exception;

	/*** 사용자 비밀번호 변경 */
	public void userPasswordUpdate (UserInfoVO userInfoVO) throws Exception;

	/*** 사용자 로그인 시도 */
	public UserInfoVO selectUserLogin(UserInfoVO userInfoVO) throws Exception;

	/*** 사용자 탈퇴 */
	public void delUserInfoUpdate(String userId) throws Exception;
	
}
