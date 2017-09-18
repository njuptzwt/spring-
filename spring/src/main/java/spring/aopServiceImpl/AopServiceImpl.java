package spring.aopServiceImpl;

import javax.security.auth.login.AccountException;

import spring.aop.IAopService;

public class AopServiceImpl implements IAopService {
public String name;
	/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

	@Override
	public void withAop() throws Exception {
		// TODO Auto-generated method stub
System.out.println("有AOP函数运行。name：+name");
if(name.trim().length()==0)
{
	throw new AccountException("name属性不能为空");
}
	}

	@Override
	public void withoutAop() throws Exception{
		// TODO Auto-generated method stub
System.out.println("没有AOP函数运行");
	}

}
