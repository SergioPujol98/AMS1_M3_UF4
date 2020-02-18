package Pt1_ex1;

public class Persona {
	private String nom;
	private String cognom;
	private String nif;
	
	public Persona(String p_nombre, String p_cognom, String p_nif) {
		nom = p_nombre;
		cognom = p_cognom;
		nif = p_nif;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	

}
