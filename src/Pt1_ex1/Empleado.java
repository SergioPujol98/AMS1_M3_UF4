package Pt1_ex1;

public class Empleado extends Persona{
	private float sou;
	
	public Empleado(String p_nombre, String p_cognom, String p_nif, float p_sou) {
		super(p_nombre, p_cognom, p_nif);
		sou = p_sou;
	}

	public float getSou() {
		return sou;
	}

	public void setSou(float sou) {
		this.sou = sou;
	}

	

}
