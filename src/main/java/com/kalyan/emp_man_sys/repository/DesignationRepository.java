package com.kalyan.emp_man_sys.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kalyan.emp_man_sys.model.Designation;

public class DesignationRepository {
	public List<Designation> getAllDesignationInfo(){
		List<Designation> designationList= new ArrayList<Designation>();
		try {
			Connection con= DBconnection.getConnection();
			// Step 3: create a statement
			final String SQLQUERY = "select * from designation";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully........");
			// Step 4: Execute statement
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Statement executed successfully.......");
			while(rs.next())
			{
				Designation des =new Designation();
				des.setDesid(rs.getInt(1));
				des.setDesname(rs.getString(2));
				des.setDespay(rs.getInt(3));
				designationList.add(des);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Failed......." + e);
		}
		return designationList;
	}
	
	public int updateDesignation(Designation des) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "update designation set desname=?,despay=? where desid=?";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setString(1, des.getDesname());
			pstmt.setInt(2, des.getDespay());
			pstmt.setInt(3, des.getDesid());
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
	
	public int deleteDesignation(int desid) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "delete from designation where desid=?";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setInt(1, desid);
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
	
	public int insertDesignation(Designation des) {
		int res=0;
		try {
			Connection con= DBconnection.getConnection();
			//step3:
			final String SQLQUERY = "insert into Designation values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement is created successfully...");
			pstmt.setInt(1, des.getDesid());
			pstmt.setString(2, des.getDesname());
			pstmt.setInt(3, des.getDespay());
			res= pstmt.executeUpdate();
			System.out.println("Statements executed successfully...");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return res;
	}
}
