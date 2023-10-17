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
if(session.getAttribute("un")==null)
{
	response.sendRedirect("login.jsp");
}
else{
	out.println("Welcome");
}
%>

<%
out.println(session.getCreationTime());
out.println(session.getLastAccessedTime());
out.println(session.isNew());
session.setMaxInactiveInterval(1*60);
%>
<a href="logout.jsp">Logout</a>
</body>
</html>