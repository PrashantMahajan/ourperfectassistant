package com.goalsup.server.database.tables.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

public class UserTest {

	private User g_objSamepleUser = null;
	
	private final LocalServiceTestHelper g_objHelper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.g_objHelper.setUp();
		this.g_objSamepleUser = new User();
		this.g_objSamepleUser.setName("abc");
	}

	@After
	public void tearDown() throws Exception {
		this.g_objHelper.tearDown();
		this.g_objSamepleUser = null;
	}

	@Test
	public void testSave() {
		this.g_objSamepleUser = new User();
		assertTrue(this.g_objSamepleUser.update());
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteRow() {
		fail("Not yet implemented");
	}

}
