<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Password</title>
<link href="styles.css" rel="stylesheet">
</head>
<body>

<form action="updatepasswordservlet">
<table border="2">
<tr>
<td colspan=2  class="header">Update Password</td>
</tr>
<tr>
<td>user name:</td>
<td><input type="text" name="uname" value="<%=request.getParameter("username")%>" readonly="readonly"/></td>
</tr>
<tr>
<td>Enter Old password:</td>
<td><input type="password" name="oldpasswd" placeholder="Oldpassword"/></td>
</tr>
<tr>
<td>Enter New password:</td>
<td><input type="password" name="newpasswd" placeholder="Newpassword"/></td>
</tr>
<tr>
<td>Confirm new password:</td>
<td><input type="password" name="confirmpasswd" placeholder="Re-enterpassword"/></td>
</tr>
<tr>
<td colspan=2><input type="submit" value="Update Password"></td>
</tr>
</table>
</form>

</body>
</html>