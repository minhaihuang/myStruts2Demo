package minhaihuang.struts2.convert;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class PointAction extends ActionSupport {
	private Point firstPoint = null;
	private Point secondPoint = null;

	public Point getFirstPoint() {
		return firstPoint;
	}

	public void setFirstPoint(Point firstPoint) {
		this.firstPoint = firstPoint;
	}

	public Point getSecondPoint() {
		return secondPoint;
	}

	public void setSecondPoint(Point secondPoint) {
		this.secondPoint = secondPoint;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("firstPoint=" + firstPoint);
		System.out.println("secondPoint=" + secondPoint);

		//获取距离
		double distance=getDistance(firstPoint, secondPoint);
		//设置到web域中
		ServletActionContext.getRequest().setAttribute("distance", distance);
		
		
		return "success";
	}

	/**
	 * 计算距离
	 * @param firstPoint
	 * @param secondPoint
	 * @return
	 */
	public double getDistance(Point firstPoint, Point secondPoint) {
		double distance = 0;

		distance = Math.sqrt((firstPoint.getX() - secondPoint.getX())
				* (firstPoint.getX() - secondPoint.getX())
				+ (firstPoint.getY() - secondPoint.getY())
				* (firstPoint.getY() - secondPoint.getY())
				+ (firstPoint.getZ() - secondPoint.getZ())
				* (firstPoint.getZ() - secondPoint.getZ()));
		
		return distance;
	}
	
}
