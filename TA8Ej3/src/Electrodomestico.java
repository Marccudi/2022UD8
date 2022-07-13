
public class Electrodomestico {

	double precioBase;
	String color;
	char consumoEnergetico;
	double peso;
	
	
	final double precioBaseDef=100;
	final String colorDef="blanco";
	final char consumoDef='F';
	final double pesoDef=5;
	
	final String arrayColores[]= {"blanco", "negro", "rojo", "azul", "gris"};
	final char arrayConsumo[]= {'A', 'B', 'C', 'D', 'E', 'F'};
	
	public Electrodomestico() {
		this.precioBase = precioBaseDef;
		this.color = colorDef;
		this.consumoEnergetico = consumoDef;
		this.peso = pesoDef;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.color = colorDef;
		this.consumoEnergetico = consumoDef;
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	
	
	
	
}
