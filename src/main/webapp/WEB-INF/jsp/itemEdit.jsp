<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Items</title>
</head>
<body>

	<form:form modelAttribute="item" enctype="multipart/form-data">
		<fieldset>

				<label for="category">Category:</label>	
			<form:select id="category" path="category.id">
				<form:option value="0" label="--Select Category--" />
				<form:options items="${categories}" itemLabel="name" itemValue="id" />
			</form:select>
			<div>
				<label for="name">Item Name:</label>			
					<form:input id="name" path="itemName" value="${items.itemName }" />			
			</div>
			<div>
				<label for="description">Description:</label>
					<form:textarea id="description" path="description" rows="2"
						value="${items.description}" />		
			</div>
			<div>
				<label for="unitPrice">Unit Price:</label>
				
						<form:input id="unitPrice" path="unitPrice"
						value="${items.unitPrice }" />
					</div>

			<div>
				<label for="unitsInStock">Quantity:</label>
					<form:input id="unitsInStock" path="unitsInStock"
						value="${items.unitsInStock}" />
			</div>

			<div>
				<label for="condition">Condition:</label>
				
					<form:radiobutton path="itemCondition" value="New" />
					New
					<form:radiobutton path="itemCondition" value="Old" />
					Old
					<form:radiobutton path="itemCondition" value="Refurbished" />
					Refurbished
				</div>
			

			<div>
				<label for="itemImage">Image:</label>
		
					<form:input id="itemImage" path="itemImage" type="file" value="${items.itemPath}" />
			
		</div>

			<div>
				<input type="submit" id="btnAdd" value="Save" />
			</div>

		</fieldset>
	</form:form>
</body>
</html>
