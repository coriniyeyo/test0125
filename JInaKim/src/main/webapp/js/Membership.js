$(function(){
	$("#submit").click(function(){
		alert("가입되었습니다. 로그인 해주세요.");
		location.href = "Controller?command=Login";
	});
});