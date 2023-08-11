package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteVetor2 {
	public static void main(String[] args) {
		String recebeNome = "";
		int recebeIdade = 0;
		int recebeRm = 0;
		
		Aluno[] alunos = new Aluno[3];

		for (int i = 0; i < alunos.length; i++) {
			recebeNome = JOptionPane.showInputDialog("Digite o nome");
			recebeIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			recebeRm = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM"));

			alunos[i] = new Aluno();
			alunos[i].setNome(recebeNome);
			alunos[i].setIdade(recebeIdade);
			alunos[i].setRm(recebeRm);
			
			System.out.println(alunos[i].getNome());
			System.out.println(alunos[i].getIdade());
			System.out.println(alunos[i].getRm());
		}


	}
}
