package minhaihuang.struts2.test01;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 模仿前面的HelloWorldAction,再自己写一个StudentAction
 * @author 黄帅哥
 * 
 * 1，在web.xml下配置（StrutsPrepareAndExecuteFilter，不要求背诵）
 * 2，创建一个类，可以不继承任何类，单一般建议继承ActionSupport类
 * 3，在src下创建struts.xml，注册action :<action name=”” class=””><result ></result></action>
 * 4，创建相关的页面
 * 5，利用xxx.action来访问action
 *
 */
public class StudentAction extends ActionSupport{
	public StudentAction(){
		System.out.println("studentAction被调用了");
	}
	
	@Override
	public String execute() throws Exception {
		
		return "success";
	}
}
