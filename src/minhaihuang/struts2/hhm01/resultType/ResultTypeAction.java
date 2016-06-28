package minhaihuang.struts2.hhm01.resultType;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ResultTypeAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
	
		ServletActionContext.getRequest().setAttribute("username", "hhm");
		
//		return "disPatcherSuccess";//可以转发参数，类似于servlet中的request中的转发请求
//		return "redirectSuccess";//不可以转发参数，类似于servlet中的response重定向
//		return "actionRedirectSuccess";//重定向到另外一个action
		return "globalResultSuccess"; //跳转到全局result
	}
}
