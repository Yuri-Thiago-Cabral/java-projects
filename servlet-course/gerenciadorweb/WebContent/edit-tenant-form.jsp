<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c">

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="${ apiRegisterLink }" method="post">
        Nome: <input type="text" name="name" value="${ currentTenant.name }" />
        Cnpj: <input type="text" name="cnpj" value="${ currentTenant.cnpj }" />
        Data: <input type="text" name="date" value="<fmt:formatDate value="${ tenant.date }" pattern="dd/MM/yyyy"/>"/>
        <input id="idTenant" type="hidden" name="id" value="${ currentTenant.id }"/>
        <input type="submit" />
    </form>
</body>
</html>