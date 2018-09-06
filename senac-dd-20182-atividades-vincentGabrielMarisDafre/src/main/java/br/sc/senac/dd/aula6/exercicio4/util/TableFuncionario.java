package br.sc.senac.dd.aula6.exercicio4.util;

public class TableFuncionario extends Table{
 
	public TableFuncionario() {
		super();
		colums.add(new Colum( "int" ,"idFuncionario"));
		colums.add(new Colum( "String", "nome"));
		colums.add(new Colum( "String", "cpf"));
		colums.add(new Colum( "String", "telefone"));
		colums.add(new Colum( "String", "email"));
		name = "funcionario";
		
		
	}

}
