<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<style>
		input {
			margin-bottom : 5px;
		}
		
		#id {
			margin-left: 8px;
		}
		
		#sub {
			width : 184px;
		}
		
		#btn{
			width : 184px;
		}
	</style>
	<script src="js/jquery-3.7.1.min.js"></script>
	<script src = "js/Login.js"></script>
	</head>
<body>
	<h1>로그인</h1>
	<form action="Controller?command=Main" method="post">
		ID : <input type = "text" name = "id" id="id"><br/>
		PW : <input type = "password" name = "pw"/><br/>
		<input type = "submit" value = "로그인" id = "sub"/><br/>
		<input type = "button" value = "회원가입" id = "btn"/>
	</form>
</body>
</html>