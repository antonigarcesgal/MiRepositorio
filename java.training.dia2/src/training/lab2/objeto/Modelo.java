package training.lab2.objeto;

public class Modelo {

	public static void main(String[] args) {
		//Sin parametros
		
		Coche rio = new Coche();
		
		rio.color = "rojo";
		rio.velocidadMaxima = "200Km/h";
		rio.fabricante = "Kia";
		rio.modelo = "Rio";
		rio.precio = "120.000€";
		rio.carburante = "gasolina";
		
		rio.arrancar();
		
		System.out.println("El color del coche modelo rio es " + rio.color);
		
		//Con parametros
		
		Coche supra = new Coche("gris","200Km/h","Toyota","Supra","120.000€","gasolina");
		
		supra.arrancar();
		
		System.out.println("El color del coche modelo supra es " + supra.color);
	}

}
