package clases;
/**
 * Clase para el objeto de tipoPlato
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 * @author Pablo Alberdi
 */

public class TipoPlato {
	/**
	 * atributos del objeto plato
	 */
	private int idTipoPlato;
	private String nombre; 
	
	public TipoPlato () {
		
	}
	
	/**
	 * constructor del tipoPlato
	 * @param idTipoPlato
	 * @param nombre
	 */
	public TipoPlato (int idTipoPlato, String nombre) {
		this.idTipoPlato=idTipoPlato;
		this.nombre=nombre;
	}
	/**
	 * Obtiene el id del tipo plato
	 * @return idTipoPlato
	 */
	public int getIdTipoPlato() {
		return idTipoPlato;
	}
	/**
	 * define el id del tipo de plato
	 * @param idTipoPlato
	 */
	public void setIdTipoPlato(int idTipoPlato) {
		this.idTipoPlato = idTipoPlato;
	}
	/**
	 * obtiene el nombre del tipoplato
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * define el nombre del tipo plato
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		nombre = nombre;
	}

}
