<%@page import="com.CmsSbClient.*"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
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
		String a = request.getParameter("cusUsername");
		String b= request.getParameter("cusPassword");
		 URL url = new URL("http://localhost:1111//custAuthenticate/"+a+"/"+b);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");

	        if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn.getResponseCode());
	        }

	        BufferedReader br = new BufferedReader(new InputStreamReader(
	            (conn.getInputStream())));

	        
	        
	        if(br.read() != '0') {
	        	
	        	out.println("login successful,");
	        	
	        	%>
	        	<jsp:include page="dashboardcust.jsp"></jsp:include>
	        	<%
	        	
	        }
	        else {
	        	
	        	
	        	%>
	        	<jsp:include page="login.html"></jsp:include>
	        	<%
	        }
	    
	  %>
</body>
</html>