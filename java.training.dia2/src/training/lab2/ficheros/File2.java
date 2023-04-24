package training.lab2.ficheros;
import java.io.*;;

public class File2 {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("C:\\ficheros\\output.txt");
			String content = "Like Java, Spring, Hibernate, ansdosfagd";
			w.write(content);
			w.close();
			System.out.println("Hecho!");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
