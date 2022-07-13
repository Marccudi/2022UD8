
public class Serie {

	String titulo="";
	int numTemp=3;
	boolean entregado=false;
	String genero="";
	String creador="";

	public Serie() {
	}

	public Serie(String titulo, int numTemp, String genero, String creador) {
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.genero = genero;
		this.creador = creador;
	}
		
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumTemp() {
		return numTemp;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	
	
}
