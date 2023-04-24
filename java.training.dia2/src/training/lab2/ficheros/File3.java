package training.lab2.ficheros;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File3 {

	public static void main(String[] args) {
		String file_name = "c:/ficheros/out.txt";
		
		Path path = Paths.get(file_name);
		
		try {
			if(Files.deleteIfExists(path)) System.out.println("Archivo Eliminado!");
			else System.out.println("No se ha podido eliminar el archivo.");
			
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
