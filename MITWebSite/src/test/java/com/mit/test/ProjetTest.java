package com.mit.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mit.dao.ProjetDAO;
import com.mit.entity.Projet;

public class ProjetTest {
	private static ClassPathXmlApplicationContext context;
	private static ProjetDAO projetDAO;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("application-context.xml");
		projetDAO=(ProjetDAO) context.getBean("projetDao");
	}

	@After
	public void tearDown() throws Exception {
	context.close();
	}

	@Test
	public void testSaveOrUpdate() {
		Date d1=new Date(01/03/2016);
		Date d2=new Date(03/05/2016);
	Projet p= new Projet("test","test de projet",4,d1,d2);
	projetDAO.saveOrUpdate(p);
	
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByCriteria() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

}
