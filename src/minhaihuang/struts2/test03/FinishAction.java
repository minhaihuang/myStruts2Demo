package minhaihuang.struts2.test03;

import javax.servlet.http.HttpServletRequest;

import minhaihuang.struts2.domain.Student;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class FinishAction extends ActionSupport implements ServletRequestAware{
	HttpServletRequest request=null;
	
	@Override
	public String execute() throws Exception {
		//获取学生姓名
		String studentName=(String) request.getSession().getAttribute("studentName");
		String school=request.getParameter("school");
		
		//设置对象
		Student student=new Student();
		student.setSchool(school);
		student.setStudentName(studentName);
		
		request.getSession().setAttribute("student", student);
		
		return "globalSuccess";
	}

	public void setServletRequest(HttpServletRequest request) {
		
		this.request=request;
	}
	
	
}
