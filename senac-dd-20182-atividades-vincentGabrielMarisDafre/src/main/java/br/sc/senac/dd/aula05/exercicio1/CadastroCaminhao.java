package br.sc.senac.dd.aula05.exercicio1;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class CadastroCaminhao extends CadastroVeiculo {
	private JTextField txtCarroceriaPeso;
	private JTextField txtCarroceriaAltura;
	private JTextField txtCarroceriaLargura;
	private JTextField txtCarroceriaComprimento;



	public CadastroCaminhao() {
		super();
		GridBagLayout gridBagLayout = (GridBagLayout) getLayout();
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		
		txtCarroceriaPeso = new JTextField();
		txtCarroceriaPeso.setText("carroceria peso");
		GridBagConstraints gbc_txtCarroceriaPeso = new GridBagConstraints();
		gbc_txtCarroceriaPeso.insets = new Insets(0, 0, 5, 0);
		gbc_txtCarroceriaPeso.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCarroceriaPeso.gridx = 5;
		gbc_txtCarroceriaPeso.gridy = 1;
		add(txtCarroceriaPeso, gbc_txtCarroceriaPeso);
		txtCarroceriaPeso.setColumns(10);
		
		txtCarroceriaAltura = new JTextField();
		txtCarroceriaAltura.setText("carroceria altura");
		GridBagConstraints gbc_txtCarroceriaAltura = new GridBagConstraints();
		gbc_txtCarroceriaAltura.insets = new Insets(0, 0, 5, 0);
		gbc_txtCarroceriaAltura.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCarroceriaAltura.gridx = 5;
		gbc_txtCarroceriaAltura.gridy = 2;
		add(txtCarroceriaAltura, gbc_txtCarroceriaAltura);
		txtCarroceriaAltura.setColumns(10);
		
		txtCarroceriaLargura = new JTextField();
		txtCarroceriaLargura.setText("carroceria largura");
		GridBagConstraints gbc_txtCarroceriaLargura = new GridBagConstraints();
		gbc_txtCarroceriaLargura.insets = new Insets(0, 0, 5, 0);
		gbc_txtCarroceriaLargura.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCarroceriaLargura.gridx = 5;
		gbc_txtCarroceriaLargura.gridy = 3;
		add(txtCarroceriaLargura, gbc_txtCarroceriaLargura);
		txtCarroceriaLargura.setColumns(10);
		
		txtCarroceriaComprimento = new JTextField();
		txtCarroceriaComprimento.setText("carroceria comprimento");
		GridBagConstraints gbc_txtCarroceriaComprimento = new GridBagConstraints();
		gbc_txtCarroceriaComprimento.insets = new Insets(0, 0, 5, 0);
		gbc_txtCarroceriaComprimento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCarroceriaComprimento.gridx = 5;
		gbc_txtCarroceriaComprimento.gridy = 4;
		add(txtCarroceriaComprimento, gbc_txtCarroceriaComprimento);
		txtCarroceriaComprimento.setColumns(10);
		// TODO Auto-generated constructor stub
		
	}
	
	

}
