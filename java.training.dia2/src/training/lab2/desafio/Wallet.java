package training.lab2.desafio;

import java.io.*;

public class Wallet {
	public static void addCurrency(String idWallet,String currency, double amount) throws IOException {
		
		File f = new File("c:/wallets/" + idWallet);
		File w = new File("c:/wallets/" + idWallet, currency + ".txt");
		if (f.exists()) {
			if(w.createNewFile()) {
				
				Writer fW = new FileWriter("c:/wallets/" + idWallet + "/" + currency + ".txt");
				String content = String.valueOf(amount);
				fW.write(content);
				fW.close();
			}
			else {
				String cadena;
				double balance = 0;
				FileReader fR = new FileReader("c:/wallets/" + idWallet + "/" + currency + ".txt");
				
				BufferedReader b = new BufferedReader(fR);
				while((cadena = b.readLine())!=null) {
					balance = Double.parseDouble(cadena);
				}
				b.close();
				balance += amount; 
				Writer fW = new FileWriter("c:/wallets/" + idWallet + "/" + currency + ".txt");
				String content = String.valueOf(balance);
				fW.write(content);
				fW.close();
			}
		}
		else {
			System.out.println("No se ha encontrado la Wallet");
		}

	}

	public static void removeCurrency(String idWallet, String currency, double amount) throws IOException {

		File f = new File("c:/wallets/" + idWallet);
		File w = new File("c:/wallets/" + idWallet, currency + ".txt");
		if (f.exists()) {
			if(w.createNewFile()) {
				
				Writer fW = new FileWriter("c:/wallets/" + idWallet + "/" + currency + ".txt");
				String content = String.valueOf(amount);
				fW.write(content);
				fW.close();
			}
			else {
				String cadena;
				double balance = 0;
				FileReader fR = new FileReader("c:/wallets/" + idWallet + "/" + currency + ".txt");
				
				BufferedReader b = new BufferedReader(fR);
				while((cadena = b.readLine())!=null) {
					balance = Double.parseDouble(cadena);
				}
				b.close();
				balance -= amount; 
				Writer fW = new FileWriter("c:/wallets/" + idWallet + "/" + currency + ".txt");
				String content = String.valueOf(balance);
				fW.write(content);
				fW.close();
			}
		}
		else {
			System.out.println("No se ha encontrado la Wallet");
		}

	}

	public static String getBalance(String idWallet, String currency) throws IOException {
		String cadena;
		FileReader fR = new FileReader("c:/wallets/" + idWallet + "/" + currency + ".txt");
		
		BufferedReader b = new BufferedReader(fR);
		System.out.println("El balance actual es el siguiente: ");
		while((cadena = b.readLine())!=null) {
			System.out.println(cadena);
		}
		b.close();
		return "";
	}

	public static void sendCurrency(String idWalletSend, String idWalletReceive,String currency, double amount) throws IOException {
		addCurrency(idWalletReceive, currency, amount);
		removeCurrency(idWalletSend, currency, amount);
	}
}
