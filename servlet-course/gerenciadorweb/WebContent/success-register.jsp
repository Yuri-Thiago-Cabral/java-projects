<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%
//scriplet
String name = (String) request.getAttribute("name");
String cnpj = (String) request.getAttribute("cnpj");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <span>Empresa <% out.println(name); %> cadastrada com sucesso</span>
    <br />
    <span>Empresa <%= name %> com cnpj <%= cnpj %> cadastrada com sucesso</span>
</body>
</html>
