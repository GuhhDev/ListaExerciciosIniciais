package com.exercicios.ifelse;

import java.util.Scanner;

public class MaiorEntreNumeros {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Digite o PRIMEIRO valor: ");
			int valor1 = scan.nextInt();
			System.out.println("Digite o SEGUNDO valor: ");
			int valor2 = scan.nextInt();
			System.out.println("Digite o TERCEIRO valor: ");
			int valor3 = scan.nextInt();

			if (valor1 >= valor2 || valor1 >= valor3)
				System.out.println("O maior valor é: " + valor1);
			else if (valor2 >= valor1 || valor2 >= valor3)
				System.out.println("O maior valor é: " + valor2);
			else if (valor3 >= valor1 || valor3 >= valor2)
				System.out.println("O maior valor é: " + valor3);
	}
}
