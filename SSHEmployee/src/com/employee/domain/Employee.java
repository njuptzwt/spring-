package com.employee.domain;

import java.util.Date;

public class Employee {
private Integer eid;
private String ename;
private String gender;
private Date joindate;
private Date birthday;
private String eno;//工号
private String username;
private String password;
//外键,所属于的部门
private Department department;
/**
 * @return the eid
 */
public Integer getEid() {
	return eid;
}
/**
 * @param eid the eid to set
 */
public void setEid(Integer eid) {
	this.eid = eid;
}
/**
 * @return the ename
 */
public String getEname() {
	return ename;
}
/**
 * @param ename the ename to set
 */
public void setEname(String ename) {
	this.ename = ename;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return the joindate
 */
public Date getJoindate() {
	return joindate;
}
/**
 * @param joindate the joindate to set
 */
public void setJoindate(Date joindate) {
	this.joindate = joindate;
}
/**
 * @return the birthday
 */
public Date getBirthday() {
	return birthday;
}
/**
 * @param birthday the birthday to set
 */
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
/**
 * @return the eno
 */
public String getEno() {
	return eno;
}
/**
 * @param eno the eno to set
 */
public void setEno(String eno) {
	this.eno = eno;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the department
 */
public Department getDepartment() {
	return department;
}
/**
 * @param department the department to set
 */
public void setDepartment(Department department) {
	this.department = department;
}
public Employee(Integer eid, String ename, String gender, Date joindate, Date birthday, String eno, String username,
		String password, Department department) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.gender = gender;
	this.joindate = joindate;
	this.birthday = birthday;
	this.eno = eno;
	this.username = username;
	this.password = password;
	this.department = department;
}
public Employee() {
	super();
}

}
