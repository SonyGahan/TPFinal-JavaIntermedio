package clases;

public class Tecnicos {
	private  int id_tecnicos;
    private  String dni;
    private  String nombre;
    private  String apellido;
    private  String celular;
    private  String medio_de_notificacion;
    
    
    //Constructor
	public Tecnicos(int id_tecnicos, String dni, String nombre, String apellido, String celular,
			String medio_de_notificacion) {
		this.id_tecnicos = id_tecnicos;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.medio_de_notificacion = medio_de_notificacion;
	}


	
	//Getters and Setters
	public int getId_tecnicos() {
		return id_tecnicos;
	}


	public void setId_tecnicos(int id_tecnicos) {
		this.id_tecnicos = id_tecnicos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getMedio_de_notificacion() {
		return medio_de_notificacion;
	}


	public void setMedio_de_notificacion(String medio_de_notificacion) {
		this.medio_de_notificacion = medio_de_notificacion;
	}



	//ToString
	@Override
	public String toString() {
		return "Tecnicos [id_tecnicos=" + id_tecnicos + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", celular=" + celular + ", medio_de_notificacion=" + medio_de_notificacion + "]";
	}
    
}
