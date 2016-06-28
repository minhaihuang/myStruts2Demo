package minhaihuang.struts2.servletDecouple;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 解耦servlet对象的第一种方法：利用xxxAwrae类（这是静态类）来获得
 * @author 黄帅哥
 *执行的顺序为：无参构造->各种set方法->excute（）；
 */
public class ServletDecouple1Action extends ActionSupport 
implements ServletContextAware,ServletRequestAware,ServletResponseAware,SessionAware{

	HttpServletRequest request=null;
	HttpServletResponse response=null;
	ServletContext servletContext=null;
	Map<String,Object> session=null;
	
	public ServletDecouple1Action(){
		System.out.println("ServletDecouple1Action的构造方法被调用了");
	}
	
	@Override
	public String execute() throws Exception {

		request.setAttribute("username", "hhm in request");
		System.out.println(request);
		

		System.out.println(response);
		
		
		servletContext.setAttribute("username", "hhm in servletContext");
		System.out.println(servletContext);
		

		session.put("username", "hhm in session");
		System.out.println(session);
		return "success";
	}

	
	//获取session对象
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}

	//获取response对象
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
		
	}

	//获取request对象
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		
	}

	//获取servletContext对象
	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext;
		
	}
}
