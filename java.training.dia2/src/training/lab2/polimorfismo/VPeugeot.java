package training.lab2.polimorfismo;

public class VPeugeot extends Vehiculo {
	
	private int nPuertas;

	public VPeugeot(String matricula, String marca, String tipo, int nPuertas) {
	super(matricula, marca, tipo);
	this.nPuertas = nPuertas;
		// TODO Auto-generated constructor stub
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	@Override
	public String mostrarDatos() {
		return super.mostrarDatos() + " con " + nPuertas + " puertas.";
	}
	
	

}
