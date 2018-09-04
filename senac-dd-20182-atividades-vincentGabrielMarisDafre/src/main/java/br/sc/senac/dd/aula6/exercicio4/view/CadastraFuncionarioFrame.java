package br.sc.senac.dd.aula6.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastraFuncionarioFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraFuncionarioFrame frame = new CadastraFuncionarioFrame();
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
	public CadastraFuncionarioFrame() {
		setTitle("Cadasto de Funcinario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(51dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("nome");
		contentPane.add(lblNewLabel, "2, 4, right, default");
		
		txtNome = new JTextField();
		txtNome.setText("nome");
		contentPane.add(txtNome, "4, 4, fill, default");
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("cpf");
		contentPane.add(lblNewLabel_1, "2, 6, right, default");
		
		txtCpf = new JTextField();
		txtCpf.setText("cpf");
		contentPane.add(txtCpf, "4, 6, fill, default");
		txtCpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("telefone");
		contentPane.add(lblNewLabel_2, "2, 8, right, default");
		
		txtTelefone = new JTextField();
		txtTelefone.setText("telefone");
		contentPane.add(txtTelefone, "4, 8, fill, default");
		txtTelefone.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("email");
		contentPane.add(lblNewLabel_3, "2, 10, right, default");
		
		txtEmail = new JTextField();
		txtEmail.setText("email");
		contentPane.add(txtEmail, "4, 10, fill, default");
		txtEmail.setColumns(10);
		
		btnCadastrar = new JButton("cadastrar");
		contentPane.add(btnCadastrar, "4, 14");
	}

}
