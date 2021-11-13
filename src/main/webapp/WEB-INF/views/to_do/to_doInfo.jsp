<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../taglib.jsp" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
작성자 : ${To_doInfo.userId}
<br>
주기 : ${To_doInfo.todoUnit}
<br>
제목 : ${To_doInfo.todoTitle}
<br>
내용 : ${To_doInfo.todoContent}
<br>
시작일자 : ${To_doInfo.todoBegin}
<br>
종료일자 : ${To_doInfo.todoEnd}
<br>
진행상태 : ${To_doInfo.todoSucessAt}
<br>
작성일자 : ${To_doInfo.registDate}

</body>
</html>