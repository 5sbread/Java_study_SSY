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
							   <!-- con-lg-6 : 사이즈 조절 -->
	<section class="container-fluid con-lg-6">
	<h1 class="align-center">Notice List</h1>
	<div class="row mb-3">
	
<!-- ============== 공지 검색 파트 =============================================================== -->	
	<div>
	<form action="./list.ssy" method="get" class="row row-cols-lg-auto g-3 align-items-center">
	
	  <div class="col-12">
	  	<!-- label : input 태그의 이름 | for : input의 id와 동일한 값 -->
	    <label class="visually-hidden" for="select">Select</label>
	    <select name="select" class="form-select" id="select">
	      <option selected>골라잡기</option>
	      <option value="select1">Contents</option>
	      <option value="select2">Title</option>
	      <option value="select3">Writer</option>
	    </select>
	  </div>
	  
	 <div class="col-12">
	    <label class="visually-hidden" for="search">검색어를 입력하세요.</label>
	    <div class="input-group">
	      <input type="text" name="search" value="" class="form-control" id="search" placeholder="검색어를 입력하세요.">
	    </div>
	  </div>
	
	  <div class="col-12">
	    <button type="submit" class="btn btn-primary">검색</button>
	  </div>
	</form>
</div>
	
<!-- ============== 공지 내용 출력 =============================================================== -->		

		<table class="table align-center">
			<thead class="table-dark">
				<tr>
					<th scope = "col">번호</th>
					<th scope = "col">제목</th>
					<th scope = "col">작성자</th>
					<th scope = "col">작성날짜</th>
					<th> 조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.num}</td>
						<td>
						<c:catch>
							<c:forEach begin="1" end="${dto.depth}">&ensp</c:forEach>
						</c:catch>
						<a href="./detail.ssy?num=${dto.num}">${dto.title}</a></td>
						<td>${dto.writer}</td>
						<td>${dto.regDate}</td>
						<td>${dto.hit}</td>
					</tr>
				</c:forEach>
			</tbody>	
		</table>
	</div>
</section>

<!-- ============== 페이지 이동 숫자버튼 =============================================================== -->						
	<nav aria-label="Page navigagion example">
		<ul class = "pagination">
		
			<c:if test="${pager.pre}">
	    		<li class="page-item">
	    		<a class="page-link" href="./list.ssy?page=${pager.startNum-1}&select=${pager.select}&search=${pager.search}">👈🏻</a></li>
	  		</c:if>
	  
	  		<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<li class="page-item"><a class="page-link" href="./list.ssy?page=${i}&select=${pager.select}&search=${pager.search}">${i}</a></li>
	  		</c:forEach>
			
		<%-- 방법 1. 부트스트랩 class 속성을 disable해서 다음 버튼을 누르지 못하게 막기 
			<c:choose>
				<c:when test="${pager.next}">
					<li class="page-item"></li>
				</c:when>
			<c:otherwise>
				<li class="page-item disabled"></li>
					</c:otherwise>
				</c:choose> 
				
			방법 2. 삼항연산자를 이용	--%>
			<li class="page-item ${pager.next?'':'disabled'}">
	    	<a class="page-link" href="./list.ssy?page=${pager.lastNum+1}&select=${pager.select}&search=${pager.search}">👉🏻</a></li>
			</ul>
		</nav>
						
	<a href = "./add.ssy" class="btn btn-primary">작성하기</a>
	
	<c:import url="../template/footer.jsp"></c:import>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>