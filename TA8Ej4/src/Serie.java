
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
	
	
	
	
}
