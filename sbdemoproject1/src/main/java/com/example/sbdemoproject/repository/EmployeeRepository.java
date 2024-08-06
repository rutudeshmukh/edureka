package com.example.sbdemoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbdemoproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
