package com.exercicios.loops;

import java.util.Scanner;

public class UsuarioSenhaWhile {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Boolean informacoesValidas = false;
		
		do {	
			System.out.println("Entre com o usuário: ");
			String nomeUser = scan.next();
			
			System.out.println("Entre com a senha: ");
			String senha = scan.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				informacoesValidas = false;
				System.out.println("Senha igual o usuário, digite novamente: ");
			} else {
				System.out.println("Senha e usuários válidos!");
			}
			
		} while (!informacoesValidas);
	}
}
