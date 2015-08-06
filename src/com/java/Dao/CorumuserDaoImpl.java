package com.java.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.CorumUser;

@Repository
public class CorumuserDaoImpl implements CorumUserDao {

	@Autowired private SessionFactory ssnfactory;
	
	
	@Override
	public void addUser(CorumUser corumuser) {
		ssnfactory.getCurrentSession().save(corumuser);

	}

	@Override
	public void edituser(CorumUser corumuser) {
		ssnfactory.getCurrentSession().update(corumuser);

	}

	@Override
	public void deleteuser(int id) {
		ssnfactory.getCurrentSession().delete(getuser(id));

	}

	@Override
	public CorumUser getuser(int id) {
		return (CorumUser)ssnfactory.getCurrentSession().get(CorumUser.class, id);
	}

	@Override
	public List<CorumUser> getAllUser() {
		return ssnfactory.getCurrentSession().createQuery("from CorumUser").list();
	}

}
