<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<!-- header import하려면 필요 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body>
	<c:import url="../templete/header.jsp"></c:import>
	
	<section class="container-fluid col-lg-4 mt-5">
		<div class="row">
			<form action="./login.bh" mrthod="post">
				<div class="mb-3">
	  				<label for="exampleInputEmail1" class="form-label">ID</label>
	  				<input type="text" name="userName" class="form-control" id="formGroupExampleInput" placeholder="Example input placeholder">
				</div>
				<div class="mb-3">
	 				<label for="formGroupExampleInput2" class="form-label">PW</label>
	  				<input type="text" name="password" class="form-control" id="formGroupExampleInput2" placeholder="Another input placeholder">
				</div>
			</form>	
		</div>
	</section>
	
	<h1>Login Page</h1>
	
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
        crossorigin="anonymous"></script>

</body>
</html>