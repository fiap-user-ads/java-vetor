package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;

public class TesteVetor3 {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Erick", 18, 123123);
		Aluno aluno2 = new Aluno("Rafa", 52, 123123);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(aluno1);
	}
}
