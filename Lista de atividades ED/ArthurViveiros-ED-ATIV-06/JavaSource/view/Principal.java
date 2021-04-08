package view;

import javax.swing.JOptionPane;

import controller.ExercicioEncadeiaAluno_Ativ_06;
import controller.ExercicioTemp_Ativ_06;
import model.Aluno;
import model.OrdemAluno;
import model.Temperatura;

public class Principal {

	public static void main(String[] args) {

		int exerc = 0;
		int choose = 0;
		int graus = 0;
		int posicao = 0;
		int RA = 0;
		String nome;
		String turma;
		String semestre;


		ExercicioTemp_Ativ_06 temperatura = new ExercicioTemp_Ativ_06();
		ExercicioEncadeiaAluno_Ativ_06 aluno = new ExercicioEncadeiaAluno_Ativ_06();
		
		JOptionPane.showMessageDialog(null, "Arthur Viveiros - RA: 1110482012024\nLista 06 - Temperatura e Aluno Recursivo");

		exerc = Integer.parseInt(JOptionPane.showInputDialog("Qual exerc�cio voc� quer ver??"
				+ "\nDigite 1 para ver o exerc�cio 1 - Temperatura" + "\nDigite 2 para ver o exerc�cio 2 - Aluno"));

		if (exerc == 1) {
			do {
				
				choose = Integer.parseInt(JOptionPane.showInputDialog(
						"----------------------------------------------------------------------"
								+ "\nExerc�cio 02 - Temperaturas\n"
								+ "\nDigite 1 para ver se a lista de temperaturas est� vazia."
								+ "\nDigite 2 para adicionar uma temperatura no inicio da lista."
								+ "\nDigite 3 para adicionar uma temperatura no fim da lista."
								+ "\nDigite 4 para adicionar uma temperatura em uma determinada posi��o da lista."
								+ "\nDigite 5 para remover uma temperatura no inicio da lista."
								+ "\nDigite 6 para remover uma temperatura no fim da lista."
								+ "\nDigite 7 para remover uma temperatura em uma determinada posi��o da lista."
								+ "\nDigite 8 para ver a lista" + "\nCaso voc� quiser encerrar o programa, digite 0"
								+ "\n----------------------------------------------------------------------",
						JOptionPane.QUESTION_MESSAGE));

				switch (choose) {
				case 1:
					boolean isVazia = temperatura.isVazia();
					JOptionPane.showMessageDialog(null, "A lista est� vazia: " + isVazia);
					break;
				case 2:
					graus = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a temperatura para se colocar no in�cio da fila: "));
					temperatura.addTempIni(graus);
					break;
				case 3:
					graus = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a temperatura para se colocar no final da fila: "));
					temperatura.addTempFim(graus);
					break;
				case 4:
					graus = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a temperatura: "));
					posicao = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a posicao em que voc� quer adicionar a temperatura: "));
					temperatura.addTempPos(graus, posicao);
					break;
				case 5:
					temperatura.delTempIni();
					break;
				case 6:
					temperatura.delTempFim();
					break;
				case 7:
					posicao = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a posicao em que voc� quer adicionar a temperatura: "));
					temperatura.delTempPos(posicao);
					break;
				case 8:
					Temperatura listado = null;
					temperatura.verLista(listado);
					break;
				}
			} while (choose != 0);
		} else {
			do {
				choose = Integer.parseInt(JOptionPane.showInputDialog(
						"----------------------------------------------------------------------"
								+ "\nExerc�cio 03 - Alunos\n" + "\nDigite 1 para adicionar um aluno no fim da lista."
								+ "\nDigite 2 para adicionar um aluno no come�o da lista."
								+ "\nDigite 3 para adicionar um aluno no meio da lista."
								+ "\nDigite 4 para remover um aluno no fim da lista."
								+ "\nDigite 5 para remover um aluno no come�o da lista."
								+ "\nDigite 6 para remover um aluno no meio da lista." + "\nDigite 7 para ver a lista."
								+ "\n----------------------------------------------------------------------",
						JOptionPane.QUESTION_MESSAGE));

				switch (choose) {
				case 1:
					RA = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno que voc� quer adicionar: "));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno que voc� quer adicionar: ");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno que voc� quer adicionar: ");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno que voc� quer adicionar: ");

					aluno.addAlunoFim(new Aluno(RA, nome, turma, semestre));
					break;
				case 2:
					RA = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno que voc� quer adicionar: "));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno que voc� quer adicionar: ");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno que voc� quer adicionar: ");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno que voc� quer adicionar: ");

					aluno.addAlunoIni(new Aluno(RA, nome, turma, semestre));
					break;
				case 3:
					RA = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno que voc� quer adicionar: "));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno que voc� quer adicionar: ");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno que voc� quer adicionar: ");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno que voc� quer adicionar: ");

					aluno.addAlunoMeio(new Aluno(RA, nome, turma, semestre));
					break;
				case 4:
					aluno.delAlunoFim();
					break;
				case 5:
					aluno.delAlunoIni();
					break;
				case 6:
					aluno.delAlunoMeio();
					break;
				case 7:
					OrdemAluno listado = null;
					aluno.verLista(listado);
					break;
				}
			} while (choose != 0);
		}

	}
}
