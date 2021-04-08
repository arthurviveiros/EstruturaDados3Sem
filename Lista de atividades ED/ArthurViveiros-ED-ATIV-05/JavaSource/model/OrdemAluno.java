package model;

public class OrdemAluno {

	private Aluno aluno;
	private OrdemAluno proxPos;

	public OrdemAluno(Aluno aluno, OrdemAluno proxPos) {
		this.aluno = aluno;
		this.proxPos = proxPos;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public OrdemAluno getProxPos() {
		return proxPos;
	}

	public void setProxPos(OrdemAluno proxPos) {
		this.proxPos = proxPos;
	}

}
