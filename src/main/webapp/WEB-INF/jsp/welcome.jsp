<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"> 
<!-- <link rel="stylesheet" href="/resources/css/layout.css" type="text/css" /> -->

<title>Welcome</title>
</head>
<body>

	<section>
			<div class="container">
				<h1> ${greeting} </h1>
				<p> ${tagline} </p>
			</div>
			<a href=" <spring:url value="/registration"/>"  > <spring:message code="label.form.signupLink"></spring:message></a>
	</section>
	</body>
	

</html>
