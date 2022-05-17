package com.hcl.employeemanagementapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.employeemanagementapi.domain.Employee;
import com.hcl.employeemanagementapi.repository.EmployeeRepository;
import com.hcl.employeemanagementapi.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllemployees() {
		return employeeRepository.findAll();
	}

}
