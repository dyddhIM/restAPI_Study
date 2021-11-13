package com.todo.api.to_do.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDao;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	@Qualifier("TodoDao")
	private TodoDao todoDao;

	@Override
	public List<TodoVO> selectTo_dos(TodoVO todoVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertTo_dos(TodoVO todoVO) throws Exception {
		todoDao.insert("todoMapper.to_dosInsert", todoVO);
	}

	@Override
	public TodoVO selectTo_do(TodoVO todoVO) throws Exception {
		return (TodoVO) todoDao.selectOne("todoMapper.to_doInfoSelect", todoVO);
	}

	@Override
	public void updateTo_do(TodoVO todoVO) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTo_do(TodoVO todoVO) throws Exception {
		// TODO Auto-generated method stub

	}

}
