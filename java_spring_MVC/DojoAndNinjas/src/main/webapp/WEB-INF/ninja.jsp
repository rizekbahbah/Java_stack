<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Dojos&Ninjas</title>
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
  <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
  <br><h1>New Ninja </h1>
  <form:form action="/addNinja" method="POST" modelAttribute="ninja">
    <label class="label">Dojo: </label>
    <form:select path="dojo">
      <c:forEach var="dojo" items="${dojos}">
      <option value="${dojo.id}">${dojo.name}</option>
      </c:forEach>
    </form:select>
    <br> <br>
    <label class="label">First Name: </label>
    <form:input type="text" path="firstName"/><br>
    <form:errors path="firstName" class="errors"/><br>

    <label class="label">Last Name: </label>
    <form:input type="text" path="lastName"/><br>
    <form:errors path="lastName" class="errors"/><br>

    <label class="label">Age</label>
    <form:input type="number" path="age"/>
    <form:errors path="age" class="errors"/><br>
    <br>

    <input type="submit" value="Create" class="create">
  </form:form>
</body>
</html>

