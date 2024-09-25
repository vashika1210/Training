<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Name Registration</title>
</head>
<body>
    <h1>Name Registration</h1>
    <form action="register" method="post">
        <input type="text" name="name" placeholder="Enter name" required />
        <button type="submit">Register Name</button>
    </form>

    <h2>Registered Names:</h2>
    <ul>
        <c:forEach var="name" items="${registeredNames}">
            <li>${name}</li>
        </c:forEach>
    </ul>
</body>
</html>
