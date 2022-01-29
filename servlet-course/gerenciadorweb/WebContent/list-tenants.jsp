<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.List" %>
<%@ page import="br.com.treinamento.domain.Tenant" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <ul>
        <%
        List<Tenant> list = (List<Tenant>) request.getAttribute("tenants");
        for (Tenant tenant : list) {
        %>
            <li><%= tenant.getName() %></li>
        <% } %>
    </ul>
</body>
</html>
