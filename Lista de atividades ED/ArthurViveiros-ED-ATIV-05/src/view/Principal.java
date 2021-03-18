package view;

import javax.swing.JOptionPane;

import controller.ExercicioAluno_Ativ_05;
import controller.ExercicioTemperatura_Ativ_05;
import model.Aluno;
import model.Temperatura;

public class Principal {

	public static void main(String[] args) {

		ExercicioTemperatura_Ativ_05 temperatura = new ExercicioTemperatura_Ativ_05();
		ExercicioAluno_Ativ_05 aluno = new ExercicioAluno_Ativ_05();

		int exerc = 0;
		int choose = 0;
		int graus = 0;
		int posicao = 0;
		int RA = 0;
		String nome;
		String turma;
		String semestre;

		JOptionPane.showMessageDialog(null, "Arthur Viveiros - RA: 1110482012024\nLista 05 - Temperatura e Alunos");

		exerc = Integer.parseInt(JOptionPane.showInputDialog("Qual exercício você quer ver??"
				+ "\nDigite 2 para ver o exercício 2 - Temperaturas" + "\nDigite 3 para ver o exercício 3 - Alunos"));
		if (exerc == 2) {
			do {
				choose = Integer.parseInt(JOptionPane.showInputDialog(
						"----------------------------------------------------------------------"
								+ "\nExercício 02 - Temperaturas\n"
								+ "\nDigite 1 para ver se a lista de temperaturas está vazia."
								+ "\nDigite 2 para adicionar uma temperatura no inicio da lista."
								+ "\nDigite 3 para adicionar uma temperatura no fim da lista."
								+ "\nDigite 4 para adicionar uma temperatura em uma determinada posição da lista."
								+ "\nDigite 5 para remover uma temperatura no inicio da lista."
								+ "\nDigite 6 para remover uma temperatura no fim da lista."
								+ "\nDigite 7 para remover uma temperatura em uma determinada posição da lista."
								+ "\nDigite 8 para ver a lista" + "\nCaso você quiser encerrar o programa, digite 0"
								+ "\n----------------------------------------------------------------------",
						JOptionPane.QUESTION_MESSAGE));

				switch (choose) {
				case 1:
					boolean isVazia = temperatura.isVazia();
					JOptionPane.showMessageDialog(null, "A lista está vazia: " + isVazia);
					break;
				case 2:
					graus = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a temperatura para se colocar no início da fila: "));
					temperatura.addTempIni(graus);
					break;
				case 3:
					graus = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a temperatura para se colocar no início da fila: "));
					temperatura.addTempFim(graus);
					break;
				case 4:
					graus = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a temperatura para se colocar no início da fila: "));
					posicao = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a posicao em que você quer adicionar a temperatura: "));
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
							JOptionPane.showInputDialog("Digite a posicao em que você quer adicionar a temperatura: "));
					temperatura.delTempPos(posicao);
					break;
				case 8:
					temperatura.verLista();
					break;
				}
			} while (choose != 0);
		} else {
			do {
				choose = Integer.parseInt(JOptionPane.showInputDialog(
						"----------------------------------------------------------------------"
								+ "\nExercício 03 - Alunos\n" + "\nDigite 1 para adicionar um aluno no fim da lista."
								+ "\nDigite 2 para adicionar um aluno no começo da lista."
								+ "\nDigite 3 para adicionar um aluno no meio da lista."
								+ "\nDigite 4 para remover um aluno no fim da lista."
								+ "\nDigite 5 para remover um aluno no começo da lista."
								+ "\nDigite 6 para remover um aluno no meio da lista." + "\nDigite 7 para ver a lista."
								+ "\n----------------------------------------------------------------------",
						JOptionPane.QUESTION_MESSAGE));

				switch (choose) {
				case 1:
					RA = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno que você quer adicionar: "));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno que você quer adicionar: ");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno que você quer adicionar: ");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno que você quer adicionar: ");

					aluno.addAlunoFim(new Aluno(RA, nome, turma, semestre));
					break;
				case 2:
					RA = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno que você quer adicionar: "));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno que você quer adicionar: ");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno que você quer adicionar: ");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno que você quer adicionar: ");

					aluno.addAlunoIni(new Aluno(RA, nome, turma, semestre));
					break;
				case 3:
					RA = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno que você quer adicionar: "));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno que você quer adicionar: ");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno que você quer adicionar: ");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno que você quer adicionar: ");

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
					aluno.verLista();
					break;
				}
			} while (choose != 0);
		}
	}
}
