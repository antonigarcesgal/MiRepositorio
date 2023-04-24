package training.lab2.list;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		//Crear lista
		List<String> lista = new ArrayList<>();
		
		//Agregar elementos a la lista
		lista.add("Leccion 1 - Conceptos Generales");
		lista.add("Leccion 2 - Programacion Orientada a Objetos");
		lista.add("Leccion 3 - JEE");
		
		//tamaño lista
		System.out.println("Tamaño de la lista: " + lista.size());
		
		//enseña elementos de lista
		System.out.println("Primer elemento de la lista: " + lista.get(0));
		System.out.println("Segundo elemento de la lista: " + lista.get(1));
		
		//Todos elementos lista
		System.out.println("Elementos de la lista: ");
		
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		lista.remove(2);
		
		System.out.println("Elementos de la lista después de eliminar el tercero:");
		
		for(String elemento : lista) {
			System.out.println(elemento);
		}
	}

}
