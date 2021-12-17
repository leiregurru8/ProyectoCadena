package tests;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clases.Plato;
import clases.Restaurante;
import clases.TipoRestaurante;

public class GestorDBTest {
	DefaultListModel<TipoRestaurante> listaRestaurante;
	DefaultListModel<Restaurante> listaRestauranteTipo;
	ArrayList<Plato> listaPlatosRestTipo;

	@Before
	public void setUp() throws Exception {
		clases.GestorDB.conectar();
		listaRestaurante=new DefaultListModel<>();
		listaRestaurante.add(0, new TipoRestaurante(1, "Italiano"));
		listaRestaurante.add(1, new TipoRestaurante(2, "Mexicano"));
		listaRestaurante.add(2, new TipoRestaurante(3, "Chino"));
		listaRestaurante.add(3, new TipoRestaurante(4, "Turco"));
		listaRestauranteTipo=new DefaultListModel<>();
		listaRestauranteTipo.add(0,new Restaurante(1, "Tagliatelle", "Calle San Mart�n", 1, false));
		listaPlatosRestTipo=new ArrayList<>();
		listaPlatosRestTipo.add(new Plato(1, "Pizza Carbonara", "Nata, Champinones, Bacon", 1, 14.99, 1));
		listaPlatosRestTipo.add(new Plato(2, "Pizza Jamon y Queso", "Tomate, Jamon, Queso", 1, 9.99, 1));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void test() {
		DefaultListModel<TipoRestaurante> listaResultante=clases.GestorDB.getTiposRestaurantes();
		for (int i=0;i<listaResultante.size();i++) {
			assertEquals(listaRestaurante.get(0).getNombre(), listaResultante.get(0).getNombre() );
		}
	}
	@Test
	public void test2() {
		ArrayList<Restaurante> listaResultante=clases.GestorDB.getRestaurantesPorTipo(1);
		for (int i=0;i<listaResultante.size();i++) {
			assertEquals(listaRestauranteTipo.get(0).getNombre(), listaResultante.get(0).getNombre() );
		}
	}
	@Test
	public void test3() {
		DefaultListModel<Plato>listaPlatosRestTipo=clases.GestorDB.getPlatosPorRestauranteYTipo(1, 1);
		for (int i=0;i<listaPlatosRestTipo.size();i++) {
			assertEquals(listaPlatosRestTipo.get(0).getNombre(), listaPlatosRestTipo.get(0).getNombre() );
	}
	

}
	@Test
	public void test4() throws SQLException {
		assertTrue(clases.GestorDB.crearCliente("Pablo", "Alberdi", "palberdi2000@gmail.com", "1234"));
	}
	
}
