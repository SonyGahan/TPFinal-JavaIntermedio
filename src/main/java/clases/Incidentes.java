package clases;

import java.time.LocalDate;

public class Incidentes {
	private int id_incidentes;
    private int id_cliente;
    private int id_servicios;
    private int id_especialidades;
    private int id_tecnicos;
    private String tiempo_estimado_resolucion;
    private LocalDate fecha_posible_resolucion;
    private String estado;
    private String consideraciones;
    
    
    //Constructor
	public Incidentes(int id_incidentes, int id_cliente, int id_servicios, int id_especialidades, int id_tecnicos,
			String tiempo_estimado_resolucion, LocalDate fecha_posible_resolucion, String estado,
			String consideraciones) {
		this.id_incidentes = id_incidentes;
		this.id_cliente = id_cliente;
		this.id_servicios = id_servicios;
		this.id_especialidades = id_especialidades;
		this.id_tecnicos = id_tecnicos;
		this.tiempo_estimado_resolucion = tiempo_estimado_resolucion;
		this.fecha_posible_resolucion = fecha_posible_resolucion;
		this.estado = estado;
		this.consideraciones = consideraciones;
	}


	//Getters and Setters
	public int getId_incidentes() {
		return id_incidentes;
	}


	public void setId_incidentes(int id_incidentes) {
		this.id_incidentes = id_incidentes;
	}


	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	public int getId_servicios() {
		return id_servicios;
	}


	public void setId_servicios(int id_servicios) {
		this.id_servicios = id_servicios;
	}


	public int getId_especialidades() {
		return id_especialidades;
	}


	public void setId_especialidades(int id_especialidades) {
		this.id_especialidades = id_especialidades;
	}


	public int getId_tecnicos() {
		return id_tecnicos;
	}


	public void setId_tecnicos(int id_tecnicos) {
		this.id_tecnicos = id_tecnicos;
	}


	public String getTiempo_estimado_resolucion() {
		return tiempo_estimado_resolucion;
	}


	public void setTiempo_estimado_resolucion(String tiempo_estimado_resolucion) {
		this.tiempo_estimado_resolucion = tiempo_estimado_resolucion;
	}


	public LocalDate getFecha_posible_resolucion() {
		return fecha_posible_resolucion;
	}


	public void setFecha_posible_resolucion(LocalDate fecha_posible_resolucion) {
		this.fecha_posible_resolucion = fecha_posible_resolucion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getConsideraciones() {
		return consideraciones;
	}


	public void setConsideraciones(String consideraciones) {
		this.consideraciones = consideraciones;
	}


	
	//ToString
	@Override
	public String toString() {
		return "Incidentes [id_incidentes=" + id_incidentes + ", id_cliente=" + id_cliente + ", id_servicios="
				+ id_servicios + ", id_especialidades=" + id_especialidades + ", id_tecnicos=" + id_tecnicos
				+ ", tiempo_estimado_resolucion=" + tiempo_estimado_resolucion + ", fecha_posible_resolucion="
				+ fecha_posible_resolucion + ", estado=" + estado + ", consideraciones=" + consideraciones + "]";
	}
    
	
	
    
    
}
