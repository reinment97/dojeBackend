<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<%
    int listCount;

	List<HashMap<String, Object>> resultStudentList = new ArrayList<HashMap<String, Object>>();

	resultStudentList = (ArrayList<HashMap<String, Object>>)request.getAttribute("selectStudentList");
	listCount = resultStudentList.size();
%>
<p></p>
<p></p>
<form action="">
	<div id="testTable">
		<table border="1" bordercolor="1313EE" >
			<tbody>
				<tr>
					<td width="33%" align="center">
						<label>tbCode</label>
					</td>
					<td width="33%" align="center">
						<label>tableName</label>
					</td>
					<td width="33%" align="center">
						<label>tableContent</label>
					</td>					
				</tr>
				<%
					if(listCount > 0){
						for(int i=0; i<listCount; i++){
							HashMap<String, Object> tableListMap = resultStudentList.get(i);
				%>
				<tr>
					<td width="33%" align="center">
						<label><%= tableListMap.get("tbCode").toString() %></label>
					</td>
					<td width="33%" align="center">
						<label><%= tableListMap.get("tableName").toString() %></label>
					</td>
					<td width="33%" align="center">
						<label><%= tableListMap.get("tableContent").toString() %></label>
					</td>		
				</tr>
				<%
						}
					}
				%>
			</tbody>
		</table>
	</div>
</form>	
</body>
</html>
