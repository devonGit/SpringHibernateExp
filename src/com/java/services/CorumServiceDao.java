package com.java.services;

import java.util.List;

import com.java.entity.CorumUser;

public interface CorumServiceDao {

	public void addUser(CorumUser corumuser);
	public void edituser(CorumUser corumuser);
	public void deleteuser(int id);
	public CorumUser getuser(int id);
	public List<CorumUser> getAllUser();
	
}
