<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>회원가입</title>
	<style>
		input {
			margin-bottom : 5px;
		}
		
		#id {
			margin-left: 25px;
		}
		
		#pw {
			margin-left : 17px;
		}
		
		#submit {
			width : 200px;
		}
	</style>
	<script src="js/jquery-3.7.1.min.js"></script>
	<script src = "js/Membership.js"></script>
	</head>
<body>
	<h1>회원가입</h1>
	<form action = "Controller?command=Login" method="post">
		ID : <input type = "text" name = "id" id="id"><br/>
		PW : <input type = "password" name = "pw" id="pw"/><br/>
		Name : <input type = "text" name = "name"/><br/>
		<input type = "submit" value = "작성완료" id = "submit"/><br/>
	</form>
</body>
</html>