package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.TestModel;
import com.example.demo.model.TestModelMapper;

@Repository
@Transactional
public class HandlerDaoImpl implements HandlerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void getById(String orderId) {
		// TODO Auto-generated method stub
		String sql = "select id, name from test1 where id =?";
		TestModel testModelMapper = (TestModel) jdbcTemplate.queryForObject(sql, new TestModelMapper(), "1");
		System.out.println("testModelMapper ID :: "+testModelMapper.getId());
		System.out.println("testModelMapper Name :: "+testModelMapper.getName());
		
	}

}
