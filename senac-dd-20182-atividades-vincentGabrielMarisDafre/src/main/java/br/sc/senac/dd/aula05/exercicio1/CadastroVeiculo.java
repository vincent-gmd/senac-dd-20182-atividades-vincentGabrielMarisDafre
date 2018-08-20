package br.sc.senac.dd.aula05.exercicio1;

import javax.swing.JPanel;

import br.sc.senac.dd.aula05.exercicio1.controler.CadastroVeiculoControler;
import br.sc.senac.dd.aula05.exercicio1.model.VeiculoForm;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;

public class CadastroVeiculo extends JPanel {
	private JTextField textField_cilindros;
	private JTextField textField_potencia;
	private JTextField textField_estado;
	private JTextField textField_placaId;
	private JTextField textField_placaCor;
	private JTextField textField_pesoGK;
	private JTextField textField_maxPassageros;
	protected VeiculoForm f;	
	private int tipo =0;
	
	
	/**
	 * Create the panel.
	 */
	
	public CadastroVeiculo(int tipo) {
		this.tipo=tipo;
		initialize();
	}
	public CadastroVeiculo() {
		initialize();
	}
	void initialize() {
	
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 140, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("motor cilindros");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		textField_cilindros = new JTextField();
		GridBagConstraints gbc_textField_cilindros = new GridBagConstraints();
		gbc_textField_cilindros.gridwidth = 2;
		gbc_textField_cilindros.insets = new Insets(0, 0, 5, 5);
		gbc_textField_cilindros.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_cilindros.gridx = 2;
		gbc_textField_cilindros.gridy = 1;
		add(textField_cilindros, gbc_textField_cilindros);
		textField_cilindros.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("motor potencia");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_potencia = new JTextField();
		GridBagConstraints gbc_textField_potencia = new GridBagConstraints();
		gbc_textField_potencia.gridwidth = 2;
		gbc_textField_potencia.insets = new Insets(0, 0, 5, 5);
		gbc_textField_potencia.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_potencia.gridx = 2;
		gbc_textField_potencia.gridy = 2;
		add(textField_potencia, gbc_textField_potencia);
		textField_potencia.setColumns(10);
		
		JLabel lblNewLabel_estado = new JLabel("estado da placa");
		GridBagConstraints gbc_lblNewLabel_estado = new GridBagConstraints();
		gbc_lblNewLabel_estado.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_estado.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_estado.gridx = 1;
		gbc_lblNewLabel_estado.gridy = 3;
		add(lblNewLabel_estado, gbc_lblNewLabel_estado);
		
		textField_estado = new JTextField();
		GridBagConstraints gbc_textField_estado = new GridBagConstraints();
		gbc_textField_estado.gridwidth = 2;
		gbc_textField_estado.insets = new Insets(0, 0, 5, 5);
		gbc_textField_estado.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_estado.gridx = 2;
		gbc_textField_estado.gridy = 3;
		add(textField_estado, gbc_textField_estado);
		textField_estado.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("placa");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 4;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_placaId = new JTextField();
		GridBagConstraints gbc_textField_placaId = new GridBagConstraints();
		gbc_textField_placaId.gridwidth = 2;
		gbc_textField_placaId.insets = new Insets(0, 0, 5, 5);
		gbc_textField_placaId.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_placaId.gridx = 2;
		gbc_textField_placaId.gridy = 4;
		add(textField_placaId, gbc_textField_placaId);
		textField_placaId.setColumns(10);
		
		JLabel lblCorDaPlaca = new JLabel("cor da placa");
		GridBagConstraints gbc_lblCorDaPlaca = new GridBagConstraints();
		gbc_lblCorDaPlaca.anchor = GridBagConstraints.EAST;
		gbc_lblCorDaPlaca.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorDaPlaca.gridx = 1;
		gbc_lblCorDaPlaca.gridy = 5;
		add(lblCorDaPlaca, gbc_lblCorDaPlaca);
		
		textField_placaCor = new JTextField();
		GridBagConstraints gbc_textField_placaCor = new GridBagConstraints();
		gbc_textField_placaCor.gridwidth = 2;
		gbc_textField_placaCor.insets = new Insets(0, 0, 5, 5);
		gbc_textField_placaCor.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_placaCor.gridx = 2;
		gbc_textField_placaCor.gridy = 5;
		add(textField_placaCor, gbc_textField_placaCor);
		textField_placaCor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PesoKG");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 6;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_pesoGK = new JTextField();
		GridBagConstraints gbc_textField_pesoGK = new GridBagConstraints();
		gbc_textField_pesoGK.gridwidth = 2;
		gbc_textField_pesoGK.insets = new Insets(0, 0, 5, 5);
		gbc_textField_pesoGK.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_pesoGK.gridx = 2;
		gbc_textField_pesoGK.gridy = 6;
		add(textField_pesoGK, gbc_textField_pesoGK);
		textField_pesoGK.setColumns(10);
		
		JLabel lblMaxPassageros = new JLabel("Max Passageros");
		GridBagConstraints gbc_lblMaxPassageros = new GridBagConstraints();
		gbc_lblMaxPassageros.anchor = GridBagConstraints.EAST;
		gbc_lblMaxPassageros.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaxPassageros.gridx = 1;
		gbc_lblMaxPassageros.gridy = 7;
		add(lblMaxPassageros, gbc_lblMaxPassageros);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastra();
			}
		});
		
		textField_maxPassageros = new JTextField();
		GridBagConstraints gbc_textField_maxPassageros = new GridBagConstraints();
		gbc_textField_maxPassageros.gridwidth = 2;
		gbc_textField_maxPassageros.insets = new Insets(0, 0, 5, 5);
		gbc_textField_maxPassageros.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_maxPassageros.gridx = 2;
		gbc_textField_maxPassageros.gridy = 7;
		add(textField_maxPassageros, gbc_textField_maxPassageros);
		textField_maxPassageros.setColumns(10);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 9;
		add(btnNewButton, gbc_btnNewButton);

	}
	public void cadastra() {
		
		
		getForm().setCilindros(textField_cilindros.getText());
		getForm().setPotencia(textField_potencia.getText());
		getForm().setEstado(textField_estado.getText());
		getForm().setId(textField_placaId.getText());
		getForm().setCor(textField_placaCor.getText());	
		getForm().setPesoKG((textField_pesoGK.getText()));
		getForm().setNumMaxPassagero((textField_maxPassageros.getText()));
		
		
		if (tipo>0) {
			CadastroVeiculoControler cadastroControler= new CadastroVeiculoControler() ;
			cadastroControler.cadastrarVeiculo(tipo, getForm());
		}
		
	}
	public VeiculoForm getForm() {
		if(f==null) {
			setForm(new VeiculoForm());
		}
		return f;
	}
	public void setForm(VeiculoForm v) {
		this.f = v;
	}

}
