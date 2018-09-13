package br.sc.senac.dd.aula6.exercicio4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;
import br.sc.senac.dd.aula6.exercicio4.util.TableFuncionario;


public class FuncionarioDAO extends BaseDAO_Tables<FuncionarioVO> {
	
	public FuncionarioDAO(){
		setTable(new TableFuncionario()); 
	}
	
	@Override
	public void setValoresAtributosInsert(FuncionarioVO entidade, PreparedStatement preparedStmt) throws SQLException {		
				preparedStmt.setString(1, entidade.getNome());
				preparedStmt.setString(2, entidade.getCpf());
				preparedStmt.setString(3, entidade.getTelefone());
				preparedStmt.setString(4, entidade.getEmail());
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
	@Override
	public void setValoresAtributosUpdate(FuncionarioVO entidade, PreparedStatement stmt) throws SQLException {
	
			 	stmt.setInt(1, entidade.getIdFuncionario());
				stmt.setString(2, entidade.getNome());			
				stmt.setString(3, entidade.getCpf());		
				stmt.setString(4, entidade.getTelefone());
				stmt.setString(5, entidade.getEmail());
	}

	public Boolean existeRegistroPorCpf(String cpf) {
		Connection conn = Banco.getConnection();
		
		ResultSet resultado = null;
		String query = "SELECT * FROM Funcionario WHERE cpf like ?";
		PreparedStatement stmt = Banco.getPreparedStatement(conn, query);
		try {
			stmt.setString(1, cpf);
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
	public FuncionarioVO pesquisarPorCpf(String cpf) {
		Connection conn = Banco.getConnection();
		ResultSet resultado = null;
		String query = "SELECT * FROM Funcionario WHERE cpf like ?";
		PreparedStatement stmt = Banco.getPreparedStatement(conn, query);
	
		try {
			stmt.setString(1, cpf);
			resultado  = stmt.executeQuery();
			if (resultado.next()){
				FuncionarioVO funcionarioVO= construirObjetoDoResultSet(resultado);
				return  funcionarioVO ;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que busca Funcionario por CPF.");
			return null;
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return null;
	}

	public boolean existeRegistroPorIdFuncionario(int idFuncionario) {
		Connection conn = Banco.getConnection();
		ResultSet resultado = null;
		String query = "SELECT * FROM Funcionario WHERE idFuncionario = ?";
		PreparedStatement stmt = Banco.getPreparedStatement(conn, query);
		try {
			stmt.setInt(1, idFuncionario);
			resultado  = stmt.executeQuery();
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


	
}