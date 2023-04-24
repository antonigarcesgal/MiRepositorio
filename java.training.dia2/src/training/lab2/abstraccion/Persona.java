package training.lab2.abstraccion;

public abstract class Persona implements IPersona{
	protected int edad;
	protected String nombre, apellido;
	
	public Persona(int edad, String nombre, String apellido) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void imprimirDatos() {
		System.out.println("Persona con nombre " + nombre + " " + apellido + " con " + edad + " años");
	}
	
	public abstract void imprimirNacionalidad();

}
