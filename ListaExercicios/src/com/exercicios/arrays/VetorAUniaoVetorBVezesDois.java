package com.exercicios.arrays;

import java.util.Scanner;

public class VetorAUniaoVetorBVezesDois {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] VetorA = new int[8];
		int[] VetorB = new int[VetorA.length];

		for (int i = 0; i < VetorA.length; i++) {
			System.out.println("Entre com os n�meros do vetor A na posi��o: " + i);
			VetorA[i] = scan.nextInt();

			VetorB[i] = VetorA[i] * 2;
		}

		System.out.print("Vetor A igual a = ");
		for (int i = 0; i < VetorA.length; i++) {
			System.out.print(VetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B igual a = ");
		for (int i = 0; i < VetorB.length; i++) {
			System.out.print(VetorB[i] + " ");
		}
	}
}
