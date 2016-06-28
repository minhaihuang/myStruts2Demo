package minhaihuang.struts2.test03;

import com.opensymphony.xwork2.ActionSupport;

public class TempAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		
		return "redirectActionSuccess";
	}
}
