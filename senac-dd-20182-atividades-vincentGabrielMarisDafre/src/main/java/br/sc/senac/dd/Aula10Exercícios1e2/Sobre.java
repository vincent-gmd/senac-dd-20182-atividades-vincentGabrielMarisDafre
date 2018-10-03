package br.sc.senac.dd.Aula10Exercícios1e2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblAutorVincent = new JLabel("autor: vincent");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblAutorVincent, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblAutorVincent, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblAutorVincent);
		
		JLabel lblInstituioSenac = new JLabel("instituição: SENAC");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblInstituioSenac, 6, SpringLayout.SOUTH, lblAutorVincent);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblInstituioSenac, 0, SpringLayout.WEST, lblAutorVincent);
		contentPane.add(lblInstituioSenac);
	}
}
