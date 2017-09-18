package com.employee.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.employee.domain.Department;
import com.employee.domain.Employee;
//hi使用getHibernateTemplate来去操作数据库对象，不用set方法注入
public class EmpolyeeDaoImpl extends HibernateDaoSupport implements EmployeeDaoInterface  {
	private List<Employee> employee;
	public Employee login(Employee Ep)
	{
     String hql="from Employee E where E.username=? and E.password=? ";
     employee=(List<Employee>) this.getHibernateTemplate().find(hql, Ep.getUsername(),Ep.getPassword());
     if(employee.size()>0)
     {
    	 return employee.get(0);
     }
     else
     {
    	 return null;
     }
	}
	public void delete()
	{
		String hql="from Department";
		List<Department> list=(List<Department>) this.getHibernateTemplate().find(hql, null);
		//List<Long> list=(List<Long>) this.getHibernateTemplate().find(hql);
		//Integer count = (Integer)getHibernateTemplate().find(hql).listIterator().next();
		//return (Integer)list.size();
		//String Eid="1";
		 System.out.println("执行了删除");
//		 Object p = getHibernateTemplate().load(Employee.class, new Integer(Eid));
//		 getHibernateTemplate().delete(p);
//		 List<Employee>list=(List<Employee>) getHibernateTemplate().find("from Employee");
		 System.out.println("删除成功");
	}
}
