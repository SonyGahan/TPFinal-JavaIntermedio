package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
	private int idCliente;
    private String razonSocial;
    private String cuit;
    private String mail;
    private List<Servicio> serviciosContratados; //la lista viene de la tabla Servicios_contratados en BD
    
    
    
    //Constructores
	public Cliente(int idCliente, String razonSocial, String cuit, String mail, List<Servicio> serviciosContratados) {
		this.idCliente = idCliente;
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.mail = mail;
		this.serviciosContratados = serviciosContratados;
	}
	
	
	public Cliente(String razonSocial, String cuit, String mail, List<Servicio> serviciosContratados) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.mail = mail;
        this.serviciosContratados = serviciosContratados;
    }

    public Cliente(String razonSocial, String cuit, String mail) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.mail = mail;
        serviciosContratados = new ArrayList<>();
    }


	
	//Getters and Setters
	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getCuit() {
		return cuit;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public List<Servicio> getServiciosContratados() {
		return serviciosContratados;
	}


	public void setServiciosContratados(List<Servicio> serviciosContratados) {
		this.serviciosContratados = serviciosContratados;
	}



	//ToString
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", razonSocial=" + razonSocial + ", cuit=" + cuit + ", mail=" + mail
				+ ", serviciosContratados=" + serviciosContratados + "]";
	}
	
	
	//Metodo que compara si dos objetos son iguales
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente == cliente.idCliente;
    }

	
	//Metodo que devuelve un número entero que representa de manera única el objeto
    @Override
    public int hashCode() {
        return Objects.hash(idCliente);
    }
	
	
	
}
