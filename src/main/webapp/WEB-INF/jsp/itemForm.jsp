<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>Items</title>

</head>
<body>

	<p>
		Hello ${user.fname} <a
			href="<spring:url value="/userpage?id=${user.id}" />"> BACK</a>
	</p>
<table>
	<form:form modelAttribute="item" enctype="multipart/form-data">

		

<<<<<<< HEAD
		<label for="category">Category:</label>
		<form:select id="category" path="category.id">
			<form:option value="0" label="--Select Category--" />
			<form:options items="${categories}" itemLabel="name" itemValue="id" />
			<form:errors path="itemName" cssStyle="color : red;" />
		</form:select>
		
				<label for="name">Item Name:</label>
		<form:input id="name" path="itemName" />

		<form:errors path="itemName" cssStyle="color : red;" />

		<label for="description">Description:</label>
		<form:textarea id="description" path="description" rows="2" />

		<form:errors path="description" cssStyle="color : red;" />

		<label for="unitPrice">Unit Price:</label>
		<form:input id="unitPrice" path="unitPrice" />
		<form:errors path="unitPrice" cssStyle="color : red;" />
			<div>
				<label  for="unitsInStock">Quantity:</label>
				<form:input id="unitsInStock" path="unitsInStock" />
			<div style="text-align: center;">
 				<form:errors path="unitsInStock" cssStyle="color : red;" /> 
 			</div>
			</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="condition">Condition:</label>
					<div class="col-lg-10">
						<form:radiobutton path="itemCondition" value="New" />New 
						<form:radiobutton path="itemCondition" value="Used" />Used 
						<form:radiobutton path="itemCondition" value="Refurbished" />Refurbished
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="itemImage">Image:</label>
					<div class="col-lg-10">
						<form:input id="itemImage" path="itemImage" type="file"
							class="form:input-large" />
					</div>
				</div>

	
	</form:form>
	</table>

</body>
</html>
