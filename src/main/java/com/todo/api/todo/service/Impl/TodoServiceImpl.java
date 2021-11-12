package com.todo.api.todo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDao;
import com.todo.api.VO.TodoVO;
import com.todo.api.todo.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	@SuppressWarnings("unchecked")
	@Override
	public List<TodoVO> selectTypeTodoList(TodoVO todoVO) throws Exception {

		return todoDao.list("todoInfoMapper.todoTypeSelectList", todoVO);
	}

	@Override
	public void insertTypeTodo(TodoVO todoVO) throws Exception {
		todoDao.inert("todoInfoMapper.todoTypeInsert", todoVO);

	}

}
