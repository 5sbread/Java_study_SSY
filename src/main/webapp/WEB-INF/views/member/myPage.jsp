<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="row">

	<h1>MyPage</h1>
<!-- 	<h1>${map}</h1>  -->
	
	
	<c:forEach itmes="${map.list}" var="dto">
		<p>${dto.accountNum}</p>
		<p>${dto.bankAccount}</p>
		<p>${dto.accountDate}</p>
	</c:forEach>	
	
	</div>
</body>
</html>