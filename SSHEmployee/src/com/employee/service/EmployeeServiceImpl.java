package com.employee.service;

import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeDaoInterface;
import com.employee.domain.Employee;
@Transactional
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	private EmployeeDaoInterface employeeDao;

	/**
	 * @return the emplyeeDao
	 */
	public EmployeeDaoInterface getEmployeeDao() {
		return employeeDao;
	}

	/**
	 * @param emplyeeDao the emplyeeDao to set
	 */
	public void setEmployeeDao(EmployeeDaoInterface employeeDao) {
		this.employeeDao = employeeDao;
	}
	public Employee login(Employee employee)
	{
	  return employeeDao.login(employee);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		employeeDao.delete();
	}
	
}
