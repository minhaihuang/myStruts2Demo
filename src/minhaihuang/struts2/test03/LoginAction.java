package minhaihuang.struts2.test03;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletRequestAware{
	HttpServletRequest request=null;
	
	@Override
	public String execute() throws Exception {
		//获取学生姓名
		String studentName=request.getParameter("studentName");
		
		//因为是重定向，所以需要设置到session中
		request.getSession().setAttribute("studentName", studentName);
		
		
		return "redirectSuccess";
	}

	//获取request对象
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}

}
