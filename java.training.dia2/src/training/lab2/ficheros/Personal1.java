package training.lab2.ficheros;
import java.io.*;
import java.util.Scanner;

public class Personal1 {
	
	public static void crearArchivo(File ruta, File f, Scanner sc) throws IOException { //Crea el archivo y el directorio
		if (!f.exists()) { // Comprueba si no existe el fichero
			System.out.println("Fichero " + f.getName() + " no existe");
			if (!ruta.exists()) { // Si no existe la ruta
				System.out.println("El directorio " + ruta.getName() + " no existe");
				if (ruta.mkdir()) { // Crea el directorio
					System.out.println("Directorio creado");
					if (f.createNewFile()) { // Creamos fichero
						System.out.println("Fichero " + f.getName() + " creado, por favor pulse enter para continuar");
						sc.nextLine();
						escribir(sc);
					} else {
						System.out.println("No se ha podido crear " + f.getName());
					}
				} else {
					System.out.println("No se ha podido crear " + ruta.getName());
				}
			} else {// la ruta existe
				if (f.createNewFile()) { // Crea el fichero
					System.out.println("Fichero " + f.getName() + " creado, por favor pulse enter para continuar");
					sc.nextLine();
					escribir(sc);
					
				} else {
					System.out.println("No se ha podido crear " + f.getName());
				}
			}
		} else { // El fichero existe
			System.out.println("Fichero " + f.getName() + " existe, por favor pulse enter para continuar");
			System.out.println("Tamaño " + f.length() + " bytes");
			
			sc.nextLine();
			escribir(sc);
		}
	}
	
	public static void escribir(Scanner sc) { //Escribe en el archivo
		try {
			Writer w = new FileWriter("c:/prueba/pruebaCrear.txt");
			String content = "Escribiendo en el archivo!";
			w.write(content);
			w.close();
			
			System.out.println("Escritura completada");
			System.out.println("Por favor pulse enter para continuar");
			sc.nextLine();
			leer(sc);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leer(Scanner sc) throws FileNotFoundException, IOException { //Lee en el archivo
		String cadena;
		FileReader f = new FileReader("c:/prueba/pruebaCrear.txt");
		
		BufferedReader b = new BufferedReader(f);
		System.out.println("El texto en el archivo es el siguiente: ");
		while((cadena = b.readLine())!=null) {
			System.out.println(cadena);
		}
		b.close();
		System.out.println("Por favor pulse enter para continuar");
		sc.nextLine();
		renombrar();
	}
	
	public static void renombrar() throws IOException {//renombra el archivo
		File file1 = new File("c:/prueba/pruebaCrear.txt");
		File file2 = new File("c:/prueba/pruebaRENOMBRADA.txt");

		if(file2.exists()) {
			throw new java.io.IOException("Archivo existe");
		}
		if(file1.renameTo(file2)) {
			System.out.println("Archivo renombrado con exito");
		} else {
			System.out.println("Archivo no renombrado");
		}
	}

	public static void main(String[] args) throws IOException {
		File ruta = new File("c:/prueba");
		
		File f = new File(ruta, "pruebaCrear.txt");
		
		Scanner sc = new Scanner(System.in);
		
		crearArchivo(ruta,f,sc);
		
	}

}
