package com.exercicios.orientacao;

public class Lampada {

	private String nome, preco, acao, marca;
	private Boolean ligada;

	public Lampada() {
	}

	public void ligar() {
		setLigada(true);
	}

	public void desligar() {
		setLigada(false);
	}

	public void mostrarEstado() {
		if (isLigada())
			System.out.println("Lampada ligada!");
		else
			System.out.println("Lampada desligada!");
	}

	public void mudarEstado() {
		if (isLigada())
			desligar();
		else
			ligar();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boolean isLigada() {
		return ligada;
	}

	public void setLigada(Boolean ligada) {
		this.ligada = ligada;
	}
}
