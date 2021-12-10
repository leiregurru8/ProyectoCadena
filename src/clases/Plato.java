package clases;

/**
 * Clase para el objeto plato y sus atributos
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-Menor
 * @author Pablo Alberdi
 */

public class Plato {
	
	private int idPlato;
	private String nombre;
	private String description;
	private int idTipoPlato;
	private double precio;
	private int idRest;
	
	public Plato() {
		
	}
	
	/**
	 * Constructor del objeto Plato
	 * @param idPlato identificador unico para cada plato
	 * @param nombre nombre del plato
	 * @param description descripcion breve de cada plato que contiene informacion del plato
	 * @param idTipoPlato identificador unico para cada tipo de plato
	 * @param d precio del plato
	 * @param idRest identificador unico para cada restaurante
	 */
	public Plato(int idPlato, String nombre, String description, int idTipoPlato, double d, int idRest) {
		
		this.idPlato = idPlato;
		this.nombre = nombre;
		this.description = description;
		this.idTipoPlato = idTipoPlato;
		this.precio = d;
		this.idRest = idRest;
	}
	/**
	 * Devuelve idPlato
	 * @return idPlato identificador unico para cada plato
	 */
	public int getIdPlato() {
		return idPlato;
	}
	/**
	 * Establece idPlato
	 * @param idPlato identificador unico para cada plato
	 */
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
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
	 * @param nombre nombre del plato
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el description
	 * @return description descripcion breve de cada plato que contiene informacion del plato
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Establece description
	 * @param description descripcion breve de cada plato que contiene informacion del plato
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * Devuelve precio 
	 * @return precio precio del plato
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Establece precio
	 * @param precio precio del plato
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * Devuelve idRest
	 * @return idRest identificador unico para cada restaurante
	 */
	public int getIdRest() {
		return idRest;
	}
	/**
	 * Establece idRest 
	 * @param idRest identificador unico para cada restaurante
	 */
	public void setIdRest(int idRest) {
		this.idRest = idRest;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
	
	
	

}
