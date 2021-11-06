package clases;

public class PedidoPlato {
	private int idPedido;
	private int idPlato;
	private int cantidad;
	public PedidoPlato(int idPedido, int idPlato, int cantidad) {
		
		this.idPedido = idPedido;
		this.idPlato = idPlato;
		this.cantidad = cantidad;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdPlato() {
		return idPlato;
	}
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	


}
