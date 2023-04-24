package training.lab2.abstraccion;

public class Adulto extends Persona {
	private int numHijos;
	
	public Adulto(int edad, String nombre, String apellido, int numHijos) {
		super(edad,nombre,apellido);
		this.numHijos = numHijos;
	}
	
	public void imprimirNacionalidad() {
		System.out.println("Esta persona és de " + nacionalidad);
	}
	
	public void imprimirInformacion() {
		System.out.println("Esta persona tiene " + numHijos + " hijos");
	}

}
