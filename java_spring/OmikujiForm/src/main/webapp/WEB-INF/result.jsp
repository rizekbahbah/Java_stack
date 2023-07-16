<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Fortune</title>
</head>
<body style="text-align: center; font-family: Consolas;">
    <h1>Here's Your Omikuji</h1>
    <div style="font-size: larger; width: 250px; height: 200px; margin: auto; background-color: blue; border-radius: 5px; padding: 50px">
        <p>
            in <c:out value="${number}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${name}"/> as your
            roommate, <c:out value="${hobby}"/> for a living. The next time you see a <c:out value="${animal}"/>, you will have good luck.
            Also, <c:out value="${something}"/>.
        </p>
    </div>
    <br><br>
    <a href="/omikuji">Go back</a>

</body>
</html>
