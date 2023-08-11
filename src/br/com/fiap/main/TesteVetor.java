package br.com.fiap.main;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Professor;

public class TesteVetor {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		aluno.setNome("Erick");
		aluno.setIdade(18);
		aluno.setRm(550371);
		
		professor.setNome("Rafael");
		professor.setIdade(37);
		professor.setSalario(8000);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getIdade());
		System.out.println(aluno.getRm());
		
		System.out.println(professor.getNome());
		System.out.println(professor.getIdade());
		System.out.println(professor.getSalario());
	
		// VETOR
		
		Aluno[] alunos = new Aluno[3];
		
		alunos[0] = new Aluno();
		alunos[0].setNome("Erick");
		alunos[0].setIdade(37);
		alunos[0].setRm(550371);
	}
}