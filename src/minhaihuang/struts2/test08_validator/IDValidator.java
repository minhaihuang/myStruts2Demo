package minhaihuang.struts2.test08_validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;
/**
 * 自定义的身份证校验器
 * 要求：能够对身份证长度进行校验，允许长度是15位或18位；
 * @author 黄帅哥
 *
 */
public class IDValidator extends FieldValidatorSupport {

	public void validate(Object object) throws ValidationException {
		//获取属性的名称
		String fieldName=this.getFieldName();
		//获取属性的值
		Object fieldValue=this.getFieldValue(fieldName, object);
		
		if(fieldValue instanceof String){
			String idNumber=(String) fieldValue;
			System.out.println(idNumber.length());
			//不满足条件，增加错误信息
			if((idNumber.trim().length()!=15)&&(idNumber.trim().length()!=18)){
				this.addFieldError(fieldName, object);
			}
		}
	}

}
