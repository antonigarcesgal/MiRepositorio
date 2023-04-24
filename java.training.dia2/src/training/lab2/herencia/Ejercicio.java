package training.lab2.herencia;

public class Ejercicio {

	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta("Monta�a", true);
		
		bici.setOwner("Manolo");
		bici.setvMax("20Km/h");
		bici.setFabricante("Decathlon");
		
		System.out.println(
				"Bicicleta a nombre de " + bici.getOwner() + 
				", de tipo " + bici.getTipo() +
				" con una velocidad m�xima de " + bici.getvMax() +
				" y con fabricante " + bici.getFabricante() + 
				(bici.getElectrica() ? " es electrica" : " no es electrica")
		);
		
		Coche coche = new Coche("ASD123", "gasoleo");
		
		coche.setOwner("Pedro");
		coche.setvMax("200Km/h");
		coche.setFabricante("Toyota");
		
		System.out.println(
				"Coche a nombre de " + coche.getOwner() + 
				", con la matr�cula " + coche.getMatricula() +
				" con una velocidad m�xima de " + coche.getvMax() +
				" y con fabricante " + coche.getFabricante() +
				" utiliza carburante " + coche.getCarburante()
		);
		

	}

}
