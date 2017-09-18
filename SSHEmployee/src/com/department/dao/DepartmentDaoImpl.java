package com.department.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.employee.domain.Department;

public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {
//private HibernateTemplate hibernateTemplate;//setter依赖注入，通过HibernateTemplate的SessionFactory对象创建

	//private SessionFactory sessionFactory;
	
	@Override
	//这个方法有问题
	public Integer findCount() {
		System.out.println("执行了findcount");
		// TODO Auto-generated method stub
		String hql="from Department";
		//@SuppressWarnings("unchecked")
		@SuppressWarnings("unchecked")
		List<Department> list=(List<Department>) this.getHibernateTemplate().find(hql, null);
		//List<Long> list=(List<Long>) this.getHibernateTemplate().find(hql);
		//Integer count = (Integer)getHibernateTemplate().find(hql).listIterator().next();
		return (Integer)list.size();
	}

	@Override
	//分页算法中的实现，从开始序号到结束序号查找元素
	public List<Department> find(int begin, int pageszie) {
		// TODO Auto-generated method stub
		System.out.println("执行了find");
		DetachedCriteria criteria=DetachedCriteria.forClass(Department.class);//反射技巧
		@SuppressWarnings("unchecked")
		List<Department> list=(List<Department>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageszie);
		return list;
	}

	@Override
	public void delete(String Did) {
		 System.out.println("执行了删除");
		 Object p = this.getHibernateTemplate().load(Department.class, new Integer(Did));
		 this.getHibernateTemplate().delete(p);
		 //List<Department>list=(List<Department>) getHibernateTemplate().find("from Department");
		 System.out.println("删除成功");
	}

	@Override
	public void update(Department de) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(de);
	}

	@Override
	public void add(Department de) {
		// TODO Auto-generated method stub
		de.setDid(25);
		this.getHibernateTemplate().save(de);
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department FingByid(int id) {
		// TODO Auto-generated method stub
		Department department=this.getHibernateTemplate().get(Department.class, id);
		
		return department;
	}

}
