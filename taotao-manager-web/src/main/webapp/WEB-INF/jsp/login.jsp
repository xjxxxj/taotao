<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/b_login.css">
	<title>管理员登录</title>
</head>
<body>
<div class="login">
	<div class="loginmain">
		<h2>管理员登录</h2>
			<form action="#" class="form-horizontal" id="login-from">
		           <!-- 让表单在一行中显示form-horizontal -->
		          <div class="form-group">
		              <label for="username" class="col-lg-1 control-label">用户名</label>
		              <div class="col-lg-4">
		                <input type="text" name="username" id="username" class="form-control" placeholder="admin">
		                <p id="username-msg" style="color: red;"></p>
		              </div>              
		          </div>
				  <div class="form-group"></div>
				  <div class="form-group"></div>
		          <div class="form-group">
		              <label for="password" class="col-lg-1 control-label">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
		              <div class="col-lg-4">
		                <input type="password" name="password" id="password" class="form-control" placeholder="admin">
		                <p id="password-msg" style="color: red;"></p>
		              </div>              
		          </div>
                   <div class="form-group"></div>
                   <!-- <div class="form-group"></div> -->
		          <div class="form-group">
		            <div class="col-lg-11 col-lg-offset-1">              
		                <span class="checkbox ">
		                    <label><input type="checkbox" name="" class="checkbox-inline">记住我</label> 
		                </span>           
		            </div>
		          </div>

		          <div class="form-group">
		            <div class="col-lg-4 col-lg-offset-1">
		                <input type="button" name="button" value="登录" class="btn btn-danger btn-lg">
		                <span class="text"></span>              
		            </div>

		          </div>

		    </form>
	</div>
	<div class="rightpic">
		<div id="container">
			<!-- <img src="picture/1.jpg" alt="" width="500px" height="330px"> -->
		</div>
	</div>
</div>
<script src="${pageContext.request.contextPath }/public/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<!-- 三角剖分 -->
<script src="${pageContext.request.contextPath }/public/js/delaunay.js"></script>
<!-- 动画库 -->
<script src="${pageContext.request.contextPath }/public/js/TweenMax.js"></script>
<!-- jquery UI -->
<script src="${pageContext.request.contextPath }/js/effect.js"></script>
<script src="${pageContext.request.contextPath }/js/b_login.js"></script>
</body>
</html>