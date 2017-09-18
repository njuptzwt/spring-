package com.department.service;

import com.employee.domain.Department;
import com.employee.domain.PageBean;

public interface DepartmentService {
	//private PageBean pagebean;
public PageBean findByPage(int currpage);
public void delete(String sid);
public void update(Department da);
public void save();
public void add(Department department);
public Department FindByid(int id);

}
