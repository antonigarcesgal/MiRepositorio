package training.lab2.herencia;

public class Coche extends Vehiculo {
	
	private String matricula;
	private String carburante;

	public Coche(String matricula, String carburante) {
		super();
		this.matricula = matricula;
		this.carburante = carburante; 
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCarburante() {
		return carburante;
	}

	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	public String getDatosCoche() {
		return "Matricula: " + this.matricula + ", Carburante: " + this.carburante;
	}
	
	

}
