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
    <title>Save Travels</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <h1>Save Travels</h1>
    <table>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
        <tr>
            <c:forEach var="expense" items="${expenses}">
        <tr>
            <td><a href="/expenses/${expense.id}"><c:out value="${expense.name}"/></a></td>
            <td><c:out value="${expense.vendor}"/></td>
            <td>$<c:out value="${expense.amount}"/></td>
            <td>
                <a href="/edit/${expense.id}">Edit</a>
                <form action="/delete/${expense.id}" method="POST">
                    <input type="hidden" value="${expense.id}">
                    <input type="submit" value="Delete" class="delete">
                </form>
            </td>
        </tr>
        </c:forEach>
    </table>

    <br><h1>Add an Expense: </h1>
    <form:form action="/addExpense" method="POST" modelAttribute="expense">
        <label class="label">Expense Name</label>
        <form:input type="text" path="name"/><br>
        <form:errors path="name" class="errors"/><br>

        <label class="label">Vendor</label>
        <form:input type="text" path="vendor"/><br>
        <form:errors path="vendor" class="errors"/><br>

        <label class="label">Amount</label>
        <form:input type="number" step="0.01" path="amount"/>
        <form:errors path="amount" class="errors"/><br>

        <label class="label">Description</label>
        <form:textarea path="description" cols="40" rows="3"></form:textarea>
        <form:errors path="description" class="errors"/> <br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>


