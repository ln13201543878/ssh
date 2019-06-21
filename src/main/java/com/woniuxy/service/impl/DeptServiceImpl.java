package com.woniuxy.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.IDeptDao;
import com.woniuxy.domain.Dept;
import com.woniuxy.service.IDeptService;

@Service
@Transactional
public class DeptServiceImpl implements IDeptService {
	
	@Autowired
	private IDeptDao dao;

	@Override
	public void saveTwo(Dept d,Dept d1) {
		dao.save(d);
		System.out.println(8/0);
		dao.save(d1);
	}

}
