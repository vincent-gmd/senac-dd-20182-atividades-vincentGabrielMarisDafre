package br.sc.senac.dd.aula05.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectCadastro extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectCadastro frame = new SelectCadastro();
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
	public SelectCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnCadastrarMoto = new JButton("cadastrar moto");
		btnCadastrarMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroFrame.open(1);
			}
		});
		GridBagConstraints gbc_btnCadastrarMoto = new GridBagConstraints();
		gbc_btnCadastrarMoto.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrarMoto.gridx = 1;
		gbc_btnCadastrarMoto.gridy = 1;
		contentPane.add(btnCadastrarMoto, gbc_btnCadastrarMoto);
		
		JButton btnCadastrarCarro = new JButton("cadastrar carro");
		btnCadastrarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFrame.open(2);
			}
		});
		GridBagConstraints gbc_btnCadastrarCarro = new GridBagConstraints();
		gbc_btnCadastrarCarro.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrarCarro.gridx = 1;
		gbc_btnCadastrarCarro.gridy = 2;
		contentPane.add(btnCadastrarCarro, gbc_btnCadastrarCarro);
		
		JButton btnCadastrarCaminhao = new JButton("cadastrar caminhão");
		btnCadastrarCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFrame.open(3);
			}
		});
		GridBagConstraints gbc_btnCadastrarCaminhao = new GridBagConstraints();
		gbc_btnCadastrarCaminhao.gridx = 1;
		gbc_btnCadastrarCaminhao.gridy = 3;
		contentPane.add(btnCadastrarCaminhao, gbc_btnCadastrarCaminhao);
	}

}
