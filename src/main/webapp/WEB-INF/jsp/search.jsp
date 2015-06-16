<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>

	<form action="/eriplaza/searchByCategory" method="get">
		<p >
			<label for="searchBy"><spring:message
					code="Search.category.label" />: </label> 
			<select id="categoryId" name="categoryId">
				<option value="None">--Select--</option>
				<c:forEach var="category" items="${categories}">
					<option value="${category.id}">${category.name}</option>
				</c:forEach>
			</select> <input type="submit" id="searchSubmit" value="Search" tabindex="5">

		</p>

	</form>
	
</body>
</html>