package minhaihuang.struts2.validator;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 体重的action类，体重不能为负数
 * @author 黄帅哥
 *
 */
public class WeightAction extends ActionSupport{
	private int weight=0;
	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	@Override
	public String execute() throws Exception {
		
		return "weightSuccess";
	}
}
