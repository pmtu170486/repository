<%@ page contentType = "text/html; charset = UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Hello World</title>
</head>

<body>
<h2>Hello World</h2>

<form:form commandName="items" action="view">

    <table>
        <tr>
            <th>name</th>
            <th>address</th>
        </tr>
        <c:forEach items="${items.employees}" var="emp" varStatus="count">
            <tr>
                <td>
                    <form:input path="employees[${count.index}].name"/>
                    <form:input path="employees[${count.index}].address"/>

                </td>
            </tr>
        </c:forEach>

    </table>
    <input type="submit" value="Save"/>
</form:form>
</body>
</html>