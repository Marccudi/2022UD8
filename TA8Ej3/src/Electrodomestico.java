
public class Electrodomestico {
	
	final String arrayColores[]= {"blanco", "negro", "rojo", "azul", "gris"};
	final char arrayConsumo[]= {'A', 'B', 'C', 'D', 'E', 'F'};
	
	final double precioBaseDef=100;
	final String colorDef=arrayColores[0];
	final char consumoDef=arrayConsumo[5];
	final double pesoDef=5;
	

	double precioBase=precioBaseDef;
	String color=colorDef;
	char consumoEnergetico = consumoDef;
	double peso = pesoDef;
	
	
	
	
	public Electrodomestico() {
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public String[] getArrayColores() {
		return arrayColores;
	}

	public char[] getArrayConsumo() {
		return arrayConsumo;
	}

	public double getPrecioBaseDef() {
		return precioBaseDef;
	}

	public String getColorDef() {
		return colorDef;
	}

	public char getConsumoDef() {
		return consumoDef;
	}

	public double getPesoDef() {
		return pesoDef;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
}
