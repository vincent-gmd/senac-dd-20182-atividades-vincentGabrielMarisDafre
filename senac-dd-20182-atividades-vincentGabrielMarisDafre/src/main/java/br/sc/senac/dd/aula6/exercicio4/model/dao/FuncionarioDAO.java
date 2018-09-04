package br.sc.senac.dd.aula6.exercicio4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;


public class FuncionarioDAO extends BaseDAO<FuncionarioVO> {
	TableFuncionario table ;
	public TableFuncionario getTable(){
		if(table==null){
			table = new TableFuncionario();
		}
		return table;
		
	}
	
	@Override
	public String getNomeTabela() {
		
		return getTable().name;
	}

	@Override
	public String getNomeColunaChavePrimaria() {
		
		return getTable().colums.get(0).getName();
	}

	@Override
	public String getNomesColunasInsert() {
		String s= "";
		
		for(int i=0;i<getTable().colums.size();i++) {
			s= s+getTable().colums.get(i).getName();
			
			if((i+1)!=getTable().colums.size()) {
				s=s+",";
			}
		}
		
		return s;
	}

	@Override
	public String getInterrogacoesInsert() {
		
		String s= "";
		for(int i=0;i<getTable().colums.size();i++) {
			s= s+"?";
			
			if((i+1)!=getTable().colums.size()) {
				s=s+",";
			}
		}
		
		return s;
	}

	@Override
	public void setValoresAtributosInsert(FuncionarioVO entidade, PreparedStatement preparedStmt) {		
		
			 try {
				preparedStmt.setString(2, entidade.getNome());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				preparedStmt.setString(3, entidade.getCpf());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				preparedStmt.setString(4, entidade.getTelefone());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				preparedStmt.setString(5, entidade.getEmail());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
		
	}

	@Override
	public String getValoresClausulaSetUpdate(FuncionarioVO entidade) {
		
		String clausulaSet = "";
		 	clausulaSet = getNomeColunaChavePrimaria() +" = " + entidade.getIdFuncionario() + ",";
		 	clausulaSet += getTable().colums.get(1)+" ='" + entidade.getNome() + ",";
		 	clausulaSet += getTable().colums.get(2)+" ='" + entidade.getCpf() + ",";
		 	clausulaSet += getTable().colums.get(3)+" ='" + entidade.getEmail() + ",";
		 	clausulaSet += getTable().colums.get(4)+" ='" + entidade.getTelefone() + "'";
		 
		
 		return clausulaSet;
	}

	@Override
	public FuncionarioVO construirObjetoDoResultSet(ResultSet resultado) {
		
		
			FuncionarioVO FuncionarioVO = new FuncionarioVO();
			try {
				FuncionarioVO.setIdFuncionario(resultado.getInt(1));
			}catch (SQLException e) {
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
		 try {
			 stmt.setInt(1, entidade.getIdFuncionario());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			 try {
				 stmt.setString(2, entidade.getNome());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				 stmt.setString(3, entidade.getCpf());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				 stmt.setString(4, entidade.getTelefone());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				 stmt.setString(5, entidade.getEmail());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 		
	}
	
}