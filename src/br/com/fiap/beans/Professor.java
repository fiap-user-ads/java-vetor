package br.com.fiap.beans;

public class Professor extends Pessoa {
	private double salario;
	
	public Professor() {}

	public Professor(String recebeNome, int recebeIdade, double recebeSalario) {
		super(recebeNome, recebeIdade);
		setSalario(recebeSalario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}