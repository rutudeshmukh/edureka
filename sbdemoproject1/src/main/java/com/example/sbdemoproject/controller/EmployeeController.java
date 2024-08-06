package com.example.sbdemoproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbdemoproject.model.Employee;
import com.example.sbdemoproject.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService ser;
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return ser.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
		Optional<Employee> employee = ser.getEmployeeById(id);
		return employee.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employees) {
		return ser.saveEmployee(employees);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
	    Optional<Employee> employeeOptional = ser.getEmployeeById(id);
	    
	    if (employeeOptional.isEmpty()) {
	        return ResponseEntity.notFound().build();
	    }
	    Employee existingEmployee = employeeOptional.get();
	    existingEmployee.setName(updatedEmployee.getName());
	    existingEmployee.setSalary(updatedEmployee.getSalary());
	    existingEmployee.setSkill(updatedEmployee.getSkill());
	    Employee savedEmployee = ser.saveEmployee(existingEmployee);
	    return ResponseEntity.ok(savedEmployee);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		ser.deleteEmployee(id);
	}

}
