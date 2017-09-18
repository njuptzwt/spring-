<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加部门</title>
</head>
<body>
<s:form action="Department_add" namspace="/Department" name="addDepartmentForm">
<s:textfield label="部门名称:" name="Dname"></s:textfield>
<s:textfield label="部门简述:" name="Description"></s:textfield>
<s:submit value="添加"></s:submit>
</s:form>
</body>
</html>