<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <%-- Required meta tags --%>
    <meta charset="utf-8">
    <title>Notice Add</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <%-- Bootstrap CSS --%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  </head>
<body>
<c:import url="../template/header.jsp"></c:import>

	<section class="container-fluid con-lg-7">
		<div class="row">
		
		<form>
	  <div class="row mb-3">
	    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
	    <div class="col-sm-10">
	      <input type="email" class="form-control" id="inputEmail3">
	    </div>
	  </div>
	  <div class="row mb-3">
	    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
	    <div class="col-sm-10">
	      <input type="password" class="form-control" id="inputPassword3">
	    </div>
	  </div>
	  <fieldset class="row mb-3">
	    <legend class="col-form-label col-sm-2 pt-0">Radios</legend>
	    <div class="col-sm-10">
	      <div class="form-check">
	        <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
	        <label class="form-check-label" for="gridRadios1">
	          First radio
	        </label>
	      </div>
	      <div class="form-check">
	        <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
	        <label class="form-check-label" for="gridRadios2">
	          Second radio
	        </label>
	      </div>
	      <div class="form-check disabled">
	        <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="option3" disabled>
	        <label class="form-check-label" for="gridRadios3">
	          Third disabled radio
	        </label>
	      </div>
	    </div>
	  </fieldset>
	  <div class="row mb-3">
	    <div class="col-sm-10 offset-sm-2">
	      <div class="form-check">
	        <input class="form-check-input" type="checkbox" id="gridCheck1">
	        <label class="form-check-label" for="gridCheck1">
	          Example checkbox
	        </label>
	      </div>
	    </div>
	  </div>
	  <button type="submit" class="btn btn-primary">Sign in</button>
	</form>
			
		</div>
	</section>
	
<c:import url="../template/footer.jsp"></c:import>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>