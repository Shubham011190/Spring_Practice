<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
		<input type="text" name='aid'><br>
		<input type="text" name="aname"><br>
		<input type="text" name="tech"><br>
		<input type="submit" value="Submit">
	</form>
	
	<h3>Fetch record below</h3><br>
	<form action="getAlien">
		<input type="text" name="aid">
		<input type="submit" value="Fetch">
	</form>
</body>
</html>