package br.sc.senac.dd.aula04.exercicio;

public class Carroceria {
	private int comprimento;
	private int largura;
	private int altura;
	private int pesoKG;
	public Carroceria(int comprimento, int largura, int altura, int pesoKG) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
		this.pesoKG = pesoKG;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPesoKG() {
		return pesoKG;
	}
	public void setPesoKG(int pesoKG) {
		this.pesoKG = pesoKG;
	}
	

}
