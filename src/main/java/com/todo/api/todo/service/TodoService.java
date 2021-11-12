package com.todo.api.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.api.VO.TodoVO;

@Service
public interface TodoService {

	public List<TodoVO> selectTypeTodoList(TodoVO todoVO) throws Exception;
 
	public void insertTypeTodo(TodoVO todoVO) throws Exception;   

}
