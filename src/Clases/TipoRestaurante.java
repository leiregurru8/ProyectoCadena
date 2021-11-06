package clases;

public class TipoRestaurante {
	private int idTipoRestaurante;
	private String Nombre;
	
	public TipoRestaurante(int idTipoRestaurante, String nombre) {
		this.idTipoRestaurante = idTipoRestaurante;
		Nombre = nombre;
	}

	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}

	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
