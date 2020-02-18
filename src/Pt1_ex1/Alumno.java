package Pt1_ex1;

public class Alumno extends Persona{
	private String nom_cicle;
	private int curs;

	public Alumno(String p_nombre, String p_cognom, String p_nif, String p_nomCicle, int p_curs) {
		super(p_nombre, p_cognom, p_nif);
		nom_cicle = p_nomCicle;
		curs = p_curs;
	}

	public String getNom_cicle() {
		return nom_cicle;
	}

	public void setNom_cicle(String nom_cicle) {
		this.nom_cicle = nom_cicle;
	}

	public int getCurs() {
		return curs;
	}

	public void setCurs(int curs) {
		this.curs = curs;
	}
	
	public void cambiar_curso (int curso) {
		this.curs = curso;
	}
	
	public void cambiar_ciclo (String ciclo){
		this.nom_cicle = ciclo;
	}
}
