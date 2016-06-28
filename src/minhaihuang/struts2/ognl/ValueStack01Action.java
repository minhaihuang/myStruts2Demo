package minhaihuang.struts2.ognl;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 测试ValueStack栈顶元素
 * 
 * @author 黄帅哥
 * 
 */
public class ValueStack01Action extends ActionSupport {
	private String company = null;

	//自动填充数据
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("username", "username in request");
		ServletActionContext.getServletContext().setAttribute("username", "username in application");
		ServletActionContext.getContext().getSession().put("username", "username in session");

		//获取valueStack对象
		ValueStack valueStack=ServletActionContext.getContext().getValueStack();
		System.out.println("valueStack:"+valueStack);
		return "success";
	}
	
	
}
