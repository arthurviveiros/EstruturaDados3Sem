package controller;

import javax.swing.JOptionPane;

import model.Produto;

public class ExercicioLojaVirtual_Ativ_04 {

	/* Trecho de criação de endereço de memória */
	int tamanhoPilha = 0;
	int tamanhoPilhaDel = 0;
	/* Fim do Trecho de criação de endereço de memória */

	public boolean isVazia(Produto[] pilhaProdutos) {
		/* Trecho de criação de endereço de memória */
		boolean isVazia = false;
		/* Fim do Trecho de criação de endereço de memória */

		if (tamanhoPilha == 0) {
			isVazia = true;
		} else {
			isVazia = false;
		}
		return isVazia;

	}

	public void addProdutoPilha(Produto newPessoa, Produto[] pilhaProdutos) {
		if (tamanhoPilha < pilhaProdutos.length) {
			pilhaProdutos[tamanhoPilha] = newPessoa;
			tamanhoPilha++;
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possível adicionar, pilha cheia");
		}

	}

	public void delProdutoPilha(Produto[] pilhaProdutos, Produto[] pilhaDel) {
		/* Trecho de criação de endereço de memória */
		Produto produto = null;
		/* Fim do Trecho de criação de endereço de memória */
		if (isVazia(pilhaProdutos) == false) {
			produto = pilhaProdutos[tamanhoPilha];

			if (tamanhoPilhaDel >= 9) {
				tamanhoPilhaDel = 9;
			}
			pilhaDel[tamanhoPilha] = produto;
			tamanhoPilhaDel++;

			if (tamanhoPilha > 0) {
				pilhaProdutos[tamanhoPilha] = produto;
				tamanhoPilha--;
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possível remover, pilha vazia");
			}
			JOptionPane.showMessageDialog(null, "O Produto foi deletado");
		}

	}

	public void verPilhaPessoasDel(Produto[] pilhaDel) {

		if (tamanhoPilha == 0) {
			JOptionPane.showMessageDialog(null, "Ninguem foi deletado, nada para mostrar");
		} else {
			/* Trecho de criação de endereço de memória */
			String listado = " ";
			/* Fim do Trecho de criação de endereço de memória */
			for (int i = 0; i < tamanhoPilha; i++) {
				listado = listado + "" + "\nID: " + pilhaDel[i].getID() + "" + "\nNome: " + pilhaDel[i].getNome() + ""
						+ "\nQuantidade: " + pilhaDel[i].getQuantidade() + "" + "\nValor: " + pilhaDel[i].getValor()
						+ "" + "\n\n";
			}
			JOptionPane.showMessageDialog(null, listado);
		}
	}

	public void verPessoasFrente(Produto[] pilhaProdutos, String produtoFrente) {
		for (int i = 0; i < tamanhoPilha; i++) {
			if (pilhaProdutos[i].getNome().toLowerCase().contains(produtoFrente.toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Faltam " + (tamanhoPilha - i) + " pessoas na frente de " + produtoFrente);
			}
		}
	}

	public void verPilha(Produto[] pilhaProdutos) {
		if (tamanhoPilha == 0) {
			JOptionPane.showMessageDialog(null, "Fila vazia, nada para mostrar");
		} else {
			/* Trecho de criação de endereço de memória */
			String listado = " ";
			/* Fim do Trecho de criação de endereço de memória */
			for (int i = 0; i < tamanhoPilha; i++) {
				listado = listado + "" + "\nID: " + pilhaProdutos[i].getID() + "" + "\nNome: " + pilhaProdutos[i].getNome() + ""
						+ "\nQuantidade: " + pilhaProdutos[i].getQuantidade() + "" + "\nValor: " + pilhaProdutos[i].getValor()
						+ "" + "\n\n";
			}
			JOptionPane.showMessageDialog(null, listado);
		}

	}

}
