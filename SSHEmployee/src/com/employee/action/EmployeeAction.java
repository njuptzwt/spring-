package com.employee.action;

import org.junit.Test;

import com.employee.domain.Employee;
import com.employee.service.EmployeeServiceInterface;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends SuperAction implements ModelDriven<Employee>{

	private EmployeeServiceInterface employeeService;
	private Employee employee=new Employee();
	/**
	 * @return the employeeService
	 */
	public EmployeeServiceInterface getEmployeeService() {
		return employeeService;
	}

	/**
	 * @param employeeService the employeeService to set
	 */
	public void setEmployeeService(EmployeeServiceInterface employeeService) {
		this.employeeService = employeeService;
	}

	public String login()
	{
		System.out.println(employee.getUsername());
		Employee loginEmployee=employeeService.login(employee);
		if(loginEmployee!=null)
		{
			session.setAttribute("login", loginEmployee);
			return "login_success";
		}
		else
		{
			this.addActionError("用户名或者密码错误");
			return INPUT;
		}
	}
//删除操作
	public String delete()
	{
		employeeService.delete();
		return null;
	}
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return this.employee;
	}
}
