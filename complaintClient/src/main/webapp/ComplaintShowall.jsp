<%@page import="com.complaintClient.Complaint"%>
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
	<th>Complaint ID</th>
	<th>ComplaintType</th>
	<th>CDescription</th>
	<th>ComplaintDate</th>
	<th>Severity</th>
	<th>Status</th>
</tr>

<%
		 URL url = new URL("http://localhost:8080/complaintService/webapi/complaint");
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
	        Complaint[] comp = objectMapper.readValue(res, Complaint[].class);
	      //  out.println(employ.length);

	        for(Complaint c : comp) {
  %>
  	<tr>
  		<td> <%=c.getComplaintID() %> </td>
  		<td> <%=c.getComplaintType() %> </td>
  		<td><%=c.getCDescription() %>  </td>
  		<td> <%=c.getComplaintDate() %> </td>
  		<td> <%=c.getSeverity() %> </td>
  		<td><%=c.getStatus() %> </td>
  	</tr>
  <%
	       	
	        }
	     // out.println(res);
	  %>
	  </table>

</body>
</html>