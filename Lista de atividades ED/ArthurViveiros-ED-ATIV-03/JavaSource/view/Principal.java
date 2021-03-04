package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import controller.ExercicioListas_Ativ_03;
import controller.ExercicioLivros_Ativ_03;
import model.Livro;

public class Principal {

	public static void main(String[] args) {

		ExercicioListas_Ativ_03 listas03 = new ExercicioListas_Ativ_03();
		ExercicioLivros_Ativ_03 livros03 = new ExercicioLivros_Ativ_03(5);

		int choose = 0;
		int exerc = 0;

		int listaFIFO[];
		listaFIFO = new int[5];

		int listaPILHA[];
		listaPILHA = new int[5];

		JOptionPane.showMessageDialog(null, "Arthur Viveiros - RA: 1110482012024\nLista 03 - Estrutura de dados");

		exerc = Integer.parseInt(JOptionPane.showInputDialog("Qual exercício você quer ver??"
				+ "\nDigite 1 para ver os exercícios 1 e 2" + "\nDigite 2 para ver os exercícios 3 e 4"));

		if (exerc == 1) {
			do {
				choose = Integer.parseInt(JOptionPane.showInputDialog(
						"----------------------------------------------------------------------"
								+ "\nDigite 1 para adicionar um valor a lista FIFO."
								+ "\nDigite 2 para remover um valor a lista FIFO."
								+ "\nDigite 3 para adicionar um valor a lista PILHA."
								+ "\nDigite 4 para remover um valor a lista PILHA."
								+ "\nCaso você quiser encerrar o programa, digite 0"
								+ "\n----------------------------------------------------------------------",
						JOptionPane.QUESTION_MESSAGE));

				switch (choose) {
				case 1:
					listas03.addValorFIFO(listaFIFO);
					break;
				case 2:
					listas03.delValorFIFO(listaFIFO);
					break;
				case 3:
					listas03.addValorPILHA(listaPILHA);
					break;
				case 4:
					listas03.delValorPILHA(listaPILHA);
					break;
				}
			} while (choose != 0);
		} else {
			do {
				
				choose = Integer.parseInt(JOptionPane.showInputDialog(
						"----------------------------------------------------------------------"
								+ "\nDigite 1 para adicionar um livro a pilha de livros."
								+ "\nDigite 2 para remover um livro como se os livros estivessem em uma PILHA"
								+ "\nDigite 3 para remover um livro como se os livros estivessem em uma FILA"
								+ "\nDigite 4 para ver a lista de livros"
								+ "\nCaso você quiser encerrar o programa, digite 0"
								+ "\n----------------------------------------------------------------------",
						JOptionPane.QUESTION_MESSAGE));

				switch (choose) {
				case 1:
					String titulo = JOptionPane.showInputDialog("Digite o nome do livro que você está adicionando");
					int qtdLivros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de livros que o livro "+titulo+" tem"));
					livros03.addLivroNovo(new Livro(titulo,qtdLivros));
					break;
				case 2:
					livros03.delLivroPILHA();
					break;
				case 3:
					livros03.delLivroFILA();
					break;
				case 4:
					livros03.mostraLivro();
				}
			} while (choose != 0);
		}
	}

}