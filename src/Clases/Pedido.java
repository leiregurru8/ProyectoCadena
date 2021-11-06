package Clases;

public class Pedido {
	private int idPedido;
	private int idCliente;
	private	String direccionEntrega;
	private String fechaPedido;
	public Pedido(int idPedido, int idCliente, String direccionEntrega, String fechaPedido) {
		
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.direccionEntrega = direccionEntrega;
		this.fechaPedido = fechaPedido;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	public String getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	
	
	

}
