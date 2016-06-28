package minhaihuang.struts2.test07;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 这是ipaction类
 * @author 黄帅哥
 *
 */
public class IpAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		//获取能访问的用户的用户名
		String username=ServletActionContext.getRequest().getParameter("username");
		//设置到session中
		ServletActionContext.getRequest().getSession().setAttribute("username", username);
		return "success";
	}
}
