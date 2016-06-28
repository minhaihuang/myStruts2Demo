package minhaihuang.struts2.domain;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class AddSchoolAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		
		return "dispatcherSuccess";
	}

}
