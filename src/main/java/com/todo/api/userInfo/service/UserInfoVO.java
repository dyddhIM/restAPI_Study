package com.todo.api.userInfo.service;

import com.todo.api.common.commonVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoVO extends commonVO {

	// 비밀번호
	private String password;

	// 이름
	private String name;

	// 핸드폰
	private String cellPhone;

	// 생년월일
	private int birthDay;

	// 존재여부
	private String chkAt;

	// 친구목록 화면에서 검색을 위해 입력한 키워드
	private String searchKeyword;

	// 친구 표시 여부
	private String friendShowAt;
	
	private String userFrindAt;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getChkAt() {
		return chkAt;
	}

	public void setChkAt(String chkAt) {
		this.chkAt = chkAt;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public String getFriendShowAt() {
		return friendShowAt;
	}

	public void setFriendShowAt(String friendShowAt) {
		this.friendShowAt = friendShowAt;
	}

	
}
