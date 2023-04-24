package training.lab2.herencia;

public class Bicicleta extends Vehiculo {
	
	private String tipo;
	private Boolean electrica;

	public Bicicleta(String tipo, Boolean electrica) {
		this.tipo = tipo;
		this.electrica = electrica;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getElectrica() {
		return electrica;
	}

	public void setElectrica(Boolean electrica) {
		this.electrica = electrica;
	}
	
	

}
