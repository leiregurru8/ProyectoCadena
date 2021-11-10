package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Plato;

class PlatoTest {
	private Plato a;
	
	@BeforeEach
	void setUp() throws Exception {
		a=new Plato();
		a.setIdPlato(1);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(1, a.getIdPlato());
		a.setIdPlato(2);
		assertEquals(2, a.getIdPlato());
	}

}
