package minhaihuang.struts2.test05;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 计算面积的类
 * 
 * @author 黄帅哥
 * 
 */
public class RectangleAction extends ActionSupport {
	// 矩形对象
	private Rectangle rectangle = null;

	public Rectangle getRectangle() {
		return rectangle;
	}


	//在调用此方法前，会先进行类型的转换
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	@Override
	public String execute() throws Exception {
		//获取长和宽
		int width=rectangle.getWidth();
		int height=rectangle.getHeight();
		
		System.out.println(rectangle);
		
		//计算面积
		int area=width*height;
		
		//设置到web域中
		ServletActionContext.getRequest().setAttribute("area", area);
		
		return "success";
	}
}
