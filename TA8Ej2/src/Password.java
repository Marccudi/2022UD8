import java.util.Random;

public class Password {

	int longitud=8;
	String pass;
	
	public Password() {
		crearPass(longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		crearPass(longitud);
	}

	public int getLongitud() {
		return longitud;
	}

	public String getPass() {
		return pass;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void crearPass(int longituda){
	
	int limiteIzq=97;//Letra a
	int limiteDer=122;//Letra z
    Random random = new Random();
    String generatedString = random.ints(limiteIzq, limiteDer + 1)
    	      .limit(longituda)
    	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
    	      .toString();
    this.pass = generatedString;
	}
}
