package br.sc.senac.dd.aula05.exercicio1.model;

public class CaminhaoForm extends VeiculoForm {
	private String comprimento;
	private String largura;
	private String altura;
	private String pesoKGCarroceria;
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public String getLargura() {
		return largura;
	}
	public void setLargura(String largura) {
		this.largura = largura;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getPesoKGCarroceria() {
		return pesoKGCarroceria;
	}
	public void setPesoKGCarroceria(String pesoKGCarroceria) {
		this.pesoKGCarroceria = pesoKGCarroceria;
	}

}
