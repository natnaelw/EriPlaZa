<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
	<p>
		Hello ${user.fname} <a
			href="<spring:url value="/userpage?id=${user.id}" />"> BACK</a>
	</p>
	<form:form modelAttribute="item" enctype="multipart/form-data">
		<table>
			<tr>
				<td><label for="category">Category:</label></td>
				<td><form:select class="select" id="category"
						path="category.id">
						<form:option value="0" label="--Select Category--" />
						<form:options items="${categories}" itemLabel="name"
							itemValue="id" />
					</form:select></td>
			</tr>

			<tr>
				<td><label for="name">Item Name:</label></td>
				<td><form:input id="name" path="itemName"
						value="${edititems.itemName }" /> <form:errors path="itemName"
						cssStyle="color : red;" /></td>
			</tr>

			<tr>
				<td><label for="description">Description:</label></td>
				<td><form:input id="description" path="description" rows="2"
						value="${edititems.description}" /> <form:errors
						path="description" cssStyle="color : red;" /></td>
			</tr>

			<tr>
				<td><label for="unitPrice">Unit Price:</label></td>
				<td><form:input id="unitPrice" path="unitPrice"
						value="${edititems.unitPrice }" /> <form:errors path="unitPrice"
						cssStyle="color : red;" /></td>
			</tr>

			<tr>
				<td><label for="unitsInStock">Quantity:</label></td>
				<td><form:input id="unitsInStock" path="unitsInStock"
						value="${edititems.unitsInStock}" /> <form:errors
						path="unitsInStock" cssStyle="color : red;" /></td>
			</tr>

			<tr>
				<td><label for="condition">Condition:</label></td>
				<td><form:radiobutton path="itemCondition" value="New" />New <form:radiobutton
						path="itemCondition" value="Old" />Used <form:radiobutton
						path="itemCondition" value="Refurbished" />Refurbished</td>
			</tr>

			<tr>
				<td><label for="itemImage">Image:</label></td>
				<td><form:input id="itemImage" path="itemImage" type="file"
						value="${edititems.itemPath}" /> <input type="submit" id="btnAdd"
					value="Save" /></td>
			</tr>
		</table>


	</form:form>
</body>
</html>
