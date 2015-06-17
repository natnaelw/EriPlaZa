<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div class="row" >
			<c:forEach items="${items}" var="item">
		<div class="article" style="padding-bottom: 15px">
					<div class="thumbnail">
					<img src="<c:url value="/resources/images/${item.itemName}.png"></c:url>" alt="image"  style = "width:100%"/>
						<div class="caption">
							<h3>${item.itemName}</h3>
							<p>${item.description}</p>
							<p>${item.unitPrice}USD</p>
							<p>Available ${item.unitsInStock} units in stock</p>
							<p>
								<a
									href="<spring:url value="/items/item?id=${item.itemId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Buy
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>

</body>
</html>