package clases;

/**
 * Clase para crear objeto pedido
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-Menor
 * @author Pablo Alberdi
 */
public class Pedido {
	
	private int idPedido;
	private int idCliente;
	private	String direccionEntrega;
	private String fechaPedido;
	
	public Pedido() {
		
	}
	/**
	 * Constructor del objeto Pedido
	 * @param idPedido identificador unico para cada pedido
	 * @param idCliente identificador unico para cada cliente
	 * @param direccionEntrega direccion de entrega que el cliente asigna a cada pedido
	 * @param fechaPedido fecha del pedido
	 */
	public Pedido(int idPedido, int idCliente, String direccionEntrega, String fechaPedido) {
		
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.direccionEntrega = direccionEntrega;
		this.fechaPedido = fechaPedido;
	}
	/**
	 * Devuelve el idPedido
	 * @return  idPedido identificador unico para cada pedido
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * Establece el idPedido
	 * @param idPedido identificador unico para cada pedido
	 */
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * Devuelve el idCliente
	 * @return idCliente el identificador unico para cada cliente
	 */
	public int getIdCliente() {
		return idCliente;
	}
	/**
	 * Establece el idCliente
	 * @param idCliente el identificador unico para cada cliente
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * Devuelve direccionEntrega
	 * @return direccionEntrega direccion entrega que el cliente asigna a cada pedido 
	 */
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	/**
	 * Establece direccionEntrega
	 * @param direccionEntrega direccion entrega que el cliente asigna a cada pedido 
	 */
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	/**
	 * Devuelve fechaPedido
	 * @return fechaPedido fecha del pedido
	 */
	public String getFechaPedido() {
		return fechaPedido;
	}
	/**
	 * Establece fechaPedido
	 * @param fechaPedido fecha del pedido 
	 */
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	
	
	

}
