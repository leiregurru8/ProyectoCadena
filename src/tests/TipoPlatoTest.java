package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clases.TipoPlato;

public class TipoPlatoTest {
	private TipoPlato a;
	@Before
	public void setUp() throws Exception {
		a=new TipoPlato();
		//a.setNombre("Leire");
		a.setIdTipoPlato(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(1, a.getIdTipoPlato());
	}

}
