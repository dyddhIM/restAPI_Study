package com.api.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("TodoDao")
public class TodoDaoImpl extends SqlSessionDaoSupport implements TodoDao {

	@Autowired
	private SqlSessionTemplate mybatisSupport;

	@Autowired(required = false)
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		// TODO Auto-generated method stub
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public List list(String queryId, Object parameterObject) {
		return mybatisSupport.selectList(queryId, parameterObject);
	}

	@Override
	public void insert(String queryId, Object parameterObject) {
		mybatisSupport.insert(queryId, parameterObject);
	}

	@Override
	public void update(String queryId, Object parameterObject) {
		mybatisSupport.update(queryId, parameterObject);
	}

	@Override
	public void delete(String queryId, Object parameterObject) {
		mybatisSupport.delete(queryId, parameterObject);
	}

	@Override
	public Object selectOne(String queryId, Object parameterObject) {
		return mybatisSupport.selectOne(queryId, parameterObject);
	}

	@Override
	public int updateInt(String queryId, Object parameterObject) {
		return mybatisSupport.update(queryId);
	}

}
