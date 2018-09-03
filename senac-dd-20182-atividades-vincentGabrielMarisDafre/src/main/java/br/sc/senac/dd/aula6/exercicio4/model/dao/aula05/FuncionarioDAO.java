package br.sc.senac.dd.aula6.exercicio4.model.dao.aula05;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.sc.senac.dd.aula6.exercicio4.model.dao.BaseDAO;
import br.sc.senac.dd.aula6.exercicio4.model.vo.aula05.Funcionario;

public class FuncionarioDAO extends BaseDAO<Funcionario> {

	@Override
	public String getNomeTabela() {
		return "FUNCIONARIO";
	}

	@Override
	public String getNomeColunaChavePrimaria() {
		return "ID";
	}

	@Override
	public String getNomesColunasInsert() {
		return "NOME,MATRICULA,CPF";
	}

	@Override
	public String getInterrogacoesInsert() {
		return "?,?,?";
	}

	@Override
	public void setValoresAtributosInsert(Funcionario entidade, PreparedStatement preparedStmt) {
		try {
			preparedStmt.setString(1, entidade.getNome());
			preparedStmt.setString(2, entidade.getNumeroMatricula());
			preparedStmt.setString(3, entidade.getCpf());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getValoresClausulaSetUpdate(Funcionario entidade) {
		// SET NOME=func.getNome(), MATRICULA=func.getNumeroMatricula()...
		String clausulaSet = " NOME = ?, MATRICULA = ?, CPF = ?"; 
		
		return clausulaSet;
	}
	
	@Override
	public void setValoresAtributosUpdate(Funcionario entidade, PreparedStatement preparedStmt){
		//Preenche cada interrogação da cláusula SET
		try {
			preparedStmt.setString(1, entidade.getNome());
			preparedStmt.setString(2, entidade.getNumeroMatricula());
			preparedStmt.setString(3, entidade.getCpf());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Funcionario construirObjetoDoResultSet(ResultSet resultado) {
		
		Funcionario novoFuncionario = null; //retorna null caso o resultado esteja vazio
		try {
			novoFuncionario = new Funcionario();
			novoFuncionario.setIdFuncionario(resultado.getInt("ID"));
			novoFuncionario.setNome(resultado.getString("NOME"));
			novoFuncionario.setNumeroMatricula(resultado.getString("MATRICULA"));
			novoFuncionario.setCpf(resultado.getString("CPF"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return novoFuncionario;
	}

}
