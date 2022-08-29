<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1"> 

<title>=◕.◕=</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

<script>
	/*Element 위치 (되도록이면 body 아래에)*/
	alert("hello");
</script>

</head>
<body>
<!-- header import -->
	<c:import url="./template/header.jsp"></c:import>
	
	<section class="container-fluid col-lg-8 mt-5">
		<div id="carouselExampleDark" class="carousel carousel-dark slide"
			data-bs-ride="carousel">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleDark"
					data-bs-slide-to="0" class="active" aria-current="true"
					aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleDark"
					data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleDark"
					data-bs-slide-to="2" aria-label="Slide 3"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active" data-bs-interval="2000">
					<img src="./resources/images/4.jpg" class="d-block w-100"
						alt="ìì´ë1">
					<div class="carousel-caption d-none d-md-block">
						<h5>꾸미</h5>
						<p>😺😸😻😽</p>
					</div>
				</div>
				<div class="carousel-item" data-bs-interval="2000">
					<img src="./resources/images/3.png" class="d-block w-100"
						alt="ìì´ë2">
					<div class="carousel-caption d-none d-md-block">
						<h5>꾸미</h5>
						<p>😺😸😻😽</p>
					</div>
				</div>
				<div class="carousel-item" data-bs-interval="2000">
					<img src="./resources/images/5.jpg" class="d-block w-100"
						alt="ìì´ë3">
					<div class="carousel-caption d-none d-md-block">
						<h5>꿈치</h5>
						<p>😺😸😻😽</p>
					</div>
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleDark" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleDark" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>

	</section>
	
	<!-- footer import -->
	<c:import url="./template/footer.jsp"></c:import>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>

<!--	본 파일 내에서 script 태그 사용해서 작성	
	<script> /*Element 위치"*/
		alert("hello");
	</script>
-->

<!-- 외부파일에서 작성 후 불러오기
(가장 많이 사용하는 방법) -->
	<script src="/resources/js/test.js"></script>

</body>
</html>