<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<link href="styles.css" rel="stylesheet">
</head>
<body>

<%@ page import="java.util.List" %>
<%@ page import="com.kalyan.emp_man_sys.model.Employee" %>
<%@ page import="com.kalyan.emp_man_sys.model.Department" %>
<%@ page import="com.kalyan.emp_man_sys.model.Designation" %>
<%
List<Employee> empList =(List<Employee>) request.getAttribute("employeeList");
List<Department> depList =(List<Department>) request.getAttribute("departmentList");
List<Designation> desList =(List<Designation>) request.getAttribute("designationList");
%>
<center>

<table border="1">
<tr>
<td class="header">Employee Id:</td>
<td class="header">Employee Name:</td>
<td class="header">Employee's Father Name:</td>
<td class="header">Gender:</td>
<td class="header">Experience:</td>
<td class="header">Department ID:</td>
<td class="header">Designation ID:</td>
</tr>
<%
for (Employee emp: empList)
{
%>
<tr>
<td><%= emp.getEmpid() %></td>
<td><%= emp.getEmpname() %></td>
<td><%= emp.getEmpfname() %></td>
<td><%= emp.getGender() %></td>
<td><%= emp.getExperience() %></td>
<td><%= emp.getDepid() %></td>
<td><%= emp.getDesid() %></td>
<%
String queryString= "empid="+emp.getEmpid()+"&empname="+emp.getEmpname()+"&empfname="+emp.getEmpfname()+"&gender="+emp.getGender()+"&experience="+emp.getExperience()+"&depid="+emp.getDepid()+"&desid="+emp.getDesid()+" ";
%>
<td><a href="UpdateEmployee.jsp?<%=queryString %>">Update</a></td>
<td><a href="deleteemployee?empid=<%=emp.getEmpid() %>">Delete</a></td>
</tr>
<%
}
%>
</table>
<a href="InsertEmployee.jsp">Click here to insert Employee</a>
<br>
<br>
<table border="1">
<tr>
<td class="header">Department Id:</td>
<td class="header">Department Name:</td>
<td class="header">Department Location:</td>
</tr>
<%
for (Department dep: depList)
{
%>
<tr>
<td><%= dep.getDepid() %></td>
<td><%= dep.getDepname() %></td>
<td><%= dep.getDeploc() %></td>
<%
String queryString= "depid="+dep.getDepid()+"&depname="+dep.getDepname()+"&deploc="+dep.getDeploc()+" ";
%>
<td><a href="UpdateDepartment.jsp?<%=queryString %>">Update</a></td>
<td><a href="deletedepartment?depid=<%=dep.getDepid() %>">Delete</a></td>
</tr>
<%
}
%>
</table>
<a href="InsertDepartment.jsp">Click here to insert Department</a>
<br>
<br>

<table border="1">
<tr>
<td class="header">Designation Id:</td>
<td class="header">Designation Name:</td>
<td class="header">Designation Salary:</td>
</tr>
<%
for (Designation des: desList)
{
%>
<tr>
<td><%= des.getDesid() %></td>
<td><%= des.getDesname() %></td>
<td><%= des.getDespay() %></td>
<%
String queryString= "desid="+des.getDesid()+"&desname="+des.getDesname()+"&despay="+des.getDespay()+" ";
%>
<td><a href="UpdateDesignation.jsp?<%=queryString %>">Update</a></td>
<td><a href="deletedesignation?desid=<%=des.getDesid() %>">Delete</a></td>
</tr>
<%
}
%>
</table>
<a href="InsertDesignation.jsp">Click here to insert Designation</a>

</center>

</body>
</html>