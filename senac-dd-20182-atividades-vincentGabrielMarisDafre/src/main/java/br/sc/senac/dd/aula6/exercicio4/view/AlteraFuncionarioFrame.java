package br.sc.senac.dd.aula6.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlteraFuncionarioFrame extends CadastraFuncionarioFrame {

	private JTextField txtIdfuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteraFuncionarioFrame frame = new AlteraFuncionarioFrame();
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
	public AlteraFuncionarioFrame() {
		btnCadastrar.setText("alterar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JLabel lblIdFuncionario = new JLabel("id funcionario");
		getContentPane().add(lblIdFuncionario, "2, 2, right, default");
		
		txtIdfuncionario = new JTextField();
		txtIdfuncionario.setText("idFuncionario");
		getContentPane().add(txtIdfuncionario, "4, 2, fill, default");
		txtIdfuncionario.setColumns(10);
		
		JButton btnBuscarPorId = new JButton("buscar por id");
		btnBuscarPorId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarPorId();
			}
		});
		getContentPane().add(btnBuscarPorId, "6, 2");
		
		JButton btnBuscarPorCpf = new JButton("buscar por cpf");
		btnBuscarPorCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarPorCpf();
			}
		});
		getContentPane().add(btnBuscarPorCpf, "6, 6");
		
	}
	
	protected void buscarPorCpf() {
		// TODO Auto-generated method stub
		
	}

	protected void buscarPorId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void inserir() {
		// TODO Auto-generated method stub
		
	}

}
