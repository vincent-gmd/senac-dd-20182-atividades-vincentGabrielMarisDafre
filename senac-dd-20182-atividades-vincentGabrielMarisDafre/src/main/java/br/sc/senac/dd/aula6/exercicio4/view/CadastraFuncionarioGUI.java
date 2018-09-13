package br.sc.senac.dd.aula6.exercicio4.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import br.sc.senac.dd.aula6.exercicio4.controller.ControladorFuncionario;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CadastraFuncionarioGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3916982128939894737L;
	protected JPanel contentPane;
	protected JTextField txtNome;
	protected JTextField txtCpf;
	protected JTextField txtTelefone;
	protected JTextField txtEmail;
	protected JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraFuncionarioGUI frame = new CadastraFuncionarioGUI();
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
	public CadastraFuncionarioGUI() {
		setTitle("Cadasto de Funcinario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(37dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(155dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(79dlu;default):grow"),},
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
		txtEmail.setText("email ");
		contentPane.add(txtEmail, "4, 10, fill, default");
		txtEmail.setColumns(10);
		
		btnCadastrar = new JButton("cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inserir();
			}

			
		});
		contentPane.add(btnCadastrar, "4, 14");
	}
	protected void inserir() {
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		funcionarioVO.setCpf(txtCpf.getText());
		funcionarioVO.setEmail(txtEmail.getText());
		funcionarioVO.setNome(txtNome.getText());
		funcionarioVO.setTelefone(txtTelefone.getText());
		ControladorFuncionario controladorFuncionario= new ControladorFuncionario();
		try {
			controladorFuncionario.cadastrarFuncionarioController(funcionarioVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
