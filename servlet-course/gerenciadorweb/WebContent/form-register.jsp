<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/application" var="apiRegisterLink" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="${ apiRegisterLink }" method="post">
        Nome: <input type="text" name="name" />
        Cnpj: <input type="text" name="cnpj" />
        Data: <input type="text" name="date"/>
        <input type="hidden" name="action" value="registerTenant"/>
        <input type="submit" />
    </form>
</body>
</html>
