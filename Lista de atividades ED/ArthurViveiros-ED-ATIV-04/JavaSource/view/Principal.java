package view;

import javax.swing.JOptionPane;

import controller.ExercicioDetram_Ativ_04;
import controller.ExercicioLojaVirtual_Ativ_04;
import model.Pessoa;
import model.Produto;

public class Principal {

	public static void main(String[] args) {

		/* Trecho de criação de endereço de memória */
		int choose = 0;
		int exerc = 0;
		/* Fim do Trecho de criação de endereço de memória */

		/* Trecho de Associação de classes */
		ExercicioDetram_Ativ_04 detram = new ExercicioDetram_Ativ_04();
		ExercicioLojaVirtual_Ativ_04 lojaVirtual = new ExercicioLojaVirtual_Ativ_04();
		Pessoa filaDetram[];
		filaDetram = new Pessoa[10];
		Pessoa pilhaDel[];
		pilhaDel = new Pessoa[10];
		Produto pilhaProdutos[];
		pilhaProdutos = new Produto[10];
		Produto pilhaProdDel[];
		pilhaProdDel = new Produto[10];
		/* Fim do Trecho de Associação de classes */
		
		
		JOptionPane.showMessageDialog(null, "Arthur Viveiros - RA: 1110482012024\nLista 04 - Detram e Loja virtual");

		exerc = Integer.parseInt(JOptionPane.showInputDialog("Qual exercício você quer ver??"
				+ "\nDigite 1 para ver o exercício 1 - Detram" + "\nDigite 2 para ver o exercício 2 - Loja Virtual"));

		if (exerc == 1) {
			do {
				choose = Integer.parseInt(JOptionPane.showInputDialog(
						"----------------------------------------------------------------------"
								+ "\nDigite 1 para ver se a fila do DETRAM está vazia."
								+ "\nDigite 2 para adicionar uma pessoa na fila do DETRAM."
								+ "\nDigite 3 para remover uma pessoa da fila do DETRAM."
								+ "\nDigite 4 para ver as pessoas removidas da fila do DETRAM."
								+ "\nDigite 5 para ver quantas pessoas estão a frente de alguem"
								+ "\nDigite 6 para ver a fila do DETRAM"
								+ "\nCaso você quiser encerrar o programa, digite 0"
								+ "\n----------------------------------------------------------------------",
						JOptionPane.QUESTION_MESSAGE));

				switch (choose) {
				case 1:
					/* Trecho de criação de endereço de memória */
					boolean isVazia = detram.isVazia(filaDetram);
					/* Fim do Trecho de criação de endereço de memória */
					JOptionPane.showMessageDialog(null, "A lista está vazia: " + isVazia);
					break;
				case 2:	
					/* Trecho de criação de endereço de memória */
					int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da pessoa que você está adicionando"));
					String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
					String RG = JOptionPane.showInputDialog("Digite o RG da pessoa");
					String telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa");
					String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento da pessoa");
					/* Fim do Trecho de criação de endereço de memória */
					/* Trecho de Associação de classes */
					detram.addPessoaFila(new Pessoa(ID,nome,RG,telefone,nascimento),filaDetram);
					/* Fim do Trecho de Associação de classes */
					break;
				case 3:
					/* Trecho de Associação de classes */
					detram.delPessoaFila(filaDetram, pilhaDel);
					/* Fim do Trecho de Associação de classes */
					break;
				case 4:
					/* Trecho de Associação de classes */
					detram.verPessoasDel(pilhaDel);
					/* Fim do Trecho de Associação de classes */
					break;
				case 5:
					/* Trecho de criação de endereço de memória */
					String pessoaFrente = JOptionPane.showInputDialog("Digite o nome da pessoa em que você quer ver a posição");
					/* Fim do Trecho de criação de endereço de memória */
					/* Trecho de Associação de classes */
					detram.verPessoasFrente(filaDetram, pessoaFrente);
					/* Fim do Trecho de Associação de classes */
					break;
				case 6:
					/* Trecho de Associação de classes */
					detram.verFila(filaDetram);
					/* Fim do Trecho de Associação de classes */
					break;
				}
			} while (choose != 0);
		} else {
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
					/* Trecho de Associação de classes */
					lojaVirtual.isVazia(pilhaProdutos);
					/* Fim do Trecho de Associação de classes */
					break;
				case 2:
					/* Trecho de criação de endereço de memória */
					int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da pessoa que você está adicionando"));
					String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
					float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o RG da pessoa"));
					int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone da pessoa"));
					/* Fim do Trecho de criação de endereço de memória */
					/* Trecho de Associação de classes */
					lojaVirtual.addProdutoPilha(new Produto(ID,nome,valor,quantidade), pilhaProdutos);
					/* Fim do Trecho de Associação de classes */
					break;
				case 3:
					/* Trecho de Associação de classes */
					lojaVirtual.delProdutoPilha(pilhaProdutos,pilhaProdDel);
					/* Fim do Trecho de Associação de classes */
					break;
				case 4:
					/* Trecho de Associação de classes */
					lojaVirtual.verPilhaPessoasDel(pilhaProdutos);
					/* Fim do Trecho de Associação de classes */
					break;
				case 5:
					/* Trecho de criação de endereço de memória */
					String produtoFrente = JOptionPane.showInputDialog("Digite o nome da pessoa em que você quer ver a posição");
					/* Fim do Trecho de criação de endereço de memória */
					/* Trecho de Associação de classes */
					lojaVirtual.verPessoasFrente(pilhaProdutos, produtoFrente);
					/* Fim do Trecho de Associação de classes */
					break;
				case 6:
					/* Trecho de Associação de classes */
					lojaVirtual.verPilha(pilhaProdutos);
					/* Fim do Trecho de Associação de classes */
					break;
				}
			} while (choose != 0);
		}

	}
}
