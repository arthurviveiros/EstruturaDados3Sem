package controller;

import javax.swing.JOptionPane;

import model.Aluno;
import model.OrdemAluno;

public class ExercicioAluno_Ativ_05 {

	static OrdemAluno primPos = null;

	public boolean isVazia() {
		boolean isVazia = false;

		if (primPos == null) {
			isVazia = true;
		} else {
			isVazia = false;
		}
		return isVazia;
	}
	
	public int getMeioLista() {
		int tamanho = 0;

		while (primPos.getProxPos() != null) {
			// Avança
			primPos = primPos.getProxPos();
			tamanho = tamanho++;
		}
		int meio = tamanho/2;
		return meio;

	}

	public void addAlunoFim(Aluno aluno) {
		while (primPos.getProxPos() != null) {
			// Avança
			primPos = primPos.getProxPos();
		}
		OrdemAluno newAluno = new OrdemAluno(aluno, primPos);
		primPos = newAluno;
		JOptionPane.showMessageDialog(null, "Aluno adicionado no final da fila!");
	}

	public void addAlunoIni(Aluno aluno) {
		OrdemAluno newAluno = new OrdemAluno(aluno, primPos);
		primPos = newAluno;
		JOptionPane.showMessageDialog(null, "Aluno adicionado no inicio da fila!");
	}

	public void addAlunoMeio(Aluno aluno) {
		for (int i = 0; i < getMeioLista() - 1; i++) {
			// Avança
			primPos = primPos.getProxPos();
		}

		OrdemAluno newAluno = new OrdemAluno(aluno, primPos.getProxPos());
		primPos.setProxPos(newAluno);
		JOptionPane.showMessageDialog(null, "Aluno adicionado no meio da fila!");
	}

	public void delAlunoFim() {
		if (isVazia() == true) {
			JOptionPane.showMessageDialog(null, "Aluno não pode ser deletado, lista vazia!");
		} else {
			while (primPos.getProxPos() != null) {
				// Avança
				primPos = primPos.getProxPos();
			}
			JOptionPane.showMessageDialog(null, "Aluno deletado no final da fila!");
		}

	}

	public void delAlunoIni() {
		if (isVazia() == true) {
			JOptionPane.showMessageDialog(null, "Aluno não pode ser deletado, lista vazia!");
		} else {
			// Avança
			primPos = primPos.getProxPos();
			JOptionPane.showMessageDialog(null, "Aluno deletado no início da fila!");
		}
	}

	public void delAlunoMeio() {
		for (int i = 0; i < getMeioLista() - 1; i++) {
			// Avança
			primPos = primPos.getProxPos();
		}

		OrdemAluno newAluno = new OrdemAluno(null, primPos.getProxPos());
		primPos.setProxPos(newAluno);
		JOptionPane.showMessageDialog(null, "Aluno foi deletado no meio da fila");
	}

	public void verLista() {
		if (isVazia() == true) {
			JOptionPane.showMessageDialog(null, "Lista não pode ser lida, lista vazia!");
		} else {
			OrdemAluno listado = primPos;
			JOptionPane.showMessageDialog(null, "A Lista de temperaturas atual é: ");
			while (listado != null) {
				Aluno aluno = listado.getAluno();
				JOptionPane.showMessageDialog(null, "\n RA: " + aluno.getRA() + ""
						+ "\n Nome: " + aluno.getNome() + ""
						+ "\n Turma: " + aluno.getTurma() + ""
						+ "\n Semestre: " + aluno.getSemestre() + "");
				listado = listado.getProxPos();
			}
		}
	}

}
