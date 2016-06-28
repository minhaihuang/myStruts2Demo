package minhaihuang.struts2.base01;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 这是struts的入门案例
 * @author 黄帅哥
 *
 */
public class HelloWorldAction extends ActionSupport{
	
	public HelloWorldAction(){
		System.out.println("构造方法被调用了");
	}
	
	//此方法是编程入口
	@Override
	public String execute() throws Exception {
	
		return "success";
	}

}
