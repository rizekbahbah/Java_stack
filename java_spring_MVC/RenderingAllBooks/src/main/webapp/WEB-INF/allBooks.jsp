<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html style="font-family: sans-serif;">
<head>
  <style>
    table, td, th, tr {
      border: 1px solid black;
      padding: 5px;
      text-align: center;
    }
  </style>
  <title><c:out value="${book.title}"/></title>
</head>
<body>
  <table>
    <tr>
      <th>ID</th>
      <th>Title</th>
      <th>Language</th>
      <th># Pages</th>
    </tr>
    <c:forEach var="book" items="${books}">
    <tr>
      <td><c:out value="${book.id}"/></td>
      <td><c:out value="${book.title}"/></td>
      <td><c:out value="${book.language}"/></td>
      <td><c:out value="${book.numberOfPages}"/></td>
    </tr>
    </c:forEach>
  </table>

</body>
</html>
