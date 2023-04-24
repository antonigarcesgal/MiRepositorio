package training.lab2.ficheros;

import java.io.*;;

public class File4 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/ficheros/output.txt");
		File file2 = new File("c:/ficheros/out.txt");

		if(file2.exists()) {
			throw new java.io.IOException("Archivo existe");
		}
		if(file1.renameTo(file2)) {
			System.out.println("Archivo renombrado con exito");
		} else {
			System.out.println("Archivo no renombrado");
		}
	}

}
