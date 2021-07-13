
public class UD8_Ej2_App {

	public static void main(String[] args) {
		
		
		Password pasword = new Password(8,"");
		Password paswordF = new Password(8,pasword.GenerarContraseña());
		
		
		System.out.println(paswordF);
	}

}
