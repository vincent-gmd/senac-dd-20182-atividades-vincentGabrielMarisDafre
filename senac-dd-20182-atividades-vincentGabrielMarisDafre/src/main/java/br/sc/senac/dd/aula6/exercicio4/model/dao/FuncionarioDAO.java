package br.sc.senac.dd.aula6.exercicio4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;


public class FuncionarioDAO extends BaseDAO<FuncionarioVO> {
	
	@Override
	public String getNomeTabela() {
		
		return "Funcionario";
	}

	@Override
	public String getNomeColunaChavePrimaria() {
		
		return "idFuncionario";
	}

	@Override
	public String getNomesColunasInsert() {
		return "idFuncionario," + 
				"nome," + 
				"cpf," + 
				"telefone," + 
				"email";
	}

	@Override
	public String getInterrogacoesInsert() {
		return "?,?,?,?,?";
	}

	@Override
	public void setValoresAtributosInsert(FuncionarioVO entidade, PreparedStatement preparedStmt) {
		/**
		 * Exemplos:
		 * preparedStmt.setInt(1, entidade.getId());  
		 * preparedStmt.setString(2, entidade.getNome());
		 *  
		 */
		
	}

	@Override
	public String getValoresClausulaSetUpdate(FuncionarioVO entidade) {
		
		/**
		 * Exemplos:
		 * 
		 * String clausulaSet = "";
		 * clausulaSet = getNomeColunaChavePrimaria() " = " + entidade.getIdFuncionario() + ",";
		 * clausulaSet += "NOME ='" + entidade.getNome() + "'";
		 */
		
 		return null;
	}

	@Override
	public FuncionarioVO construirObjetoDoResultSet(ResultSet resultado) {
		
		
			FuncionarioVO FuncionarioVO = new FuncionarioVO();
			try {
				FuncionarioVO.setIdFuncionario(Integer.parseInt(resultado.getString(1)));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FuncionarioVO.setNome(resultado.getString(2));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FuncionarioVO.setCpf(resultado.getString(3));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FuncionarioVO.setTelefone(resultado.getString(4));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FuncionarioVO.setEmail(resultado.getString(5));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
	public void setValoresAtributosUpdate(FuncionarioVO entidade, PreparedStatement stmt) {
		// TODO Auto-generated method stub
		
	}
	
}