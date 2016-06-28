package minhaihuang.struts2.test08_validator;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 身份证类的action类
 * @author 黄帅哥
 *
 */
public class IDAction extends ActionSupport {
	private String idNumber=null;

	public String getIdNumber() {
		return idNumber;
	}
	//获取值
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	@Override
	public String execute() throws Exception {
		
		return "registerSuccess";
	}
}
