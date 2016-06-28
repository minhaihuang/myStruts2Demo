package minhaihuang.struts2.test05;
/**
 * 矩形类转换器
 */
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class RectangleConverter extends StrutsTypeConverter{

	/**
	 * 转换为Rectangle对象
	 */
	@Override
	public Object convertFromString(Map map, String[] values, Class clazz) {
		//获取values的第一个元素，进行转换
		String str=values[0];
		
		//切割字符串
		String[] temp=str.split(",");
		
		try {
			int width=Integer.parseInt(temp[0]);
			int height=Integer.parseInt(temp[1]);
			
			return new Rectangle(width,height);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}

		return null;
	}

	
	/**
	 * 将Rectangle对象转换为字符串
	 */
	@Override
	public String convertToString(Map map, Object obj) {
		Rectangle rectangle=(Rectangle)obj;
		
		return rectangle.getWidth()+","+rectangle.getHeight();
	}

}
