<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<section class="container-fluid col-lg-8 mt-5 ml-5">
		<div>
								<!-- 파일 첨부하려면 무조건 post -->
										    	<!-- enctype=multipart / 파일이 없으면 사용XXX -->
			<form action="./join.ssy" method="post" enctype="multipart/form-data">
				<div class="col-md-3">
					<label for="userName" class="form-label">아이디</label>
					<input type="text" name="userName" class="form-control" id="userName">
					<input type="hidden" id="idError" name="idError" value="아이디는 <strong>2글자 미만</strong>으로 설정할 수 없습니다.">
				</div><div></div>
				<div class="col-md-3">
					<label for="pw" class="form-label">비밀번호</label>
					<input type="password" name="password" class="form-control" id="pw">
				</div><div></div>
				<div class="col-md-3">
					<label for="pwCheck" class="form-label">비밀번호 확인</label>
					<input type="password" name="pwCheck" class="form-control" id="pwCheck">
				</div><div></div>
				<div class="col-3">
					<label for="name" class="form-label">이름</label>
					<input type="text" name="name"class="form-control" id="name" placeholder="">
				</div><div></div>
				<div class="col-3">
					<label for="email" class="form-label">이메일</label>
					<input type="email" required name="email" class="form-control" id="email" placeholder="">
				</div><div></div>
				<div class="col-md-3">
					<label for="phone" class="form-label">전화번호</label>
					<input type="text" name="phone"class="form-control" id="phone"
						placeholder="하이픈(-)없이 숫자만 입력">
				</div><div></div>
				<div class="row-md-3">
					<label for="files" class="col-sm-2 col-form-label">사진</label>
					<div class="col-sm-10">
					<input type="file" name="photo"class="form-control" id="inputphoto">
					</div><div></div>
				</div>
				
				<div class="col-12">
					<button type="submit" class="btn btn-primary">가입하기</button>
					<br>
				</div>
			</form>
		</div>
	</section>
	<c:import url="../template/footer.jsp"></c:import>

	<scriptsrc ="https://cdn.jsdelivr.net/npm/bootstrap
		@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></scriptsrc>
	<script src="/resources/js/member.js"></script>
	<script>
		/* joinCheck(); */
	</script>	
</body>
</html>
