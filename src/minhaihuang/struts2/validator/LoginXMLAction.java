package minhaihuang.struts2.validator;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 第二种数据校验模式，通过在当前包下定义一个名字为“该类名-validation.xml”的文件进行校验，在该文件中邪校验的代码
 * 
 * @author 黄帅哥
 * 
 */
public class LoginXMLAction extends ActionSupport {
	private String username = null;
	private String password = null;

	//填充数据
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

	
	@Override
	public String execute() throws Exception {

		return "loginSuccess";
	}
}
