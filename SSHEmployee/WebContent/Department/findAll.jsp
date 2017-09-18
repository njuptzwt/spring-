<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<a
		href="${pageContext.request.contextPath }/Department/addDepartment.jsp">
		<img src="${pageContext.request.contextPath }/Imags/add.jpg"
		width="10">
	</a>
	<table>
		<tr>
			<th>部门号</th>
			<th>部门名称</th>
			<th>部门简介</th>
			<th>删除</th>
			<th>编辑</th>
		</tr>

		<!-- 遍历传出的数据 -->
		<s:iterator value="#session.pagebean.list" var="de">
			<tr>
				<td><s:property value="#de.Did" /></td>
				<td>
					<!-- 固定的格式去传递值和参数 --> <s:url var="modify" namespace="/Department"
						action="Department_modify">
						<s:param name="Did" value="#de.Did"></s:param>
					</s:url> <s:a href="%{modify}" target="right">
						<s:property value="#de.Dname" />
					</s:a>
				</td>
				<td><s:property value="#de.Description"></s:property></td>
				<td>
					<!--  这样做没问题！！！！参数传递--> <s:url var="delete" namespace="/Department"
						action="Department_delete">
						<s:param name="Did" value="#de.Did"></s:param>
					</s:url> <s:a href="%{delete}" target="right"
						onclick="javascript:return confirm('真的要删除嘛？');">删除</s:a>
				</td>
				<td><s:url var="modify" namespace="/Department"
						action="Department_modify">
						<s:param name="Did" value="#de.Did"></s:param>
					</s:url> <s:a href="%{modify}" target="right">编辑</s:a></td>
			</tr>
		</s:iterator>
	</table>
	<table border="0" cellspacing="0" cellpadding="0" align="center">
		<tr>
			<td align="right"><span>第<s:property
						value="#session.pagebean.curpage" />/<s:property
						value="#session.pagebean.totalpage" />页
			</span>&nbsp;&nbsp; <span>总共<s:property
						value="#session.pagebean.totalpage" />页
			</span>&nbsp;&nbsp; <span>每页<s:property
						value="#session.pagebean.pagesize" />记录
			</span>&nbsp;&nbsp;<span>总共<s:property
						value="#session.pagebean.totalcount" />记录 &nbsp;&nbsp;
			</span> <span> <!-- 首页 --> 
			<!--<s:url var="findAll"
						namespace="/Department" action="Department_findAll">
						<s:param name="currpage" value="#session.pagebean.curpage=1"></s:param>
					</s:url> <s:a href="%{findAll}" target="right">首页</s:a> -->
					<!-- 上一页 --> 
					<!--<s:url
						var="findAll" namespace="/Department" action="Department_findAll">
						<s:param name="currpage" value="#session.pagebean.curpage-1"></s:param>
					</s:url> <s:a href="%{findAll}" target="right">上一页</s:a>-->
					<!-- 尾页 --> <!--<s:url var="findAll" namespace="/Department"
							action="Department_findAll">
							<s:param name="currpage" value="#session.pagebean.curpage+1"></s:param>
						</s:url>
						<s:a href="%{findAll}" target="right">下一页</s:a>--> <!-- 下一页 -->
						<!-- 首页 -->
						<a href="Department_findAll?currpage=<s:property value="#session.pagebean.curpage+1"/>">下一页</a>
					    <!-- 尾页 --> <!-- 尾页另一种表达方式 --> <!--<s:url var="findAll" namespace="/Department"
							action="Department_findAll">
							<s:param name="currpage" value="#session.pagebean.totalpage"></s:param>
						</s:url>
						<s:a href="%{findAll}" target="right">尾页</s:a>--> <a
					    href="Department_findAll?currpage=<s:property value="#session.pagebean.totalpage"/>">尾页</a>
						
						 <a href="Department_findAll?currpage=<s:property value="#session.pagebean.curpage=1"/>">首页</a>
						 <a href="Department_findAll?currpage=<s:property value="#session.pagebean.curpage-1"/>">上一页</a>
					    
			</span></td>
		</tr>
	</table>
</body>
</html>