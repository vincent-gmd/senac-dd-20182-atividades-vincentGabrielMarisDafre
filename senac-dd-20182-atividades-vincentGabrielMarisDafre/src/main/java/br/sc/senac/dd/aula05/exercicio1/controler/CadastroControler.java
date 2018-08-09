package br.sc.senac.dd.aula05.exercicio1.controler;

import br.sc.senac.dd.aula04.exercicio.Automovel;
import br.sc.senac.dd.aula04.exercicio.Caminhao;
import br.sc.senac.dd.aula04.exercicio.Carroceria;
import br.sc.senac.dd.aula04.exercicio.Moto;
import br.sc.senac.dd.aula04.exercicio.Motor;
import br.sc.senac.dd.aula04.exercicio.Placa;
import br.sc.senac.dd.aula05.exercicio1.model.VeiculoForm;

public class CadastroControler {
	
	public int cadastrarVeiculo(int tipo,VeiculoForm v){
		switch (tipo) {
		case 1:
			cadastrarMoto(v);
			break;
		case 2:
			cadastrarCarro(v);
			break;

		default:
			return -1;
		}
		
		
		
		
		return 0;

	}
	public int cadastrarMoto(VeiculoForm v){
		Motor m=new Motor(Integer.parseInt(v.getCilindros()),Integer.parseInt(v.getPotencia()));
		Placa p=new Placa(v.getEstado(),v.getId(),v.getCor());
		int pesoKG =Integer.parseInt(v.getPesoKG());
		int numMaxPassagero = Integer.parseInt(v.getNumMaxPassagero());
		
		
		new Moto(m, p, pesoKG, numMaxPassagero);
		
		return 0;
	}
	public int cadastrarCarro(VeiculoForm v){
		Motor m=new Motor(Integer.parseInt(v.getCilindros()),Integer.parseInt(v.getPotencia()));
		Placa p=new Placa(v.getEstado(),v.getId(),v.getCor());
		int pesoKG =Integer.parseInt(v.getPesoKG());
		int numMaxPassagero = Integer.parseInt(v.getNumMaxPassagero());
		
		new Automovel(m, p, pesoKG, numMaxPassagero);
		return 0;
	}
	public int cadastrarCaminhao(VeiculoForm v){
		Motor m=new Motor(Integer.parseInt(v.getCilindros()),Integer.parseInt(v.getPotencia()));
		Placa p=new Placa(v.getEstado(),v.getId(),v.getCor());
		int pesoKG =Integer.parseInt(v.getPesoKG());
		int numMaxPassagero = Integer.parseInt(v.getNumMaxPassagero());
		
		Carroceria c =null; //= new Carroceria(comprimento, largura, altura, pesoKG)
		
		
		new Caminhao(m, p, pesoKG, numMaxPassagero, c);
		
		return 0;
	}
	

}
