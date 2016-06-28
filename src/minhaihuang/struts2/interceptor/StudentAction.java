package minhaihuang.struts2.interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 学生Action类，进行增删改查的操作
 * 
 * @author 黄帅哥
 * 
 */
public class StudentAction extends ActionSupport {
	/**
	 * 增
	 * @return
	 */
	public String add() {

		return "add";
	}

	/**
	 * 删
	 * @return
	 */
	public String delete() {

		return "delete";
	}

	/**
	 * 改
	 * @return
	 */
	public String update() {

		return "update";
	}

	/**
	 * 查
	 * @return
	 */
	public String query() {

		return "query";
	}
}
