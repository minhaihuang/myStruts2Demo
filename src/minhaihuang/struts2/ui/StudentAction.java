package minhaihuang.struts2.ui;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import minhaihuang.struts2.ognl.Student;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	private List<Student> studentList = null;

	@Override
	public String execute() throws Exception {
		// 初始化十个学生对象
		studentList = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student student = new Student();
			student.setAge(20 + i);
			student.setId(i + 1);
			student.setStudentName("hhm" + i);
			studentList.add(student);
		}
		
		//设置到web域中
		ServletActionContext.getRequest().setAttribute("studentList", studentList);
		return "success";
	}
}
