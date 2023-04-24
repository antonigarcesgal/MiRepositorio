package training.lab2.encapsulamiento;

public class PersonaMedida {

	public static void main(String[] args) {
		Persona persona = new Persona();
		
		persona.setAlturaMetros(1.75);
		persona.setPesoKG(80);
		
		System.out.println(
				"Peso en KG = " + persona.getPesoKG() +
				"\n Peso en LB = " + persona.getPesoLB() +
				"\n Altura en Metros = " + persona.getAlturaMetros() + 
				"\n Altura en Pies = " + persona.getAlturaPies()
				);

	}

}
