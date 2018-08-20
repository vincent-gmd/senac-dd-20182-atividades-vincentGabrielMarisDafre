package br.sc.senac.dd.aula05.exercicio1.controler;

import br.sc.senac.dd.aula04.exercicio.Automovel;
import br.sc.senac.dd.aula04.exercicio.Caminhao;
import br.sc.senac.dd.aula04.exercicio.Carroceria;
import br.sc.senac.dd.aula04.exercicio.Moto;
import br.sc.senac.dd.aula04.exercicio.Motor;
import br.sc.senac.dd.aula04.exercicio.Placa;
import br.sc.senac.dd.aula05.exercicio1.model.CaminhaoForm;
import br.sc.senac.dd.aula05.exercicio1.model.VeiculoForm;

public class CadastroCarroControler {
	
	public int cadastrarVeiculo(int tipo,VeiculoForm f){
		switch (tipo) {
		case 1:
			cadastrarMoto(f);
			break;
		case 2:
			cadastrarCarro(f);
			break;

		default:
			return -1;
		}
		
		
		
		
		return 0;

	}
	public int cadastrarMoto(VeiculoForm f){
		Motor m=new Motor(Integer.parseInt(f.getCilindros()),Integer.parseInt(f.getPotencia()));
		Placa p=new Placa(f.getEstado(),f.getId(),f.getCor());
		int pesoKG =Integer.parseInt(f.getPesoKG());
		int numMaxPassagero = Integer.parseInt(f.getNumMaxPassagero());
		
		
		new Moto(m, p, pesoKG, numMaxPassagero);
		
		return 0;
	}
	public int cadastrarCarro(VeiculoForm f){
		Motor m=new Motor(Integer.parseInt(f.getCilindros()),Integer.parseInt(f.getPotencia()));
		Placa p=new Placa(f.getEstado(),f.getId(),f.getCor());
		int pesoKG =Integer.parseInt(f.getPesoKG());
		int numMaxPassagero = Integer.parseInt(f.getNumMaxPassagero());
		
		new Automovel(m, p, pesoKG, numMaxPassagero);
		return 0;
	}
	public int cadastrarCaminhao(CaminhaoForm f){
		Motor m=new Motor(Integer.parseInt(f.getCilindros()),Integer.parseInt(f.getPotencia()));
		Placa p=new Placa(f.getEstado(),f.getId(),f.getCor());
		int pesoKG =Integer.parseInt(f.getPesoKG());
		int numMaxPassagero = Integer.parseInt(f.getNumMaxPassagero());
		
		Carroceria c =new Carroceria(Integer.parseInt(f.getComprimento()), Integer.parseInt(f.getLargura()), Integer.parseInt(f.getAltura()), Integer.parseInt(f.getPesoKGCarroceria() ) );//= new Carroceria(comprimento, largura, altura, pesoKG)
		
		new Caminhao(m, p, pesoKG, numMaxPassagero, c);
		
		return 0;
	}
	

}
