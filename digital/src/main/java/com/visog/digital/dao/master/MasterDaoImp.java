package com.visog.digital.dao.master;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.visog.digital.model.user.Users;
import com.visog.util.Database;

public class MasterDaoImp implements MasterDao {

	 private Connection con;
	 
	    public MasterDaoImp() {
	        con = Database.getConnection();
	    }
	 
	    public void checkUser(Users user) {
	        try {
	            PreparedStatement ps = con.prepareStatement("select uname from users where uname = ?");
	            ps.setString(1, user.getName());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) // found
	            {
	                updateUser(user);
	            } else {
	                addUser(user);
	            }
	        } catch (Exception ex) {
	            System.out.println("Error in check() -->" + ex.getMessage());
	        } 
	    }
	
	
	@Override
	public void addUser(Users user) {
		PreparedStatement prstmt;
		try {
			prstmt = con.prepareStatement("insert into users(uname, password, email, ) values (?, ?, ?, ? )");
			 // Parameters start with 1
	        prstmt.setString(1, user.getName());
	        prstmt.setString(2, user.getEmail());
	        prstmt.setString(3, user.getPassword());
	        prstmt.setString(4, user.getPhone_no());
	        prstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
	}

	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(Users user) {
		
	}

	@Override
	public Users getUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
