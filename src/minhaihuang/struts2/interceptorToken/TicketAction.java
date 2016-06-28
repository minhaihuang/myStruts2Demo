package minhaihuang.struts2.interceptorToken;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户类，要求用户的名字不能相同，用token拦截器防止表单的重复提交
 * 
 * @author 黄帅哥
 * 
 */
public class TicketAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		//获取用户名。必须用此方法才能获取到，用set和get方法不行
		String username=ServletActionContext.getRequest().getParameter("username");
		//将用户名设置到request中
		ServletActionContext.getRequest().setAttribute("username", username);
		return "success";
	}

}
