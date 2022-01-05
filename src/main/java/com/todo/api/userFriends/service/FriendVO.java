package com.todo.api.userFriends.service;

import com.todo.api.common.commonVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FriendVO extends commonVO{
	
	private int seqSn;
	
	// 요청 대상이된 아이디
	private String requestId; 
	
	/**
	 * 신청 상태
	 * W : 대기
	 * Y : 승인
	 * N : 거절
	 * */ 
	private String stateAt;


	public int getSeqSn() {
		return seqSn;
	}

	public void setSeqSn(int seqSn) {
		this.seqSn = seqSn;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStateAt() {
		return stateAt;
	}

	public void setStateAt(String stateAt) {
		this.stateAt = stateAt;
	}

}
