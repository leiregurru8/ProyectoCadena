package clases;

/**
 * Clase para el objeto plato y sus atributos
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 * @author Pablo Alberdi
 */

public class Plato {
	/**
	 * atributos de la clase plato
	 */
	private int idPlato;
	private String nombre;
	private String description;
	private int idTipoPlato;
	private int precio;
	private int idRest;
	/**
	 * Constructor del objeto Plato
	 * @param idPlato
	 * @param nombre
	 * @param description
	 * @param idTipoPlato
	 * @param precio
	 * @param idRest
	 */
	public Plato(int idPlato, String nombre, String description, int idTipoPlato, int precio, int idRest) {
		
		this.idPlato = idPlato;
		this.nombre = nombre;
		this.description = description;
		this.idTipoPlato = idTipoPlato;
		this.precio = precio;
		this.idRest = idRest;
	}
	/**
	 * devuelve el id del plato
	 * @return idPlato
	 */
	public int getIdPlato() {
		return idPlato;
	}
	/**
	 * define el id del plato
	 * @param idPlato
	 */
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}
	/**
	 * devuelve el nombre del plato
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * define el nombre del plato
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * devuelve el descripcion del plato
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * define la descripcion del plato
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * devuelve el id del tipoplato
	 * @return idTipoPlato
	 */
	public int getIdTipoPlato() {
		return idTipoPlato;
	}
	/**
	 * define el id del tipoPlato
	 * @param idTipoPlato
	 */
	public void setIdTipoPlato(int idTipoPlato) {
		this.idTipoPlato = idTipoPlato;
	}
	/**
	 * devuelve el precio del plato
	 * @return precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * define el precio del plato
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * devuelve el id del restaurante
	 * @return idRest
	 */
	public int getIdRest() {
		return idRest;
	}
	/**
	 * define el id del restaurante 
	 * @param idRest
	 */
	public void setIdRest(int idRest) {
		this.idRest = idRest;
	}
	
	
	

}
