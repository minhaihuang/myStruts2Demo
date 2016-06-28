<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	拦截器测试<br>
	<a href="${pageContext.request.contextPath }/interceptor/StudentAction_add.action">跳转到添加学生页面</a><br>
	<a href="${pageContext.request.contextPath }/interceptor/StudentAction_delete.action">跳转到删除学生页面</a><br>
	<a href="${pageContext.request.contextPath }/interceptor/StudentAction_update.action">跳转到更改学生页面</a><br>
	<a href="${pageContext.request.contextPath }/interceptor/StudentAction_query.action">跳转到查询学生页面</a><br>
	</body>
</html>