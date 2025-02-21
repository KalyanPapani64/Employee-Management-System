<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<link href="styles.css" rel="stylesheet">
</head>
<body>

<form action="updateemployee">
<table border="2">
<tr>
<td>Employee ID Number:</td>
<td><input type="text" name="empid" value=<%=request.getParameter("empid") %>
readonly="readonly"></td>
</tr>
<tr>
<td>Employee Name:</td>
<td><input type="text" name="empname" value=<%=request.getParameter("empname") %>></td>
</tr>
<tr>
<td>Employee's Father Name:</td>
<td><input type="text" name="empfname" value=<%=request.getParameter("emfname") %>></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="text" name="gender" value=<%=request.getParameter("gender") %>></td>
</tr>
<tr>
<td>Experience:</td>
<td><input type="text" name="experience" value=<%=request.getParameter("experience") %>></td>
</tr>
<tr>
<td>Department ID Number:</td>
<td><input type="text" name="depid" value=<%=request.getParameter("depid") %>></td>
</tr>
<tr>
<td>Designation ID Number:</td>
<td><input type="text" name="desid" value=<%=request.getParameter("desid") %>></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Click here to update"></td>
</tr>
</table>
</form>

</body>
</html>