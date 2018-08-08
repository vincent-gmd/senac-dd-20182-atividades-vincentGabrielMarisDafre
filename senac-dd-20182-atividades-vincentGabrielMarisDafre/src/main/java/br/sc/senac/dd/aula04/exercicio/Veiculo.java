package br.sc.senac.dd.aula04.exercicio;

public abstract class Veiculo {
	Motor motor;
	Placa placa;
	int pesoKG;
	int numMaxPassagero;
	public Veiculo(Motor motor, Placa placa, int pesoKG, int numMaxPassagero) {
		super();
		this.motor = motor;
		this.placa = placa;
		this.pesoKG = pesoKG;
		this.numMaxPassagero = numMaxPassagero;
	}
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Placa getPlaca() {
		return placa;
	}
	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
	public int getPesoKG() {
		return pesoKG;
	}
	public void setPesoKG(int pesoKG) {
		this.pesoKG = pesoKG;
	}
	public int getNumMaxPassagero() {
		return numMaxPassagero;
	}
	public void setNumMaxPassagero(int numMaxPassagero) {
		this.numMaxPassagero = numMaxPassagero;
	}

}
