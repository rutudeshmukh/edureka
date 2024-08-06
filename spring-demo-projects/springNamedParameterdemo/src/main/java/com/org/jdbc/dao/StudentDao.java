package com.org.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.org.jdbc.model.Student;

public class StudentDao {

/*
 * Syntax of execute method of namedparameterjdbctemplate 
 * public T execute(String sql, Map map, PreparedStatementCallback psc)
 * */	
	private NamedParameterJdbcTemplate  namedParameterJdbcTemplate;

	public StudentDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		super();
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	@SuppressWarnings("rawtypes")
	public void insertStudentInfo(Student student) {
		String sql = " insert into Student values (:id , :name , :department)";//namedparameter
		
		Map<String , Object > map = new HashMap<String, Object>();
		
		map.put("id", student.getId());
		map.put("name", student.getName());
		map.put("department", student.getDepartment());
		
	   namedParameterJdbcTemplate.execute(sql, map, new PreparedStatementCallback() {

		@Override
		public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			return ps.executeUpdate();
		}
		   
	});
		
	}
}
