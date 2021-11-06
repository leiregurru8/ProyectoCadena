package clases;

public class TipoPlato {
	private int idTipoPlato;
	private String nombre; 
	
	public TipoPlato (int idTipoPlato, String nombre) {
		this.idTipoPlato=idTipoPlato;
		this.nombre=nombre;
	}

	public int getIdTipoPlato() {
		return idTipoPlato;
	}

	public void setIdTipoPlato(int idTipoPlato) {
		this.idTipoPlato = idTipoPlato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre;
	}

}
