package training.lab2.list;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	//TEST COMMITS
	
	public static void main(String[] args) {

		//Crear lista
		List<String> lista = new ArrayList<>();
		
		//Agregar elementos a la lista
		lista.add("Leccion 1 - Conceptos Generales");
		lista.add("Leccion 2 - Programacion Orientada a Objetos");
		lista.add("Leccion 3 - JEE");
		
		//tama�o lista
		System.out.println("Tama�o de la lista: " + lista.size());
		
		//ense�a elementos de lista
		System.out.println("Primer elemento de la lista: " + lista.get(0));
		System.out.println("Segundo elemento de la lista: " + lista.get(1));
		
		//Todos elementos lista
		System.out.println("Elementos de la lista: ");
		
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		lista.remove(2);
		
		System.out.println("Elementos de la lista despu�s de eliminar el tercero:");
		
		for(String elemento : lista) {
			System.out.println(elemento);
		}
	}

}
