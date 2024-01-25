<%@page import="dao.MemberDao"%>
<%@page import="vo.memberVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<memberVo> listVo = (ArrayList<memberVo>)request.getAttribute("listVo");
%> 
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>관리자 페이지</title>
	<link rel ="stylesheet" href = "css/AdminPage.css">
	</head>
<body>
	<div class = 'header1'>
		<h1>회원관리</h1>
		<button>로그인</button>
	</div>
	<div class = "table_container">
		<table>
			<tr>
				<th>ID</th>
				<th>PW</th>
				<th>Name</th>
				<th>Point</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			
			<% 
			let idx=0;			
			for(idx=0; listVo.size()-1; idx++;){ 
			%>
			<!-- 반복 -->
			<tr>
				<td><%=listVo.getId(); %></td>
				<td><%=listvo.getPw(); %></td>
				<td><%=listvo.getName(); %></td>
				<td><%=listvo.getPoint(); %></td>
				<td><button>수정</button></td>
				<td><button>삭제</button></td>
			</tr>
			<!-- 반복끝 -->
			<% } %>
		</table>
	</div>
	<div class = 'header2'>
		<h1>스케줄러관리</h1>
		<button>스케줄러(20초마다 포인트1 증가) 실행 시작</button>
		<button>스케줄러 실행 종료</button>
	</div>
</body>
</html>