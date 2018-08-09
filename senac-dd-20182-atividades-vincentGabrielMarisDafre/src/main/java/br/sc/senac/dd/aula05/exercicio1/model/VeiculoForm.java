package br.sc.senac.dd.aula05.exercicio1.model;

import br.sc.senac.dd.aula04.exercicio.Motor;
import br.sc.senac.dd.aula04.exercicio.Placa;

public class VeiculoForm {
	private String cilindros;
	private String potencia;
	private String estado;
	private String id ;
	private String cor;
	private String pesoKG;
	private String numMaxPassagero;
	public String getCilindros() {
		return cilindros;
	}
	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPesoKG() {
		return pesoKG;
	}
	public void setPesoKG(String pesoKG) {
		this.pesoKG = pesoKG;
	}
	public String getNumMaxPassagero() {
		return numMaxPassagero;
	}
	public void setNumMaxPassagero(String numMaxPassagero) {
		this.numMaxPassagero = numMaxPassagero;
	}


}
