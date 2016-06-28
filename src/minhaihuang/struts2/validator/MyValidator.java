package minhaihuang.struts2.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * 自定义一个数据检验器
 * 
 * @author 黄帅哥
 * 
 */
public class MyValidator extends FieldValidatorSupport {

	/**
	 * 获取体重，判断体重是否为负数
	 */
	public void validate(Object object) throws ValidationException {
		// 获取验证字段名和值
		String fieldName = getFieldName();
		Object value = this.getFieldValue(fieldName, object);
		
		if (value instanceof java.lang.Integer) {
			Integer weight = (Integer) value;
			if (weight < 0) {
				// 将错误信息添加到filedError的集合中
				addFieldError(fieldName, object);
			}
		}

	}

}
