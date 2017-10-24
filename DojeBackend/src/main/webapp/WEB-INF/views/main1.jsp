<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Main</title>
</head>
<body>

<h1>Main Page!</h1>

	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		<input type="submit" value="로그아웃" />
	</form:form>

</body>
</html>
