
public class UD8_Ej3_App {

	public static void main(String[] args) {
		
		
		Electrodomesticos electro = new Electrodomesticos ();
		String dicc [] = electro.Colores();
		electro.setColor(dicc[3]);
		
		System.out.println(electro);
	}

}
