package minhaihuang.struts2.test06;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 上传多个文件的action类
 * @author 黄帅哥
 *
 */
public class UploadManyFileAction extends ActionSupport{
	//三个必须有的字段
	File[] uploadFile=null;
	String[] uploadFileContentType=null;
	String[] uploadFileFileName=null;
	
	public File[] getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(File[] uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String[] getUploadFileContentType() {
		return uploadFileContentType;
	}
	public void setUploadFileContentType(String[] uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}
	public String[] getUploadFileFileName() {
		return uploadFileFileName;
	}
	public void setUploadFileFileName(String[] uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}
	
	
	@Override
	public String execute() throws Exception {
		//获取目标文件夹
		String descPath=ServletActionContext.getServletContext().getRealPath("/pratices");
		//文件夹不存在，则创建
		File descPathFile=new File(descPath);
		if(descPathFile.exists()==false){
			descPathFile.mkdirs();
		}
		
		//开始上传文件
		for(int i=0;i<uploadFile.length;i++){
			FileUtils.copyFile(uploadFile[i], new File(descPathFile,uploadFileFileName[i]));
		}
		return "success";
	}
}
