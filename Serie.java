
public class Serie {
	
	//ATRIVUTOS 
	private String Titulo;
	
	private Integer Temporadas;
	
	private Boolean Entregado;
	
	private String Genero;
	
	private String Creador;
	
	public Serie() {
		this.Titulo="";
		this.Temporadas=3;
		this.Entregado=false;
		this.Genero="";
		this.Creador="";
		
	}

	//CONSTRUCTORES
	public Serie(String titulo, Integer temporadas, Boolean entregado, String genero, String creador) {
		Titulo = titulo;
		Temporadas = temporadas;
		Entregado = entregado;
		Genero = genero;
		Creador = creador;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Integer getTemporadas() {
		return Temporadas;
	}

	public void setTemporadas(Integer temporadas) {
		Temporadas = temporadas;
	}

	public Boolean getEntregado() {
		return Entregado;
	}

	public void setEntregado(Boolean entregado) {
		Entregado = entregado;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getCreador() {
		return Creador;
	}

	public void setCreador(String creador) {
		Creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [Titulo=" + Titulo + ", Temporadas=" + Temporadas + ", Entregado=" + Entregado + ", Genero="
				+ Genero + ", Creador=" + Creador + "]";
	}
	
	

}
