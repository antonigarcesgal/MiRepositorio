package training.lab2.abstraccion;

public class Toyota extends Auto {
	private String Vmax;

	public Toyota(String marca, String modelo, String precio, String Vmax) {
		super(marca, modelo,precio);
		this.Vmax = Vmax;
	}

	public void imprimirInformacion() {
		System.out.println("Auto Toyota y la velocidad maxima es: " + Vmax);
	}
	
	public void imprimirNpuertas() {
		System.out.println("Auto Toyota y el número de puertas es: " + nPuertas);
	}
	
	

}
