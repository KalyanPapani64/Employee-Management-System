<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link href="styles.css" rel="stylesheet">
</head>
<body>

<body>
<h1>Hi, <%=request.getAttribute("username")%></h1>
<a href="retrieveall">Click Here To View All Details</a>
<br>
<a
href="UpdatePassword.jsp?username=<%=request.getAttribute("username")%>">click
here to Update Password</a>
</body>

</body>
</html>