<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'RegisterStudent.jsp' starting page</title>
    
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
  		<s:fielderror></s:fielderror><!-- 输出错误信息 -->
   		<form action="${pageContext.request.contextPath }/test08_validator/RegisterStudentAction.action">
   			please input the studentName<input type="text" name="studentName"/><br>
   			please input the password	<input type="password" name="password"/><br>
   		please input the password again	<input type="rePassword" name="rePassword"/>
   			<input type="submit" value="create">
   		</form>
  </body>
</html>
