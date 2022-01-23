<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<c:if test="${ not empity name }">
			Empresa ${ name } cadastrada com sucesso
		</c:if>
	</body>
</html>