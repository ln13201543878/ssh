package com.woniuxy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.woniuxy.domain.Dept;
import com.woniuxy.service.IDeptService;


public class AppTest {
 @Test
public void test() throws Exception {
		ApplicationContext ctx = //
				new ClassPathXmlApplicationContext("applicationContext.xml");
		IDeptService service = (IDeptService) ctx.getBean("deptServiceImpl");
		Dept d=new Dept();
		Dept d1=new Dept();
		d.setDname("开发部");
		d1.setDname("市场部");
		service.saveTwo(d, d1);
}
}
