package com.exercicios.arrays;

import java.util.Scanner;

public class VetorAUniaoVetorB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] VetorA = new int[5];
		int[] VetorB = new int[VetorA.length];

		for (int i = 0; i < VetorA.length; i++) {
			System.out.println("Entre com os números do vetor A na posição: " + i);
			VetorA[i] = scan.nextInt();

			VetorB[i] = VetorA[i];
		}

		System.out.println("Vetor A igual a = ");
		for (int i = 0; i < VetorA.length; i++) {
			System.out.println(VetorA[i] + "");
		}

		System.out.println("Vetor B igual a = ");
		for (int i = 0; i < VetorB.length; i++) {
			System.out.println(VetorB[i] + "");
		}
	}
}
