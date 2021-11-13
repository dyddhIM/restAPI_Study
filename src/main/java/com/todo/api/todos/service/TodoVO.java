package com.todo.api.todos.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoVO {

	// 번호
	private int seqSN;

	// 작성자 id
	private String userId;

	// 단위 (일, 주, 월 : D, W, M)
	private String todoUnit;

	// 제목
	private String todoTitle;

	// 내용
	private String todoContent;

	// 시작날짜
	private String todoBegin;

	// 종료 날짜
	private String todoEnd;

	// 완료여부
	private String todoSucessAt;

	private String todoChangeDt;

}
