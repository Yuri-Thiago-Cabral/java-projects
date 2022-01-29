<!DOCTYPE html>
<html lang="en">
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
</body>
</html>
