package controller;

import javax.swing.JOptionPane;

import model.Livro;

public class ExercicioLivros_Ativ_03 {

	public int tamanhoPilha = 0;
	private Livro dados[];

	public ExercicioLivros_Ativ_03(int quantidade) {
		dados = new Livro[quantidade];
	}

	public void addLivroNovo(Livro newLivro) {
		if (tamanhoPilha < dados.length) {
			dados[tamanhoPilha] = newLivro;
			tamanhoPilha++;
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possível adicionar, pilha cheia");
		}
	}

	public void delLivroPILHA() {
			if (tamanhoPilha > 0) {
				dados[tamanhoPilha] = null;
				tamanhoPilha--;
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possível remover, pilha vazia");
			}
			JOptionPane.showMessageDialog(null,"O Livro foi removido\n\nFIFO = primeiro valor que entrou, sai primeiro\"");
		}
	
	public void delLivroFILA() {
			if (tamanhoPilha >= 1) {
				dados[0] = null;
				for (int i = 0; i < tamanhoPilha - 1; i++) {
					dados[i] = dados[i + 1];
				}
				tamanhoPilha--;
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possível remover, pilha vazia");
			}
			JOptionPane.showMessageDialog(null,"O Livro foi removido\n\nPILHA = o último valor que entrou, sai primeiro\"");
	}

	public void mostraLivro() {
		String listado = " ";
		for (int i = 0; i < tamanhoPilha; i++) {
			listado = listado + "\nTítulo: " + dados[i].getTitulo() + " \nQuantidade: " + dados[i].getQuantidade() + "\n\n";
			
		}
		JOptionPane.showMessageDialog(null, listado);
	}
}
