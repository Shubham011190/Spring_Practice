<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setHeader("Pragma", "no-cache");		// For HTTP1.0 and lower
	response.setHeader("Expires", "0");			//For Proxy
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
%>

Welcome ${username}<br>
<a href="videos.jsp">Click here for videos!</a>
 
 
 <form action ="Logout">
 	<input type="submit" value='Logout'>
 </form>

</body>
</html>