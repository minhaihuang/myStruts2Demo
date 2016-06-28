package minhaihuang.struts2.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 权限控制器
 * @author 黄帅哥
 *
 */
public class AuthorityInterceptor extends AbstractInterceptor{

	/**
	 * 判断用户是否登陆，若已经登陆，可接着执行action的下一步操作；
	 * 若没有登陆，则返回登陆页面
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//获取session对象
		Map<String,Object> sessionMap=invocation.getInvocationContext().getSession();
		//获取用户对象
		String username=(String) sessionMap.get("username");
		
		if(username!=null&&username.trim().length()!=0){
			//执行action的下一步操作
			return invocation.invoke();
		}
		
		//设置错误信息
		sessionMap.put("message", "You have not login or timeout");
		return "login";
	}

}
