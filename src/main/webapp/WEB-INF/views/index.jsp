<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="taglib.jsp" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>메인화면</title>

    <!-- Bootstrap core CSS -->
    <link href="/js/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/signin.css" rel="stylesheet">

    <!-- Bootstrap core JS-->
    <script src="/js/bootstrap/js/bootstrap.min.js"></script>
  </head>

  <body>
    <!-- navbar -->
    <div class="navbar navbar-default">
      <div class="container-fluid">
      
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">
            <span class="glyphicon glyphicon-align-justify" aria-hidden="true"></span>
            <a class="navbar-brand" href="#">Main</a>
          </a>
          <!--<a class="navbar-brand" href="#">Main</a>-->
        </div>

        <!-- Nav body -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">메뉴1<span class="sr-only">(current)</span></a></li>
            <li><a href="#">메뉴2</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">오른쪽메뉴</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">로그인
                <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#">로그인</a></li>
                <li><a href="#">회원가입</a></li>
                <li><a href="#">로그아웃</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </div> <!-- /navbar -->

    <!-- sidebar -->
    <div class="col-md-3">
      <div class="panel panel-info">
          <div class="panel-heading">
            <h3 class="panel-title">사이드바</h3>
          </div>
          <div class="panel-primary">
            <a>불편불편</a>
          </div>
      </div>
    </div>
    
    <!-- Main Card-->
    <div class="col-md-9 border">
      <div class="w-auto p-3 h-auto d-inline-block" style="background-color: rgb(255, 255, 255);">
        <img src="/img/bootstrapExampleImg/bootstrap-logo.png">
        <P>이런느낌?</P>
      </div>

    </div>
  </body>
</html>
