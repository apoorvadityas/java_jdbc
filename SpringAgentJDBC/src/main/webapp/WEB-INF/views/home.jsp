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
            <h1>Employ List</h1>
            <h3><a href="newagent">New Agent</a></h3>
            <table border="1">
            <tr>
                <th>Agent ID</th>
               <th>FirstName</th>
               <th>MI</th>
               <th>LastName</th>
               <th>Gender</th>
               <th>DOB</th>
               <th>SSN</th>
               <th>MaritalStatus</th>
               <th>Address1</th>
               <th>Address2</th>
               <th>City</th>
               <th>STATE</th>
               <th>ZipCode</th>
               <th>Country</th>
                </tr> 
                <c:forEach var="agent" items="${listAgent}" varStatus="status">
                <tr>
                    <td>${agent.agentID}</td>
                    <td>${agent.firstName}</td>
                    <td>${agent.MI}</td>
                    <td>${agent.lastName}</td>
                    <td>${agent.gender}</td>
                    <td>${agent.DOB}</td>
                    <td>${agent.SSN}</td>
                    <td>${agent.maritalStatus}</td>
                    <td>${agent.address1}</td>
                    <td>${agent.address2}</td>
                    <td>${agent.city}</td>
                    <td>${agent.STATE}</td>
                    <td>${agent.zipCode}</td>
                    <td>${agent.country}</td>
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
