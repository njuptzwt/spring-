<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action=" " method="post" enctype="multipart/form-data"
		namespace="/test1">
		<s:textfield label="姓名" name="username" tooltip="Enter your Name here" />
		<s:password label="密码" name="password" />
		<s:textarea label="备注" name="remark" cols="20" rows="3"
			tooltip="Enter your remark" />
		<!-- 数据前台设置 -->
		<s:select label="性别" name="gender" list="#{1:'男',2:'女'}" listKey="key"
			listValue="value" value="#{2:'女'}" emptyOption="true" headerKey="-1"
			headerValue="--请选择性别--" tooltip="Choose your gender" />
			
			
			
		<s:combobox theme="simple" label="选择你喜欢的颜色" name="colorNames"
			headerValue="------请选择------" headerKey="1"
			list="{'红','橙','黄','绿','青','蓝','紫'}" />
		<s:checkboxlist name="hobby" label="兴趣"
			list="#{1:'football', 2:'music',3:'basketball', 4:'computer'}"
			listKey="key" listValue="value" tooltip="Choose your hobby" />
			
			<s:radio list="#{1:'男',2:'女'}" name="gender" label="性别" required="true" value="1"></s:radio>
		<s:checkbox name="age" label="年龄" value="18" fieldValue="yes"
			tooltip="Confirmed that your are Over 18" />
		<s:file label="上传" theme="simple" name="uploadfile" />
		<s:submit value="提交" />
		<s:reset value="重置" />
	</s:form>

</body>
</html>