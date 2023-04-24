package training.lab2.herencia;

public class Empleados {

	public static void main(String[] args) {
		
		//Empleado 1

		Empleado empleado1 = new Empleado(1001, 1892756264);
		empleado1.setNombre("Juan");
		empleado1.setApellido("Arvello");
		empleado1.setEmail("juan@email.es");
		empleado1.setEdad(21);
		empleado1.setTelefono("123-4567890");
		
		String name1 = empleado1.getNombre();
		String apellido1 = empleado1.getApellido();
		String email1 = empleado1.getEmail();
		int edad1 = empleado1.getEdad();
		String telefono1 = empleado1.getTelefono();
		
		System.out.println
		(
				"Datos del empleado 1: \n Nombre: " + name1 + 
					"\n Apellido: " + apellido1 + 
					"\n Email: " + email1 +
					"\n Edad: " + edad1 + 
					"\n Telefono: " + telefono1
		);
		
		//Empleado 2
		
		Empleado empleado2 = new Empleado(1001, 1892756264);
		empleado2.setNombre("Pedro");
		empleado2.setApellido("Arvello");
		empleado2.setEmail("pedro@email.es");
		empleado2.setEdad(56);
		empleado2.setTelefono("123-13478120");
		
		
		System.out.println
		(
				"Datos del empleado 1: \n Nombre: " + empleado2.getNombre() + 
					"\n Apellido: " + empleado2.getApellido() + 
					"\n Email: " + empleado2.getEmail() +
					"\n Edad: " + empleado2.getEdad() + 
					"\n Telefono: " + empleado2.getTelefono()
		);
		
		System.out.println(empleado2.getDatosEmpleado());
		

	}

}
