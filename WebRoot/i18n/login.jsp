<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    	<form action="${pageContext.request.contextPath }/i18n/LoginAction.action">
    		<s:i18n name="minhaihuang.struts2.i18n.package">
    		
    		<s:text name="username"/><input type="text" name="username"/><br>
    		<s:text name="password"/><input type="password" name="password"/><br>
    		<s:text name="phone"/><input type="text" name="phone"/><br>
    		<s:text name="birthday"/><input type="text" name="birthday"/><br>
    		<input type="submit">
    		</s:i18n>
    	</form>
  </body>
</html>
