package br.sc.senac.dd.Aula10Exercícios1e2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private CadastroProduto telaCadastro = new CadastroProduto();
	private ArrayList<JFrame> frames = new ArrayList<JFrame>();
	private Sobre sobre=new Sobre();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					
					//Inicializa a tela principal MAXIMIZADA
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
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
	public Principal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar mbPrincipal = new JMenuBar();
		setJMenuBar(mbPrincipal);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnProdutos.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-comprar.png")));
		mbPrincipal.add(mnProdutos);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Adiciona a tela de cadastro no painel principal
				addInternalFrame(telaCadastro);
			}
		});
		
		mntmCadastrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mntmCadastrar.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-adicionar-usuário-masculino.png")));
		mnProdutos.add(mntmCadastrar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		mntmListar.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-cardápio.png")));
		mnProdutos.add(mntmListar);
		
		JMenu mnSobre = new JMenu("sobre");
		mnSobre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				addFrame(sobre);
			}
		});
		mbPrincipal.add(mnSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
	}
	private void addInternalFrame(JInternalFrame frame){
		JInternalFrame[] allFrames = desktopPane.getAllFrames();
		if(allFrames==null) {
			desktopPane.add(frame);
			frame.show();
			return;
		}else {
			for(int i=0;i<allFrames.length;i++) {
				if(allFrames[i].equals(frame)) {
					frame.show();
					return;
				}
			}
			desktopPane.add(frame);
			frame.show();
		}
	}
	private void addFrame(JFrame frame){
		{
			for(int i=0;i<frames.size();i++) {
				if(frames.get(i).equals(frame)) {
					frames.get(i).setVisible(true);
					frames.get(i).requestFocus();
					return;
				}
			}
			frames.add(frame);
			frame.setVisible(true);
			frame.requestFocus();

		}
	}
}
