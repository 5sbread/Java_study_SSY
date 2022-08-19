<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charest="UTF-8">
	<title>Home</title>
	<link rel="stylesheet" href="./resources/css/test.css">
	<style>
		li {
			color: aqua;
		}
	</style>
</head>
<body>
	<!--헤더 메뉴의 링크는 상대경로X-->
	<!--nav-->
	<!--Group-->
	<div>
		<ul>
			<li><a href="/bankbook/list.bh">상품리스트</a></li>
			<li><a href="/board/list.bh">게시판</a></li>
			<li><a href="/member/login.bh">로그인</a></li>
			<li><a href="/member/join.bh">회원가입</a></li>
		</ul>
	</div>

	<img src="./resources/images/cat.png">

	<iframe width="560" height="315" src="https://www.youtube.com/embed/z8yAx04Votg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

	<h1>=0.0=</h1>

	<!--순서가 있는 List-->
	<ol>
		<li style="color: red;">First</li>
		<li>Second</li>
		<li>Thrid</li>
	</ol>

	<!--순서가 없는 List-->
	<ul>
		<li>SKT</li>
		<li>KT</li>
		<li>LGT</li>
	</ul>

</body>
</html>
