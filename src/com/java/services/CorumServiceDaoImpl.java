package com.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.Dao.CorumUserDao;
import com.java.entity.CorumUser;

@Service
public class CorumServiceDaoImpl implements CorumServiceDao{

	@Autowired private CorumUserDao corumUserdao;
	
	@Transactional
	public void addUser(CorumUser corumuser) {
		
		corumUserdao.addUser(corumuser);
				
	}

	@Transactional
	public void edituser(CorumUser corumuser) {
		corumUserdao.edituser(corumuser);
		
	}

	@Transactional
	public void deleteuser(int id) {
		corumUserdao.deleteuser(id);
	}

	@Transactional
	public CorumUser getuser(int id) {
		
		return corumUserdao.getuser(id);
	}

	@Transactional
	public List<CorumUser> getAllUser() {
			return corumUserdao.getAllUser();
	}

}
