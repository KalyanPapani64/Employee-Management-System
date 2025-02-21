<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Designation</title>
<link href="styles.css" rel="stylesheet">
</head>
<body>

<form action="updatedesignation">
<table border="2">
<tr>
<td>Designation ID Number:</td>
<td><input type="text" name="desid" value=<%=request.getParameter("desid") %>
readonly="readonly"></td>
</tr>
<tr>
<td>Designation Name:</td>
<td><input type="text" name="desname" value=<%=request.getParameter("desname") %>></td>
</tr>
<tr>
<td>Designation salary:</td>
<td><input type="text" name="despay" value=<%=request.getParameter("despay") %>></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Click here to update"></td>
</tr>
</table>
</form>

</body>
</html>