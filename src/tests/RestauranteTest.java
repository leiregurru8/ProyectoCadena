package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clases.Restaurante;

public class RestauranteTest {
	private Restaurante a;
	@Before
	public void setUp() throws Exception {
		a=new Restaurante();
		a.setEntrega(true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(a.isEntrega());
		a.setEntrega(false);
		assertFalse(a.isEntrega());
	}

}
