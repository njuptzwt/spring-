package com.department.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.department.dao.DepartmentDao;
import com.employee.domain.Department;
import com.employee.domain.PageBean;
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
private DepartmentDao departmentDao;

/**
 * @return the departmentDao
 */
public DepartmentDao getDepartmentDao() {
	return departmentDao;
}

/**
 * @param departmentDao the departmentDao to set
 */
public void setDepartmentDao(DepartmentDao departmentDao) {
	this.departmentDao = departmentDao;
}

@Override
public PageBean<Department> findByPage(int currpage) {
	System.out.println("执行service");
	// TODO Auto-generated method stub
	PageBean<Department> pagebean=new PageBean<Department>();
	//封装当前页数
	pagebean.setCurpage(currpage);
	int pagesize=3;
	//封装当前页面大小
	pagebean.setPagesize(pagesize);
	//封装总的记录数
	Integer totalcount=departmentDao.findCount();//查找总记录数
	//int totalcount=8;
	pagebean.setTotalcount(totalcount);
	double tc=totalcount;
	//封装总的页数
	Double num=Math.ceil(tc/pagesize);
	pagebean.setTotalpage(num.intValue());
	//封装每一页的数据集合list
	int begin=(currpage-1)*pagesize;
	//System.out.println(begin);
	List<Department> list=departmentDao.find( begin,pagesize);
	pagebean.setList(list);
	return pagebean;
}

@Override
public void delete(String Did) {
	// TODO Auto-generated method stub
	departmentDao.delete(Did);
}

@Override
public void update(Department de) {
	// TODO Auto-generated method stub
	departmentDao.update(de);
}



@Override
public void save() {
	// TODO Auto-generated method stub
	
}

@Override
public void add(Department department) {
	// TODO Auto-generated method stub
	departmentDao.add(department);
}

@Override
public Department FindByid(int id) {
	// TODO Auto-generated method stub
	Department de=departmentDao.FingByid(id);
	return de;
}


}
