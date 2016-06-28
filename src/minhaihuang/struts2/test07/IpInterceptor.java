package minhaihuang.struts2.test07;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletConfigInterceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 这是IP拦截器类
 * @author 黄帅哥
 *
 */
public class IpInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//获取request对象
		HttpServletRequest request=(HttpServletRequest) ActionContext.getContext().get(ServletConfigInterceptor.HTTP_REQUEST);
		//截取用户的IP
		String ipAddress=request.getRemoteHost();
		System.out.println(ipAddress);
		//如果是本地的ip,则让其通过
		if("0:0:0:0:0:0:0:1".equals(ipAddress)){
			//去action执行下一步操作
			return invocation.invoke();
		}
		return "error";
	}

}
