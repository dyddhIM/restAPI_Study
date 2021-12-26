package com.todo.api.to_do.service;

import java.util.List;

public interface TodoService {

	public List<TodoVO> selectTo_dos(TodoVO todoVO) throws Exception;

	public void insertTo_do(TodoVO todoVO) throws Exception;

	public TodoVO selectTo_doInfo(TodoVO todoVO) throws Exception;

	public void updateTo_do(TodoVO todoVO) throws Exception;

	public void deleteTo_do(TodoVO todoVO) throws Exception;

}
