<%@page session="false"%>
<html>
<head>
<title>${title}</title>
</head>
<body>
    <jsp:include page="_menu.jsp" />
 	<jsp:include page="common/header.jsp" />
 
    <h1>Message : ${message}</h1>
</body>
</html>