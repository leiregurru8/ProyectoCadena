package clases;

/**
 * Clase para el objeto restaurante con sus atributos
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-Menor
 * @author Pablo Alberdi
 */

public class Restaurante implements Comparable<Restaurante> {
	
	private int idRest;
	private String nombre;
	private String direccion;
	private int idTipoRestaurante;
	private boolean entrega;
	
	public Restaurante() {
		
	}
	
	/**
	 * Contructor del objeto Restaurante
	 * @param idRest identificador unico para cada restaurante
	 * @param nombre nombre del restaurante
	 * @param direccion direccion del restaurante
	 * @param idTipoRestaurante identificador unico para cada tipo de plato
	 * @param entrega indica si el cliente solicita la entrega a domicilio o no
	 */
	public Restaurante(int idRest, String nombre, String direccion, int idTipoRestaurante, boolean entrega) {
		this.idRest = idRest;
		this.nombre = nombre;
		this.direccion = direccion;
		this.idTipoRestaurante = idTipoRestaurante;
		this.entrega = entrega;
	}
	/**
	 * Devuelve idRest
	 * @return idrest identificador unico para cada restaurante
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
	/**
	 * Devuelve nombre
	 * @return nombre del restaurante
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece nombre 
	 * @param nombre del restaurante
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 *Devuelve direccion 
	 * @return direccion del restaurante
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Establece direccion
	 * @param direccion del restaurante
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Devuelve idTipoRestaurante
	 * @return idTipoRestaurante identificador unico para cada tipo de plato
	 */
	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}
	/**
	 * Establece idTipoRestaurante
	 * @param idTipoRestaurante identificador unico para cada tipo de plato
	 */
	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}
	/**
	 * Devuelve entrega
	 * @return entrega indica si el cliente solicita la entrega a domicilio o no
	 */
	public boolean isEntrega() {
		return entrega;
	}
	/**
	 * Establece entrega 
	 * @param entrega indica si el cliente solicita la entrega a domicilio o no
	 */
	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}

	@Override
	public String toString() {
		return nombre;
	}


	@Override
	public int compareTo(Restaurante r) {
		return this.nombre.compareTo(r.getNombre());
	}
	
	

}
