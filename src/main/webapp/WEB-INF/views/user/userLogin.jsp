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

	<title>로그인</title>
	
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
	    <h2 class="form-signin-heading">로그인</h2>
	    <label for="inputEmail" class="sr-only">Email address</label>
	    <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
	    <label for="inputPassword" class="sr-only">Password</label>
	    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
	    <div class="checkbox">
	      <label>
	        <input type="checkbox" value="remember-me"> Remember me
	      </label>
	    </div>
	    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	  </form>
	
	</div> 
	<!-- /container -->

</body>
</html>