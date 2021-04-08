package model;

public class Temperatura {

	private int graus;
	private Temperatura proxPos;

	public Temperatura(int graus, Temperatura posicao) {
		this.graus = graus;
		this.proxPos = posicao;
	}

	public int getGraus() {
		return graus;
	}

	public void setGraus(int graus) {
		this.graus = graus;
	}

	public Temperatura getProxPos() {
		return proxPos;
	}

	public void setProxPos(Temperatura posicao) {
		this.proxPos = posicao;
	}
}
