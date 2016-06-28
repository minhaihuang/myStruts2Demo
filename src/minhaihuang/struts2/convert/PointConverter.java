package minhaihuang.struts2.convert;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;
/**
 * 这是point类的转换器
 * @author 黄帅哥
 *
 */
public class PointConverter extends StrutsTypeConverter{

	/**
	 * 将字符串转换为特定对象
	 */
	@Override
	public Object convertFromString(Map map, String[] values, Class clazz) {
		//只需获取values的第一个元素，勇气来转换即可
		String str=values[0];
		
		//切割str，格局','切割
		String[] temp=str.split(",");
		
		try {
			//转换值
			int x=Integer.parseInt(temp[0]);
			int y=Integer.parseInt(temp[1]);
			int z=Integer.parseInt(temp[2]);
			
			return new Point(x,y,z);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	/**
	 * 将对象转换为字符串
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		Point point=(Point)arg1;
		
		return point.getX()+","+point.getY()+","+point.getZ();
	}

}
