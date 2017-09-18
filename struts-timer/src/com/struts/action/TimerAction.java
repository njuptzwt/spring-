package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class TimerAction extends ActionSupport {

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		for(int i=0;i<1000;i++)
		{
			System.out.println("i love you");
		}
		return SUCCESS;
	}

}
