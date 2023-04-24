package training.lab2.abstraccion;

public class PAutos {

	public static void main(String[] args) {
		Toyota t = new Toyota("Toyota Supra", "Mk4", "140.000€", "200Km/h");
		t.imprimirDatos();
		t.imprimirInformacion();
		t.imprimirNpuertas();
		
		
		Kia k = new Kia("Kia Picanto", "1.2 DPI GT LINE", "17.610€", "GRIS");
		k.imprimirDatos();
		k.imprimirInformacion();
		k.imprimirNpuertas();

	}

}
