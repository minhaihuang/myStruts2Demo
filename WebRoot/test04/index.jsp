<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	通配符测试<br>
	<a href="${pageContext.request.contextPath }/test04/UserAction_add.action">跳转到添加用户页面</a><br>
	<a href="${pageContext.request.contextPath }/test04/SupplierAction_add.action">跳转到添加供应商页面</a><br>
	<a href="${pageContext.request.contextPath }/test04/UserAction_delete.action">跳转到删除页面</a><br>
	<br>
	<br>
	<br>
	<br>
	动态方法的调用
	<a href="${pageContext.request.contextPath }/test04/UserAction!add.action">动态方法的调用</a><br>
</body>
</html>