<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Booking</title>
    </head>
    <body>
       <div align="center">
            <h1>Room Booking</h1>
            <h3><a href="newbook">New Booking</a></h3>
            <table border="1">
              <tr>
            	<th>Book ID</th>
            	<th>Room ID</th>
                <th>Cust Name</th>
               <th>City</th>
               <th>Booking Date</th>
               <th>CheckIn Date</th>
               <th>CheckOut Date</th>
            </tr>
          
                
             
                <c:forEach var="book" items="${listbook}" varStatus="status">
                 <tr>
                  <td>${book.bookId}</td>
                    <td>${book.roomID}</td>
                    <td>${book.custName}</td>
                    <td>${book.city}</td>
                     <td>${book.bookDate}</td>
                    <td>${book.chkInDate}</td>
                    <td>${book.chkOutDate}</td>
                
              
           
                </tr>  
                </c:forEach>             
            </table>
        </div>
    </body>
</html>