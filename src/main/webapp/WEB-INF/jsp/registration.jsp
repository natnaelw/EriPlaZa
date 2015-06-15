
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title><spring:message code="label.form.title"></spring:message></title>
</head>
<body>
    <H1>
        <spring:message code="label.form.title"></spring:message>
    </H1>
    <form:form modelAttribute="user" method="POST" enctype="utf8">
        <br>
        <p>
        <tr>
        <td><label><spring:message code="label.user.firstName"></spring:message>
            </label>
        </td>
        <td><form:input path="fname" value="" /></td>
        <form:errors path="fname" element="div"/>
    </tr>
    </p>
      <br>
      <p>
    <tr>
        <td><label><spring:message code="label.user.lastName"></spring:message>
            </label>
        </td>
        <td><form:input path="lname" value="" /></td>
        <form:errors path="lname" element="div" />
    </tr>
    </p>
      <br>
      <p>
    <tr>
        <td><label><spring:message code="label.user.email"></spring:message>
            </label>
        </td>
        <td><form:input path="email" value="" /></td>
        <form:errors path="email" element="div" />
    </tr>
    </p>
      <br>
      <p>
      <tr>
        <td><label><spring:message code="label.user.userName"></spring:message>
            </label>
        </td>
        <td><form:input path="username" value="" /></td>
        <form:errors path="username" element="div" />
    </tr>
    </p>
      <br>
      <p>
      <tr>
        <td><label><spring:message code="label.user.phone"></spring:message>
            </label>
        </td>
        <td><form:input path="phone" value="" /></td>
        <form:errors path="phone" element="div" />
    </tr>
    </p>
      <br>
      <p>
    <tr>
        <td><label><spring:message code="label.user.password"></spring:message>
            </label>
        </td>
        <td><form:input path="password" value="" type="password" /></td>
        <form:errors path="password" element="div" />
    </tr>
    </p>
    <br>
   <p>
  <tr> 
        <td><label><spring:message code="label.user.address.str"></spring:message> 
            </label> 
        </td> 
      <td><form:input path="street" value="" type="street" /></td> 
      <form:errors element="div" />
   </tr> 
   <br>
   </p>
   <p>
    <tr> 
   <td><label><spring:message code="label.user.address.state"></spring:message> 
     </label> 
 </td> 
     <td><form:input path="state" value="" type="state" /></td> 
  <form:errors element="div" /> 
</tr> 
</br>
</p>
<p>

   <tr> 
    <td><label><spring:message code="label.user.address.zip"></spring:message> 
      </label> 
   </td> 
  <td><form:input path="zipcode" value="" type="zipcode" /></td> 
    <form:errors element="div" /> 
 </tr>
  <br>
  </p>
    <p>
        <button type="submit"><spring:message code="label.form.submit"></spring:message>
        </button>
    </form:form>
    </p>
    <br>
    <p>
    <a href="<c:url value="login.html" />">
        <spring:message code="label.form.loginLink"></spring:message>
    </a>
    </p>
</body>
</html>