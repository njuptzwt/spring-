package com.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String username;//用来接收外部传来的参数
	private String password;
	private Map<String,Object> session;//封装错误信息
	

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}


	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the passsword
	 */
	public String getPasssword() {
		return password;
	}


	/**
	 * @param passsword the passsword to set
	 */
	public void setPasssword(String password) {
		this.password = password;
	}
	public String login()
	{
		if("admin".equals(username)&&"123".equals(password))
		{
			session.put("Logininfo", username);
			return SUCCESS;
		}
		else
		{
			session.put("loginError", "用户名或者密码不正确");
			return ERROR;
		}
	}
}
