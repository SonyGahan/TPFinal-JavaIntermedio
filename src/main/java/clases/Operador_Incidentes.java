package clases;

public class Operador_Incidentes {
	private int id_operador;
	private int id_incidentes;
	
	
	//Constructor
	public Operador_Incidentes(int id_operador, int id_incidentes) {
		super();
		this.id_operador = id_operador;
		this.id_incidentes = id_incidentes;
	}


	
	//Getters and Setters
	public int getId_operador() {
		return id_operador;
	}


	public void setId_operador(int id_operador) {
		this.id_operador = id_operador;
	}


	public int getId_incidentes() {
		return id_incidentes;
	}


	public void setId_incidentes(int id_incidentes) {
		this.id_incidentes = id_incidentes;
	}



	//ToString
	@Override
	public String toString() {
		return "Operador_Incidentes [id_operador=" + id_operador + ", id_incidentes=" + id_incidentes + "]";
	}
	
	
	
}
