<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Hairdressers</title>
</head>
<body>
<h2>Add New Stylist</h2>
<p>
    <form:form action="/addStylist?hairdresser=${hairdresser}"  modelAttribute="stylist">
        Name: <form:input path="name"/><br/>
        <form:errors path="name"/><br/>
        Qualification: <form:input input="text" path="qualification"/><br/>
        <form:errors path="qualification"/><br/>
        Expertise: <form:input path="expertise"/><br/>
        <form:errors path="expertise"/><br/>
        Price: <form:input path="price"/><br/>
        <form:errors input="number" path="price"/><br/>
        <input type="submit"/>
    </form:form>




</p>
</body>
</html>