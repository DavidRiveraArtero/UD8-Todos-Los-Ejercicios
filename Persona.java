
public class Persona {
	// ATRIBUTOS
	public Persona(String nombre, Integer edad, String dNI, String sexo, Integer peso, double altura) {
		super();
		Nombre = nombre;
		Edad = edad;
		DNI = dNI;
		Sexo = sexo;
		Peso = peso;
		Altura = (int) altura;
	}

	// NOMBRE
	private String Nombre;

	// EDAD
	private Integer Edad;

	// DNI
	private String DNI;

	// SEXO
	private String Sexo;

	// PESO
	private Integer Peso;

	// ALTURA
	private Integer Altura;

	public Persona() {
		this.Nombre = "";
		this.Edad = 0;
		this.DNI = "";
		this.Sexo = "Hombre";
		this.Peso = 0;
		this.Altura = 0;

	}

	public String saberNombre() {
		return this.Nombre;

	}

}
