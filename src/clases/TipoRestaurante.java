package clases;
/**
 * Clase para el tipo de restaurante
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-Menor
 * @author Pablo Alberdi
 */

public class TipoRestaurante {
	private int idTipoRestaurante;
	private String Nombre;
	
	public TipoRestaurante() {
		
	}
	
	/**
	 * constructor del tipo restaurante
	 * @param idTipoRestaurante identificador unico para cada tipo de restaurante
	 * @param nombre nombre del tipo del restaurnate
	 */
	public TipoRestaurante(int idTipoRestaurante, String nombre) {
		this.idTipoRestaurante = idTipoRestaurante;
		Nombre = nombre;
	}
	/**
	* Devuelve idTipoRestaurante
 	* @return idTipoRestaurante identificador unico para cada tipo de restaurante
 	*/
	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}
	/**
	 * Establece idTipoRestaurante
	 * @param idTipoRestaurante identificador unico para cada tipo de restaurante
	 */

	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}
	/**
	 * Devuelve nombre
	 * @return nombre del tipo del restaurnate
	 */

	public String getNombre() {
		return Nombre;
	}
	/**
	 * Establece nombre
	 * @param nombre del tipo del restaurnate
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return Nombre;
	}
	
}
