<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.form.title"></spring:message></title>
</head>
<body>
<form:form modelAttribute="user" method="POST" enctype="utf8">
<table>
<tr>
<td><label><spring:message code="label.user.firstName"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="fname" value="" />
 <form:errors path="fname" element="div"/>
</td>
</tr>


<tr>
<td><label><spring:message code="label.user.lastName"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="lname" value="" />
<form:errors path="lname" element="div" />
</td>
</tr>



<tr>
<td><label><spring:message code="label.user.email"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="email" value="" />
 <form:errors path="email" element="div" /> 
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.phone"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="phone" value="" />
 <form:errors path="phone" element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.userName"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="username" value="" />
<form:errors path="username" element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.password"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="password" value="" type="password" />
<form:errors path="password" element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.address.str"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="street" value="" type="street" />
<form:errors element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.address.state"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="state" value="" type="state" />
<form:errors element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.address.zip"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="zipcode" value="" type="zipcode" />
<form:errors element="div" />
</td>
</tr>
<tr>
<td>
<button type="submit"><spring:message code="label.form.submit"></spring:message></button>
</td>
</tr>
</table>

</form:form>





<!--     <H1> -->
<%--         <spring:message code="label.form.title"></spring:message> --%>
<!--     </H1> -->
<%--     <form:form modelAttribute="user" method="POST" enctype="utf8"> --%>
<!--         <br> -->
<!--         <p> -->
<!--         <table> -->
<!--         <tr> -->
<%--         <td><label><spring:message code="label.user.firstName"></spring:message> --%>
<!--             </label> -->
<!--         </td> -->
<%--         <td><form:input path="fname" value="" /></td> --%>
<%--         <form:errors path="fname" element="div"/> --%>
<!--     </tr> -->
<!--     </p> -->
<!--       <br> -->
<!--       <p> -->
<!--     <tr> -->
<%--         <td><label><spring:message code="label.user.lastName"></spring:message> --%>
<!--             </label> -->
<!--         </td> -->
<%--         <td><form:input path="lname" value="" /></td> --%>
<%--         <form:errors path="lname" element="div" /> --%>
<!--     </tr> -->
<!--     </p> -->
<!--       <br> -->
<!--       <p> -->
<!--     <tr> -->
<%--         <td><label><spring:message code="label.user.email"></spring:message> --%>
<!--             </label> -->
<!--         </td> -->
<%--         <td><form:input path="email" value="" /></td> --%>
<%--         <form:errors path="email" element="div" /> --%>
<!--     </tr> -->
<!--     </p> -->
<!--       <br> -->
<!--       <p> -->
<!--       <tr> -->
<%--         <td><label><spring:message code="label.user.userName"></spring:message> --%>
<!--             </label> -->
<!--         </td> -->
<%--         <td><form:input path="username" value="" /></td> --%>
<%--         <form:errors path="username" element="div" /> --%>
<!--     </tr> -->
<!--     </p> -->
<!--       <br> -->
<!--       <p> -->
<!--       <tr> -->
<%--         <td><label><spring:message code="label.user.phone"></spring:message> --%>
<!--             </label> -->
<!--         </td> -->
<%--         <td><form:input path="phone" value="" /></td> --%>
<%--         <form:errors path="phone" element="div" /> --%>
<!--     </tr> -->
<!--     </p> -->
<!--       <br> -->
<!--       <p> -->
<!--     <tr> -->
<%--         <td><label><spring:message code="label.user.password"></spring:message> --%>
<!--             </label> -->
<!--         </td> -->
<%--         <td><form:input path="password" value="" type="password" /></td> --%>
<%--         <form:errors path="password" element="div" /> --%>
<!--     </tr> -->
<!--     </p> -->
<!--     <br> -->
<!--    <p> -->
<!--   <tr>  -->
<%--         <td><label><spring:message code="label.user.address.str"></spring:message>  --%>
<!--             </label>  -->
<!--         </td>  -->
<%--       <td><form:input path="street" value="" type="street" /></td>  --%>
<%--       <form:errors element="div" /> --%>
<!--    </tr>  -->
<!--    <br> -->
<!--    </p> -->
<!--    <p> -->
<!--     <tr>  -->
<%--    <td><label><spring:message code="label.user.address.state"></spring:message>  --%>
<!--      </label>  -->
<!--  </td>  -->
<%--      <td><form:input path="state" value="" type="state" /></td>  --%>
<%--   <form:errors element="div" />  --%>
<!-- </tr>  -->
<!-- </br> -->
<!-- </p> -->
<!-- <p> -->

<!--    <tr>  -->
<%--     <td><label><spring:message code="label.user.address.zip"></spring:message>  --%>
<!--       </label>  -->
<!--    </td>  -->
<%--   <td><form:input path="zipcode" value="" type="zipcode" /></td>  --%>
<%--     <form:errors element="div" />  --%>
<!--  </tr> -->
<!--   <br> -->
<!--   </p> -->
<!--   </table> -->
<!--     <p> -->
<%--         <button type="submit"><spring:message code="label.form.submit"></spring:message> --%>
<!--         </button> -->
<%--     </form:form> --%>
<!--     </p> -->
<!--     <br> -->
<!--     <p> -->
<%--     <a href="<c:url value="login.html" />"> --%>
<%--         <spring:message code="label.form.loginLink"></spring:message> --%>
<!--     </a> -->
<!--     </p> -->
<!-- </body> -->
</html>