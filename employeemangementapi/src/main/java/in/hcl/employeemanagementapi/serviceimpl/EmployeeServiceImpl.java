package in.hcl.employeemanagementapi.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import in.hcl.employeemanagementapi.domain.Employee;
import in.hcl.employeemanagementapi.repository.EmployeeRepository;
import in.hcl.employeemanagementapi.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllemployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
					}else {
						throw new RuntimeException(" Employee not found for id ::" + id);
					}
		return employee;
						
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
		
	}

}
