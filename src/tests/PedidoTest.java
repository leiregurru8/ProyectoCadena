package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clases.Pedido;
/**
 * 
 * @author Pablo Alberdi
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 *
 */
public class PedidoTest {
	/**
	 * Inicializamos la variable
	 */
	private Pedido a;
	@Before
	public void setUp() throws Exception {
		/**
		 * Creamos el pedido
		 */
		a=new Pedido(1,2,"Tenis Ondarreta","09/10/2021");
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/**
		 * vemos si se modifica correctamente
		 */
	a.setDireccionEntrega("deusto");
	 assertEquals("deusto",a.getDireccionEntrega());
	}

}
