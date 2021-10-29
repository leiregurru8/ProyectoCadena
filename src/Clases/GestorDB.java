package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorDB {
	private static String db = "Cadena.db";
	private static String url = "jdbc:sqlite:" + db;
	private static Connection con;
	
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
	
	private static void crearTablas() {
		try {
			Statement stmt = con.createStatement();
			String tabla1 = "CREATE TABLE IF NOT EXISTS TABLA1(__atributos__)";
			
			//stmt.execute(tabla1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
