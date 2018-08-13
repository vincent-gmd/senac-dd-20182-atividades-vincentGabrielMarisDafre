package br.sc.senac.dd.aula05.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CadastroFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void open(int tipo) {
		final int t=tipo;
		switch (tipo) {
		case 0:
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CadastroFrame frame = new CadastroFrame();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			break;
		default:
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CadastroFrame frame = new CadastroFrame(t);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			break;
		}
		
	
	}



	/**
	 * Create the frame.
	 */
	public CadastroFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new CadastroVeiculo();
		setContentPane(contentPane);
	}
	public CadastroFrame(int tipo) {
		if(tipo==1 || tipo==2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new CadastroVeiculo(tipo);
		setContentPane(contentPane);
		}
		if(tipo==3) {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 600, 300);
			contentPane = new CadastroCaminhao();
			setContentPane(contentPane);
		}
	}

}
