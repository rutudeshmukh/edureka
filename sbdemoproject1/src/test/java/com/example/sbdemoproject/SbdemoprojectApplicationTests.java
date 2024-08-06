package com.example.sbdemoproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sbdemoproject.model.Employee;
import com.example.sbdemoproject.repository.EmployeeRepository;
import com.example.sbdemoproject.service.EmployeeService;

@DataJpaTest
@SpringBootTest
class SbdemoprojectApplicationTests {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeRepository emp;
	
	@Test
	public void testGetAllEmployee() {
		
	}
	
	@Test
	public void testGetEmployeeById() {
		
	}
	
	@Test 
	public void testSaveEmployee() {
		
	}
	
	@Test
	public void testUpdateEmployee() {
		Employee employee = emp.save(new Employee(123L,"Rutuja",12222.00,"Java"));
		//Optional<Employee> e= Optional.ofNullable(emp.findById(123L).get());
		employee.setName("Rutu");
        employee.setSalary(13999.00);
        employee.setSkill("Spring");

        Employee updatedEmployee = employeeService.updateEmployee(employee);
        
        assertNotNull(updatedEmployee);
        assertEquals("Rutu", updatedEmployee.getName());
        assertEquals(13999.00, updatedEmployee.getSalary());
        assertEquals("Spring", updatedEmployee.getSkill());
        
        Employee fetchedEmployee = emp.findById(employee.getEmpid()).orElse(null);
        assertNotNull(fetchedEmployee);
        assertEquals("Rutu", fetchedEmployee.getName());
        assertEquals(13999.00, fetchedEmployee.getSalary());
        assertEquals("Spring", fetchedEmployee.getSkill());
		
	}
	@Test
	void contextLoads() {
			
	}

}
