package br.sc.senac.dd.aula6.exercicio4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.sc.senac.dd.aula6.exercicio4.util.Colum;
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
	public String getValoresClausulaSetUpdate() {
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
	public String getValoresClausulaWhere(ArrayList<Colum> colums) {
		// TODO Auto-generated method stub
		String clausulaSet = "where ";
		for(int i=0;i<colums.size();i++) {
			
			clausulaSet += colums.get(i).getName()+" =  ?";
					if((i+1)<colums.size()) {
						clausulaSet+=",";
					}
		}	
		return clausulaSet;
	}
	public String getValoresClausulaWhereLike(ArrayList<Colum> colums) {
		// TODO Auto-generated method stub
		String clausulaSet = "where ";
		for(int i=0;i<colums.size();i++) {
			
			clausulaSet += colums.get(i).getName()+" like  ?";
					if((i+1)<colums.size()) {
						clausulaSet+=",";
					}
		}	
		return clausulaSet;
	}
	
	

	@Override
	public T construirObjetoDoResultSet(ResultSet resultado) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public List<T> listarTodosWhere(ArrayList<Colum> colums ,ArrayList<Object> values) throws SQLException{
		String sql = "SELECT * FROM " + getNomeTabela()+getValoresClausulaWhere(colums);
		

		Connection conn = Banco.getConnection();
		PreparedStatement stmt = Banco.getPreparedStatement(conn, sql);
		ResultSet resultado = null;
		ArrayList<T> listaEntidades = new ArrayList<T>();
		
		try{
			this.setValoresAtributosWhere(colums, values, stmt);
			resultado = stmt.executeQuery(sql);
			while(resultado.next()){
				T objetoConsultado = construirObjetoDoResultSet(resultado);
				listaEntidades.add(objetoConsultado);
			}
		} catch (SQLException e){
			System.out.println("Erro ao consultar todos os objetos da entidade " + this.getClass().toString());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return listaEntidades;
	}
	public void setValoresAtributosWhere(ArrayList<Colum> colums ,ArrayList<Object> values,PreparedStatement stmt) throws SQLException{
		for(int i =0;i<values.size();i++) {
			switch (colums.get(i).getType()) {
			case value:
				
				
			
				break;

			default:
				break;
			}
			stmt.setString(i, values.toString());
		}
				

	}
						

}
