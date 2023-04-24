package training.lab2.encapsulamiento;

public class Termo {

	public static void main(String[] args) {
		Termometro termo = new Termometro();
		termo.setCelcius(92);
		
		System.out.println("Fahrenheit: " + termo.getFahrenheit());
		System.out.println("Celcius: " + termo.getCelcius());
		System.out.println("Kelvin: " + termo.getKelvin());
	}

}
