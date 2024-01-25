<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>관리자페이지(회원정보수정)</title>
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
	</head>
<body>
	<h1>회원관리-수정관리자</h1>
	<form action = "Controller?command=MemberModify">
		ID : <input type = "text" name = "id" id="id" readonly><br/>
		PW : <input type = "password" name = "pw" id="pw"/><br/>
		Name : <input type = "text" name = "name"/><br/>
		point : <input type = "text" name = "name"/><br/>
		<input type = "submit" value = "제출" id = "submit"/><br/>
	</form>
</body>
</html>