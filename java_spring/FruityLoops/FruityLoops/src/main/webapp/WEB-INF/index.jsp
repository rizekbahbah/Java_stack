<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/14/2023
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><html>
<head>
    <title>Fruity Loops</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
  <table>
    <tr>
        <th>Name</th>
        <th>Price</th>
    </tr>
    <c:forEach var="fruit" items="${fruits}">
      <tr>
        <td><c:out value="${fruit.name}"/></td>
        <td><c:out value="${fruit.price}"/></td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
