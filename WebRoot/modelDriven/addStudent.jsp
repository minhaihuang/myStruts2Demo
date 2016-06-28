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

<title>My JSP 'addStudent.jsp' starting page</title>

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
	<!--  <s:form action="StudentAction_add.action" namespace="/modelDriven" theme="simple">
		id:<s:textfield name="id"></s:textfield><br/>
		age:<s:textfield name="age"></s:textfield> <br/>
		studentName:<s:textfield name="studentName"></s:textfield><br/>
		<s:submit value="ok"></s:submit>
	</s:form>
	-->
	<form
		action="${pageContext.request.contextPath }/modelDriven/StudentAction_add.action">

		id:<input type="text" name="id"><br /> 
		studentName:<input type="text"name="studentName"><br /> 
		age:<input type="text" name="age"><br />
		<input type="submit" value="ok"><br />
	</form>
</body>
</html>
