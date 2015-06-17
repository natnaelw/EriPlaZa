<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Items</title>
</head>
<body>
	<section>
		<div class="jumbotron">
  			<div class="pull-right" style="padding-right:50px">
						
			</div>
			
		</div>
	</section>
	<section class="container">
		<form:form class="form-horizontal" modelAttribute="item"  enctype="multipart/form-data" >
			<fieldset>
				<legend>Add new Item</legend>
	
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="category">Category:</label>
					<div class="col-lg-10">
						
						 <form:select  id="category" path="category" class="form:input-large">
                        <form:option   value="0" label= "--Select Category--" />
                         <form:options items="${categories}" itemLabel="name" itemValue= "name"/>
 		 	
 		 	</form:select>
						
					</div>
				</div>

				<div>
					<label  for="name">Item Name:</label>
					<div>
						<form:input id="name" path="itemName" value="${item.itemName }"/>
						
					</div>
				</div>
				<div>
					<label for="description">Description:</label>
					<div >
						<form:textarea id="description" path="description" rows = "2" value="${item.description}"/>
					</div>
				</div>

				<div >
					<label  for="unitPrice">Unit Price:</label>
					<div>
						<div>
							<form:input id="unitPrice" path="unitPrice" value="${item.unitPrice }"/>
							
						</div>
					</div>
				</div>
				
				<div>
					<label  for="unitsInStock">Number Of Items:</label>
					<div >
						<form:input id="unitsInStock" path="unitsInStock"  value="${item.unitsInStock}"/>
					</div>
				</div>

				<div>
					<label  for="condition">Condition:</label>
					<div class="col-lg-10">
						<form:radiobutton path="itemCondition" value="New" />New 
						<form:radiobutton path="itemCondition" value="Old" />Old 
						<form:radiobutton path="itemCondition" value="Refurbished" />Refurbished
					</div>
				</div>
				
				<div >
					<label  for="itemImage">Image:</label>
					<div >
						<form:input id="itemImage" path="itemImage" type="file" value="${item.itemPath}"/>
					</div>
				</div>


				<div>
					<div >
						<input type="submit" id="btnAdd" value ="Save"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
