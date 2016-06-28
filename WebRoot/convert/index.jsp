<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/convert/PointAction.action" method="">
		输入第一个点<input type="text" name="firstPoint"><br>
		输入第二个点<input type="text" name="secondPoint"><br>
		<br>
		<br>
		<br>
		<input type="submit" value="提交">
	</form>
</body>
</html>