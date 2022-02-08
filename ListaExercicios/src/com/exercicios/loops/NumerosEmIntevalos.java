package com.exercicios.loops;

import java.util.Scanner;

public class NumerosEmIntevalos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Entre com o número 1: ");
			int num1 = scan.nextInt();
			
			System.out.println("Entre com o número 2: ");
			int num2 = scan.nextInt();
			
			for(int i=num1; i < num2; i++) {
				num1 += 1;
				System.out.println(i);
			}
	}
}
