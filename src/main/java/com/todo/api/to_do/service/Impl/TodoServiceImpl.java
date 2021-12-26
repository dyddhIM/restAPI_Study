package com.todo.api.to_do.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDao;
import com.todo.api.to_do.service.TodoService;
import com.todo.api.to_do.service.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	@SuppressWarnings("unchecked")
	@Override
	public List<TodoVO> selectTo_dos(TodoVO todoVO) throws Exception {
		return todoDao.list("to_doMapper.selectTodoTypeList", todoVO);
	}

	@Override
	public void insertTo_do(TodoVO todoVO) throws Exception {
		todoDao.insert("to_doMapper.insertTo_do", todoVO);
	}

	@Override
	public TodoVO selectTo_doInfo(TodoVO todoVO) throws Exception {
		return (TodoVO) todoDao.selectOne("to_doMapper.selectTo_doInfo", todoVO);
	}

	@Override
	public void updateTo_do(TodoVO todoVO) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTo_do(TodoVO todoVO) throws Exception {
		todoDao.delete("to_doMapper.deleteTo_do", todoVO);
	}

}
