package tests;

import static org.junit.Assert.assertEquals;


import clases.Plato;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


class PlatoTest {
	private Plato a;
	
	@BeforeClass
	void setUp() throws Exception {
		a=new Plato();
		a.setIdPlato(1);
	}

	@AfterClass
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(1, a.getIdPlato());
		a.setIdPlato(2);
		assertEquals(2, a.getIdPlato());
	}

}
