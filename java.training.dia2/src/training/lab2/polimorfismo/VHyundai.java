package training.lab2.polimorfismo;

public class VHyundai extends Vehiculo {
	
	private int carga;

	public VHyundai(String matricula, String marca, String tipo, int carga) {
		super(matricula, marca, tipo);
		this.carga = carga;
		// TODO Auto-generated constructor stub
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public String mostrarDatos() {
		return super.mostrarDatos() + " con una carga de " + carga + ".";
	}
	
	

}
