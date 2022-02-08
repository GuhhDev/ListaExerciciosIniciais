package com.exercicios.arrays;

import java.util.Scanner;

public class SomaTodosNumerosVetorA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] VetorA = new int[10];

		for (int i = 0; i < VetorA.length; i++) {
			System.out.println("Entre com os números do vetor A na posição: " + i);
			VetorA[i] = scan.nextInt();
		}

		int soma = 0;
		for (int i = 0; i < VetorA.length; i++) {
			soma += VetorA[i];
		}

		System.out.println("Valor da soma é: " + soma);
	}
}