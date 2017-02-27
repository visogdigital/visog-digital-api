package com.visog.digital.dao.master;

import java.util.List;

import com.visog.digital.model.user.*;


public interface MasterDao {
	
	public void addUser(Users user);
	public void deleteUser(String userId); 
	public void updateUser(Users user);

    public Users getUserById(String userId);
    public List<Users> getAllUsers();

}
