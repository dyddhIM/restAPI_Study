package com.todo.api.todos.service;

import java.util.List;

public interface TodoService {

	public List<TodoVO> selectTypeTodoList(TodoVO todoVO) throws Exception;

	public void insertTypeTodo(TodoVO todoVO) throws Exception;

}
