package minhaihuang.struts2.i18n;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 登陆操作
 * @author 黄帅哥
 *
 */
public class LoginAction extends ActionSupport {
	private String username=null;


	public String getUsername() {
		return username;
	}
	//自动填充username
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String execute() throws Exception {
		//将用户设置到session中
		ServletActionContext.getRequest().getSession().setAttribute("username", username);
		return "loginSuccess";
	}
	
}
