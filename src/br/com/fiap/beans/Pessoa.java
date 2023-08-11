package br.com.fiap.beans;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa() {
		
	}

	public Pessoa(String recebeNome, int recebeIdade) {
		super();
		setNome(recebeNome);
		setIdade(recebeIdade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
