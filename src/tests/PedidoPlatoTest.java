package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clases.PedidoPlato;
/**
 * 
 * @author Pablo Alberdi
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 *
 */
public class PedidoPlatoTest {
	/**
	 * Inicializamos la variable
	 */
	private PedidoPlato a;
	
	@Before
	public void setUp() throws Exception {
		/**
		 * Definimos los atributos
		 */
		a=new PedidoPlato();
		a.setCantidad(3);
		a.setIdPedido(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/**
		 * testeamos si se a modificado correctamente
		 */
		assertEquals(3, a.getCantidad());
		a.setCantidad(1);
		assertEquals(1, a.getCantidad());
		
	}

}
