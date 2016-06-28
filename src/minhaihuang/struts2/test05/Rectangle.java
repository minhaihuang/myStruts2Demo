package minhaihuang.struts2.test05;

/**
 * 矩形类，有长和宽两个属性
 * 
 * @author 黄帅哥
 * 
 */
public class Rectangle {
	private int Width = 0;
	private int height = 0;

	public Rectangle(int width, int height) {
		super();
		Width = width;
		this.height = height;
	}

	public Rectangle() {
		super();
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		
		return getWidth()+","+getHeight();
	}
}
