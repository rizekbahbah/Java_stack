<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<html>
<head>
    <style>
        body {
            font-family: sans-serif;
            padding: 20px 100px;
        }
        tr, th, td {
            border: 1px solid black;
            padding: 5px;
            text-align: center;
        }
        .errors {
            color: indianred;
        }
        form > .label {
            width: 100px;
        }
    </style>
    <title>Burger Tracker 1</title>
</head>
<body>
<br><h1>Edit a Burger: </h1>
<form:form action="/updateBurger/${burger.id}" method="POST" modelAttribute="burger">
    <label class="label">Burger Name</label>
    <form:input type="text" path="burgerName"/><br>
    <form:errors path="burgerName" class="errors"/><br>

    <label class="label">Restaurant Name</label>
    <form:input type="text" path="restaurantName"/><br>
    <form:errors path="restaurantName" class="errors"/><br>

    <label class="label">Rating</label>
    <form:input type="number" path="burgerRating"/>
    <%--<form:select path="burgerRating">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
    </form:select>--%>
    <form:errors path="burgerRating" class="errors"/><br>

    <label class="label">Notes</label>
    <form:textarea path="burgerNotes" cols="40" rows="2"></form:textarea>
    <form:errors path="burgerNotes" class="errors"/> <br>

    <input type="submit" value="Submit">
</form:form>
</body>
</html>

