<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Stylist</title>
</head>
<body>
<c:forEach var="hairdresser1" items="${stylists}">
    <h3>Name: ${hairdresser1.name}</h3><br/>
    <h3>Qualification: ${hairdresser1.qualification}</h3><br/>
    <h3>Expertise: ${hairdresser1.expertise}</h3><br/>
    <h3>Price: ${hairdresser1.price}</h3><br/>
</c:forEach>
<a href="/newStylist?hairdresser= ${hairdresser}">Link to new Stylists</a>
<p>

</p>
</body>
</html>