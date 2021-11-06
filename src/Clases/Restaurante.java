package Clases;

public class Restaurante {
	private int idRest;
	private String nombre;
	private String direccion;
	private int idTipoRestaurante;
	private boolean entrega;
	public Restaurante(int idRest, String nombre, String direccion, int idTipoRestaurante, boolean entrega) {
	
		this.idRest = idRest;
		this.nombre = nombre;
		this.direccion = direccion;
		this.idTipoRestaurante = idTipoRestaurante;
		this.entrega = entrega;
	}
	public int getIdRest() {
		return idRest;
	}
	public void setIdRest(int idRest) {
		this.idRest = idRest;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}
	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}
	public boolean isEntrega() {
		return entrega;
	}
	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	


}
