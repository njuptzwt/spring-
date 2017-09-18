package com.struts.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
//登陆拦截器设计
public class loginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation innovation) throws Exception {
		// TODO Auto-generated method stub
	  ActionContext actioncontext=ActionContext.getContext();
	  Map<String,Object> session=actioncontext.getSession();
	  if(session.get("Logininfo")!=null)
	  {
		  System.out.println(session.get("Logininfo"));
		  String result=innovation.invoke();
		  return result;
	  }
	  else
		  return "login";
	}

}
