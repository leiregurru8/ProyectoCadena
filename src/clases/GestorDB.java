package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;


/**
 * Clase est�tica para gestionar la conexi�n con la base de datos
 * @author Pablo Alberdi
 * @author Julen Alboniga-Menor
 * @author Leire Gurrutxaga
 *
 */
public class GestorDB {
	private static String db = "RepEAT.db";
	private static String url = "jdbc:sqlite:" + db;
	private static Connection con;
	
	/**
	 * Establece la conexi�n con la base de datos
	 */
	public static void conectar() {
		try {
			con = DriverManager.getConnection(url);
			System.out.println("Conexi�n a la BD realizada con �xito");
			crearTablas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Genera las tablas necesarias en caso de que �stas no hayan sido creadas
	 */
	
	private static void crearTablas() {
		try {
			Statement stmt = con.createStatement();
			String t1 = "CREATE TABLE IF NOT EXISTS Restaurante(idRest INTEGER NOT NULL PRIMARY KEY, Nombre TEXT NOT NULL, Direccion TEXT NOT NULL, idTipoRest INTEGER NOT NULL, Entrega INTEGER NOT NULL);";
			String t2 = "CREATE TABLE IF NOT EXISTS Plato(idPlato INTEGER NOT NULL PRIMARY KEY, Nombre TEXT NOT NULL, Descripcion TEXT NOT NULL, idTipoPlato INTEGER NOT NULL, Precio INTEGER NOT NULL, idRestaurante INTEGER NOT NULL);";
			String t3 = "CREATE TABLE IF NOT EXISTS Cliente(idCliente INTEGER NOT NULL PRIMARY KEY, Nombre TEXT NOT NULL, Apellidos TEXT NOT NULL, Email TEXT NOT NULL UNIQUE, Contrasena TEXT NOT NULL);";
			String t4 = "CREATE TABLE IF NOT EXISTS Pedido(idPedido INTEGER NOT NULL PRIMARY KEY, idCliente INTEGER NOT NULL, DireccionEntrega TEXT NOT NULL, FechaPedido DATETIME DEFAULT CURRENT_TIMESTAMP);";
			String t5 = "CREATE TABLE IF NOT EXISTS Pedido_Plato(idPedido INTEGER NOT NULL, idPlato INTEGER NOT NULL, Cantidad INTEGER NOT NULL, PRIMARY KEY(idPedido, idPlato));";
			String t6 = "CREATE TABLE IF NOT EXISTS TipoRest(idTipoRest INTEGER NOT NULL PRIMARY KEY, Nombre TEXT NOT NULL);";
			String t7 = "CREATE TABLE IF NOT EXISTS TipoPlato(idTipoPlato INTEGER NOT NULL PRIMARY KEY, Nombre TEXT NOT NULL);";
			
			stmt.execute(t1);
			stmt.execute(t2);
			stmt.execute(t3);
			stmt.execute(t4);
			stmt.execute(t5);
			stmt.execute(t6);
			stmt.execute(t7);
			
			System.out.println("Tablas creadas con �xito");
			insertInicial();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Precargar las tablas necesarias con informaci�n de Tipos de restaurantes, restaurantes, tipos de platos y platos
	 */
	private static void insertInicial() {
		try {
			Statement stmt = con.createStatement();
			//TIPO RESTAURANTE
			String i1 = "INSERT OR IGNORE INTO TipoRest(idTipoRest, Nombre) VALUES(1, 'Italiano');";
			String i2 = "INSERT OR IGNORE INTO TipoRest(idTipoRest, Nombre) VALUES(2, 'Mexicano');";
			String i3 = "INSERT OR IGNORE INTO TipoRest(idTipoRest, Nombre) VALUES(3, 'Chino');";
			String i4 = "INSERT OR IGNORE INTO TipoRest(idTipoRest, Nombre) VALUES(4, 'Turco');";
			//RESTAURANTE
			String i5 = "INSERT OR IGNORE INTO Restaurante(idRest, Nombre, Direccion, idTipoRest, Entrega) VALUES(1, 'Tagliatelle', 'Calle San Mart�n', 1, 0);";
			String i6 = "INSERT OR IGNORE INTO Restaurante(idRest, Nombre, Direccion, idTipoRest, Entrega) VALUES(2, 'El Chile Picon', 'Plaza Nafarroa', 2, 1);";
			String i7 = "INSERT OR IGNORE INTO Restaurante(idRest, Nombre, Direccion, idTipoRest, Entrega) VALUES(3, 'Dragon feliz', 'Calle Easo', 3, 1);";
			String i8 = "INSERT OR IGNORE INTO Restaurante(idRest, Nombre, Direccion, idTipoRest, Entrega) VALUES(4, 'Donner Good', 'Avenida de la Libertad', 4, 0);";
			//TIPO PLATO
			String i9 = "INSERT OR IGNORE INTO TipoPlato(idTipoPlato, Nombre) VALUES (1, 'Pizza');";
			String i10 = "INSERT OR IGNORE INTO TipoPlato(idTipoPlato, Nombre) VALUES (2, 'Pasta');";
			String i11 = "INSERT OR IGNORE INTO TipoPlato(idTipoPlato, Nombre) VALUES (3, 'Entrantes');";
			String i12 = "INSERT OR IGNORE INTO TipoPlato(idTipoPlato, Nombre) VALUES (4, 'Platos principales');";
			String i23 = "INSERT OR IGNORE INTO TipoPlato(idTipoPlato, Nombre) VALUES (5, 'Postres');";
			//PLATOS
			String i13 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(1, 'Pizza Carbonara', 'Nata, Champinones, Bacon', 1, 14.99, 1);";
			String i14 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(2, 'Pizza Jamon y Queso', 'Tomate, Jamon, Queso', 1, 9.99, 1);";
			String i15 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(3, 'Tallarines Carbonara', 'Tallarines, Nata, Champinones, Bacon', 2, 12.99, 1);";
			String i16 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(4, 'Raviollis de Atun', 'Raviollis, Atun, Salsa parmesano', 2, 10.99, 1);";
			String i17 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(5, 'Tacos', 'Carne desmechada, Pimiento Rojo, Pimiento Verde, Salsa Chiltepin', 4, 8.99, 2);";
			String i18 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(6, 'Totopos', 'Nachos con guacamole, queso y creamcheese', 3, 7.99, 2);";
			String i19 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(7, 'Galleta de la suerte', 'Descubre tu futuro', 5, 0.99, 3);";
			String i20 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(8, 'Gyoza', 'Empanadillas de Pekin', 3, 2.99, 3);";
			String i21 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(9, 'Tataki de atun', 'Tacos sabrosos de atun', 4, 19.99, 3);";
			String i22 = "INSERT OR IGNORE INTO Plato(idPlato, Nombre, Descripcion, idTipoPlato, Precio, idRestaurante) VALUES(10, 'Kebab Especial', 'Carne, patatas fritas, lechuga, abundante salsa blanca', 4, 4.99, 4);";
			
			stmt.execute(i1);
			stmt.execute(i2);
			stmt.execute(i3);
			stmt.execute(i4);
			stmt.execute(i5);
			stmt.execute(i6);
			stmt.execute(i7);
			stmt.execute(i8);
			stmt.execute(i9);
			stmt.execute(i10);
			stmt.execute(i11);
			stmt.execute(i12);
			stmt.execute(i13);
			stmt.execute(i14);
			stmt.execute(i15);
			stmt.execute(i16);
			stmt.execute(i17);
			stmt.execute(i18);
			stmt.execute(i19);
			stmt.execute(i20);
			stmt.execute(i21);
			stmt.execute(i22);
			stmt.execute(i23);
			
			System.out.println("Tablas precargadas con exito");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * metodo que permite optener los tipos de restaurantes 
	 * @return devuele los tipos de restaurantes en la db
	 */
	public static DefaultListModel<TipoRestaurante> getTiposRestaurantes() {
		
		DefaultListModel<TipoRestaurante> tiposRestaurantes = new DefaultListModel<>();
		try {
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM TipoRest");
			while(res.next()) {
				tiposRestaurantes.addElement(new TipoRestaurante(res.getInt("idTipoRest"), res.getString("Nombre")));
				System.out.println(res.getInt("idTipoRest") + " " + res.getString("Nombre"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tiposRestaurantes;
	}
	
	public static boolean crearCliente(String nombre, String apellidos, String email, String contrasenya) throws SQLException{
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO Cliente (Nombre, Apellidos, Email, Contrasena) VALUES (?, ?, ?, ?);");
		pstmt.setString(1, nombre);
		pstmt.setString(2, apellidos);
		pstmt.setString(3, email);
		pstmt.setString(4, contrasenya);
		pstmt.execute();
		ResultSet res = pstmt.getGeneratedKeys();
		if (res.next()) {
			int idCliente = res.getInt(1);
			Cliente.idCliente = idCliente;
			Cliente.nombre = nombre;
			Cliente.apellidos = apellidos;
			Cliente.email = email;
			return true;
		} else {
			return false;
		}

	}
	
	public static ResultSet iniciarSesion(String email, String contrasenya) throws SQLException{
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Cliente WHERE Email = ? AND Contrasena = ?;");
		pstmt.setString(1, email);
		pstmt.setString(2, contrasenya);
		return pstmt.executeQuery();
	}
	
	public static DefaultListModel<Restaurante> getRestaurantesPorTipo(int idTipoRestaurante) {
    	PreparedStatement pstmt;
    	DefaultListModel<Restaurante> restaurantes = new DefaultListModel();
		try {
			pstmt = con.prepareStatement("SELECT * FROM Restaurante WHERE idTipoRest = ?");
			pstmt.setInt(1, idTipoRestaurante);
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				restaurantes.addElement(new Restaurante(res.getInt("idRest"), res.getString("Nombre"), res.getString("Direccion"), res.getInt("idTipoRest"), res.getBoolean("Entrega")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return restaurantes;
    }
	
	public static ArrayList<Plato> getPlatosPorRestauranteYTipo(int idRestaurante, int idTipoPlato) {
    	PreparedStatement pstmt;
    	ArrayList<Plato> platos = new ArrayList<>();
		try {
			pstmt = con.prepareStatement("SELECT * FROM Plato WHERE idRestaurante = ? AND idTipoPlato = ?");
			pstmt.setInt(1, idRestaurante);
			if (idTipoPlato == 0) {
				pstmt.setString(2, "%");
			} else {
				pstmt.setInt(2, idTipoPlato);
			}
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				platos.add(new Plato(res.getInt("idPlato"), res.getString("Nombre"), res.getString("Descripcion"),res.getInt("idTipoPlato"),res.getInt("Precio"),res.getInt("idRestaurante")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return platos;
    }
	
	public static DefaultComboBoxModel<TipoPlato> getTipoPlatoPorRestaurante(int idRestaurante) {
		PreparedStatement pstmt;
		DefaultComboBoxModel<TipoPlato> tiposPlato = new DefaultComboBoxModel<>();
		tiposPlato.addElement(new TipoPlato(0, "Todos"));
		try {
			pstmt = con.prepareStatement("SELECT TipoPlato.idTipoPlato AS idTipoPlato, TipoPlato.Nombre AS Nombre FROM Plato, TipoPlato WHERE Plato.idTipoPlato = TipoPlato.idTipoPlato AND Plato.idRestaurante = ? GROUP BY TipoPlato.idTipoPlato");
			pstmt.setInt(1, idRestaurante);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				tiposPlato.addElement(new TipoPlato(res.getInt("idTipoPlato"), res.getString("Nombre")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tiposPlato;
	}
}
