package clases;

import java.util.List;
import java.util.Objects;

public class Servicio {
	private int idServicio;
	private String aplicacion;
	private String descripcion;
	private List<Cliente> serviciosContratados; // la lista viene de la tabla Servicios_contratados en BD
	List<TipoProblema> tipoProblemas;

	
	
	// Constructores
	public Servicio(int idServicio, String aplicacion, String descripcion, List<Cliente> serviciosContratados,
			List<TipoProblema> tipoProblemas) {
		this.idServicio = idServicio;
		this.aplicacion = aplicacion;
		this.descripcion = descripcion;
		this.serviciosContratados = serviciosContratados;
		this.tipoProblemas = tipoProblemas;
	}

	public Servicio(String aplicacion, String descripcion, List<Cliente> serviciosContratados) {
		this.aplicacion = aplicacion;
		this.descripcion = descripcion;
		this.serviciosContratados = serviciosContratados;
	}

	
	
	// Getters and Setters
	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public String getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Cliente> getServiciosContratados() {
		return serviciosContratados;
	}

	public void setServiciosContratados(List<Cliente> serviciosContratados) {
		this.serviciosContratados = serviciosContratados;
	}

	public List<TipoProblema> getTipoProblemas() {
		return tipoProblemas;
	}

	public void setTipoProblemas(List<TipoProblema> tipoProblemas) {
		this.tipoProblemas = tipoProblemas;
	}
	
	

	// ToString
	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", aplicacion=" + aplicacion + ", descripcion=" + descripcion
				+ ", serviciosContratados=" + serviciosContratados + ", tipoProblemas=" + tipoProblemas + "]";
	}

	
	//Metodo que compara si dos objetos son iguales
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Servicio servicio = (Servicio) o;
		return idServicio == servicio.idServicio;
	}
	
	

	//Metodo que devuelve un número entero que representa de manera única el objeto
	@Override
	public int hashCode() {
		return Objects.hash(idServicio);
	}

}
