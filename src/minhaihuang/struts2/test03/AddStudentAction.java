package minhaihuang.struts2.test03;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class AddStudentAction extends ActionSupport{
	

	@Override
	public String execute() throws Exception {
		
		return "dispatcherSuccess";//跳转页面
	}
	
	
}
