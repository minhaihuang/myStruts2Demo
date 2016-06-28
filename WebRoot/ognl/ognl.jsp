<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'ognl.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	el表达式的内容：
	<br> ${requestScope.username}
	<br /> ${sessionScope.username}
	<br /> ${applicationScope.username}
	<br /> ognl表达式的内容:
	<br>
	<s:property value="#request.username" />
	---------
	<s:property value="#request['username']" />
	<br>
	<s:property value="#session.username" />
	---------
	<s:property value="#session['username']" />
	<br>
	<s:property value="#application.username" />
	---------
	<s:property value="#application['username']" />
	<br>
	<s:property value="messageInValueStack" />
	<br>
	
	获取map的对象<br>
	<s:property value="#request.genderMap.man"/><br>
	<s:property value="#request.genderMap.woman"/><br>
	<s:property value="#request.genderMap"/><br>
	<s:radio list="#request.genderMap"/><br>
	
	测试百分号的用法<br>
	<s:property value="%{#request.username}"/><br><!-- 能获取到username的值 -->
	<s:property value="%{'#request.username'}"/><!-- 不能获取到username的值，直接打印 #request.username-->
</body>
</html>
