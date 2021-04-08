package controller;

import javax.swing.JOptionPane;

import model.Temperatura;

public class ExercicioTemp_Ativ_06 {
	static Temperatura primPos = null;

	public boolean isVazia() {
		boolean isVazia = false;

		if (primPos == null) {
			isVazia = true;
		} else {
			isVazia = false;
		}
		return isVazia;

	}

	public void addTempIni(int graus) {
		Temperatura newTemp = new Temperatura(graus, primPos);
		primPos = newTemp;
		JOptionPane.showMessageDialog(null, "Temperatura " + newTemp.getGraus() + "� adicionada no in�cio da fila!");
	}

	public void addTempFim(int graus) {
		Temperatura primTemp = primPos;
		Temperatura newTemp = new Temperatura(graus, null);

		while (primPos.getProxPos() != null) {
			// Avan�a
			primTemp = primTemp.getProxPos();

			newTemp = new Temperatura(graus, null);
			primPos.setProxPos(newTemp);
		}

		JOptionPane.showMessageDialog(null, "Temperatura " + newTemp.getGraus() + "� adicionada no final da fila!");
	}

	public void addTempPos(int graus, int posicao) {
		for (int i = 0; i < posicao - 1; i++) {
			// Avan�a
			primPos = primPos.getProxPos();
		}

		Temperatura newTemp = new Temperatura(graus, primPos.getProxPos());
		JOptionPane.showMessageDialog(null,
				"Temperatura " + newTemp.getGraus() + "� adicionada na posi��o " + posicao + " da fila!");
	}

	public void delTempIni() {
		if (isVazia() == true) {
			JOptionPane.showMessageDialog(null, "Temperatura n�o pode ser deletada, lista vazia!");
		} else {
			// Avan�a
			primPos = primPos.getProxPos();
			JOptionPane.showMessageDialog(null, "Temperatura deletada no in�cio da fila!");
		}

	}

	public void delTempFim() {
		if (isVazia() == true) {
			JOptionPane.showMessageDialog(null, "Temperatura n�o pode ser deletada, lista vazia!");
		} else {
			while (primPos.getProxPos() != null) {
				// Avan�a
				primPos = primPos.getProxPos();
			}
			JOptionPane.showMessageDialog(null, "Temperatura deletada no final da fila!");
		}
	}

	public void delTempPos(int posicao) {
		for (int i = 0; i < posicao - 1; i++) {
			// Avan�a
			primPos = primPos.getProxPos();
		}

		Temperatura newTemp = new Temperatura(0, primPos.getProxPos());
		primPos.setProxPos(newTemp);
		JOptionPane.showMessageDialog(null, "Temperatura deletada na posi��o " + posicao + " da fila!");
	}

	public void verLista(Temperatura listado) {
		if (isVazia() == true) {
			JOptionPane.showMessageDialog(null, "Lista n�o pode ser lida, lista vazia!");
		} else {
			if (listado != null) {
				JOptionPane.showMessageDialog(null, "\nTemperatura: " + listado.getGraus() + "�C.");
				verLista(listado.getProxPos());
				
			}
		}

	}

}