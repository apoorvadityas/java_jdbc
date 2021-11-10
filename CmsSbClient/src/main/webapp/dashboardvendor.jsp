
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
<table border="3">
<tr>
	<th>Vendor Id</th>
	<th>Vendor Name</th>
	<th>Vendor Phone Number</th>
	<th>Vendor Username</th>
	<th>Vendor Password</th>
	<th>Vendor Email</th>

	
	
	
</tr>

<%
		 URL url = new URL("http://localhost:1111/showVendor");
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
	         //  out.println(output);
	            
	        }
	        ObjectMapper objectMapper = new ObjectMapper();
	        vendor[] ven = objectMapper.readValue(res, vendor[].class);
	      //  out.println(employ.length);

	        for(vendor v : ven) {
  %>
  	<tr>
  		<td> <%=v.getVenId() %> </td>
  		<td> <%=v.getVenName() %> </td>
  		<td> <%=v.getVenPhnNo() %> </td>
  		<td> <%=v.getVenUsername() %> </td>
  		<td> <%=v.getVenPassword() %> </td>
  		<td> <%=v.getVenEmail() %> </td>
  		
  		
  	</tr>
  <%
	       	
	        }
	     // out.println(res);
	  %>
	  </table>
<br/><br/>
<div class="logout">
<input type="button" name="logout" value="Logout" onclick="window.location='venlogin.html'">
</div><br/><br/>

</body>
</html>