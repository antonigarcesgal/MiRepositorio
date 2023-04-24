package training.lab2.polimorfismo;

public class VMaserati extends Vehiculo{
	
	private int cilindrado;

	public VMaserati(String matricula, String marca, String tipo, int cilindrado) {
		super(matricula, marca, tipo);
		this.cilindrado = cilindrado;
		// TODO Auto-generated constructor stub
	}

	public int getCilindrado() {
		return cilindrado;
	}

	public void setCilindrado(int cilindrado) {
		this.cilindrado = cilindrado;
	}
	
	@Override
	public String mostrarDatos() {
		return super.mostrarDatos() + " con un cilindrado de " + cilindrado + ".";
	}

}
