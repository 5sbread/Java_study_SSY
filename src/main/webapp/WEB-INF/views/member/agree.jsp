<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agree</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
		crossorigin="anonymous">
	<style>
	    .align-center {text-align: center;}
	</style>	
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<section class="container-fluid col-lg-8 mt-5 ml-5">
	
	<h1>Argree Page</h1>
	<div>
		<!-- 동의 버튼 넣기 -->
	
	</div>
	
		<form action="./join.ssy" id="form">
			<button type="button" id="join">회원가입</button>
		</form>

	<c:import url="../template/footer.jsp"></c:import>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	<script src="/resources/js/board.js"></script>
	<script src="/resources/js/member.js"></script>
	<script>
		agreeCheck();
	</script>
</body>
</html>