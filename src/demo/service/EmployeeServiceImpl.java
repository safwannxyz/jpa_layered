package demo.service;

import demo.model.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	// creating object(dao) in service
	EmployeeDao dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public Employee findbyEmployeeId(int empid) {
		Employee findEmp = dao.getEmployeeById(empid);
		return findEmp;
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

}
