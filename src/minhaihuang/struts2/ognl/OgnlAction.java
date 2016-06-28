package minhaihuang.struts2.ognl;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 测试ValueStack栈顶元素
 * 
 * @author 黄帅哥
 * 
 */
public class OgnlAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("username", "username in request");
		ServletActionContext.getServletContext().setAttribute("username", "username in application");
		ServletActionContext.getContext().getSession().put("username", "username in session");

		//获取valueStack对象
		ValueStack valueStack=ServletActionContext.getContext().getValueStack();
		valueStack.set("messageInValueStack", "message In ValueStack");
		
		//准备一个map对象，方便后台测试
		Map<String,String> genderMap=new HashMap<String,String>();
		genderMap.put("man", "男");
		genderMap.put("woman", "女");
		ServletActionContext.getRequest().setAttribute("genderMap", genderMap);
		
		return "success";
	}
	
	
}
