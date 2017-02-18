
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Index Page</title>
</head>

<body>

<spring:form method="post"  modelAttribute="userJSP" action="fio-out">
    Name    : <spring:input path="name"/>  <br/> <br/>
    Password: <spring:input path="password"/>   <br/> <br/>
    <spring:button>Autorisation</spring:button>
</spring:form>
<spring:form method="post"  modelAttribute="userJSP" action="registration">
    <spring:button>Registration</spring:button>
</spring:form>




</body>

</html>
