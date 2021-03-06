package minhaihuang.struts2.test08_validator;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 基于配置文件的数据校验方法
 * @author 黄帅哥
 *
 */
public class RegisterStudentXMLAction extends ActionSupport {
	private String studentName=null;
	private String password=null;
	private String rePassword=null;
	
	//填充数据
	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRePassword() {
		return rePassword;
	}



	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	//数据校验器
	@Override
	public void validate() {
		if(!password.equals(rePassword)){
			this.addFieldError("error", "password must the same as rePassword");
		}
		super.validate();
	}

	/**
	 * 注册一个学生
	 * @return
	 * @throws Exception
	 */
	public String execute() throws Exception {
		
		return "success";
	}
}
