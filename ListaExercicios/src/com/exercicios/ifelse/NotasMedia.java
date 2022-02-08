package com.exercicios.ifelse;

import java.util.Scanner;

public class NotasMedia {
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite a primeira nota: ");
			Double valor = scan.nextDouble();
			
			System.out.println("Digite a primeira nota: ");
			Double valor2 = scan.nextDouble();
			
			Double media = (valor + valor2) / 2;
			
			if (media == 10)
				System.out.println("Aprovado com distinção! Sua média é: " + media);
			else if (media >= 7)
				System.out.println("Aprovado! Sua média é: " + media);
			else
				System.out.println("Reprovado! Sua média é: " + media);
		}
}
