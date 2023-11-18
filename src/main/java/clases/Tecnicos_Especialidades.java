package clases;

public class Tecnicos_Especialidades {
	private int id_tecnicos;
    private int id_especialidades;
    
    
    //Constructor
	public Tecnicos_Especialidades(int id_tecnicos, int id_especialidades) {
		this.id_tecnicos = id_tecnicos;
		this.id_especialidades = id_especialidades;
	}


	
	//Getters and Setters
	public int getId_tecnicos() {
		return id_tecnicos;
	}


	public void setId_tecnicos(int id_tecnicos) {
		this.id_tecnicos = id_tecnicos;
	}


	public int getId_especialidades() {
		return id_especialidades;
	}


	public void setId_especialidades(int id_especialidades) {
		this.id_especialidades = id_especialidades;
	}



	//ToString
	@Override
	public String toString() {
		return "Tecnicos_Especialidades [id_tecnicos=" + id_tecnicos + ", id_especialidades=" + id_especialidades + "]";
	}

	
	
	
	
	
	
    
    
}
