package com.kalyan.emp_man_sys.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository {
	public String getPassword(String username) {
		Connection con= DBconnection.getConnection();
		String password="";
		try {
			//step3:
			final String SQLQUERY="select passwd from login where uname=?";
			PreparedStatement pstmt=con.prepareStatement(SQLQUERY);
			//step4:
			pstmt.setString(1, username);
			ResultSet rs= pstmt.executeQuery();
	
			while(rs.next()) {
				password=rs.getString(1);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return password;
		}
	
	public int registerUser(String username,String password) {
		Connection con= DBconnection.getConnection();
		int result=0;
		try {
			//step3:
			final String SQLQUERY="insert into login values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(SQLQUERY);
			//step4:
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			result= pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
		}
	
	public int updatePassword(String username,String password) {
		Connection con= DBconnection.getConnection();
		int result=0;
		try {
			//step3:
			final String SQLQUERY="update login set passwd=? where uname=?";
			PreparedStatement pstmt=con.prepareStatement(SQLQUERY);
			//step4:
			pstmt.setString(2, username);
			pstmt.setString(1, password);
			result= pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
