<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"   prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add a user</title>
</head>
<body>
	<s:actionerror/>
	<br>
	<s:form action="interceptorToken/TicketAction.action" method="post">
		<s:textfield label="username" name="username"></s:textfield><br>
		<s:textfield label="IDNumber" name="IDNumber"></s:textfield><br>
		<s:token></s:token><!-- 必须要有的token标签 -->
		<s:submit value="ok"></s:submit>
	</s:form>
	</body>
</html>