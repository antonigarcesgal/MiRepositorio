package training.lab2.herencia;

public class Empleado extends Persona {
	
	private int numEmpleado;
	private int numContrato;

	public Empleado(int numEmpleado, int numContrado) {
		super();
		this.numContrato = numContrado;
		this.numEmpleado = numContrado;
	}
	
	public String getDatosEmpleado() {
		return "El número de empleado es: " + numEmpleado + " Y el numero de contrado es: " + numContrato;
	}

}
