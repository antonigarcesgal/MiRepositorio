package training.lab2.encapsulamiento;

public class Persona {
	private double pesoKG;
	private double pesoLB;
	private double alturaMetros;
	private double alturaPies;
	
	public Persona() {
		
	}

	public double getPesoKG() {
		return pesoKG;
	}

	public void setPesoKG(double pesoKG) {
		this.pesoKG = pesoKG;
		this.pesoLB = pesoKG * 2.20462262;
	}

	public double getPesoLB() {
		return pesoLB;
	}

	public void setPesoLB(double pesoLB) {
		this.pesoLB = pesoLB;
		this.pesoKG = pesoLB / 2.20462262;
	}

	public double getAlturaMetros() {
		return alturaMetros;
	}

	public void setAlturaMetros(double alturaMetros) {
		this.alturaMetros = alturaMetros;
		this.alturaPies = alturaMetros * 3.2808399;
	}

	public double getAlturaPies() {
		return alturaPies;
	}

	public void setAlturaPies(double alturaPies) {
		this.alturaPies = alturaPies;
		this.alturaMetros = alturaPies / 3.2808399;
	}
	
	
}
