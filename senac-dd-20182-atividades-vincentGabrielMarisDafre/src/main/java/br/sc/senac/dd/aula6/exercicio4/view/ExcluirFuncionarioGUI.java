package br.sc.senac.dd.aula6.exercicio4.view;

import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;

import br.sc.senac.dd.aula6.exercicio4.controller.ControladorFuncionario;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;


public class ExcluirFuncionarioGUI extends AlteraFuncionarioGUI {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4592466520661309139L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirFuncionarioGUI frame = new ExcluirFuncionarioGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExcluirFuncionarioGUI() {
		setTitle("Exclusao de Funcinario");
		btnCadastrar.setText("excluir");
		setBounds(100, 100, 566, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	@Override
	protected void inserir() {
		ControladorFuncionario controladorFuncionario= new ControladorFuncionario();
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		funcionarioVO.setIdFuncionario(Integer.parseInt(txtIdfuncionario.getText()) );
		funcionarioVO.setCpf(txtCpf.getText());
		funcionarioVO.setEmail(txtEmail.getText());
		funcionarioVO.setNome(txtNome.getText());
		funcionarioVO.setTelefone(txtTelefone.getText());

		try {
			controladorFuncionario.excluirFuncionarioController(funcionarioVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
