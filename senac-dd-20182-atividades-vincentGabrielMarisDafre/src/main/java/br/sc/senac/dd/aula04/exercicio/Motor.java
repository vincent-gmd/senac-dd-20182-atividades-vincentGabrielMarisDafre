package br.sc.senac.dd.aula04.exercicio;

public class Motor {
	private int cilindros;
	private int potencia;
public Motor(int cilindros, int potencia) {
		super();
		this.cilindros = cilindros;
		this.potencia = potencia;
	}
public int getCilindros() {
	return cilindros;
}
public void setCilindros(int cilindros) {
	this.cilindros = cilindros;
}
public int getPotencia() {
	return potencia;
}
public void setPotencia(int potencia) {
	this.potencia = potencia;
}
}
