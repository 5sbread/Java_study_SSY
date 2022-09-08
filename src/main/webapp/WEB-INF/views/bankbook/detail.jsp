<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Detail</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
	<style>
		.align-center {text-align: center;}
		.row {text-align: center;}
	</style>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<br><br>

	<h1 class="align-center">Detail Page</h1>
	<br>

	<section class="container-fluid col-lg-6">
	
<!--	<form action="./detail.ssy" method="post">  -->
	<div class="row">
		<table class="table talbe-dark">
			<thead>
				<tr>
					<th scope="col">상품번호</th>
					<th scope="col">상품명</th>
					<th scope="col">이자율</th>
					<th scope="col">판매여부</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${dto.bookNum}</td>
					<td>${dto.bookName}</td>
					<td>${dto.bookRate}</td>
					<td>${dto.bookSale}</td>
				</tr> 		
			</tbody>
		</table>
		
		<br><br>
		<div class="align-center">
			<a href = "./list.ssy" calss="btn btn-info">상품 목록 보기</a>
			<br><br>
			<a href= "./update.ssy?bookNum=${dto.bookNum}" class="btn btn-primary">수정하기</a>
			<a href="./delete.ssy?bookNum=${dto.bookNum}" class="btn btn-danger">삭제하기</a>
			
			<c:if test="${not empty sessionScope.member}">
				<a href="../bankAccount/add.ssy?bookNum=${dto.bookNum}" class="btn btn-success">가입하기</a>
			</c:if>
		</div>
	</div>

		<!------------- Comment ------------>
	<div class="row2">
		<div class="mb-3">
			<label for="writer" class="form-label">작성자</label>
			<input type="text" class="form-control" id="writer" placeholder="작성자를 입력하세요.">
		  </div>
	  	<div class="mb-3">
			<label for="contents" class="form-label">내용을 작성하세요.</label>
			<textarea class="form-control" id="contents" rows="3"></textarea>
		</div>
		<div class="mb-3">
			<button type="button" id="commentBtn" data-book-num="${dto.bookNum}">댓글 작성</button>
		</div>
	</div>

		<!-- Comment List 출력-->
		<div>
			<table id="commentList" class="table table-hover">

			</table>
		</div>
		<button id="more" class="btn btn-danger disabled" >더보기</button>
		<!-- Comment 끗-->


		<!------------- Modal ------------>
		<div>
			<button type="button" style="display: none;" class="btn btn-primary" id="up" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@getbootstrap">Open modal for @getbootstrap</button>

			<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">수정하기</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<form>
						<input type="hidden" id="num" value="">
						<div class="mb-3">
							<label for="updateWriter" class="col-form-label">작성자 :</label>
							<input type="text" class="form-control" id="updateWriter">
						</div>
						<div class="mb-3">
							<label for="updateContents" class="col-form-label">내용 :</label>
							<textarea class="form-control" id="updateContents"></textarea>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary" data-bs-dismiss="modal">Send message</button>
				</div>
				</div>
			</div>
			</div>
		</div>
		<!-- Modal 끝-->

	</section>
	<c:import url="../template/footer.jsp"></c:import>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
		<script src="/resources/js/bankBookComment.js"></script>

		</body>
</html>