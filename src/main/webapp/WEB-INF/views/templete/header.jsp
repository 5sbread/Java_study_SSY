<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>    
    
	<header class="container-fluid"></header>
	<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
          <a class="nav-link active" href="/bankbook/list.bh">list</a>
          <a class="nav-link active" href="/board/list.bh">notice</a>
          <a class="nav-link active" href="/board/list.bh">list</a>
          
          <c:choose>
          	<c:when test="${not empty member}">                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               }">
          		<a class="nav-link active" href="/member/myPage.bh">my page</a>
          		<a class="nav-link active" href="/member/logout.bh">logout</a>
          	</c:when>
          	<c:otherwise>
	          	<a class="nav-link active" href="/member/login.bh">login</a>
	          	<a class="nav-link active" href="/member/join.bh">join</a>
          	</c:otherwise>
          </c:choose>
        </div>
      	</div>
    </div>
  </nav>