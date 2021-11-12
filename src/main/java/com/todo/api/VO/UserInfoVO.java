package com.todo.api.VO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoVO {

	// 아이디
	private String userId;

	// 비밀번호
	private String password;

	// 이름
	private String name;

	// 핸드폰
	private String cellPhone;

	// 생년월일
	private int birthDay;

	// 입력날짜
	private String registDate;

	// 변경일자
	private String changeDate;

	// 존재여부
	private String chkAt;

	// 친구목록 화면에서 검색을 위해 입력한 키워드
	private String searchKeyword;

	// 친구 표시 여부
	private String friendShowAt;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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
