<%
	String tenantName = (String) request.getAttribute("name");
	System.out.println(tenantName);
%>

<html>
	<body>
		Empresa <%= tenantName %> cadastrada com scesso
	</body>
</html>
