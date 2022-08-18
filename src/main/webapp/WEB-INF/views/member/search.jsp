<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<h1>Login Page</h1>
		<form action="./login.ssy" method="post">
			<div>
				아이디<br>
				<input type="text" value="bbh" name="userName"><input type="hidden">
				<br>
				<br>
				비밀번호<br>
				<input type="password" value="9256" name="password">
				<br>
				<input type="submit" value="로그인">
			<button type="button" onclick="location.href='/home'">HOME</button>	
				
			</div>
		
		</form>

</body>
</html>