
public class Electrodomesticos {
	// ATRIVUTOS

	// PRECIO
	private Integer Precio;

	// COLOR
	String Color;

	// ConsumoEnergetico
	private String Consumo;

	// PESO
	private Integer Peso;

	public Electrodomesticos() {
		this.Precio = 100;
		this.Peso = 5;
		this.Color = "Blanco";
		this.Consumo = "F";

	}

	public Electrodomesticos(Integer precio, String color, String consumo, Integer peso) {
		super();
		Precio = precio;
		Color = color;
		Consumo = consumo;
		Peso = peso;
	}

	public String[] Colores() {
		String colores [] = {"Blanco","Negro","Rojo","Azul","Gris","blanco","negro","rojo","azul","gris"};
		return colores;

	}

	public Integer getPrecio() {
		return Precio;
	}

	public void setPrecio(Integer precio) {
		Precio = precio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getConsumo() {
		return Consumo;
	}

	public void setConsumo(String consumo) {
		Consumo = consumo;
	}

	public Integer getPeso() {
		return Peso;
	}

	public void setPeso(Integer peso) {
		Peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [Precio=" + Precio + ", Color=" + Color + ", Consumo=" + Consumo + ", Peso=" + Peso
				+ "]";
	}

}
