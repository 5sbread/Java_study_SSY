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
	    
	    .check-all {
		    display: block;
		    margin-block-start: 1em;
		    margin-block-end: 1em;
		    margin-inline-start: 0px;
		    margin-inline-end: 0px;
		    text_decoration : underline;
			word-break : break-all;
			}

		
	</style>	
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<section class="container-fluid col-lg-8 mt-5 ml-5">
	
	<h1 class="align-center">Agree Page</h1>
	<br><br>
	
	
	<div class="agree">
		<p class=check-all>
			<input type="checkbox" name="all" id="all">
			<label for="all">
				<span class="all_text">
					"이용약관, 개인정보 수집 및 이용, 꾸또미 귀여워, 꿈치 보고싶다(필수)에 모두 동의합니다."
				</span>
			</label>
		</p>
		
		
		동의1 [필수] <input type="checkbox" name="box" class="ch req"> <br>
		동의2 [필수] <input type="checkbox" name="box" class="ch req"> <br>
		동의3 [필수] <input type="checkbox" name="box" class="ch req"> <br>
		동의4 [선택] <input type="checkbox" name="box" class="ch"> <br><br>
	</div>	
	
	<form action="./join.ssy" method="get" id="form">
		<button type="button" id="join">동의</button>
	</form>

	<c:import url="../template/footer.jsp"></c:import>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	<script src="/resources/js/member.js"></script>
	<script>
		agreeCheck();
	</script>
</body>
</html>