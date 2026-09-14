<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>ATM Management System</title>
</head>

<body>

	<h1>ATM Management System</h1>
	
	<h2>ATM Login</h2>
	
	<p><%= request.getAttribute("message") %></p>
	
	<form action="login"  method="post">
	
		<label>Enter Pin:</label>
		<input type="password" name="pin">
		
		<br><br>
		
		<button type="Submit">Login</button>
	</form>
	
</body>
</html>