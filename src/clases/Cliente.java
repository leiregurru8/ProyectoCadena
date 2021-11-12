package clases;
/**
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 * @author Pablo Alberdi
 */
public class Cliente {
	/**
	 * Atributos del cliente
	 */
	private int idCliente;
	private String nombre;
	private String apellidos;
	private String email;
	private String contrasenya;
	
	public Cliente() {
		
	}
	/**
	 * Constructor del objeto cliente
	 * @param idCliente
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param contrasenya
	 */
	public Cliente(int idCliente, String nombre, String apellidos, String email, String contrasenya) {
		
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contrasenya = contrasenya;
	}
	/**
	 * @return metodo que devuelve el id del cliente
	 */
	public int getIdCliente() {
		return idCliente;
	}
	/**
	 * metodo que define el idcliente
	 * @param idCliente parametro tipo int que definira el id
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * 
	 * @return metodo que devuelve el nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * metodo que define el nombre
	 * @param nombre parametro tipo String que define el nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return metodo que devuelve el apellido del cliente
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * metodo que define los apellidos
	 * @param apellidos parametro tipo String que define los apellidos del cliente
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * 
	 * @return metodo que devuelve el email del cliente
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * metodo para definir el email
	 * @param email parametro tipo String que define el email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return metodo que devuelve el contrasenya del cliente
	 */
	public String getContrasenya() {
		return contrasenya;
	}
	/**
	 * metodo para definir contrasenya
	 * @param contrasenya parametro String para definir la contraseña
	 */
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	
	

}
