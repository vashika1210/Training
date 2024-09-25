<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple Form</title>
</head>
<body>
    <h1>Enter Your Details</h1>
    <form action="submit" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br><br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>
        <br><br>
        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male" required>
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="Female" required>
        <label for="female">Female</label>
        <br><br>
        <input type="submit" value="Submit">
    </form>

    <hr>

    <%-- Display submitted data if available --%>
    <h2>Submitted Information</h2>
    <% 
        String name = (String) request.getAttribute("name");
        String age = (String) request.getAttribute("age");
        String gender = (String) request.getAttribute("gender");
        
        if (name != null && age != null && gender != null) {
    %>
        <p><strong>Name:</strong> <%= name %></p>
        <p><strong>Age:</strong> <%= age %></p>
        <p><strong>Gender:</strong> <%= gender %></p>
    <% } %>
</body>
</html>
