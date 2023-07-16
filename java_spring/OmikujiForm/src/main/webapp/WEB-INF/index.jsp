<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Omikuji</title>
</head>
<body>
    <form action="/send" method="POST" style="border: 5px solid black; width: fit-content; padding: 20px;">
        <label>Pick any number from 5 to 25</label><br>
        <select name="number">
            <option value="5">2</option>
            <option value="10">4</option>
            <option value="15">8</option>
            <option value="20">12</option>
            <option value="25">16</option>
        </select>
        <br><label>Enter the name of any city</label><br>
        <input type="text" name="city"><br>
        <label>Enter the name of any real person</label><br>
        <input type="text" name="name"><br>
        <label>Enter professional endeavor or hobby</label><br>
        <input type="text" name="hobby"><br>
        <label>Enter any type of living thing</label><br>
        <input type="text" name="animal"><br>
        <label>Say something nice to someone</label><br>
        <textarea name="something" cols="50" rows="5"></textarea><br>
        <p>Send and show a friend</p>
        <input type="submit" value="Send">
    </form>
</body>
</html>
