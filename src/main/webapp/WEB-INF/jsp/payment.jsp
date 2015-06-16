<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>

</head>
<body>
	<form:form modelAttribute="creditCard">
	<form:errors path="*" cssClass="alert alert-danger" element="div" />
	Item : ${item.itemName}<br/>
	Price: ${item.unitPrice}
		<div class="">
			<label class="" for="name"> <spring:message
					code="creditCard.form.type.label" /></label>
			<div class="">
				<form:select id="type" path="type" type="text" class="">
					<form:options items="${creditCardTypes}"/>
				</form:select>
			</div>
		</div>

		<div class="">
			<label class="" for="name"> <spring:message
					code="creditCard.form.name.label" /></label>
			<div class="">
				<form:input id="name" path="name" type="text" class="" />
				<form:errors path="name" cssClass="text-danger" />
			</div>
		</div>

		<div class="">
			<label class="" for="number"><spring:message
					code="creditCard.form.number.label" /></label>
			<div class="">
				<form:input id="number" path="number" type="text" class="" />
				<form:errors path="number" cssClass="text-danger" />
			</div>
			<label class="" for="cvv"><spring:message
					code="creditCard.form.cvv.label" /></label>
			<div class="">
				<form:input id="cvv" path="cvv" type="text" class="" />
				<form:errors path="cvv" cssClass="text-danger" />
			</div>
		</div>

		<div class="">
			<label class="" for="expireMonth"><spring:message
					code="creditCard.form.expireMonth.label" /></label>
			<div class="">
				<form:select id="expireMonth" path="expireMonth" type="text" class="">
					<form:options items="${months}"/>
				</form:select>
				<form:errors path="expireMonth" cssClass="text-danger" />
			</div>
		</div>

		<div class="">
			<label class="" for="expireYear"><spring:message
					code="creditCard.form.expireYear.label" /></label>
			<div class="">
				<form:input id="expireYear" path="expireYear" />
				<form:errors path="expireYear" cssClass="text-danger" />
			</div>
		</div>

		<div class="">
			<div class="">
				<input type="submit" id="btnAdd" class="btn btn-primary" value="Add" />
			</div>
		</div>

	</form:form>
</body>
</html>
