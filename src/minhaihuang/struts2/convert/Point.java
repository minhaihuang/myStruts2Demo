package minhaihuang.struts2.convert;
/**
 * 这是需要转换的类
 * @author 黄帅哥
 *
 */
public class Point {
	private int x = 0, y = 0, z = 0;

	public Point(){
		
	}
	
	public Point(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		
		return getX()+","+getY()+","+","+getZ();
	}
}
