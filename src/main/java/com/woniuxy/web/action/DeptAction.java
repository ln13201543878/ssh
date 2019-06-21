package com.woniuxy.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniuxy.domain.Dept;
import com.woniuxy.service.IDeptService;



@Controller
@Scope("prototype")
public class DeptAction extends ActionSupport implements ModelDriven<Dept>{
	private Dept d=new Dept();
	@Autowired
	private IDeptService service;
	
	public String save() {
		
		return "findAll";
	}
	public String delete() {
		return "findAll";
	}
	
	@Override
	public Dept getModel() {
		return d;
	}

}
