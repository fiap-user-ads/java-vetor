package br.com.fiap.beans;

public class Aluno extends Pessoa {
	private int rm;

	public Aluno() {}

	public Aluno(String recebeNome, int recebeIdade, int recebeRm) {
		super(recebeNome, recebeIdade);
		setRm(recebeRm);
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}
}
