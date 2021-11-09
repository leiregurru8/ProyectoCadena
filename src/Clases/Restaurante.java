package clases;

/**
 * Clase para el objeto restaurante con sus atributos
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 * @author Pablo Alberdi
 */

public class Restaurante {
	/**
	 * atributos del objeto Restaurante 
	 */
	private int idRest;
	private String nombre;
	private String direccion;
	private int idTipoRestaurante;
	private boolean entrega;
	/**
	 * Contructor del objeto Restaurante
	 * @param idRest
	 * @param nombre
	 * @param direccion
	 * @param idTipoRestaurante
	 * @param entrega
	 */
	public Restaurante(int idRest, String nombre, String direccion, int idTipoRestaurante, boolean entrega) {
		this.idRest = idRest;
		this.nombre = nombre;
		this.direccion = direccion;
		this.idTipoRestaurante = idTipoRestaurante;
		this.entrega = entrega;
	}
	/**
	 * obtiene el id del restaurante
	 * @return idrest
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
	/**
	 * Obtiene el nombre del restaurante
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * define el nombre del restaurante
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtiene la direccion del restaurante
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * define la direccion del restaurante
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * obtiene el id del tipo de restaurante
	 * @return idTipoRestaurante
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
	 * Devuelve si entrega
	 * @return entrega
	 */
	public boolean isEntrega() {
		return entrega;
	}
	/**
	 * define si entrega 
	 * @param entrega
	 */
	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	


}
