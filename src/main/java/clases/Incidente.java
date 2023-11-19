package clases;

import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
	private int idIncidente;
    private LocalDateTime fechaReporte;
    List<Problema> problemas;
    Cliente cliente;
    
    
    //Constructores
	public Incidente(int idIncidente, LocalDateTime fechaReporte, List<Problema> problemas, Cliente cliente) {
		super();
		this.idIncidente = idIncidente;
		this.fechaReporte = fechaReporte;
		this.problemas = problemas;
		this.cliente = cliente;
	}
    
	public Incidente(LocalDateTime fechaReporte, List<Problema> problemas, Cliente cliente) {
        this.fechaReporte = fechaReporte;
        this.problemas = problemas;
        this.cliente = cliente;
    }

	
	//Getters and Setters
	public int getIdIncidente() {
		return idIncidente;
	}

	public void setIdIncidente(int idIncidente) {
		this.idIncidente = idIncidente;
	}

	public LocalDateTime getFechaReporte() {
		return fechaReporte;
	}

	public void setFechaReporte(LocalDateTime fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public List<Problema> getProblemas() {
		return problemas;
	}

	public void setProblemas(List<Problema> problemas) {
		this.problemas = problemas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Incidente [idIncidente=" + idIncidente + ", fechaReporte=" + fechaReporte + ", problemas=" + problemas
				+ ", cliente=" + cliente + "]";
	}
	
	
	
    
    
    
}
