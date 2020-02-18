package Apuntes;

public class persona {
	private String nombre;
	private int idpersona;
	
	public persona(String p_nombre, int p_id) {
		nombre = p_nombre;
		idpersona = p_id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String p_nombre) {
		nombre = p_nombre;
	}


	public int getIdpersona() {
		return idpersona;
	}


	public void setId(int p_id) {
		idpersona = p_id;
	}


	public void mostrar() {
		System.out.println("\n Datos  de la persona : Id =  "+ this.idpersona + "  Nombre = "  + this.nombre);
	}
	

}
