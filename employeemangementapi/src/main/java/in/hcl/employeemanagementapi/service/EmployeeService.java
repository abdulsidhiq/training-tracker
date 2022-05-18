package in.hcl.employeemanagementapi.service;

import java.util.List;

import in.hcl.employeemanagementapi.domain.Employee;

public interface EmployeeService {
	
	List<Employee> getAllemployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

}
