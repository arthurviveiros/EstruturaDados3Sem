package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import controller.Exercicio02_Ativ_02;
import controller.Exercicio03_Ativ_02;

public class Principal {

	public static void main(String[] args) {
		Exercicio02_Ativ_02 Exerc02 = new Exercicio02_Ativ_02();
		Exercicio03_Ativ_02 Exerc03 = new Exercicio03_Ativ_02();
		
		
		Scanner sc= new Scanner(System.in);
		int choose = 0;

		JOptionPane.showMessageDialog(null,"Arthur Viveiros - RA: 1110482012024\nAtividade 02 - Estrutura de dados");

		int numExerc = Integer.parseInt(JOptionPane.showInputDialog("Qual exercício você quer ver nesta execução ??\n"
				+ "\nDigite 2 para ver o Exercício02-ListaDeCaracteres"
				+ "\nDigite 3 para ver o Exercício03-ListaDeStrings"));
		
		if ( numExerc == 2 ) {
			
			char lista03[];
			lista03 = new char[5];
			
			do {
				choose = Integer.parseInt(JOptionPane.showInputDialog("Exercício02-ListaDeCaracteres\n\nDigite o número na esquerda das funcionalidades para executá-las\n"
						+ "\n1 - Verificar se a lista está vazia"
						+ "\n2 - Verificar se a lista está cheia"
						+ "\n3 - Adicionar caractere no início da lista"
						+ "\n4 - Adicionar caractere no fim da lista"
						+ "\n5 - Adicionar caractere em determinada posição"
						+ "\n6 - Remover caractere no inicio da lista"
						+ "\n7 - Remover caractere no fim da lista"
						+ "\n8 - Remover caractere em determinada posição"
						+ "\n9 - Percorrer a lista concatenando os elementos"
						+ "\n"
						+ "\n0 - Para encerrar o programa"));
			
				switch(choose) {
				case 1: boolean isVazia = Exerc02.verVazia(lista03); JOptionPane.showMessageDialog(null, "Lista está vazia: "+ isVazia); break;
				case 2: boolean isCheia = Exerc02.verCheia(lista03); JOptionPane.showMessageDialog(null, "Lista está cheia: "+ isCheia); break;
				case 3: Exerc02.addIni(lista03); break;
				case 4: Exerc02.addFim(lista03); break;
				case 5: Exerc02.addSel(lista03); break;
				case 6: Exerc02.delIni(lista03); break;
				case 7: Exerc02.delFim(lista03); break;
				case 8: Exerc02.delSel(lista03); break;
				case 9: Exerc02.seeLista(lista03); break;
				}
			} while(choose != 0);
		
		} else {
			
			String lista03[];
			lista03 = new String[5];
			
			System.out.println(lista03[0]);
			System.out.println(lista03[0]);
			System.out.println(lista03[0]);
			System.out.println(lista03[0]);
			System.out.println(lista03[0]);
			System.out.println(lista03[0]);
			System.out.println(lista03[0]);
			
			do {
				choose = Integer.parseInt(JOptionPane.showInputDialog("Exercício03-ListaDeStrings\n\nDigite o número na esquerda das funcionalidades para executá-las\n"
						+ "\n1 - Verificar se a lista está vazia"
						+ "\n2 - Verificar se a lista está cheia"
						+ "\n3 - Adicionar string no início da lista"
						+ "\n4 - Adicionar string no fim da lista"
						+ "\n5 - Adicionar string em determinada posição"
						+ "\n6 - Remover string no inicio da lista"
						+ "\n7 - Remover string no fim da lista"
						+ "\n8 - Remover string em determinada posição"
						+ "\n9 - Percorrer a lista concatenando os elementos"
						+ "\n"
						+ "\n0 - Para encerrar o programa"));
			
				switch(choose) {
				case 1: Exerc03.verVazia(lista03); break;
				case 2: Exerc03.verCheia(lista03); break;
				case 3: Exerc03.addIni(lista03); break;
				case 4: Exerc03.addFim(lista03); break;
				case 5: Exerc03.addSel(lista03); break;
				case 6: Exerc03.delIni(lista03); break;
				case 7: Exerc03.delFim(lista03); break;
				case 8: Exerc03.delSel(lista03); break;
				case 9: Exerc03.seeLista(lista03); break;
				}
			} while(choose != 0);
			
		}
	}
	
}
