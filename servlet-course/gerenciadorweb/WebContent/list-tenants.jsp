<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.treinamento.servlets.Tenant" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<%
			List<Tenant> list = (List<Tenant>) request.getAttribute("tenants");
			for (Tenant tenant : list) {
		%>
		
		<li><%= tenant.getName() %></li>
		
		<%
			}
		%>
	</ul>
</body>
</html>