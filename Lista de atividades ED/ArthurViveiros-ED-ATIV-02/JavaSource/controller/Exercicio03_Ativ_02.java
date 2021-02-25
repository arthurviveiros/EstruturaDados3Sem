package controller;

import javax.swing.JOptionPane;

public class Exercicio03_Ativ_02 {

	public boolean verVazia(String lista03[]) {
		boolean isVazia = false;
		
		for (int i = 0; i != lista03.length; i++) {
			if (lista03[i] == null) {
				isVazia = true;
			} else {
				isVazia = false;
				break;
			}
		}
		return isVazia;
		
	}

	public boolean verCheia(String lista03[]) {
		boolean isCheia = false;
		
		for (int i = 0; i != lista03.length; i++) {
			if (lista03[i] != null) {
				isCheia = true;
			} else {
				isCheia = false;
				break;
			}
		}
		return isCheia;
		
	}

	public void addIni(String lista03[]) {
		if (verCheia(lista03)) {
			JOptionPane.showMessageDialog(null, "Lista cheia, não foi possível adicionar");
		} else {
			for (int i = lista03.length - 1; i > 0; i--) {
				lista03[i] = lista03[i - 1];
			}
			lista03[0] = JOptionPane.showInputDialog("Digite o caracter para ser colocado na primeira posição");
			JOptionPane.showMessageDialog(null, "Caracter "+lista03[0]+" adicionado na primeira posição da lista");
		}
		
	}

	public void addFim(String lista03[]) {
		if (verCheia(lista03)) {
			JOptionPane.showMessageDialog(null, "Lista cheia, não foi possível adicionar");
		} else {
			for (int i = 0; i < lista03.length-1; i--) {
				lista03[i] = lista03[i + 1];
			}
			lista03[lista03.length-1] = JOptionPane.showInputDialog("Digite o caracter para ser colocado na ultima posição");
			JOptionPane.showMessageDialog(null, "Caracter "+lista03[lista03.length-1]+" adicionado na ultima posição da lista");
		}
		
	}

	public void addSel(String lista03[]) {
		int posicao = 10;
		
		if (verCheia(lista03)) {
			JOptionPane.showMessageDialog(null, "Lista cheia, não foi possível adicionar");
		} else {
			posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que você quer colocar o caracter entre ou igual a 0 e "+(lista03.length - 1)));
			lista03[posicao] = JOptionPane.showInputDialog("Digite o caracter para ser colocado na posição especifica da lista");
			JOptionPane.showMessageDialog(null, "Caracter "+lista03[posicao]+" adicionado na posição "+ posicao +" da lista");
		}
		
	}

	public void delIni(String lista03[]) {
		JOptionPane.showMessageDialog(null, "Caracter "+lista03[0]+" foi removido da primeira posição da lista");
		lista03[0] = null;
		
		for (int i = 0; i < lista03.length - 1; i++) {
			lista03[i] = lista03[i + 1];
		}
		
	}

	public void delFim(String lista03[]) {
		JOptionPane.showMessageDialog(null, "Caracter "+lista03[lista03.length-1]+" foi removido da primeira posição da lista");
		lista03[lista03.length-1] = null;
		for (int i = 0; i < lista03.length-1; i++) {
			lista03[i] = lista03[i + 1];
		}

	}

	public void delSel(String lista03[]) {
		int posicao = 10;
		
		posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que você quer deletar o caracter entre ou igual a 0 e "+(lista03.length - 1)));
		JOptionPane.showMessageDialog(null, "Caracter "+lista03[posicao]+" removido na posição "+ posicao +" da lista");
		lista03[posicao] = null;
		
	}

	public void seeLista(String lista03[]) {
		String listado = " ";
		
		for (int i = 0; i < lista03.length; i++) {
			listado = listado + " " + lista03[i];
		}
		JOptionPane.showMessageDialog(null,listado);
	}
	
}
