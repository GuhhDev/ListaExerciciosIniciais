package com.exercicios.ifelse;

import java.util.Scanner;

public class NegativoOuPositivo {
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o valor: ");
			int valor = scan.nextInt();
			
			if (valor >= 0)
				System.out.println("O " + valor + " é positivo! ");
			else
				System.out.println("O " + valor + " é negativo! ");
		}
}
