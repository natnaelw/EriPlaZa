<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title><tiles:insertAttribute name="title" /></title>

<link href="http://getbootstrap.com/dist/css/bootstrap.css"
	rel="stylesheet">

<link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css"
	rel="stylesheet">
	
	<style>
 .outer {
    width: 960px;
    color: #6A5ACD;
    background-color: #ADD8E6;
    padding: 5px;
    font-type:
 }
</style>

</head>

<body>

	<div class="container">
		<div class="header">
			<h3 class="text-muted">Welcome to EriPlaZa!</h3>
			<form action="/eriplaza/search/" method="get">
				<p align="right">
					<label for="searchBy"><spring:message code="Search.product.category.label"/>: </label> 
					<select id="searchBy">
					    <option value="None">--Select--</option>
					    <c:forEach var="category" items="${categories}">
					    <option value="${category.id}">${category.name}</option>
					    </c:forEach>
					</select> <input type="submit" id="searchSubmit" value="Search" tabindex="5">

				</p>

			</form>


		</div>

		<div class="outer">
			<h4>
				<tiles:insertAttribute name="heading" />
			</h4>
			<p>
				<tiles:insertAttribute name="tagline" />
			</p>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span2 nav pull-left">
					<tiles:insertAttribute name="navigation" />
				</div>
				<div class="span10">
					<tiles:insertAttribute name="body" />
				</div>
			</div>
		</div>
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>
</body>
</html>
