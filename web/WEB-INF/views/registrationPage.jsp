
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
  <title>Registration Page</title>
</head>

<body>
<spring:form method="post"  modelAttribute="userJSP" action="fio-out">

  Login: <spring:input path="login"/>  <br/> <br/>
  Password: <spring:input path="password"/>   <br/> <br/>
  <spring:button>Registration</spring:button>

</spring:form>

</body>

</html>
