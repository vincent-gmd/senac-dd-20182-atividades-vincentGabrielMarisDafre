package br.sc.senac.dd.aula6.exercicio4.model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.sc.senac.dd.aula6.exercicio4.model.dao.FuncionarioDAO;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;


public class FuncionarioBO {

	public void cadastrarFuncionarioBO(FuncionarioVO FuncionarioVO) throws SQLException {
		FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
		if(FuncionarioDAO.existeRegistroPorCpf(FuncionarioVO.getCpf())){
			System.out.println("\nFuncionario já Cadastrado");
		} else {
			int idFuncionario = FuncionarioDAO.inserir(FuncionarioVO);
			if(idFuncionario > 0){
				System.out.println("\nFuncionario cadastrado com Sucesso.");
			} else {
				System.out.println("\nNão foi possível cadastrar o Funcionario.");
			}
		}
	}

	public void excluirFuncionarioBO(FuncionarioVO FuncionarioVO) throws SQLException {
		FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
		if(FuncionarioDAO.existeRegistroPorIdFuncionario(FuncionarioVO.getIdFuncionario())){
			boolean excluiuFuncionario = FuncionarioDAO.excluir(FuncionarioVO.getIdFuncionario());
			if(excluiuFuncionario){
				System.out.println("\nFuncionario excluído com Sucesso.");
			} else {
				System.out.println("\nNão foi possível excluir o Funcionario.");
			}
		} else {
			System.out.println("\nFuncionario não existe na base da dados.");
		}
	}

	public void atualizarFuncionarioBO(FuncionarioVO FuncionarioVO) throws SQLException {
		FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
		if(FuncionarioDAO.existeRegistroPorIdFuncionario(FuncionarioVO.getIdFuncionario())){
			boolean sucessoUpdate = FuncionarioDAO.atualizar(FuncionarioVO, FuncionarioVO.getIdFuncionario());
			if(sucessoUpdate){
				System.out.println("\nFuncionario atualizado com Sucesso.");
			} else {
				System.out.println("\nNão foi possível atualizar o Funcionario.");
			}
		} else {
			System.out.println("\nFuncionario ainda não foi cadastrado.");
		}
	}
	
	public ArrayList<FuncionarioVO> consultarFuncionarioesBO() throws SQLException {
		FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
		ArrayList<FuncionarioVO> FuncionarioesVO = (ArrayList<FuncionarioVO>) FuncionarioDAO.listarTodos();
		if(FuncionarioesVO.isEmpty()){
			System.out.println("\nLista de Funcionario não Localizada.");
		}
		return FuncionarioesVO;
	}

	public FuncionarioVO consultarFuncionarioBO(FuncionarioVO FuncionarioVO) throws SQLException {
		FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
		FuncionarioVO Funcionario = FuncionarioDAO.pesquisarPorId(FuncionarioVO.getIdFuncionario());
		if(Funcionario == null){
			System.out.println("\nFuncionario não Localizado.");
		}
		return Funcionario;
	}

}
