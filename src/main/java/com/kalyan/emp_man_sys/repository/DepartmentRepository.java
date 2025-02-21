package com.kalyan.emp_man_sys.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kalyan.emp_man_sys.model.Department;

public class DepartmentRepository {
	public List<Department> getAllDepartmentInfo(){
		List<Department> departmentList= new ArrayList<Department>();
		try {
			Connection con= DBconnection.getConnection();
			// Step 3: create a statement
			final String SQLQUERY = "select * from department";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully........");
			// Step 4: Execute statement
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Statement executed successfully.......");
			while(rs.next())
			{
				Department dep =new Department();
				dep.setDepid(rs.getInt(1));
				dep.setDepname(rs.getString(2));
				dep.setDeploc(rs.getString(3));
				departmentList.add(dep);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Failed......." + e);
		}
		return departmentList;
	}
	
	public int updateDepartment(Department dep) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "update department set depname=?,deploc=? where depid=?";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setString(1, dep.getDepname());
			pstmt.setString(2, dep.getDeploc());
			pstmt.setInt(3, dep.getDepid());
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
	
	public int deleteDepartment(int depid) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "delete from department where depid=?";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setInt(1, depid);
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
	
	public int insertDepartment(Department dep) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "insert into department values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setInt(1, dep.getDepid());
			pstmt.setString(2, dep.getDepname());
			pstmt.setString(3, dep.getDeploc());
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
}

