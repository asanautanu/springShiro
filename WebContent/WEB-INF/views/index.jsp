<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="param" value="Valeriu"/>
	<p>
		Hola <c:out value="${param1}" />, ¿tienes <c:out value="${edad}" /> años?
	</p>
</body>
</html>