<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Hairdressers</title>
</head>
<body>

<p>
    <c:forEach items="${hairdressers}" var="hairdresser">
        <h3>City: ${hairdresser.city}</h3>
        <h3>Founder: ${hairdresser.founder}</h3>
        <a href="/stylists?hairdresser=${hairdresser.id}"> Stylist</a>
    </c:forEach>
</p>
</body>
</html>