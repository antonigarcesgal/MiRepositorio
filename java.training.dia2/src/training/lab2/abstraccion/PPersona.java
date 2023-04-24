package training.lab2.abstraccion;

public class PPersona {

	public static void main(String[] args) {
		Adulto adulto = new Adulto(40,"Pedro","Garc�a",2);
		adulto.imprimirDatos();
		adulto.imprimirInformacion();
		adulto.imprimirNacionalidad();
		
		Niño niño = new Niño(8,"Juanito","Rubio",9);
		niño.imprimirDatos();
		niño.imprimirInformacion();
		niño.imprimirNacionalidad();
	}

}
