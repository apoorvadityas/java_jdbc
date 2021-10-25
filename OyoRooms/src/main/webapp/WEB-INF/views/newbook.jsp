<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Booking</title>
</head>
<body>
<div align="center">
        <h1>Booking A Room</h1>
        <form:form action="savebook" method="post" modelAttribute="Book">
        <table>
          <tr>
            	<th>Book ID</th>
            	<td><form:input path="bookId" /> </td>
            </tr>
            <tr>
            	<th>Room ID</th>
            	        	<td>
      		<form:select path="roomID">  
       			 <form:option value="R001" label="R001"/>  
       			 <form:option value="R002" label="R002"/>  
       			 <form:option value="R003" label="R003"/> 
       			 <form:option value="R004" label="R004"/> 
        </form:select> 
            <tr>
                <th>Cust Name</th>
                <td><form:input path="custName" /> </td>
            </tr>
            <tr>
               <th>City</th>
                     	<td><form:input path="city" /> 
      		
      	</td>
            </tr>
            <tr>
               <th>Booking Date</th>
               <td><form:input type="date" path="bookDate"  name="date" /> </td>
            </tr>
<tr>
               <th>CheckIn Date</th>
               <td><form:input path="ChkInDate" /> </td>
            </tr>
            <tr>
            <tr>
               <th>CheckOut Date</th>
               <td><form:input path="ChkOutDate" /> </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Submit"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>