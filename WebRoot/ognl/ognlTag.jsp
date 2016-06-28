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
    
    <title>ognlTag page</title>

  </head>
  
  <body>
   	property label:
   	<br/>
   	<s:property value="#request.username"/>
   	<s:property value="#request.username1" default="username1"/>
   	<br/>
   	
   	set label:
   	<br/>
   	<s:set value="#request.username" var="usernameInSession" scope="session"></s:set>
   	<s:property value="%{#session.usernameInSession}"/>
   	<br/>
   	
   	push label
   	<br/>
   	<s:push value="#request.username">
   		<s:property />
   		<br/>
   	</s:push>
   	<s:property />
	<br />
	
	bean label
	<br/>
	<s:bean name="minhaihuang.struts2.ognl.Student" var="student">
		<s:param name="id" value="1"/>
		<s:param name="studentName" value="%{'hhm'}"/>
		<s:param name="age" value="21"/>
	</s:bean>
	<s:property value="#student.studentName"/>---
	<s:property value="#student.age"/>---
	<s:property value="#student.id"/>
	<br/>
	
	iterator label:
	<br/>
	first:
	<br/>
	<s:iterator value="#request.studentList" var="student">
		<s:property value="#student.studentName"/>---
		<s:property value="#student.age"/>---
		<s:property value="#student.id"/>
		<br/>
	</s:iterator>
	
	second step:
	<br/>
	<s:iterator value="%{#request.studentList}" var="student" begin="2" end="6" step="2">
		<s:property value="#student.studentName"/>---
		<s:property value="#student.age"/>---
		<s:property value="#student.id"/>
		<br/>
	</s:iterator>
	
	third status:
	<br/>
	<s:iterator value="%{#request.studentList}" var="student" status="status">
		<s:property value="#status.count" />
		----
		<s:property value="#status.index" />
		----
		<s:property value="#status.first" />
			<s:property value="#status.last" />
		----
		<s:property value="#status.even" />
		----
		<s:property value="#status.odd" />
			<br />
	</s:iterator>
	
	----if else if else----
	<br/>
	<table style="width:200px;height:100px;border:1px red solid;">
		<tr>
			<td>id</td>
			<td>studentName</td>
			<td>age</td>
			<td>age range</td>
		</tr>
		
		
			<s:iterator value="%{#request.studentList}" var="student">
			<tr>
				<td><s:property value="#student.id"/></td>
				<td><s:property value="#student.studentName"/></td>
				<td><s:property value="#student.age"/></td>
				<td> 
					<s:if test="%{#student.age>=20 && #student.age<45}">青年</s:if>
					<s:elseif test="%{#student.age>46 && #student.age<60}">中年</s:elseif>
					<s:else>老年</s:else>
				</td>
			</tr>
			</s:iterator>
	</table>
	<br/>
	
	---url label---
	<br/>
	<s:url action="OgnlTagAction" namespace="/ognl" var="myUrl">
		<s:param name="id" value="001"></s:param>
		<s:param name="name" value="%{'pujing'}"></s:param>
	</s:url>
	<s:a href="%{#myUrl}">visit ognl tag action</s:a>
     <br/>
      <br/>
       <br/>
       
   --操作数组--
   <br/>
     <br/>
        <s:property value="#request.studentList[2].name"/>--- <s:property value="#request.studentList[2].age"/><br/>
        
        <s:iterator value="{9,8,7,6,5,4,3,2,1}">
            <s:property/>
        </s:iterator>
        <br/>

         <s:iterator value="{'a','b','c'}" var="char">
            <s:property value="#char"/><br/>
        </s:iterator>
      
        <br/>
        --------------
        <br/>
     --操作Map--
     <br/>
     <s:iterator value="#{'son1':'son1Name','son2':'son2Name','son3':'son3Name' }" var="son">
     	<s:property value="#son.key"/>--
    	<s:property value="#son.value"/><br>
     </s:iterator>
     <br/>
     <br/>
     ----操作影像----
     <br/>
     <s:iterator value="%{#request.studentList.{studentName}}" var="studentName">
     	<s:property value="#studentName"/>
     </s:iterator>
     <br/>
     <br/>
     --操作过滤器--
     <br/>
           选出年龄全部大于25的人
      <br/>
      <s:iterator value="#request.studentList.{?#this.age>25}" var="student">
      	<s:property value="#student.studentName"/>
      </s:iterator>
      <br/>
      <br/>
      
      	选出年龄大于25的人的第一个人
      	<br/>
      <s:iterator value="#request.studentList.{^#this.age>25}" var="student">
      	<s:property value="#student.studentName"/>
      </s:iterator>
      <br/>
      <br/>
      
      	选出年龄大于25的人的最后一个人
      	<br/>
      <s:iterator value="#request.studentList.{$#this.age>25}" var="student">
      	<s:property value="#student.studentName"/>
      </s:iterator>
      <br/>
      <br/>
      
      --影像加过滤器--
      <br/>
      	选出年龄大于25的人的的全部名字
      	<br/>
      <s:iterator value="#request.studentList.{?#this.age>25}.{studentName}" var="studentName">
      	<s:property/>
      </s:iterator>
      
  </body>
</html>
