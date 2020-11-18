package com.insurance.quote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.entity.User_Role;
import com.insurance.quote.utils.DatabaseConnection;

public class InsuranceDaoImpl implements InsuranceDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int CreateProfile(User_Role profile) {
		// TODO Auto-generated method stub
		
		 return 0;
	
	}

	@Override
	public int CreateAccount(Accounts account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CreatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User_Role getUser(String userId) {
		// TODO Auto-generated method stub
		User_Role user=new User_Role();
		conn=DatabaseConnection.getConnection();
    try {
    	pst=conn.prepareStatement("select * from User_Role where User_Name;");
		pst.setString(1,userId);
		rs=pst.executeQuery();
		while(rs.next()) {
			user.setUser_Name(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setRole_Code(rs.getString(3));
			
		} 
    }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DatabaseConnection.closeConnection();
		}
		return user;
	}

	


}
