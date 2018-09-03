package br.sc.senac.dd.aula6.exercicio4.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import br.sc.senac.dd.aula6.exercicio4.model.bo.FuncionarioBO;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;

/**
 * Classe criada na disciplina de POO (2018/1)
 * @author Adriano de Melo
 *
 */
public class ControladorFuncionario {

	public void cadastrarColecionadorController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		funcionarioBO.cadastrarColecionadorBO(funcionarioVO);
	}

	public void excluirColecionadorController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		funcionarioBO.excluirColecionadorBO(funcionarioVO);
	}

	public void atualizarColecionadorController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		funcionarioBO.atualizarColecionadorBO(funcionarioVO);
	}

	public ArrayList<FuncionarioVO> consultarTodosColecionadoresController() throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		return funcionarioBO.consultarColecionadoresBO();
	}

	public FuncionarioVO consultarColecionadorController(FuncionarioVO funcionarioVO) throws SQLException {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		return funcionarioBO.consultarColecionadorBO(funcionarioVO);
	}

}
