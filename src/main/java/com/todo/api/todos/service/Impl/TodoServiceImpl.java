package com.todo.api.todos.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.todo.DAO.TodoDao;
import com.todo.api.todos.service.TodoService;
import com.todo.api.todos.service.TodoVO;

public class TodoServiceImpl implements TodoService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	@Override
	public List<TodoVO> selectTypeTodoList(TodoVO todoVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertTypeTodo(TodoVO todoVO) throws Exception {
		// TODO Auto-generated method stub

	}

}
