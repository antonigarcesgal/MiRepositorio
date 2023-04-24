package training.lab2.objeto;

public class Coche {
	
	String color;
	String velocidadMaxima;
	String fabricante;
	String modelo;
	String precio;
	String carburante;
	
	public Coche() {
		super();
	}
	
	public Coche(String color, String velocidadMaxima, String fabricante, String modelo, String precio, String carburante) {
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.precio = precio;
		this.carburante = carburante;
	}
	
	//Functions
	
	static void parar() {
		System.out.println("Los métodos estaticos se pueden llamar sin crear objetos");
	}
	
	public void arrancar() {
		System.out.println("Los métodos públicos deben llamarde mediante la creación de objetos");
	}
	
	//Get and set

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(String velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getCarburante() {
		return carburante;
	}

	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}

}
