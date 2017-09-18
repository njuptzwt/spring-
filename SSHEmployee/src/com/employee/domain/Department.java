package com.employee.domain;

import java.util.HashSet;
import java.util.Set;
//部门员工信息
public class Department {
private Integer Did;//部门号
private String Dname;//部门名称
private String Description;
private Set<Employee> employeeset=new HashSet<Employee>();//一个部门包含了员工的信息

/**
 * @return the employeeset
 */
public Set<Employee> getEmployeeset() {
	return employeeset;
}
/**
 * @param employeeset the employeeset to set
 */
public void setEmployeeset(Set<Employee> employeeset) {
	this.employeeset = employeeset;
}
/**
 * @return the did
 */
public Integer getDid() {
	return Did;
}
/**
 * @param did the did to set
 */
public void setDid(Integer did) {
	Did = did;
}
/**
 * @return the dname
 */
public String getDname() {
	return Dname;
}
/**
 * @param dname the dname to set
 */
public void setDname(String dname) {
	Dname = dname;
}
/**
 * @return the description
 */
public String getDescription() {
	return Description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	Description = description;
}
public Department(Integer did, String dname, String description) {
	super();
	Did = did;
	Dname = dname;
	Description = description;
}
public Department() {
	super();
}

}
