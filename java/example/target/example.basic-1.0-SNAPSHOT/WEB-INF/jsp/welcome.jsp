<%--
  Created by IntelliJ IDEA.
  User: pmtu
  Date: 3/29/2017
  Time: 5:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Welcome</h2>
<c:forEach items="${listResult}" var="item">
    ${item.name} - ${item.address} <br/>
</c:forEach>
</body>
</html>
