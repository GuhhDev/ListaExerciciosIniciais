package com.exercicios.loops;

import java.util.Scanner;

public class NumerosWhile {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Boolean notaValida = false;
		
		System.out.println("Entre com um valor: ");
		Double nota = scan.nextDouble();
	
		do {	
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Voc� digitou: " + nota);
		} else {
				System.out.println("Nota inv�lida, voc� digitou: " + nota);
			}
		} while (!notaValida);
	}
}
