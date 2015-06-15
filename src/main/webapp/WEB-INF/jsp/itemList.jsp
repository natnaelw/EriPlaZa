<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyList</title>
</head>
<body>
<h1>Posted Items</h1>

<!-- Query Parameter passing  -->
  
<table>
<tr>
    <th>Category</th>
    <th>Name</th>
    <th>Description</th>
    <th>price</th>
    <th>Quantity</th>
    <th>Condition</th>
</tr>
<c:forEach items="${items}" var="item">
    <tr>
        <td>${item.category.name}</td>
        <td>${item.itemName}</td>
        <td>${item.description}</td>
        <td>${item.unitPrice}</td>
        <td>${item.unitsInStock}</td>
        <td>${item.itemCondition}</td>
        
        <!-- Spring:url for handling Spring template/@PathVariable -->
        <spring:url value="/item_edit/{id}"  var="edit" >
   				<spring:param name="id" value="${item.itemId}" />
 		</spring:url>
         
        <td><a href="${edit}">Edit</a></td>
    </tr>
</c:forEach>
</table>
</div>
</body>
</html>