package demo.controller;

import demo.model.Employee;
import demo.service.EmployeeService;
import demo.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeServiceImpl();

		// creating employee obj to insert data into db
		Employee emp = new Employee(123,"safwan",78945.00, "hyd");
		service.addEmployee(emp);
//		
//		Employee employee = service.findbyEmployeeId(123);
//		System.out.println(employee);

//		Employee.setEmpsal(78545);
//		Employee.setEmpadd("kurnool");

		// to update employee data
//		service.updateEmployee(emp);

		// to delete the data in the table
		// service.deleteEmployee(employee);

	}

}