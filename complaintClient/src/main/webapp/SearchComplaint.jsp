<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="com.complaintClient.Complaint"%>
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
		int a = Integer.parseInt(request.getParameter("ComplaintID"));
		 URL url = new URL("http://localhost:8080/complaintService/webapi/complaint/"+a);
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
	      Complaint comp = new ObjectMapper().readValue(res, Complaint.class);
	    out.println("Complaint No  " +comp.getComplaintID() + "<br/>");
	    out.println("ComplaintType " +comp.getComplaintType() + "<br/>");
	    out.println("CDescription  " +comp.getCDescription() + "<br/>"); 
	    out.println("ComplaintDate  " +comp.getComplaintDate() + "<br/>");
	    out.println("Severity  " +comp.getSeverity() + "<br/>");
	    out.println("Status " +comp.getStatus() + "<br/>");
	  %>
</body>
</html>