<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<c:import url="../template/header.jsp"></c:import>
   <section class="container-fluid col-lg-4 mt-5"> 
	   <h1>🐱 My Page 🐱</h1>
   <div class="row mt-5">
      <p>ID : ${requestScope.dto.userName}</p>
      <p>NAME : ${dto.name}</p>
      <p>EMAIL : ${dto.email}</p>
      <p>PHONE : ${dto.phone}</p>
   </div>
   <br>
   <div>
      <c:forEach items="${dto.bankAccountDTOs}" var="dto">
         <p>통장번호 : ${pageScope.dto.accountNum}</p>
         <p>통장이름 : ${dto.bankBookDTO.bookName}</p>
         <P>개설일자 : ${dto.accountDate}</P>      
      </c:forEach>
   </div>
   
   <div>
   	  <c:forEach items="${member.roleDTOs}" var="roleDTO">
   	  	<div>${RoleDTO.roleNum}, ${RoleDTO.roleName}</div>
   	  </c:forEach>
   	  
   	  <h1>당신은 ${member.rolDTOs.get(0).roleName}</h1>
   	  <h1>당신은 ${member.roleDTOD["0"].roleName}</h1>
   </div>
   
   <div class="row">
   	<imag alt="" src="../resources/upload/member/${dto.bankMembersFileDTO.fileName}">
   </div>
   
   </section>
   <c:import url="../template/footer.jsp"></c:import>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
              integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" 
              crossorigin="anonymous"></script>
   
</body>

</html>