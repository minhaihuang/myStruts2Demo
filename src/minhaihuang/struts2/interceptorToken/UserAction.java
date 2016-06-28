package minhaihuang.struts2.interceptorToken;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 用户类，要求用户的名字不能相同，用token拦截器防止表单的重复提交
 * @author 黄帅哥
 *
 */
public class UserAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		
		return "success";
	}
}
