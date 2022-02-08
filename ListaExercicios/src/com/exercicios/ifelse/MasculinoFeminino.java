package com.exercicios.ifelse;

import java.util.Scanner;

public class MasculinoFeminino {
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Digite a letra correspondente ao sexo: (M | F) ");
			String letra = scan.next();
			if (letra.equalsIgnoreCase("M")) 
				System.out.println("M - MASCULINO" );
			else if (letra.equalsIgnoreCase("F")) 
				System.out.println("F - FEMININO" );
			else 
				System.out.println("SEXO INVÁLIDO" );
	}
}
