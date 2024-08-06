package com.org.sim.data.db;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.org.sim.data.model.Dish;

public class DBClass {
	
	DataSource dataSource; //A DataSource is part of the JDBC specification and is a generalized connection factory. 
	JdbcTemplate jdbcTemplate; // provides methods to query and update data in a database and is oriented toward relational databases.
	public DBClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("[DB] setter Injection on DataSource and JdbcTemplate intilizeds");
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//insert data into dish table 
	public void insertDish(Dish dish) {
	String sql = "insert into Dish values(null ,?,?)";
	
	int result = jdbcTemplate.update(sql, dish.getName(),dish.getPrice());
	System.out.println("Dish "+dish.getName()+"  Inserted in Table");
	}
	
	//update data into dish table 
	public int updateDish(Dish dish) {
		String sql = "update Dish set name='" +dish.getName()+"',price='" +dish.getPrice()+"' where disId='"+dish.getDishId()+"'";
		return jdbcTemplate.update(sql);
	}
	
	//delete data from table 
	public int delete(Dish dish) {
		String sql = "delete from Dish where disId = '"+dish.getDishId()+"'";
		return jdbcTemplate.update(sql);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
