<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Student list</h1>
	<table border="1">
		<tr align="center">
			<td width="100px">id</td>
			<td width="100px">이름</td>
			<td width="100px">나이</td>
			<td width="100px">등록일</td>
		</tr>
		<c:forEach var="student" items="${Students}">
			<tr align="center">
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.age}</td>
				<td>${student.created}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>