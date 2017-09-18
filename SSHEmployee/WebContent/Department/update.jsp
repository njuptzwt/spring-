<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<s:form action="Department_Update" namspace="/Department" name="updateDepartmentForm">
部门号:<input type="text" name="Did" value='<s:property value="#session.de.Did"/>'>
部门名称：<input type="text" name="Dname" value='<s:property value="#session.de.Dname"/>'>
部门简介：<input type="text" name="Description" value='<s:property value="#session.de.Description"/>'>
<input type="submit" value="保存">
</s:form>
</body>
</html>