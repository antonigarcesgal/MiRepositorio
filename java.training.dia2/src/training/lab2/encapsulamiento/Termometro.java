package training.lab2.encapsulamiento;

public class Termometro {
	
	private double celcius;
	private double fahrenheit;
	private double kelvin;

	public Termometro() {
		// TODO Auto-generated constructor stub
	}

	public double getCelcius() {
		return celcius;
	}

	public void setCelcius(double celcius) {
		this.celcius = celcius;
		this.fahrenheit = (celcius * 1.8) + 32;
		this.kelvin = celcius + 273.15;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
		this.celcius = fahrenheit;
		this.kelvin = fahrenheit;
	}

	public double getKelvin() {
		return kelvin;
	}

	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
		this.celcius = kelvin - 273.15;
		this.fahrenheit = (kelvin - 273.15) * 1.8 + 32;
	}
	
	

}
