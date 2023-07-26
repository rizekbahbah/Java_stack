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
  <meta charset="UTF-8">
  <title>Edit Travels</title>
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
  <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
  <br>
  <div class="header">
    <h1 class="expenseH1"><c:out value="${expense.name}"/></h1>
    <h1><a href="/" class="goBack">Go Back</a></h1>
  </div>
  <br>
  <p>Expense Name: <c:out value="${expense.name}"/></p>
  <p>Expense Description: <c:out value="${expense.description}"/></p>
  <p>Vendor: <c:out value="${expense.vendor}"/></p>
  <p>Amount Spent: $<c:out value="${expense.amount}"/></p>


</body>
</html>
