package com.exercicios.loops;

import java.util.Scanner;

public class UsuarioSenhaWhile {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Boolean informacoesValidas = false;
		
		do {	
			System.out.println("Entre com o usu�rio: ");
			String nomeUser = scan.next();
			
			System.out.println("Entre com a senha: ");
			String senha = scan.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				informacoesValidas = false;
				System.out.println("Senha igual o usu�rio, digite novamente: ");
			} else {
				System.out.println("Senha e usu�rios v�lidos!");
			}
			
		} while (!informacoesValidas);
	}
}
