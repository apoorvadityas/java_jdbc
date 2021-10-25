<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>Add Room</h1>
        <form:form action="saveroom" method="post" modelAttribute="Room">
        <table>
            <tr>
            	<th>Room ID</th>
            	<td><form:input path="roomID" /> </td>
            </tr>
            <tr>
                <th>Type</th>
                <td><form:input path="type" /> </td>
            </tr>
            <tr>
               <th>Status</th>
                     	<td>
      		<form:select path="status">  
       			 <form:option value="AVAILABLE" label="AVAILABLE"/>  
       			 <form:option value="BOOKED" label="BOOKED"/>  
        </form:select>  
      	</td>
            </tr>
            <tr>
               <th>COST PER DAY</th>
               <td><form:input path="costPerDay" /> </td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>