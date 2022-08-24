<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notice List</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<style>
	.align-center {text-align: center;}
</style>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<form action="./list.ssy" method="post">
	
	<br><br>
	<h1 class="align-center">Notice List</h1>
	<br>
							   <!-- con-lg-6 : 사이즈 조절 -->
	<section class="container-fluid con-lg-6">
		<div class = "row">
			<table class="table">
				<thead class="table-dark">
					<tr>
						<th scope = "col">번호</th>
						<th scope = "col">제목</th>
						<th scope = "col">작성자</th>
						<th scope = "col">작성날짜</th>
						<th scope = "col">조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="dto">
						<tr>
							<td><a href="./detail.ssy?num=${dto.num}">${dto.num}</a></td>
							<td><a href="./detail.ssy?num=${dto.num}">${dto.title}</a></td>
							<td><a href="./detail.ssy?num=${dto.num}">${dto.writer}</a></td>
							<td><a href="./detail.ssy?num=${dto.num}">${dto.regDate}</a></td>
							<td><a href="./detail.ssy?num=${dto.num}">${dto.hit}</a></td>
						</tr>
					</c:forEach>		
				</tbody>	
			</table>
		</div>
	</section>
	<a href = "./add.ssy" class="btn btn-primary">공지 추가</a>
	</div>
	</section>
	<c:import url="../template/footer.jsp"></c:import>
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>