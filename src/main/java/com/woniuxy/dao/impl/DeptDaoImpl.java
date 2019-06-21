package com.woniuxy.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.woniuxy.dao.IDeptDao;
import com.woniuxy.domain.Dept;


@Component
public class DeptDaoImpl implements IDeptDao {

	
	@Autowired
	private SessionFactory sf;
	
	private Session getSession() {
		return sf.getCurrentSession();
	}
	@Override
	public void save(Dept d) {
		getSession().save(d);
	}
	@Override
	public void delete(Integer did) {
		
	}
	@Override
	public void edit(Dept d) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Dept findOne(Integer did) {
		// TODO Auto-generated method stub
		return null;
	}

}
