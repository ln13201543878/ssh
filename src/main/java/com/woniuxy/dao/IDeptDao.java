package com.woniuxy.dao;

import java.util.List;

import com.woniuxy.domain.Dept;

public interface IDeptDao {
void save(Dept d);
void delete(Integer did);
void edit(Dept d);
List findAll();
Dept findOne(Integer did);
}
