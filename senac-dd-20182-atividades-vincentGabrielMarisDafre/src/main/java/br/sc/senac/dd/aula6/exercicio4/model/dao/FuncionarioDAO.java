package br.sc.senac.dd.aula6.exercicio4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;
import br.sc.senac.dd.aula6.exercicio4.util.Table;
import br.sc.senac.dd.aula6.exercicio4.util.TableFuncionario;


public class FuncionarioDAO extends BaseDAO<FuncionarioVO> {
	Table table ;
	public Table getTable(){
		if(table==null){
			table = new TableFuncionario();
		}
		return table;
		
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
	public void setValoresAtributosInsert(FuncionarioVO entidade, PreparedStatement preparedStmt) throws SQLException {		
		
			
				preparedStmt.setString(1, entidade.getNome());
			
				preparedStmt.setString(2, entidade.getCpf());
			
				preparedStmt.setString(3, entidade.getTelefone());
			
				preparedStmt.setString(4, entidade.getEmail());
	}

	@Override
	public String getValoresClausulaSetUpdate(FuncionarioVO entidade) {
		
		String clausulaSet = "";
		 	clausulaSet = getNomeColunaChavePrimaria() +" = " + entidade.getIdFuncionario() + ",";
		 	clausulaSet += getTable().getColums().get(1).getName()+" ='" + entidade.getNome() + "',";
		 	clausulaSet += getTable().getColums().get(2).getName()+" ='" + entidade.getCpf() + "',";
		 	clausulaSet += getTable().getColums().get(3).getName()+" ='" + entidade.getEmail() + "',";
		 	clausulaSet += getTable().getColums().get(4).getName()+" ='" + entidade.getTelefone() + "'";
		 
		
 		return clausulaSet;
	}

	@Override
	public FuncionarioVO construirObjetoDoResultSet(ResultSet resultado) throws SQLException {
		
		
			FuncionarioVO FuncionarioVO = new FuncionarioVO();
		
				FuncionarioVO.setIdFuncionario(resultado.getInt(1));
			
				FuncionarioVO.setNome(resultado.getString(2));
			
				FuncionarioVO.setCpf(resultado.getString(3));
			
				FuncionarioVO.setTelefone(resultado.getString(4));
			
				FuncionarioVO.setEmail(resultado.getString(5));
			
			
		return FuncionarioVO;
	}

	public Boolean existeRegistroPorCpf(String cpf) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		String query = "SELECT * FROM Funcionario WHERE cpf like '" + cpf + "'";
		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next()){
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que verifica existência de Funcionario por CPF.");
			return null;
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return false;
	}

	public boolean existeRegistroPorIdFuncionario(int idFuncionario) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		String query = "SELECT * FROM Funcionario WHERE idFuncionario = " + idFuncionario;
		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next()){
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que verifica existência de Registro por Id.");
			return false;
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return false;
	}

	@Override
	public void setValoresAtributosUpdate(FuncionarioVO entidade, PreparedStatement stmt) throws SQLException {
	
			 stmt.setInt(1, entidade.getIdFuncionario());
			
				 stmt.setString(2, entidade.getNome());
			
				 stmt.setString(3, entidade.getCpf());
		
				 stmt.setString(4, entidade.getTelefone());
			
				 stmt.setString(5, entidade.getEmail());
			
			
	}
	
}