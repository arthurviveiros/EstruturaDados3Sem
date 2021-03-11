package model;

public class Pessoa {

	private int ID;
	private String nome;
	private String RG;
	private String telefone;
	private String nascimento;
	
	public Pessoa( int ID, String nome, String RG, String telefone, String nascimento) {
		this.ID = ID;
		this.nome = nome;
		this.RG = RG;
		this.telefone = telefone;
		this.setNascimento(nascimento);
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
}
