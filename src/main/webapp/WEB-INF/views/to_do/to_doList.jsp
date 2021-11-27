<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../taglib.jsp" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
selectTo_dos : <br>
<c:if test="${empty selectTo_dos}">
NULL <br>
</c:if>
<c:if test="${!empty selectTo_dos}">
<c:forEach var="todoList" items="${selectTo_dos}">
	${todoList.todoTitle}
	<br>
</c:forEach>
! NULL <br>
</c:if>
${deleteMessage}
</body>
</html>