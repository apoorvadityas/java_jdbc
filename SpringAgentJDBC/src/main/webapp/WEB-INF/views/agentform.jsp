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
        <h1>Add Employ</h1>
        <form:form action="saveagent" method="post" modelAttribute="agent">
        <table>
            <tr>
            	<th>Agent ID</th>
            	<td><form:input path="agentID" /> </td>
            </tr>
            <tr>
                <th>FirstName</th>
                <td><form:input path="firstName" /> </td>
            </tr>
            <tr>
               <th>MI</th>
               <td><form:input path="MI" /> </td>
            </tr>
            <tr>
               <th>LastName</th>
               <td><form:input path="lastName" /> </td>
            </tr>
          <tr>
      	<th>Gender</th>
      	<td>
      		<form:select path="gender">  
       			 <form:option value="Male" label="Male"/>  
       			 <form:option value="Female" label="Female"/>  
        </form:select>  
      	</td>
      	</tr>
            <tr>
               <th>DOB</th>
               <td><form:input path="DOB" /> </td>
            </tr>
            <tr>
               <th>SSN</th>
               <td><form:input path="SSN" /> </td>
            </tr>
         
            <tr>
               <th>Address1</th>
               <td><form:input path="address1" /> </td>
            </tr>
            <tr>
               <th>Address2</th>
               <td><form:input path="address2" /> </td>
            </tr>
            <tr>
               <th>City</th>
               <td><form:input path="city" /> </td>
            </tr>
            <tr>
               <th>STATE</th>
               <td><form:input path="STATE" /> </td>
            </tr>
            <tr>
               <th>ZipCode</th>
               <td><form:input path="zipCode" /> </td>
            </tr>
            <tr>
               <th>Country</th>
                <td><form:input path="country" /></td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>