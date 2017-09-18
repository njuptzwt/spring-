package com.department.dao;

import java.util.List;

import com.employee.domain.Department;

public interface DepartmentDao {
public Integer findCount();
public void delete(String Did);
public List<Department> find(int begin,int pageszie);
public void update(Department da);
public void add(Department de);
public void save();
public Department FingByid(int id);
}
