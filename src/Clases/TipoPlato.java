package clases;
/**
 * Clase para el objeto de tipoPlato
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-Menor
 * @author Pablo Alberdi
 */

public class TipoPlato {
	
	private int idTipoPlato;
	private String nombre; 
	
	public TipoPlato () {
		
	}
	
	/**
	 * constructor del tipoPlato
	 * @param idTipoPlato identificador unico para cada tipo de plato
	 * @param nombre nombre del plato
	 */
	public TipoPlato (int idTipoPlato, String nombre) {
		this.idTipoPlato=idTipoPlato;
		this.nombre=nombre;
	}
	/**
	 * Devuelve idTipoPlato
	 * @return idTipoPlato identificador unico para cada tipo de plato
	 */
	public int getIdTipoPlato() {
		return idTipoPlato;
	}
	/**
	 * Establece idTipoPlato
	 * @param idTipoPlato identificador unico para cada tipo de plato
	 */
	public void setIdTipoPlato(int idTipoPlato) {
		this.idTipoPlato = idTipoPlato;
	}
	/**
	 * Devuelve nombre
	 * @return nombre nombre del plato
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece nombre
	 */

	public void setNombre(String nombre) {
		nombre = nombre;
	}

}
