package br.sc.senac.dd.aula6.exercicio4.model.dao;

import java.util.ArrayList;

public class TableFuncionario {
	String name = "funcionario";
	ArrayList<Colum> colums = new ArrayList<Colum>(); 
	public TableFuncionario() {
		super();
		colums.add(new Colum( "int" ,"idFuncionario"));
		colums.add(new Colum( "String", "nome"));
		colums.add(new Colum( "String", "cpf"));
		colums.add(new Colum( "String", "telefone"));
		colums.add(new Colum( "String", "email"));
	}
	
	
	

}
