package com.data.springEmpCrudDemo.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.data.springEmpCrudDemo.model.Emp;

public class EmpDB {

	
	DataSource dataSource; 
	JdbcTemplate jdbcTemplate;
	public EmpDB() {
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
	
	public void saveEmployee(Emp e){  
	    String query= "insert into emp values(0,?,?,?) ";
	    int result = jdbcTemplate.update(query, e.getName(),e.getSalary(),e.getSkill());
		System.out.println("Employee "+e.getName()+"  Inserted in Table");
	
	}  
	
	public int updateEmployee(Emp e){  
	    String query="update emp set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Emp e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	public List<Emp> showAllEmp(Emp e) {
		String q = "select * from emp ";
		@SuppressWarnings("unchecked")
		List<Emp> e1 = jdbcTemplate.query(q,  new BeanPropertyRowMapper(Emp.class));
		return e1;
		
	}
}
