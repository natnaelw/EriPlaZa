<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
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
		<form:form  modelAttribute="item" action="additem" class="form-horizontal" enctype="multipart/form-data" >
			<fieldset>
				<legend>Add new Item</legend>
	
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="category">Category:</label>
					<div class="col-lg-10">
						
						 <form:select  id="category" path="category" class="form:input-large">
                        <form:option value="0" label= "--Select Category--" />
                         <form:options items="${categories}"  />
 		 	
 		 	</form:select>
						
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">Item Name:</label>
					<div class="col-lg-10">
						<form:input id="name" path="itemName"  class="form:input-large"/>
						
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description:</label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows = "2"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitPrice">Unit Price:</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="unitPrice" path="unitPrice"  class="form:input-large"/>
							
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="unitsInStock">Number Of Items:</label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInStock"  class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="condition">Condition:</label>
					<div class="col-lg-10">
						<form:radiobutton path="itemCondition" value="New" />New 
						<form:radiobutton path="itemCondition" value="Old" />Old 
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


				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
