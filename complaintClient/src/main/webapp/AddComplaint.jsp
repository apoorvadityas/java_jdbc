
<%@page import="java.sql.Date"%>
<%@page import="com.complaintClient.Status"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.sun.jersey.api.client.ClientResponse"%>
<%@page import="com.sun.jersey.api.client.WebResource"%>
<%@page import="com.sun.jersey.api.client.Client"%>
<%@page import="com.complaintClient.Complaint"%>
<%@page import="javax.ws.rs.client.Invocation"%>
<%@page import="javax.ws.rs.client.Entity"%>
<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.Response"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.client.ClientBuilder"%>
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
	Complaint comp = new Complaint();
comp.setComplaintID(Integer.parseInt(request.getParameter("ComplaintID")));
comp.setComplaintType(request.getParameter("ComplaintType"));
comp.setCDescription(request.getParameter("CDescription"));
comp.setComplaintDate(Date.valueOf(request.getParameter("ComplaintDate")));

comp.setSeverity(request.getParameter("Severity"));
comp.setStatus(Status.valueOf(request.getParameter("Status")));
	 Client client = Client.create();

     WebResource webResource = client
        .resource("http://localhost:8080/complaintService/webapi/complaint/addComplaint");
 
  	Gson obj = new Gson();  
  String input = obj.toJson(comp);


     ClientResponse res = webResource.type("application/json")
        .post(ClientResponse.class, input);

     if (response.getStatus() != 200) {
         throw new RuntimeException("Failed : HTTP error code : "
              + res.getStatus());
     } 


  
     String output = res.getEntity(String.class);
     out.println(output); 
%>
</body>
</html>