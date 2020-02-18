package Apuntes;


public class principal {
	public static void main(String[] args) {
		System.out.println("Creamos dos objetos  de la clase persona");
		persona p1 = new persona("Pepe",1);
		persona p2 = new persona(null, 0);
		p2.setId(2);
		p2.setNombre("juan");
		System.out.println("\nUsamos el metodo mostrar para mostrar por pantalla los datos");
		p1.mostrar();
		p2.mostrar();
		estudiante est1 = new estudiante (0, 0, null);
		est1.setId(3);
		est1.setNombre("David");
		est1.setMedia((float)8.3);
		est1.mostrar();
		
		estudiante est2 = new estudiante ((float)7.6 , 4, "Carlos");
		est2.mostrar();
	}
	
}
