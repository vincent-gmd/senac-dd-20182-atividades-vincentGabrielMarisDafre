package br.sc.senac.dd.aula6.exercicio4.model.dao;

import java.util.ArrayList;

public class TableFuncionario {
	String name = "funcionario";
	ArrayList<Colum> a = new ArrayList<Colum>(); 
	public TableFuncionario() {
		super();
		a.add(new Colum( "int" ,"idFuncionario"));
		a.add(new Colum( "String", "nome"));
		a.add(new Colum( "String", "cpf"));
		a.add(new Colum( "String", "telefone"));
		a.add(new Colum( "String", "email"));
	}
	
	
	

}
