package minhaihuang.struts2.ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class OgnlTagAction extends ActionSupport {
	private List<Student> studentList=null;

	@Override
	public String execute() throws Exception {
		//初始化十个学生对象
		studentList=new ArrayList<Student>();
		for(int i=0;i<10;i++){
			Student student=new Student();
			student.setAge(20+i);
			student.setId(i+1);
			student.setStudentName("hhm"+i);
			studentList.add(student);
		}
		ServletActionContext.getRequest().setAttribute("username", "username in request");
		ServletActionContext.getRequest().setAttribute("studentList", studentList );
		return "success";
	}
	
	
}
