package com.todo.api.userInfo.service;

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

}
