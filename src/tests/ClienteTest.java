package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clases.Cliente;

class ClienteTest {
	private Cliente a;
	@BeforeClass
	void setUp() throws Exception {
		a=new Cliente();
		a.setNombre("Pablo");
		a.setApellidos("Alberdi Escudero");
		a.setEmail("palberdi2000@gmail.com");
	}

	@AfterClass
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		a.setApellidos("Alboniga");
		assertEquals("Alboniga", a.getApellidos());
	}

}
