package training.lab2.ficheros;

import java.io.*;

public class File1 {

	public static void main(String[] args) throws IOException {
		File ruta = new File("c:/ficheros");

		File f = new File(ruta, "datos.txt");

		System.out.println((f.getAbsolutePath()));
		System.out.println(f.getParent());
		System.out.println(ruta.getAbsolutePath());
		System.out.println(ruta.getParent());

		if (!f.exists()) { // Comprueba si no existe el fichero
			System.out.println("Fichero " + f.getName() + " no existe");
			if (!ruta.exists()) { // Si no existe la ruta
				System.out.println("El directorio " + ruta.getName() + " no existe");
				if (ruta.mkdir()) { // Crea el directorio
					System.out.println("Directorio creado");
					if (f.createNewFile()) { // Creamos fichero
						System.out.println("Fichero " + f.getName() + " creado");
					} else {
						System.out.println("No se ha podido crear " + f.getName());
					}
				} else {
					System.out.println("No se ha podido crear " + ruta.getName());
				}
			} else {// la ruta existe
				if (f.createNewFile()) { // Crea el fichero
					System.out.println("Fichero " + f.getName() + " creado");
				} else {
					System.out.println("No se ha podido crear " + f.getName());
				}
			}
		} else { // El fichero existe
			System.out.println("Fichero " + f.getName() + " existe");
			System.out.println("Tamaño " + f.length() + " bytes");
		}

	}

}
