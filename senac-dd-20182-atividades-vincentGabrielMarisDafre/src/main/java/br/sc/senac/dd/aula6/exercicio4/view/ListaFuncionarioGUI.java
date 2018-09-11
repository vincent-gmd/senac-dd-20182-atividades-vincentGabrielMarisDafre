package br.sc.senac.dd.aula6.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.sc.senac.dd.aula6.exercicio4.controller.ControladorFuncionario;
import br.sc.senac.dd.aula6.exercicio4.model.vo.FuncionarioVO;
import br.sc.senac.dd.aula6.exercicio4.util.Table;
import br.sc.senac.dd.aula6.exercicio4.util.TableFuncionario;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ListaFuncionarioGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3504274089868589171L;
	private JPanel contentPane;
	private JTable table;
	private TableModel model;
	TableFuncionario  tableFuncionario =new TableFuncionario ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaFuncionarioGUI frame = new ListaFuncionarioGUI();
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
	public ListaFuncionarioGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnListarFuncionarios = new JButton("listar funcionarios");
		btnListarFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listar();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnListarFuncionarios, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnListarFuncionarios, 2, SpringLayout.WEST, contentPane);
		contentPane.add(btnListarFuncionarios);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.SOUTH, btnListarFuncionarios);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollPane, 2, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollPane, 2, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollPane, 2, SpringLayout.EAST, contentPane);
		contentPane.add(scrollPane);
	//	tableFuncionario.getNames().toArray(new String[] {})
		
		
		
		
		table = new JTable( );
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			tableFuncionario.getNames().toArray(new String[tableFuncionario.getNames().size()] )
		));
		
		
		model= table.getModel();
		
		scrollPane.setViewportView(table);
		
	}
	void listar(){
		ControladorFuncionario cF=new ControladorFuncionario();
		
		try {
			ArrayList<FuncionarioVO> arrayFuncionario = cF.consultarTodosFuncionariosController();
			table.setModel(new DefaultTableModel(
					new Object[arrayFuncionario.size()][5] ,
					tableFuncionario.getNames().toArray(new String[tableFuncionario.getNames().size()] )
				));
			model= table.getModel();
			for(int i=0;i<arrayFuncionario.size();i++) {
				//for(int i2=0;i<tableFuncionario.getColums().size();i++) {}
				
					model.setValueAt(arrayFuncionario.get(i).getIdFuncionario(), i, 0);
					model.setValueAt(arrayFuncionario.get(i).getNome(), i, 1);
					model.setValueAt(arrayFuncionario.get(i).getCpf(), i, 2);
					model.setValueAt(arrayFuncionario.get(i).getTelefone(), i, 3);
					model.setValueAt(arrayFuncionario.get(i).getEmail(), i, 4);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
