package com.test;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowCountCallbackHandler;
public class sqlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Resource resource= new ClassPathResource("myspring.xml");
BeanFactory factory=new XmlBeanFactory(resource);
JdbcTemplate jt=(JdbcTemplate) factory.getBean("dbtest");
jt.execute(SqlStatement.createsql);
jt.execute(SqlStatement.insertdata1);
jt.execute(SqlStatement.insertdata2);
jt.execute(SqlStatement.insertdata3);
RowCountCallbackHandler rcch=new RowCountCallbackHandler();
jt.query(SqlStatement.selectsql, rcch);
System.out.println("结果集中的列数量："+rcch.getColumnCount());
System.out.println("结果集中的行数量:"+rcch.getRowCount());
System.out.println("结果集中的结果：");
String []str=rcch.getColumnNames();
for(int i=0;i<str.length;i++)
{
	System.out.print(str[i]+" ");
	
}
final ArrayList list=new ArrayList();
jt.query(SqlStatement.selectsql, new RowCallbackHandler()
{
	public void processRow(ResultSet rs) throws SQLException
	{
		SpringtoResultSetInfo sri=new SpringtoResultSetInfo();
		sri.setId(rs.getInt(1));
		sri.setTemplatename(rs.getString(2));
		list.add(sri);
	}
}
);
for(int i=0; i<list.size();i++)
{
	SpringtoResultSetInfo sri=(SpringtoResultSetInfo) list.get(i);
	System.out.print("\n"+" "+sri.getId());
	System.out.print(" "+sri.getTemplatename());
	
}
System.out.println("\n 完成");
}
}
