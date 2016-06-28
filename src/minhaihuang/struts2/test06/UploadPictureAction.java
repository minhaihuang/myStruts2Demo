package minhaihuang.struts2.test06;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 上传图片
 * 
 * @author 黄帅哥
 * 
 */
public class UploadPictureAction extends ActionSupport {
	// 三个必须有的字段
	File uploadFile = null;
	String uploadFileContentType = null;
	String uploadFileFileName = null;

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}
	
	/**
	 * 入口方法
	 */
	@Override
	public String execute() throws Exception {
		//获取文件存储路径
		String realPath=ServletActionContext.getServletContext().getRealPath("/pratices");
		//文件夹不存在则创建文件夹
		File realPathFile=new File(realPath);
		if(realPathFile.exists()==false){
			realPathFile.mkdirs();
		}
		
		//开始上传文件
		FileUtils.copyFile(uploadFile, new File(realPathFile,uploadFileFileName));
		return "success";
	}
}
