<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Ninja Gold</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="top">
        <h1 id="yourGold">Your Gold: <c:out value="${gold}"/></h1>
        <form action="/earn" method="POST">
            <input type="hidden" name="earn" value="reset">
            <input type="submit" value="Reset" class="btn">
        </form>
    </div>
    <div class="container">
        <div class="box">
            <form action="/earn" method="POST">
                <h2>Farm</h2>
                <p>earns 10-20 gold</p><br>
                <input type="hidden" name="earn" value="farm">
                <input type="submit" value="Find Gold" class="btn">
            </form>
        </div>
        <div class="box">
            <form action="/earn" method="POST">
                <h2>Cave</h2>
                <p>earns 5-10 gold</p><br>
                <input type="hidden" name="earn" value="cave">
                <input type="submit" value="Find Gold" class="btn">
            </form>
        </div>
        <div class="box">
            <form action="/earn" method="POST">
                <h2>House</h2>
                <p>earns 2-5 gold</p><br>
                <input type="hidden" name="earn" value="house">
                <input type="submit" value="Find Gold" class="btn">
            </form>
        </div>
        <div class="box">
            <form action="/earn" method="POST">
                <h2>Quest</h2>
                <p>earns/takes 0-50 gold</p><br>
                <input type="hidden" name="earn" value="quest">
                <input type="submit" value="Find Gold" class="btn">
            </form>
        </div>
    </div>
    <div class="footer"><br>
        <h2>Activities:</h2>
     
     
            <c:forEach var="message" items="${messages}">
                <c:if test="${message.contains('earned')}">
                    <p style="color: springgreen;"><c:out value="${message}"/></p>
                </c:if>
                <c:if test="${message.contains('lost')}">
                    <p style="color: indianred"><c:out value="${message}"/></p>
                </c:if>
            </c:forEach>
    </div>
</body>
</html>