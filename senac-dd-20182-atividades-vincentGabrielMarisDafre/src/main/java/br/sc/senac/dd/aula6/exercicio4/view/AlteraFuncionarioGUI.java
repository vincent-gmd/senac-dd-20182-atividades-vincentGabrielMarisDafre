package br.sc.senac.dd.aula6.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.sc.senac.dd.aula6.exercicio4.controller.ControladorFuncionario;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AlteraFuncionarioGUI extends CadastraFuncionarioGUI {

	protected JTextField txtIdfuncionario;
	JButton btnBuscarPorCpf;
	JButton btnBuscarPorId;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteraFuncionarioGUI frame = new AlteraFuncionarioGUI();
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
	public AlteraFuncionarioGUI() {
		super();
		setTitle("Atualizaçao de Funcinario");
		btnCadastrar.setText("Atualizar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 300);
		
		JLabel lblIdFuncionario = new JLabel("id funcionario");
		getContentPane().add(lblIdFuncionario, "2, 2, right, default");
		
		txtIdfuncionario = new JTextField();
		txtIdfuncionario.setText("idFuncionario");
		getContentPane().add(txtIdfuncionario, "4, 2, fill, default");
		txtIdfuncionario.setColumns(10);
		
		btnBuscarPorId = new JButton("buscar por id");
		btnBuscarPorId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarPorId();
			}
		});
		getContentPane().add(btnBuscarPorId, "6, 2");
		
		btnBuscarPorCpf = new JButton("buscar por cpf");
		btnBuscarPorCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarPorCpf();
			}
		});
		getContentPane().add(btnBuscarPorCpf, "6, 6");
		
	}
	
	protected void buscarPorCpf() {
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		ControladorFuncionario controladorFuncionario= new ControladorFuncionario();
		funcionarioVO.setCpf(txtCpf.getText());

	}

	protected void buscarPorId() {
		ControladorFuncionario controladorFuncionario= new ControladorFuncionario();
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		funcionarioVO.setIdFuncionario(Integer.parseInt(txtIdfuncionario.getText()) );
		try {
			controladorFuncionario.consultarFuncionarioController(funcionarioVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
			controladorFuncionario.atualizarFuncionarioController(funcionarioVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
