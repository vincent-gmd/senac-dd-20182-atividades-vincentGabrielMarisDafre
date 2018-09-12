package br.sc.senac.dd.aula6.exercicio4.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.sc.senac.dd.aula6.exercicio4.util.Table;
import br.sc.senac.dd.aula6.exercicio4.util.TableFuncionario;

public abstract class BaseDAO_Tables<T> extends BaseDAO<T>{

	protected  Table table;
	public Table getTable(){
		return table;	
	}
	public void setTable(Table table){
		this.table =table;	
	}
	public BaseDAO_Tables(Table table) {
		this.table =table;
	}
	public BaseDAO_Tables() {

	}

	@Override
	public String getNomeTabela() {
		return getTable().getName();

	}

	@Override
	public String getNomeColunaChavePrimaria() {
		return getTable().getColums().get(0).getName();
	}

	@Override
	public String getNomesColunasInsert() {
		String s= "";
		
		for(int i=1;i<getTable().getColums().size();i++) {
			s= s+getTable().getColums().get(i).getName();
			
			if((i+1)!=getTable().getColums().size()) {
				s=s+",";
			}
		}
		
		return s;
	}

	@Override
	public String getInterrogacoesInsert() {
		String s= "";
		for(int i=1;i<getTable().getColums().size();i++) {
			s= s+"?";
			
			if((i+1)<getTable().getColums().size()) {
				s=s+",";
			}
		}
		
		return s;
	}

	@Override
	public void setValoresAtributosInsert(T entidade, PreparedStatement preparedStmt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getValoresClausulaSetUpdate(T entidade) {
		// TODO Auto-generated method stub
		String clausulaSet = "";
		for(int i=0;i<getTable().getColums().size();i++) {
			clausulaSet += getTable().getColums().get(i).getName()+" =  ?";
					if((i+1)<getTable().getColums().size()) {
						clausulaSet+=",";
					}
		}	
		return clausulaSet;
	}

	@Override
	public void setValoresAtributosUpdate(T entidade, PreparedStatement stmt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public T construirObjetoDoResultSet(ResultSet resultado) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
