package com.hcl.employeemanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.employeemanagementapi.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
