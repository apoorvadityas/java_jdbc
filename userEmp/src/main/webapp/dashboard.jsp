<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  String user=(String)session.getAttribute("user");
  out.println("Welcome <b>" +user+"</b>");
  
%>
<div class="aone" >
	<div class= "atwo" >
	<a href="employshow.jsp">Employees</a> 
	</div>

	<div class="atwo">
	<a href="agentshow.jsp">Agents</a>
	</div>
	
	<div class="atwo">
	<a href="usershow.jsp">Users</a>
	</div>
	
	</div>
</div>

<div class="logout">
<input type="button" name="logout" value="Logout" onclick="window.location='login.html'">
</div><br/><br/>

</body>
</html>