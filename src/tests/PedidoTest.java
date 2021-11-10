package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clases.Pedido;

public class PedidoTest {
	private Pedido a;
	@Before
	public void setUp() throws Exception {
		a=new Pedido(1,2,"Tenis Ondarreta","09/10/2021");
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	a.setDireccionEntrega("deusto");
	 assertEquals("deusto",a.getDireccionEntrega());
	}

}
