<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>

</head>
<body>
	<section class="container">
		<form:form modelAttribute="creditCard" class="form-horizontal">
			<fieldset>
				<form:errors path="*" cssClass="alert alert-danger" element="div" />
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="name">
					<spring:message code="creditCard.form.name.label" /></label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text"
							class="form:input-large" />
						<form:errors path="name" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="number"><spring:message
							code="creditCard.form.number.label" /></label>
					<div class="col-lg-10">
						<form:input id="number" path="number" type="text"
							class="form:input-large" />
						<form:errors path="number" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="expireMonth"><spring:message
							code="creditCard.form.expireMonth.label" /></label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="expireMonth" path="expireMonth" type="text"
								class="form:input-large" />
							<form:errors path="expireMonth" cssClass="text-danger" />
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="expireYear"><spring:message
							code="creditCard.form.expireYear.label" /></label>
					<div class="col-lg-10">
						<form:textarea id="expireYear" path="expireYear" rows="2" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Add" />
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>
