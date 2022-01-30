<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/application" var="apiEditTenant" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="${ apiEditTenant }" method="post">
        Nome: <input type="text" name="name" value="${ currentTenant.name }" />
        Cnpj: <input type="text" name="cnpj" value="${ currentTenant.cnpj }" />
        Data: <input type="text" name="date" value="<fmt:formatDate value="${ currentTenant.date }" pattern="dd/MM/yyyy"/>"/>
        <input id="idTenant" type="hidden" name="id" value="${ currentTenant.id }"/>
        <input type="hidden" name="action" value="editTenant"/>
        <input type="submit" />
    </form>
</body>
</html>