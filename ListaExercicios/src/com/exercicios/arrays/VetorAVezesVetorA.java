package com.exercicios.arrays;

import java.util.Scanner;

public class VetorAVezesVetorA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] VetorA = new int[15];
		int[] VetorB = new int[VetorA.length];

		for (int i = 0; i < VetorA.length; i++) {
			System.out.println("Entre com os números do vetor A na posição: " + i);
			VetorA[i] = scan.nextInt();

			VetorB[i] = VetorA[i] * VetorA[i];
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
