package com.todo.api.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class commonVO {

	// 사용자
	private String userId;

	// 입력날짜
	private String registDate;

	// 변경일자
	private String changeDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

	public String getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	
}
