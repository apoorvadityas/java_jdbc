<%@page import="com.CmsSbClient.*"%>
<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
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
		int a = Integer.parseInt(request.getParameter("CusId"));
		 URL url = new URL("http://localhost:1111/customer/"+a);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");

	        if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn.getResponseCode());
	        }

	        BufferedReader br = new BufferedReader(new InputStreamReader(
	            (conn.getInputStream())));

	        String output;
	        String res="";
	        while ((output = br.readLine()) != null) {
	        	res+=output;
	            //out.println(output);
	        }
	       // out.println(res);
	      customer cust = new ObjectMapper().readValue(res, customer.class);
	    out.println("customer ID  " +cust.getCusId() + "<br/>");
	    out.println("Customer Name " +cust.getCusName() + "<br/>");
	    out.println("Customer Phone Number  " +cust.getCusPhnNo() + "<br/>"); 
	    out.println("Customer Username  " +cust.getCusUsername() + "<br/>");
	    out.println("Customer Password  " +cust.getCusPassword() + "<br/>");
	    out.println("Customer Email  " +cust.getCusEmail() + "<br/>");
	  %>
</body>
</html>