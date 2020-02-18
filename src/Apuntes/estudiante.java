package Apuntes;

public class estudiante extends persona {
	private float media;

	
	
	public estudiante (float p_media, int p_id, String p_nombre) {
		super(p_nombre,p_id);
		media = p_media;
	}
	public void setMedia(float p_media) {
		media = p_media;
	}
	public float getMedia() {
		return media;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("\n Tiene media : " + media);
	}

}
