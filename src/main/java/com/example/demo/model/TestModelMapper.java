package com.example.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TestModelMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		TestModel testModel = new TestModel();
		testModel.setId(rs.getInt("id"));
		testModel.setName(rs.getString("name"));
		
		return testModel;
	}

}
