package com.exercicios.ifelse;

import java.util.Scanner;

public class ConsoanteOuVogal {
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite uma letra: ");
			String letra = scan.next();
			
//			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
//				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
//				letra.equalsIgnoreCase("u"))
//				System.out.println("A letra " + letra + " é vogal! ");
//			else
//				System.out.println("A letra " + letra + " é consoante! ");
//		}
			if (letra.length() > 1) 
				System.out.println("Não é uma letra válida!");
			else 
				
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("A letra " + letra + " é uma vogal!"); break;
			default: System.out.println("A letra " + letra + " é uma consoante!");
		}
	}
}
