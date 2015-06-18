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


<link href="resources/css/template.css" rel="stylesheet">
	
	
</head>

<body>

		<div id="header">
			<h1 class="text-muted">EriPlaZaa</h1>
			<form id="searchBy" action="/eriplaza/searchByCategory" method="get" >
		<p align="right">
			<label for="searchBy"><spring:message
					code="Search.product.category.label" />: </label> 
			<select id="categoryId" name="categoryId">
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

		<div id="menu">
					<tiles:insertAttribute name="navigation" />
		</div>
		<div id="searchBody">
				  <tiles:insertAttribute name="body" />
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>

</body>
</html>
