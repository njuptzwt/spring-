package com.department.action;

import com.department.service.DepartmentService;
import com.employee.action.SuperAction;
import com.employee.domain.Department;
import com.employee.domain.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class DepartmentAction extends SuperAction implements ModelDriven<Department>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DepartmentService departmentService;
	private PageBean pagebean;
	private int id;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	private int currpage=3;//通过构造器的方式传入参数，这是Struts的用法，属性值相同和jsp页面
	
	/**
	 * @param currpage the currpage to set
	 */
	public void setCurrpage(int currpage) {
		System.out.println("被调用");
		this.currpage = currpage;
	}
	public int getCurrpage()
	{
		return this.currpage;
	}
	private Department department=new Department();
    /**
	 * @return the departmenrService
	 */
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	/**
	 * @param departmenrService the departmenrService to set
	 */
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public String findAll()
	{
		//int curpage=Integer.valueOf(currpage);
		System.out.println("执行了");
		PageBean<Department> pagebean=new PageBean<Department>();
		pagebean=departmentService.findByPage(currpage);
		System.out.println(pagebean);
		//session.setAttribute("pagebean", pagebean);
		ActionContext.getContext().getValueStack().push(pagebean);
		return "findAll";
	}
	//根据id获取对象
	public String FindByid()
	{
		Department de=departmentService.FindByid(id);
		System.out.println(de.getDescription());
		session.setAttribute("de", de);
		return "find_byid";
	}
	//修改
	public String delete()
	{
		String Did=request.getParameter("Did");
		departmentService.delete(Did);
		return "delete_success";
	}
	//编辑
	public String Update()
	{
		departmentService.update(department);
		return "modify_success";
	}
	//保存
	public String save()
	{
		return null;
	}
	//添加
	public String add()
	{
		departmentService.add(department);
		return "add_success";
	}
	@Override
	//Department的参数采用模型驱动的方式传入数据，也可以同样使用set方式传递值，前提是属性值和jsp页面的值应该一样
	public Department getModel() {
		// TODO Auto-generated method stub
		return this.department;
	}
	/* (non-Javadoc)
	 * @see com.employee.action.SuperAction#execute()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	

}
