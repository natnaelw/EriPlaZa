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

		</form:form>
	</section>
</body>
</html>
