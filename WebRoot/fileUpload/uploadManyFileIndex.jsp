<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/fileUpload/UploadManyFileAction.action" 
	method="post" enctype="multipart/form-data">
			please choose a file<input type="file" name="uploadFile"><br>
			please choose a file<input type="file" name="uploadFile"><br>
			please choose a file<input type="file" name="uploadFile"><br>
			please choose a file<input type="file" name="uploadFile"><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>