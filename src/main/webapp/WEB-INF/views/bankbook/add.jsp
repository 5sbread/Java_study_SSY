<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
</head>
<body>
<h1>Add Book Page</h1>
<form action="add.ssy" method = "POST">

<table border="1">
	<tr>
		<td>Account Name</td>
		<td>Rate</td>
	</tr>
	<tr>
		<td><input type="text" name= "bookName"></td>
		<td><input type= "text" name = "bookRate"></td>
	</tr>
</table>
<br>
<input type="submit" value="SUBMIT">
</form> 
</body>
</html>