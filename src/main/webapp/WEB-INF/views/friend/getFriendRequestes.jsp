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
RequestList : <br>
<c:if test="${empty RequestList}">
NULL <br>
</c:if>
<c:if test="${!empty RequestList}">
<c:forEach var="friendRequestList" items="${RequestList}">
	${friendRequestList.seqSn}
	&nbsp;&nbsp;
	${friendRequestList.userId}
	&nbsp;&nbsp;
	${friendRequestList.requestId}
	&nbsp;&nbsp;
	${friendRequestList.stateAt}
	<br>
	---------------------------------------------
	<br><br>
	<br>
</c:forEach>
! NULL <br>
</c:if>
</body>
</html>