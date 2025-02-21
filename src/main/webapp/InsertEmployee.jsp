<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Employee</title>
<link href="styles.css" rel="stylesheet">
</head>
<body>

<form action="insertemployee">
<table border="2">
<tr>
<td>Employee ID Number:</td>
<td><input type="text" name="empid" ></td>
</tr>
<tr>
<td>Employee Name:</td>
<td><input type="text" name="empname" ></td>
</tr>
<tr>
<td>Employee's Father Name:</td>
<td><input type="text" name="empfname" ></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="text" name="gender" ></td>
</tr>
<tr>
<td>Experience:</td>
<td><input type="text" name="experience" ></td>
</tr>
<tr>
<td>Department ID number:</td>
<td><input type="text" name="depid" ></td>
</tr>
<tr>
<td>Designation ID number:</td>
<td><input type="text" name="desid" ></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Once Verify the details and Click here to insert"></td>
</tr>
</table>
</form>

</body>
</html>