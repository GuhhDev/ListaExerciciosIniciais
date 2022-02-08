package com.exercicios.ifelse;

import java.util.Scanner;

public class MaiorEntreTresNumeros {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o PRIMEIRO valor: ");
			int valor1 = scan.nextInt();
			System.out.println("Digite o SEGUNDO valor: ");
			int valor2 = scan.nextInt();
			
			if (valor1 > valor2)
				System.out.println("O maior valor é: " + valor1);
			else
				System.out.println("O maior valor é: " + valor2);
		}
	}
}
