package minhaihuang.struts2.validator;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 登陆操作
 * 
 * @author 黄帅哥
 * 
 */
public class LoginAction extends ActionSupport {
	private String username = null;
	private String password = null;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	/**
	 * 校验全部方法的拦截器，校验提交的数据是否符合指定规范,此方法在业务方法之前调用
	 */
	@Override
	public void validate() {
		if(username==null||username.trim().length()==0){
			this.addFieldError("username", "username must not be null");
		}
		
		if(password==null||password.length()<=6){
			this.addFieldError("password", "password must not be null and length must more than 6");
		}
		super.validate();
	}

	@Override
	public String execute() throws Exception {
		// 将用户设置到session中
		ServletActionContext.getRequest().getSession()
				.setAttribute("username", username);
		return "loginSuccess";
	}

}
