package com.mit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mit.dao.MembreDAO;
import com.mit.entity.Membre;

public class MembreTest {
	private static ClassPathXmlApplicationContext context;
	private static MembreDAO membreDAO;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("application-context.xml");
		membreDAO=(MembreDAO)context.getBean("membreDao");
	}

	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void testSaveOrUpdate() {
		Membre m =new Membre("Member1");
		membreDAO.saveOrUpdate(m);
		
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
	public void testFindById() {
		fail("Not yet implemented");
	}

}
