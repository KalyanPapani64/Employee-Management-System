package com.kalyan.emp_man_sys.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kalyan.emp_man_sys.model.Employee;

public class EmployeeRepository {
	public List<Employee> getAllEmployeeInfo(){
		List<Employee> employeeList= new ArrayList<Employee>();
		try {
			Connection con= DBconnection.getConnection();
			// Step 3: create a statement
			final String SQLQUERY = "select * from employee";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully........");
			// Step 4: Execute statement
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Statement executed successfully.......");
			while(rs.next())
			{
				Employee emp =new Employee();
				emp.setEmpid(rs.getInt(1));
				emp.setEmpname(rs.getString(2));
				emp.setEmpfname(rs.getString(3));
				emp.setGender(rs.getString(4));
				emp.setExperience(rs.getInt(5));
				emp.setDepid(rs.getInt(6));
				emp.setDesid(rs.getInt(7));
				employeeList.add(emp);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Failed......." + e);
		}
		return employeeList;
	}
	
	public int updateEmployee(Employee emp) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "update employee set empname=?,empfname=?,gender=?,experience=?,depid=?,desid=? where empid=?";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setString(1, emp.getEmpname());
			pstmt.setString(2, emp.getEmpfname());
			pstmt.setString(3, emp.getGender());
			pstmt.setInt(4, emp.getExperience());
			pstmt.setInt(5, emp.getDepid());
			pstmt.setInt(6, emp.getDesid());
			pstmt.setInt(7, emp.getEmpid());
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
	
	public int deleteEmployee(int empid) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "delete from employee where empid=?";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setInt(1, empid);
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
	
	public int insertEmployee(Employee emp) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "insert into employee values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setInt(1, emp.getEmpid());
			pstmt.setString(2, emp.getEmpname());
			pstmt.setString(3, emp.getEmpfname());
			pstmt.setString(4, emp.getGender());
			pstmt.setInt(5, emp.getExperience());
			pstmt.setInt(6, emp.getDepid());
			pstmt.setInt(7, emp.getDesid());
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
}
