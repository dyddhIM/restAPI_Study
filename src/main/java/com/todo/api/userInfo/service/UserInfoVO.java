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

}
