 
public class Password {
	
	//ATRIVUTOS
	
	//LONGITUD
	private Integer Longitud;
	
	//CONTRASEÑA
	private String Contraseña;

	
	
	public Password() {
		this.Longitud=8;
		this.Contraseña="";
		
	}
	//CONSTRUCTORES
	public Password(Integer longitud, String contraseña) {
		Longitud = longitud;
		Contraseña = contraseña;
	}
	
	public String GenerarContraseña() {
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
	
	
	public String saberContraseña() 
	{
		return this.Contraseña;
		
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
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	@Override
	public String toString() {
		return "Password [Longitud=" + Longitud + ", Contraseña=" + Contraseña + "]";
	}
	
		
}
