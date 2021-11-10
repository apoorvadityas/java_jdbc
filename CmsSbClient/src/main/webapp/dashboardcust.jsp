<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  String user=(String)session.getAttribute("user");
  out.println("Welcome");
  
%>
<div class="aone" >
	<div class= "atwo" >
	<a href="custshow.html">Customer Info</a> 
	</div>

	<div class="atwo">
	<a href="pendingorders.html">Pending Orders</a>
	</div>
	
	<div class="atwo">
	<a href="orders.jsp">Customer Orders</a>
	</div>
	
	</div>
</div>
<br/><br/>
<div class="logout">
<input type="button" name="logout" value="Logout" onclick="window.location='login.html'">
</div><br/><br/>

</body>
</html>