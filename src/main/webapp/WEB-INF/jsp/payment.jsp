<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>

</head>
<body>
		<form:form modelAttribute="creditCard" >

			<div class="">
				<label class="" for="name"> <spring:message
						code="creditCard.form.name.label" /></label>
				<div class="">
					<form:input id="name" path="name" type="text"
						class="" />
					<form:errors path="name" class="" />
				</div>
			</div>

			<div class="">
				<label class="" for="number"><spring:message
						code="creditCard.form.number.label" /></label>
				<div class="">
					<form:input id="number" path="number" type="text"
						class="" />
					<form:errors path="number" class="" />
				</div>
				<label class="" for="cvv"><spring:message
						code="creditCard.form.cvv.label" /></label>
				<div class="">
					<form:input id="cvv" path="cvv" type="text"
						class="" />
					<form:errors path="cvv" class="" />
				</div>
			</div>

			<div class="">
				<label class="" for="expireMonth"><spring:message
						code="creditCard.form.expireMonth.label" /></label>
				<div class="">
					<form:input id="expireMonth" path="expireMonth" type="text"
						class="" />
					<form:errors path="expireMonth" class="" />
				</div>
			</div>

			<div class="">
				<label class="" for="expireYear"><spring:message
						code="creditCard.form.expireYear.label" /></label>
				<div class="">
					<form:input id="expireYear" path="expireYear"/>
				</div>
			</div>

			<div class="">
				<div class="">
					<input type="submit" id="btnAdd" class="btn btn-primary"
						value="Add" />
				</div>
			</div>

		</form:form>
</body>
</html>
