package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase estática para gestionar la conexión con la base de datos
 * @author Pablo Alberdi
 * @author Julen Alboniga-Menor
 * @author Leire Gurrutxaga
 *
 */
public class GestorDB {
	private static String db = "Cadena.db";
	private static String url = "jdbc:sqlite:" + db;
	private static Connection con;
	
	/**
	 * Establece la conexión con la base de datos
	 */
	public static void conectar() {
		try {
			con = DriverManager.getConnection(url);
			System.out.println("Conexión a la BD realizada con éxito");
			crearTablas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Genera las tablas necesarias en caso de que éstas no hayan sido creadas
	 */
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
