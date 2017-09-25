
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>

<!-- CSS de Bootstrap -->
<link rel="stylesheet" href="<c:url value='/css/bootstrap/bootstrap.min.css'/>" type="text/css"  />
<link rel="stylesheet" href="<c:url value='/font-awesome/css/font-awesome.min.css'/>" type="text/css" />
<!--Iconos-->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,500" />
<link rel="stylesheet" href="<c:url value='/css/bootstrap/custom.css'/>" type="text/css" />
 
</head>
<body>


	<div class="my-content">
		<div class="container">

			<div class="row">
				<div class="col-sm-12">
					<h1>
						<strong>GRV</strong> Gestión de Recursos Virtuales
					</h1>
					<!-- /login?error=true -->
					<c:if test="${param.error == 'true'}">
						<div style="color: red; margin: 10px 0px;">
							Login Failed!!!&nbsp; &nbsp;Reason :
							${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
						</div>
					</c:if>
				</div>
			</div>

			<div class="row">
				<div class="col-sm-6 col-sm-offset-3 myform-cont">
					<div class="myform-top">
						<div class="myform-top-left">
							<h3>Ingresa al Sistema.</h3>
							<p>Digita tu usuario y contraseña:</p>
						</div>
						<div class="myform-top-right">
							<i class="fa fa-key"></i>
						</div>
					</div>
					<div class="myform-bottom">
						<form role="form" name='f'
							action="${pageContext.request.contextPath}/j_spring_security_check"
							method='POST'>
							<div class="form-group">
								<input type="text" name="username" placeholder="Email..."
									class="form-control" id="form-username">
							</div>
							<div class="form-group">
								<input type="password" name="password"
									placeholder="Contraseña..." class="form-control"
									id="form-password">
							</div>
							<button name="submit" type="submit" class="mybtn">Entrar</button>
						</form>
					</div>
				</div>
			</div>
			<jsp:include page="common/footer.jsp" />
        </div>
    </div>			
</body>
</html>