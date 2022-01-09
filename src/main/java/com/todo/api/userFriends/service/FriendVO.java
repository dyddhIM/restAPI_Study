package com.todo.api.userFriends.service;

import com.todo.api.common.commonVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FriendVO extends commonVO{
	
	private int seqSn;
	
	/**
	 * 신청 상태
	 * W : 대기
	 * Y : 승인
	 * N : 거절
	 * */ 
	private String stateAt;

	// 친구 ID
	private String friendId;

	/**
	 * 친구요청 여부
	 * AA -> 친구 요청한 경우
	 * BB -> 친구 요청 받은경우
	 */
	private String friendRegistAt;
	
	
	

	public int getSeqSn() {
		return seqSn;
	}


	public void setSeqSn(int seqSn) {
		this.seqSn = seqSn;
	}
	
	public String getFriendId() {
		return friendId;
	}
	
	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getStateAt() {
		return stateAt;
	}

	public void setStateAt(String stateAt) {
		this.stateAt = stateAt;
	}


	public String getFriendRegistAt() {
		return friendRegistAt;
	}


	public void setFriendRegistAt(String friendRegistAt) {
		this.friendRegistAt = friendRegistAt;
	}

}
