package com.api.userInfo.service;

import com.api.common.commonVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoVO extends commonVO {

	// 사용자
	private String userId;
	
	// 이름
	private String name;
		
	// 비밀번호
	private String userPw;

	// 핸드폰
	private String cellPhone;

	// 생년월일
	private String birthDay;


	
}
