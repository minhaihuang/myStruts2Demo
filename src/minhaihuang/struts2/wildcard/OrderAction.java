package minhaihuang.struts2.wildcard;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 测试类，SchoolAction
 * @author 黄帅哥
 *
 */
public class OrderAction extends ActionSupport{

	/**
	 * add方法
	 * @return
	 */
	public String add(){
		System.out.println("the add method of OrderAction is being used");
		return "add";
	}
	
	
	/**
	 * delete方法
	 * @return
	 */
	public String delete(){
		System.out.println("the delete method of OrderAction is being used");
		return "delete";
	}
	
	@Override
	public String execute() throws Exception {
		
		return "success";
	}
}
