package com.todo.DAO;

import java.util.List;

public interface TodoDao {

	public List list(String queryId, Object parameterObject) throws Exception;

	public void insert(String queryId, Object parameterObject) throws Exception;

	public Object selectOne(String queryId, Object parameterObject) throws Exception;

	public void update(String queryId, Object parameterObject) throws Exception;

	public int updateInt(String queryId, Object parameterObject) throws Exception;

	public void delete(String queryId, Object parameterObject) throws Exception;
}
