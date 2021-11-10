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
	<th>Order Id</th>
	<th>Customer Id</th>
	<th>Vendor Id</th>
	<th>Wallet Source</th>
	<th>Menu Id</th>
	<th>Order Date</th>
	<th>Order Quantity</th>
	<th>Order Bill Amount</th>
	<th>Order Status</th>
	
	
	
</tr>
<%
		int a = Integer.parseInt(request.getParameter("ordId"));
       
		 URL url = new URL("http://localhost:1111//customerPendingOrders/"+a);
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
	     ObjectMapper objectMapper = new ObjectMapper();
	        Orders[] order = objectMapper.readValue(res, Orders[].class);
	      //  out.println(employ.length);

	        for(Orders o : order) {
  %>
  	<tr>
  		<td> <%=o.getOrdId() %> </td>
  		<td> <%=o.getCusId() %> </td>
  		<td> <%=o.getVenId() %> </td>
  		<td> <%=o.getWalSource() %> </td>
  		<td> <%=o.getMenId() %> </td>
  		<td> <%=o.getOrdDate() %> </td>
  		<td> <%=o.getOrdQuantity() %></td>
  		<td> <%=o.getOrdBillamount() %></td>
  		<td> <%=o.getOrdStatus() %></td>
  	
  		
  	</tr>
  <%
	       	
	        }
	     // out.println(res);
	  %>
	  </table>
</body>
</html>