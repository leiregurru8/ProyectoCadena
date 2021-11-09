package clases;
/**
 * Clase para el tipo de restaurante
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 * @author Pablo Alberdi
 */

public class TipoRestaurante {
	private int idTipoRestaurante;
	private String Nombre;
	/**
	 * constructor del tipo restaurante
	 * @param idTipoRestaurante
	 * @param nombre
	 */
	public TipoRestaurante(int idTipoRestaurante, String nombre) {
		this.idTipoRestaurante = idTipoRestaurante;
		Nombre = nombre;
	}
	/**
	* obtiene el id del tipo de restaurante
 	* @return idtipoRestaurante
 	*/
	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}
	/**
	 * define el tipo de restaurante
	 * @param idTipoRestaurante
	 */

	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}
	/**
	 * obtiene el nombre del tipo de restaurante
	 * @return nombre
	 */

	public String getNombre() {
		return Nombre;
	}
	/**
	 * define el nombre del tipo de restaurante
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
