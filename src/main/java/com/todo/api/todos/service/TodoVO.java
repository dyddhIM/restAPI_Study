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

	public int getSeqSN() {
		return seqSN;
	}

	public void setSeqSN(int seqSN) {
		this.seqSN = seqSN;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTodoUnit() {
		return todoUnit;
	}

	public void setTodoUnit(String todoUnit) {
		this.todoUnit = todoUnit;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getTodoContent() {
		return todoContent;
	}

	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}

	public String getTodoBegin() {
		return todoBegin;
	}

	public void setTodoBegin(String todoBegin) {
		this.todoBegin = todoBegin;
	}

	public String getTodoEnd() {
		return todoEnd;
	}

	public void setTodoEnd(String todoEnd) {
		this.todoEnd = todoEnd;
	}

	public String getTodoSucessAt() {
		return todoSucessAt;
	}

	public void setTodoSucessAt(String todoSucessAt) {
		this.todoSucessAt = todoSucessAt;
	}

	public String getTodoChangeDt() {
		return todoChangeDt;
	}

	public void setTodoChangeDt(String todoChangeDt) {
		this.todoChangeDt = todoChangeDt;
	}


}
