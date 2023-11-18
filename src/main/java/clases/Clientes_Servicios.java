package clases;

public class Clientes_Servicios {
	private int id_clientes;
	private int id_servicios;
	
	
	//Constructor
	public Clientes_Servicios(int id_clientes, int id_servicios) {
		this.id_clientes = id_clientes;
		this.id_servicios = id_servicios;
	}


	//Getters and Setters
	public int getId_clientes() {
		return id_clientes;
	}


	public void setId_clientes(int id_clientes) {
		this.id_clientes = id_clientes;
	}


	public int getId_servicios() {
		return id_servicios;
	}


	public void setId_servicios(int id_servicios) {
		this.id_servicios = id_servicios;
	}


	//ToString
	@Override
	public String toString() {
		return "Clientes_Servicios [id_clientes=" + id_clientes + ", id_servicios=" + id_servicios + "]";
	}
	
	
	
	
	
}
