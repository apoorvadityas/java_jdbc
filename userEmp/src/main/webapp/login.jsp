<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.userEmp.users"%>  
<%@page import="com.userEmp.usersDAO"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="bean1" class="com.userEmp.users"/>
	<jsp:setProperty property="*" name="bean1" />
<%
		usersDAO obj=new usersDAO();
		
		int i=obj.loginCheck(bean1);  
		if(i==0)  {
		out.print("Invalid Credentials....");
		%>
		<jsp:include page="login.html"></jsp:include>
	<%
	}
		else{
			session.setAttribute("user",bean1.getName());
			
			%>
			<jsp:include page="dashboard.jsp"></jsp:include>
		<%
	
		}
	%>
</body>
</html>