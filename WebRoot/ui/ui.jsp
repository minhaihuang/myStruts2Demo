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
    
    <title>My JSP 'ui.jsp' starting page</title>
    
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
    	<s:form action="" method="post" theme="simple">
    	textfield label
    	<br/>
    	username:<s:textfield name="username"></s:textfield><br/>    	
    	password:<s:textfield name="password"></s:textfield><br/>
    	<br/>
    	
    	hidden label:
    	<br/>
    	<s:hidden name="hidden" value="hahah" ></s:hidden>
    	<br/>
    	
    	textarea label:
    	<br/>
    	<s:textarea name="notice" cols="30" rows="10" value="vocation now "
    	readonly="true"></s:textarea><br/>
    	<br/>
    	
    	checkbox label:
    	<br/>
    	<s:checkbox name="hobby" value="basketball">篮球</s:checkbox>
    	<s:checkbox name="hobby" value="music">音乐</s:checkbox>
    	<s:checkbox name="hobby" value="sport">运动</s:checkbox>
    	<br/>
    	
   		<br/>
   		checkboxlist label:
   		<br/>
   		操作list集合：<br/>
   		<s:checkboxlist name="subject1" list="{'asp','jsp','php'}" value="'asp'"></s:checkboxlist>
    	<br/>
    	操作map集合,经测试，若带%号，只能默认选中一个。若不带%号，则能默认选中多个<br/>
    	<s:checkboxlist listKey="key" listValue="value"  list="#{1:'asp',2:'jsp',3:'php',4:'andriod' }" name="subject2" value="{1,2}"></s:checkboxlist>
    	<br/>
    	操作javabean对象<br/>
    	<s:checkboxlist list="#request.studentList" listKey="id" listValue="studentName" name="subject3" value="{3,4}"/>
    	<br/>
    	
    	radio label:
    	<br/>
    	操作list集合<br/>
    	<s:radio list="{'asp','php','jsp'}" name="radio1" value="{'asp'}"></s:radio><br/>
    	
    	操作map集合<br/>
    	<s:radio list="#{1:'asp',2:'php',3:'jsp'}" listKey="key" listValue="value"  name="radio2" value="2"></s:radio><br/>
    	
    	操作javabean集合<br/>
    	<s:radio list="#request.studentList" listKey="id" listValue="studentName" name="radio3" value="3"></s:radio><br/>
    	<br/>
    	
    	select label:<br/>
    	操作list集合：<br/>
    	<s:select list="{'asp','php','jsp'}" name="select1" value="'php'" headerKey="0" headerValue="--请选择--"></s:select>
    	<br/>
    	
    	操作map集合：<br/>
    	<s:select list="#{1:'asp',2:'php',3:'jsp',4:'and'}" listKey="key" listValue="value" name="select2" value="3" headerKey="0" headerValue="--请选择--"></s:select>
    	<br/>
    	
    	操作javabean对象：<br/>
    	<s:select list="#request.studentList" listKey="id" listValue="studentName" name="select3" value="3" headerKey="0" headerValue="--请选择--"></s:select>
    	<br/>
    	
    	<br/>
    	reset label:
    	<br/>
    	<s:reset value="重置"></s:reset><br/>
    	
    	sumbit label:
    	<br/>
    	<s:submit value="提交"/>
    	</s:form>
  </body>
</html>
