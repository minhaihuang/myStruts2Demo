package minhaihuang.struts2.fileUpload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadManyFileAction extends ActionSupport {
	// 此三个属性名称必须有，且名字固定
	File[] uploadFile = null;
	String[] uploadFileContentType = null;
	String[] uploadFileFileName = null;

	// set和get方法必须有，初始化属性值
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
		// 获取目标存储文件路径
		String realPath = ServletActionContext.getServletContext().getRealPath(
				"/uploadFiles");
		// 如果目录不存在，创建目录
		File realPathFolder = new File(realPath);
		if (!realPathFolder.exists()) {
			realPathFolder.mkdirs();
		}
		try {
			// 上传文件
			for(int i=0;i<uploadFile.length;i++){
			FileUtils.copyFile(uploadFile[i], new File(realPathFolder,
					uploadFileFileName[i]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
	}

}
