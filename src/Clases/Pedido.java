package clases;

/**
 * Clase para crear objeto pedido
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 * @author Pablo Alberdi
 */
public class Pedido {
	/**
	 * Atributos del objeto pedido
	 */
	private int idPedido;
	private int idCliente;
	private	String direccionEntrega;
	private String fechaPedido;
	
	public Pedido() {
		
	}
	/**
	 * Constructor del objeto Pedido
	 * @param idPedido
	 * @param idCliente
	 * @param direccionEntrega
	 * @param fechaPedido
	 */
	public Pedido(int idPedido, int idCliente, String direccionEntrega, String fechaPedido) {
		
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.direccionEntrega = direccionEntrega;
		this.fechaPedido = fechaPedido;
	}
	/**
	 * metodo get para obtener id del pedido
	 * @return devuelve el id del pedido
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * define el id del pedido
	 * @param idPedido parametro tipo int para definirlo en el objeto
	 */
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * metodo get para obtener el id del cliente
	 * @return devuelve el id del cliente
	 */
	public int getIdCliente() {
		return idCliente;
	}
	/**
	 * define el id del Cliente
	 * @param idCliente parametro tipo int que se define en el objeto Cliente
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * metodo get para obtener la direccion de entrega
	 * @return devuelve la direccion de entrega 
	 */
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	/**
	 * define la direccion de entrega del pedido
	 * @param direccionEntrega parametro tipo String 
	 */
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	/**
	 * metodo get para obtener la fecha del pedido
	 * @return devuelve la fecha del pedido
	 */
	public String getFechaPedido() {
		return fechaPedido;
	}
	/**
	 * define la fecha del pedido 
	 * @param fechaPedido parametro tipo String 
	 */
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	
	
	

}
