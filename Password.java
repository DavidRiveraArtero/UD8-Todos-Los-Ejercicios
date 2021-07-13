 
public class Password {
	
	//ATRIVUTOS
	
	//LONGITUD
	private Integer Longitud;
	
	//CONTRASE�A
	private String Contrase�a;

	
	
	public Password() {
		this.Longitud=8;
		this.Contrase�a="";
		
	}
	//CONSTRUCTORES
	public Password(Integer longitud, String contrase�a) {
		Longitud = longitud;
		Contrase�a = contrase�a;
	}
	
	public String GenerarContrase�a() {
		int cont = 0;
		int num1 = 1;
		int num2 = 9;
		String contra = "";
		while (cont < getLongitud()) {
			int random = (int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
			contra = contra+ " " +  random; 
			cont++;
		} 
		return contra;
	}
	
	
	public String saberContrase�a() 
	{
		return this.Contrase�a;
		
	}
	
	public Integer LongitudT() {
		
		return this.Longitud;
	}
	public Integer getLongitud() {
		return Longitud;
	}
	public void setLongitud(Integer longitud) {
		Longitud = longitud;
	}
	public String getContrase�a() {
		return Contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}
	@Override
	public String toString() {
		return "Password [Longitud=" + Longitud + ", Contrase�a=" + Contrase�a + "]";
	}
	
		
}
