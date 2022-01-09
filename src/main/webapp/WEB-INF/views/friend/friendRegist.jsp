<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../taglib.jsp" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	
</script>
<body>
registList : <br>
<c:if test="${empty registList}">
NULL <br>
</c:if>
<c:if test="${!empty registList}">
<c:forEach var="friendRegistList" items="${registList}">
	${friendRegistList.seqSn}
	&nbsp;&nbsp;
	${friendRegistList.userId}
	&nbsp;&nbsp;
	${friendRegistList.friendId}
	&nbsp;&nbsp;
	${friendRegistList.stateAt}
	<br>
	---------------------------------------------
	<br><br>
	<br>
</c:forEach>
! NULL <br>
</c:if>
</body>
</html>