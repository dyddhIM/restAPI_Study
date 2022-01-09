<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../taglib.jsp" %>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<meta name="description" content="">
	<meta name="author" content="">

	<title>회원가입</title>
	
	   <!-- Bootstrap core CSS -->
    <link href="/js/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap core JS-->
    <script src="/js/bootstrap/js/bootstrap.min.js"></script>
    
</head>
<script type="text/javascript">
	
</script>
<body>

	<div class="container">
	
	  <form class="form-signin">
	    <h2 class="form-signin-heading">회원가입</h2>
	
	    <div class="row">
	      <div class="col-md-1">ID</div>
	      <div class="col-md-4">
	        <input type="text" id="inputEmail" class="form-control" placeholder="ID" required autofocus>
	        <p></p>
	      </div>
	      <div class="col-md-1">
	        <button class="btn btn-default" type="submit">중복체크</button>
	      </div>
	    </div>
	    <div class="row">
	      <div class="col-md-1">pw</div>
	      <div class="col-md-4">
	        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
	        <p></p>
	      </div>
	    </div>
	    <div class="row">
	      <div class="col-md-1">이름</div>
	      <div class="col-md-4">
	        <input type="text" id="inputName" class="form-control" placeholder="이름" required>
	        <p></p>                  
	      </div>
	    </div>
	    <div class="row">
	      <div class="col-md-1">생년월일</div>
	      <div class="col-md-4">
	        <input type="number" id="inputBirth" class="form-control" placeholder="생년월일" required>
	        <p></p>
	      </div>
	    </div>
	    <div class="row">
	      <div class="col-md-1">핸드폰</div>
	      <div class="col-md-4">
	        <input type="number" id="inputPonenum" class="form-control" placeholder="핸드폰" required>
	        <p></p>
	      </div>
	    </div>
	    <div class="row">
	      <div class="col-md-1">E-mail</div>
	      <div class="col-md-4">
	        <input type="email" id="inputEmail" class="form-control" placeholder="email" required>
	        <p></p>
	      </div>
	    </div>
	    
	    <button class="btn btn-lg btn-primary btn-block" type="submit">회원가입</button>
	  </form>
	
	</div> 
	<!-- /container -->

</body>
</html>