package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clases.PedidoPlato;

public class PedidoPlatoTest {

	private PedidoPlato a;
	
	@Before
	public void setUp() throws Exception {
		a=new PedidoPlato();
		a.setCantidad(3);
		a.setIdPedido(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(3, a.getCantidad());
		a.setCantidad(1);
		assertEquals(1, a.getCantidad());
		
	}

}
