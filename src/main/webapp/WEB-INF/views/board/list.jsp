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
		.row{
			justify-content: center;
		}
	    /* .align-center {text-align: center;} */
	</style>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
						   <!-- con-lg-6 : 사이즈 조절 -->
<section class="container-fluid col-lg-6">
	<br><br>
	<h1 class="align-center">Notice List</h1>
	<br>
	<div class="row mb-3">
	
<!-- ============== 공지 검색 파트 =============================================================== -->	
	<form action="./list.ssy" class="row row-cols-lg-auto g-3 align-items-center">
	
	  <div class="col-12">
	  	<!-- label : input 태그의 이름 | for : input의 id와 동일한 값 -->
	    <label class="visually-hidden" for="select">Select</label>
	    <select name="select" class="form-select" id="select">
	      <option selected>골라잡기</option>
	      <option class="select" id="contents" value="contents">Contents</option>
	      <option class="select" id="title" value="title">Title</option>
	      <option class="select" id="writer" value="writer">Writer</option>
	    </select>
	  </div>
	  
	 <div class="col-12">
	    <label class="visually-hidden" for="search">검색어를 입력하세요.</label>
	    <div class="input-group">
	      <input type="text" name="search" value="${param.search}" class="form-control" id="search">
	    </div>
	  </div>
	
	  <div class="col-12">
	    <button type="submit" class="btn btn-primary">검색</button>
	  </div>
	</form>
</div>
	
<!-- ============== 공지 내용 출력 =============================================================== -->		
<div class="row">
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
	<div class="mb-3">
		<a href="./add.ssy" class="btn btn-primary">글 쓰기</a>
	</div>
<!-- ============== 페이지 이동 숫자버튼 =============================================================== -->						
	<nav aria-label="Page navigagion example">
		<ul class = "pagination justify-content-center"">
		
			<c:if test="${pager.pre}">
	    		<li class="page-item">
	    			<a class="page-link" href="./list.ssy?page=${pager.startNum-1}&select=${pager.select}&search=${pager.search}" aria-label="👈🏻">
	    			<span aria-hidden="true">&laquo;</span>
	  				</a>
	  			</li>	
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
	    	<a class="page-link" href="./list.ssy?page=${pager.lastNum+1}&select=${pager.select}&search=${pager.search}" aria-label="👉🏻">
	    		<span aria-hidden="true">&raquo;</span>
	    	</a>
	    	</li>
			</ul>
		</nav>
</div>
</section>	
	<c:import url="../template/footer.jsp"></c:import>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<script src="/resources/js/board.js"></script>
<script>
	let s = '${param.select}';
	console.log(s);
	//파라미터로 받은 값과 동일한 value 찾기 -> 해당 value에 selected
	const select = document.getElementsByClassName("select");

	for(let i=0; i<select.length; i++){
		if(select[i].value==s){
			select[i].selected = true;
			
		}
	}

</script>

</body>
</html>