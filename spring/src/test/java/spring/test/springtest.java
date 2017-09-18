package spring.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.imook.spring.Person;

public class springtest {
	//private Person person;
	
@Test
public void testSpring()
{
	XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
	Person person=(Person)factory.getBean("person");
	person.eat();
	//person.setId("1");
	//person.setName("zheng");
	person.getFood().eatfood();
	System.out.println(person);
	factory.destroySingletons();
}
}
