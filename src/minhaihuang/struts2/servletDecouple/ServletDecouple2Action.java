package minhaihuang.struts2.servletDecouple;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 解耦servlet对象的第二种方法：利用ServletActionContext类（这是静态类）来获得
 * @author 黄帅哥
 *
 */
public class ServletDecouple2Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		//获取request对象
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("username", "hhm in request");
		System.out.println(request);
		
		//获取response对象
		HttpServletResponse response=ServletActionContext.getResponse();
		System.out.println(response);
		
		//获取servletContext对象
		ServletContext servletContext=ServletActionContext.getServletContext();
		servletContext.setAttribute("username", "hhm in servletContext");
		System.out.println(servletContext);
		
		//获取sessiont对象
		Map<String,Object> session=ServletActionContext.getContext().getSession();
		session.put("username", "hhm in session");
		System.out.println(session);
		return "success";
	}
}
