package clases;

import java.time.LocalDateTime;


public class Problema {
	private int idProblema;
    private Incidente incidente;
    private TipoProblema tipoProblema;
    private boolean resuelto;
    private LocalDateTime fechaResolucion;
    private String Observaciones;
    private Tecnico tecnicoAsignado;
    
    
    //Constructor
	public Problema(int idProblema, Incidente incidente, TipoProblema tipoProblema, boolean resuelto,
			LocalDateTime fechaResolucion, String observaciones, Tecnico tecnicoAsignado) {
		this.idProblema = idProblema;
		this.incidente = incidente;
		this.tipoProblema = tipoProblema;
		this.resuelto = resuelto;
		this.fechaResolucion = fechaResolucion;
		Observaciones = observaciones;
		this.tecnicoAsignado = tecnicoAsignado;
	}


	
	//Getters and Setters
	public int getIdProblema() {
		return idProblema;
	}


	public void setIdProblema(int idProblema) {
		this.idProblema = idProblema;
	}


	public Incidente getIncidente() {
		return incidente;
	}


	public void setIncidente(Incidente incidente) {
		this.incidente = incidente;
	}


	public TipoProblema getTipoProblema() {
		return tipoProblema;
	}


	public void setTipoProblema(TipoProblema tipoProblema) {
		this.tipoProblema = tipoProblema;
	}


	public boolean isResuelto() {
		return resuelto;
	}


	public void setResuelto(boolean resuelto) {
		this.resuelto = resuelto;
	}


	public LocalDateTime getFechaResolucion() {
		return fechaResolucion;
	}


	public void setFechaResolucion(LocalDateTime fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}


	public String getObservaciones() {
		return Observaciones;
	}


	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}


	public Tecnico getTecnicoAsignado() {
		return tecnicoAsignado;
	}


	public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
		this.tecnicoAsignado = tecnicoAsignado;
	}



	//ToString
	@Override
	public String toString() {
		return "Problema [idProblema=" + idProblema + ", incidente=" + incidente + ", tipoProblema=" + tipoProblema
				+ ", resuelto=" + resuelto + ", fechaResolucion=" + fechaResolucion + ", Observaciones=" + Observaciones
				+ ", tecnicoAsignado=" + tecnicoAsignado + "]";
	}
	
	
	
    
    
    
}
