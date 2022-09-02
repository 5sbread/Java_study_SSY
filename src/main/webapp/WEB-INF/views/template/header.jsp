<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

   <header>
        <nav class="navbar  navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="/">=◕.◕=</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                </button>
                
                <div class="collapse navbar-collapse justify-content-between" id="navbarNavAltMarkup">
                <div class="navbar-nav">
<%--                <a class="nav-link active" aria-current="page" href="/">=◕.◕=</a>  --%>
                    <a class="nav-link active" href="/notice/list.ssy">공지사항</a>
                    <a class="nav-link active" href="/member/search.ssy">회원검색</a>
                    <a class="nav-link active" href="/bankbook/list.ssy">상품리스트</a>
                    <a class="nav-link active" href="/qna/list.ssy">QnA</a> 
				</div>
				<div class="navbar-nav">
                    <c:choose>
                    	<c:when test="${not empty member}">
		                    <a class="nav-right" href="/member/myPage.ssy">마이페이지</a>
		                    <a class="nav-right" href="/member/logout.ssy">로그아웃</a>
                    	</c:when>
                    	
                    	<c:otherwise>
	                    	<a class="nav-right" href="/member/login.ssy">로그인</a>
	                    	<a class="nav-right" href="/member/agree.ssy">회원가입</a>
                   		</c:otherwise>
                    </c:choose>
                </div>
                
                </div>
            </div>
        </nav>
    </header>