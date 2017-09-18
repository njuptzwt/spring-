<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>访问登陆界面</title>
</head>
<body>
<img src="${pageContext.request.contextPath}/Imags/1.jpg"  alt="唯美背景图">
<h1 align="center">登陆界面</h1>
<s:form action="Employee_login" method="post" namespace="/Employee" theme="simple">
<s:actionerror/>
<table border="1" width="400" align="center">
<tr>
<td><s:label>用户名:</s:label></td>
<td><input type="text" name="username"></input></td>
</tr>
<tr>
<td><s:label>密码:</s:label></td>
<td><s:password name="password"></s:password></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="登陆"></td>
</tr>
</table>
</s:form>
</body>
</html>