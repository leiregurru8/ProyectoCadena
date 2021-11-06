package clases;

public class Plato {
	private int idPlato;
	private String nombre;
	private String description;
	private int idTipoPlato;
	private int precio;
	private int idRest;
	public Plato(int idPlato, String nombre, String description, int idTipoPlato, int precio, int idRest) {
		
		this.idPlato = idPlato;
		this.nombre = nombre;
		this.description = description;
		this.idTipoPlato = idTipoPlato;
		this.precio = precio;
		this.idRest = idRest;
	}
	public int getIdPlato() {
		return idPlato;
	}
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIdTipoPlato() {
		return idTipoPlato;
	}
	public void setIdTipoPlato(int idTipoPlato) {
		this.idTipoPlato = idTipoPlato;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getIdRest() {
		return idRest;
	}
	public void setIdRest(int idRest) {
		this.idRest = idRest;
	}
	
	
	

}
