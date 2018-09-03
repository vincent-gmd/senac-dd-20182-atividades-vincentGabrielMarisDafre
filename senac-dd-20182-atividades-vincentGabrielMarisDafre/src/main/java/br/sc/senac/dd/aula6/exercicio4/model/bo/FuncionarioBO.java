package br.sc.senac.dd.aula6.exercicio4.model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.sc.senac.dd.aula6.exercicio4.model.dao.ColecionadorDAO;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;

/**
 * Classe criada na disciplina de POO (2018/1)
 * @author Adriano de Melo
 *
 */
public class FuncionarioBO {

	public void cadastrarColecionadorBO(FuncionarioVO colecionadorVO) throws SQLException {
		ColecionadorDAO colecionadorDAO = new ColecionadorDAO();
		if(colecionadorDAO.existeRegistroPorCpf(colecionadorVO.getCpf())){
			System.out.println("\nColecionador já Cadastrado");
		} else {
			int idColecionador = colecionadorDAO.inserir(colecionadorVO);
			if(idColecionador > 0){
				System.out.println("\nColecionador cadastrado com Sucesso.");
			} else {
				System.out.println("\nNão foi possível cadastrar o Colecionador.");
			}
		}
	}

	public void excluirColecionadorBO(FuncionarioVO colecionadorVO) throws SQLException {
		ColecionadorDAO colecionadorDAO = new ColecionadorDAO();
		if(colecionadorDAO.existeRegistroPorIdColecionador(colecionadorVO.getIdFuncionario())){
			boolean excluiuColecionador = colecionadorDAO.excluir(colecionadorVO.getIdFuncionario());
			if(excluiuColecionador){
				System.out.println("\nColecionador excluído com Sucesso.");
			} else {
				System.out.println("\nNão foi possível excluir o Colecionador.");
			}
		} else {
			System.out.println("\nColecionador não existe na base da dados.");
		}
	}

	public void atualizarColecionadorBO(FuncionarioVO colecionadorVO) throws SQLException {
		ColecionadorDAO colecionadorDAO = new ColecionadorDAO();
		if(colecionadorDAO.existeRegistroPorIdColecionador(colecionadorVO.getIdFuncionario())){
			boolean sucessoUpdate = colecionadorDAO.atualizar(colecionadorVO, colecionadorVO.getIdFuncionario());
			if(sucessoUpdate){
				System.out.println("\nColecionador atualizado com Sucesso.");
			} else {
				System.out.println("\nNão foi possível atualizar o Colecionador.");
			}
		} else {
			System.out.println("\nColecionador ainda não foi cadastrado.");
		}
	}
	
	public ArrayList<FuncionarioVO> consultarColecionadoresBO() throws SQLException {
		ColecionadorDAO colecionadorDAO = new ColecionadorDAO();
		ArrayList<FuncionarioVO> colecionadoresVO = (ArrayList<FuncionarioVO>) colecionadorDAO.listarTodos();
		if(colecionadoresVO.isEmpty()){
			System.out.println("\nLista de Colecionador não Localizada.");
		}
		return colecionadoresVO;
	}

	public FuncionarioVO consultarColecionadorBO(FuncionarioVO colecionadorVO) throws SQLException {
		ColecionadorDAO colecionadorDAO = new ColecionadorDAO();
		FuncionarioVO colecionador = colecionadorDAO.pesquisarPorId(colecionadorVO.getIdFuncionario());
		if(colecionador == null){
			System.out.println("\nColecionador não Localizado.");
		}
		return colecionador;
	}

}
