package controller;

import javax.swing.JOptionPane;

import model.Pessoa;

public class ExercicioDetram_Ativ_04 {

	/* Trecho de criação de endereço de memória */
	int tamanhoFila = 0;
	int tamanhoPilha = 0;
	/* Fim do Trecho de criação de endereço de memória */

	public boolean isVazia(Pessoa[] filaDetram) {
		/* Trecho de criação de endereço de memória */
		boolean isVazia = false;
		/* Fim do Trecho de criação de endereço de memória */

		if (tamanhoFila == 0) {
			isVazia = true;
		} else {
			isVazia = false;
		}
		return isVazia;

	}

	public void addPessoaFila(Pessoa newPessoa, Pessoa[] filaDetram) {
		if (tamanhoFila < filaDetram.length) {
			filaDetram[tamanhoFila] = newPessoa;
			tamanhoFila++;
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possível adicionar, fila cheia");
		}

	}

	public void delPessoaFila(Pessoa[] filaDetram, Pessoa[] pilhaDel) {
		/* Trecho de criação de endereço de memória */
		Pessoa pessoa = null;
		/* Fim do Trecho de criação de endereço de memória */
		if (isVazia(filaDetram) == false) {
			pessoa = filaDetram[0];

			if (tamanhoPilha >= 9) {
				tamanhoPilha = 9;
			}
			pilhaDel[tamanhoPilha] = pessoa;
			tamanhoPilha++;

			for (int i = 0; i < tamanhoFila - 1; i++) {
				filaDetram[i] = filaDetram[i + 1];
			}
			JOptionPane.showMessageDialog(null, "Pessoa deletada");
			tamanhoFila--;
		} else {
			JOptionPane.showMessageDialog(null, "Fila vazia, ninguem para deletar");
		}
	}

	public void verPessoasDel(Pessoa[] pilhaDel) {

		if (tamanhoPilha == 0) {
			JOptionPane.showMessageDialog(null, "Ninguem foi deletado, nada para mostrar");
		} else {
			/* Trecho de criação de endereço de memória */
			String listado = " ";
			/* Fim do Trecho de criação de endereço de memória */
			for (int i = 0; i < tamanhoPilha; i++) {
				listado = listado + "" + "\nNome: " + pilhaDel[i].getNome() + "" + "\nID: " + pilhaDel[i].getID() + ""
						+ "\nNascimento: " + pilhaDel[i].getNascimento() + "" + "\nTelefone: "
						+ pilhaDel[i].getTelefone() + "" + "\n\n";
			}
			JOptionPane.showMessageDialog(null, listado);
		}

	}

	public void verPessoasFrente(Pessoa[] filaDetram, String pessoaFrente) {
		for (int i = 0; i < tamanhoFila; i++) {
			if (filaDetram[i].getNome().toLowerCase().contains(pessoaFrente.toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Faltam " + i + " pessoas na frente de " + pessoaFrente);
			}
		}
	}

	public void verFila(Pessoa[] filaDetram) {

		if (tamanhoFila == 0) {
			JOptionPane.showMessageDialog(null, "Fila vazia, nada para mostrar");
		} else {
			/* Trecho de criação de endereço de memória */
			String listado = " ";
			/* Fim do Trecho de criação de endereço de memória */
			for (int i = 0; i < tamanhoFila; i++) {
				listado = listado + "" + "\nNome: " + filaDetram[i].getNome() + "" + "\nID: " + filaDetram[i].getID()
						+ "" + "\nNascimento: " + filaDetram[i].getNascimento() + "" + "\nTelefone: "
						+ filaDetram[i].getTelefone() + "" + "\n\n";
			}
			JOptionPane.showMessageDialog(null, listado);
		}

	}

}
