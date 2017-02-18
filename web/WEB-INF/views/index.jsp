
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Autorisation Page</title>
</head>

<body>
<h1> Авторизуйтесь или зарегистрируйтесь</h1>
<spring:form method="post"  modelAttribute="userJSP" action="fio-out">
    Login    : <spring:input path="login"/>  <br/> <br/>
    Password: <spring:input path="password"/>   <br/> <br/>
    <spring:button>Autorisation</spring:button>
</spring:form>
<spring:form method="post"  modelAttribute="userJSP" action="registration">
    <spring:button>Registration</spring:button>
</spring:form>
<br/> <br/>
<h5> Для проверки :</h5>
<h5> Login: goga,    Pass: gg,   Status: Admin</h5>
<h5> Login: ivan,    Pass: iv,   Status: Admin</h5>
<h5> Login: sveta,   Pass: sv,   Status: Seller</h5>
<h5> Login: gosha,   Pass: gsh,  Status: Buyer</h5>
<h5> Login: fedor,   Pass: fd,   Status: Buyer</h5>

</body>

</html>
