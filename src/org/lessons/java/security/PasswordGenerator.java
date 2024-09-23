package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		String nome;
		String cognome;
		String colore; 
		int giorno;
		int mese;
		int anno;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto nel creatore di password");
		
		System.out.println("Inserisci i tuoi dati per generare la tua password");
		
		System.out.println("BInserisci il tuo nome");
		
		nome = scan.next();
		
		System.out.println("Inserisci il tuo cognome");
		
		cognome = scan.next();
		
		System.out.println("Inserisci il tuo colore");
		
		colore = scan.next();
		
		System.out.println("Inserisci il tuo giorno di nascita");
		
		giorno = scan.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita");
		
		mese = scan.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita");
		
		anno = scan.nextInt();
		
		int somma = giorno + mese + anno;
		
		String password = nome + "-" + cognome + "-" + colore + "-" + somma;
		
		System.out.println("Password generata: " + password);
		
		scan.close();
	}
}
