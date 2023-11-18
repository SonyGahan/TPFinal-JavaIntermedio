package clases;

public class Operador {
	private int id_operador;
	private String nombre;
	
	
	//Constructor
	public Operador(int id_operador, String nombre) {
		super();
		this.id_operador = id_operador;
		this.nombre = nombre;
	}


	//Getters and Setters
	public int getId_operador() {
		return id_operador;
	}


	public void setId_operador(int id_operador) {
		this.id_operador = id_operador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	//ToString
	@Override
	public String toString() {
		return "Operador [id_operador=" + id_operador + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
	
}
