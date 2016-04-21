package com.mit.test;

import static org.junit.Assert.*;

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
	Projet p= new Projet(3);
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
