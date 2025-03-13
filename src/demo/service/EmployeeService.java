package demo.service;

import demo.model.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee emp);

	void updateEmployee(Employee emp);
	
	void deleteEmployee(Employee emp);
	
	Employee findbyEmployeeId(int empid);

	void commitTransaction();

	Employee getEmployeeById(int empid);
	
	
	

}
