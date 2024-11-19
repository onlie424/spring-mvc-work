<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Hairdressers</title>
</head>
<body>
<h2>Add New Hairdresser</h2>
<p>
<form:form action="/addHairdresser" modelAttribute="hairdresser">
    ID:<form:input input="number" path="id"/><br/>
    <form:errors path="id"/><br/>
    City:<form:input input="text" path="city"/><br/>
    <form:errors path="city"/><br/>
    Founder:<form:input input="text"  path="founder"/><br/>
    <form:errors path="founder"/><br/>
    <input type="submit"/>
</form:form>




</p>
</body>
</html>