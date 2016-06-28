package minhaihuang.struts2.modelDriven;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import minhaihuang.struts2.ognl.Student;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
/**
 * 测试模型驱动，实际上就是用javabean来封装数据，以减少action中的set和get的方法
 * 
 * 步骤/要求：
 * 1，action类药实现ModelDriven类，注意添加泛型，
 * 2，javabean类中要有一个无参构造
 * 3，在action类要new一个javabean类中的对象，注意，是new
 * 4，在输入数据界面的空间名称要与javabean类中的各个属性名称相同
 * @author 黄帅哥
 *
 */
public class StudentAction extends ActionSupport implements ModelDriven<Student>{
	private Student student=new Student();
	
	public String add(){
		System.out.println(student.getStudentName());
		return "add";
	}

	public String edit(){
		//设置学生对象
		Student student1=new Student();
		student1.setId(002);
		student1.setAge(18);
		student1.setStudentName("hhm");
		
		//取出值栈，将student对象加入值栈
		ValueStack valueStack=ServletActionContext.getContext().getValueStack();
		valueStack.set("student1", student1);
		
		return "edit";
	}
	
	//会封装数据的方法
	public Student getModel() {
		
		return student;
	}
}
