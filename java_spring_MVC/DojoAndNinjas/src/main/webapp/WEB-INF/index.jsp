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
    <title>Ninja Form</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <hr>
    <div class="content">
        <div>
            <br><h1>Dojos</h1>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <c:forEach var="dojo" items="${dojos}">
                <tr>
                    <td><c:out value="${dojo.id}"/></td>
                    <td><c:out value="${dojo.name}"/></td>
                </tr>
                </c:forEach>
            </table>
        </div>
        <div>
            <br><h1>Ninjas</h1>
            <table>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Age</th>
                    <th>Dojo</th>
                </tr>
                <tr>
                    <c:forEach var="ninja" items="${ninjas}">
                <tr>
                    <td><c:out value="${ninja.id}"/></td>
                    <td><c:out value="${ninja.firstName}"/></td>
                    <td><c:out value="${ninja.lastName}"/></td>
                    <td><c:out value="${ninja.age}"/></td>
                    <td><c:out value="${ninja.dojo.name}"/></td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <br>
    <hr>
    <br>
    <div class="footer">
        <p><a href="/dojos/new">Add a Dojo</a></p>
        <p><a href="/ninjas/new">Add a Ninja</a></p>
    </div>
</body>
</html>

