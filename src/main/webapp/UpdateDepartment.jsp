<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Department</title>
<link href="styles.css" rel="stylesheet">
</head>
<body>

<form action="updatedepartment">
<table border="2">
<tr>
<td>Department ID Number:</td>
<td><input type="text" name="depid" value=<%=request.getParameter("depid") %>
readonly="readonly"></td>
</tr>
<tr>
<td>Department Name:</td>
<td><input type="text" name="depname" value=<%=request.getParameter("depname") %>></td>
</tr>
<tr>
<td>Department Location:</td>
<td><input type="text" name="deploc" value=<%=request.getParameter("deploc") %>></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Click here to update"></td>
</tr>
</table>
</form>

</body>
</html>