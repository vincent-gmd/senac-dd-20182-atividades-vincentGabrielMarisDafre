package br.sc.senac.dd.aula6.exercicio4.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import br.sc.senac.dd.aula6.exercicio4.model.bo.FuncionarioBO;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;

public class ControladorFuncionario {

	public void cadastrarFuncionarioController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		funcionarioBO.cadastrarFuncionarioBO(funcionarioVO);
	}

	public void excluirFuncionarioController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		funcionarioBO.excluirFuncionarioBO(funcionarioVO);
	}

	public void atualizarFuncionarioController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		funcionarioBO.atualizarFuncionarioBO(funcionarioVO);
	}

	public ArrayList<FuncionarioVO> consultarTodosFuncionariosController() throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		return funcionarioBO.consultarFuncionariosBO();
	}

	public FuncionarioVO consultarFuncionarioController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		return funcionarioBO.consultarFuncionarioBO(funcionarioVO);
	}
	public FuncionarioVO consultarFuncionarioPorCPFController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		return funcionarioBO.consultarFuncionarioBO(funcionarioVO);
	}

}
