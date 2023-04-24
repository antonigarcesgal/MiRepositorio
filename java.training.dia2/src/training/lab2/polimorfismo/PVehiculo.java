package training.lab2.polimorfismo;

public class PVehiculo {

	public static void main(String[] args) {
		Vehiculo nVehiculos[] = new Vehiculo[4];
		
		nVehiculos[0] = new Vehiculo("GJT-456", "Yamaha Motocicleta", "Deportivo");
		nVehiculos[1] = new VPeugeot("GT56","Rifter 1.5","Turismo", 4);
		nVehiculos[2] = new VMaserati("AT111","Maserati 250F","Deportivo", 2500);
		nVehiculos[3] = new VHyundai("AT111","Hyundai H1 Travel","Furgoneta", 500);
		
		for(Vehiculo vehiculos: nVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}

	}

}
