package br.sc.senac.dd.aula04.exercicio;

public class Caminhao extends Veiculo {
	private Carroceria carroceria;



	public Caminhao(Motor motor, Placa placa, int pesoKG, int numMaxPassagero, Carroceria carroceria) {
		super(motor, placa, pesoKG, numMaxPassagero);
		this.carroceria = carroceria;
	}

	public Carroceria getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
}
