package clases;

/**
 * Clase que relaciona el pedido con el plato
 * @author Leire Gurrutxaga
 * @author Julen Alboniga-menor
 * @author Pablo Alberdi
 */

public class PedidoPlato {
	/**
	 * atributos de la clase pedidoPlato
	 */
	private int idPedido;
	private int idPlato;
	private int cantidad;

	public PedidoPlato() {
		
	}
	/**
 * Constructor del objeto pedidoPlato
 * @param idPedido
 * @param idPlato
 * @param cantidad
 */
	public PedidoPlato(int idPedido, int idPlato, int cantidad) {
		
		this.idPedido = idPedido;
		this.idPlato = idPlato;
		this.cantidad = cantidad;
	}
	/**
	 * metodo get para obtener el id del pedido
	 * @return devuelve el id del pedido
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * define el id del pedido 	
	 * @param idPedido parametro tipo int que define el id del pedido
	 */
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * metodo get que devuelve el id del plato	
	 * @return idPlato
	 */
	public int getIdPlato() {
		return idPlato;
	}
	/**
	 * define el id del plato	
	 * @param idPlato parametro int 
	 */
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}
	/**
	 * metodo get que obtiene la cantidad de platos
	 * @return cantidad de platos
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * defina cantidad de platos 
	 * @param cantidad parametro tipo int
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	


}
