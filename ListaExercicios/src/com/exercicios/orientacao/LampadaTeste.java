package com.exercicios.orientacao;

public class LampadaTeste extends Lampada {
	
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		
	}
}
