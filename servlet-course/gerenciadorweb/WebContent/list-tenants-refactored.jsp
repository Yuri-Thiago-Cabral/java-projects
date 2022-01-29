<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c">
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt">

<fmt:formatDate />

<!DOCTYPE html>
<html lang="en">*
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <c:if test="${ not empity name }">
        <span>Empresa ${ name } com cnpj ${ cnpj } cadastrada com sucesso</span>
    </c:if>

    <c:if test="${ empity name }">
        <span>Nenhuma empresa registrada</span>
    </c:if>

    <ul>
        <c:forEach items="${ tenants }" var="tenant">
            <li>${ tenant.name } |
            <fmt:formatDate value="${ tenant.date }" pattern="dd/MM/yyyy"/>
               <a href="/api/v1/servlet/find/tenant?id=${ tenant.id }">Editar empresa</a>
            <a href="/api/v1/servlet/delete/tenant?id=${ tenant.id }">Deletar empresa</a>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
