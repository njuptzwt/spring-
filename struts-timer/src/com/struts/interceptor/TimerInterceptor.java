package com.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation innvocation) throws Exception {
		// TODO Auto-generated method stub
		Long start=System.currentTimeMillis();
		//执行下一个拦截器，如果是最后一个拦截器那么久看也一执行目标的action,这个result的结果是Action中的返回值！！视图。
		String result=innvocation.invoke();
		//拦截器结束
		Long end=System.currentTimeMillis();
		System.out.println("计算花费时间:"+(end-start)+"ms");
		return result;
	}

}
