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
	<hr>
		<form action="./login.ssy" method="GET">
			<div>
				ID<br>
				<input type="text" value="bbh" name="userName"><input type="hidden">
				<br>
				PW<br>
				<input type="password" value="9256" name="password">
				<br>
				<input type="submit" value="로그인">
			</div>
			<hr>						
				<button type="button" onclick="location.href='/'">HOME</button>
		</form>

</body>
</html>