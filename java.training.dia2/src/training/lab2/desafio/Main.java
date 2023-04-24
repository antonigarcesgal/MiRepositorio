package training.lab2.desafio;

import java.util.Scanner;

import java.io.*;

public class Main extends Wallet {
	
	
	public static void createWallet() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, indique el nombre de la Wallet");
		
		String name = sc.nextLine();
		File f = new File("c:/wallets/" + name);
		
		if (!f.exists()) { // Si no existe la ruta
			if (f.mkdir()) { // Crea el directorio
				System.out.println("Wallet creada");
			}
			else System.out.println("No se ha podido crear");
		}
		else System.out.println("No se ha podido crear");
	}
	
	public static void addCurrency() throws IOException {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("Por favor, escriba el nombre de su cuenta");
		name = sc.nextLine();
		
		Wallet.addCurrency(name, "Bitcoin", 200);
		
			
	}
	
	public static void removeCurrency() throws IOException {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("Por favor, escriba el nombre de su cuenta");
		name = sc.nextLine();
		
		Wallet.removeCurrency(name, "Bitcoin", 200);
		
	}
	
	public static void getBalance() throws IOException {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("Por favor, escriba el nombre de su cuenta");
		name = sc.nextLine();
		Wallet.getBalance(name, "Bitcoin");
	}
	
	public static void sendCurrency() throws IOException {
		Scanner sc = new Scanner(System.in);
		String sender;
		String receiver;
		
		System.out.println("Por favor, escriba el nombre de su cuenta");
		sender = sc.nextLine();
		
		System.out.println("Por favor, escriba el nombre de la cuenta que reciba el dinero");
		receiver = sc.nextLine();
		
		Wallet.sendCurrency(sender, receiver, "Bitcoin", 200);
		
	}
	
	public static void main(String[] args) throws IOException {
		//createWallet();
		//addCurrency();
		//removeCurrency();
		//getBalance();
		//sendCurrency();
		
	}
}
