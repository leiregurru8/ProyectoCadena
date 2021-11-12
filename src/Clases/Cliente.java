package clases;
/**
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-Menor
 * @author Pablo Alberdi
 */
public class Cliente {
	
	private int idCliente;
	private String nombre;
	private String apellidos;
	private String email;
	private String contrasenya;
	
	public Cliente() {
		
	}
	/**
	 * Constructor del objeto cliente
	 * @param idCliente identificador unico de cada cliente
	 * @param nombre	nombre del cliente
	 * @param apellidos	apellido del cliente
	 * @param email		email del cliente
	 * @param contrasenya	contraseña del cliente
	 */
	public Cliente(int idCliente, String nombre, String apellidos, String email, String contrasenya) {
		
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contrasenya = contrasenya;
	}
	
	/**
	 * Devuelve el idCliente
	 * @return idCliente identificador unico de cada cliente
	 */
	public int getIdCliente() {
		return idCliente;
	}
	/**
	 * Establece el idcliente
	 * @param idCliente identificador unico de cada cliente
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * Devuelve el nombre
	 * @return nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece el nombre
	 * @param nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el apellido
	 * @return apellido del cliente
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * Establece el apellido
	 * @param apellido del cliente
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * Devuelve el email del cliente
	 * @return  email del cliente
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Establece el email
	 * @param email del cliente
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Devuelve la contraseña
	 * @return contraseña del cliente
	 */
	public String getContrasenya() {
		return contrasenya;
	}
	/**
	 * Establece la contraseña
	 * @param contraseña del cliente
	 */
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	
	

}
