package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Cliente;

class ClienteTest {
	private Cliente a;
	@BeforeEach
	void setUp() throws Exception {
		a=new Cliente();
		a.setNombre("Pablo");
		a.setApellidos("Alberdi Escudero");
		a.setEmail("palberdi2000@gmail.com");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		a.setApellidos("Alboniga");
		assertEquals("Alboniga", a.getApellidos());
	}

}
