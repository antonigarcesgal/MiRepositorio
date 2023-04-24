package training.lab2.abstraccion;

public class Niño extends Persona {
	private int numJugetes;
		
		public Niño(int edad, String nombre, String apellido, int numJugetes) {
			super(edad,nombre,apellido);
			this.numJugetes = numJugetes;
		}
		
		public void imprimirNacionalidad() {
			System.out.println("Este ni�o �s de " + nacionalidad);
		}
		
		public void imprimirInformacion() {
			System.out.println("Este ni�o tiene " + numJugetes + " jugetes");
		}


}
