
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
	
	
	
	
	
}
