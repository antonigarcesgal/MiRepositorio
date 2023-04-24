package training.lab2.abstraccion;

public class Kia extends Auto {
	
	private String color;

	public Kia(String marca, String modelo, String precio, String color) {
		super(marca, modelo,precio);
		this.color = color;
	}

	public void imprimirInformacion() {
		System.out.println("Auto KIA y el color es: " + color);
	}
	
	public void imprimirNpuertas() {
		System.out.println("Auto KIA y el número de puertas es: " + nPuertas);
	}
}
