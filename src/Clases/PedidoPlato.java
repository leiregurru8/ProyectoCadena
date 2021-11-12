package clases;

/**
 * Clase que relaciona el pedido con el plato
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-Menor
 * @author Pablo Alberdi
 */

public class PedidoPlato {
	
	private int idPedido;
	private int idPlato;
	private int cantidad;

	public PedidoPlato() {
		
	}
	/**
 * Constructor del objeto pedidoPlato
 * @param idPedido identificador unico para cada pedido
 * @param idPlato	identificador unico para cada plato
 * @param cantidad la cantidad de tipo de comida que elije el cliente en cada pedido
 */
	public PedidoPlato(int idPedido, int idPlato, int cantidad) {
		
		this.idPedido = idPedido;
		this.idPlato = idPlato;
		this.cantidad = cantidad;
	}
	/**
	 * Devuelve idPedido
	 * @return idPedido identificador unico para cada pedido
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * Establece idPedido 	
	 * @param idPedido identificador unico para cada pedido
	 */
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * Devuelve idPlato	
	 * @return idPlato identificador unico para cada plato
	 */
	public int getIdPlato() {
		return idPlato;
	}
	/**
	 * Establece idplato	
	 * @param idPlato identificador unico para cada plato 
	 */
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}
	/**
	 * Devuelve cantidad
	 * @return cantidad la cantidad de tipo de comida que elije el cliente en cada pedido
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * Establece cantidad
	 * @param cantidad la cantidad de tipo de comida que elije el cliente en cada pedido
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	


}
