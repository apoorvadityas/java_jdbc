<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
       <div align="center">
            <h1>Rooms</h1>
            <h3><a href="newroom">New Room</a></h3>
            <table border="1">
            <tr>
                <th> Room No</th>
               <th>Type</th>
               <th>Status</th>
               <th>CostPerDay</th>
             
                <c:forEach var="room" items="${listroom}" varStatus="status">
                <tr>
                    <td>${room.roomID}</td>
                    <td>${room.type}</td>
                    <td>${room.status}</td>
                    <td>${room.costPerDay}</td>
                
              
                     <td>
                        <a href="">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="">Delete</a>
                    </td>
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>
