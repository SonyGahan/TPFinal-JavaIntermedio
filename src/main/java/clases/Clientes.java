package clases;

public class Clientes {
	private int id_cliente;
	private String cuit;
	private String razonSocial;
	private String email;
	
	
	//Constructor
	public Clientes(int id_cliente, String cuit, String razonSocial, String email) {
		this.id_cliente = id_cliente;
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.email = email;
	}

	
	//Getters and Setters
	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getCuit() {
		return cuit;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "cliente [id_cliente=" + id_cliente + ", cuit=" + cuit + ", razonSocial=" + razonSocial + ", email="
				+ email + "]";
	}
	
	
	
	
	
}
