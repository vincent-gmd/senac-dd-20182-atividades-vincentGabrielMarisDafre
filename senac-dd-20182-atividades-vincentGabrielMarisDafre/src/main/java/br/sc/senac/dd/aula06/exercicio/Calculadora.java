package br.sc.senac.dd.aula06.exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	
	private static final long serialVersionUID = 2096125199821278351L;
	private JPanel contentPane;
	private JTextField textFieldDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 231, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{39, 39, 39, 41, 0};
		gbl_contentPane.rowHeights = new int[]{20, 23, 23, 23, 23, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textFieldDisplay = new JTextField();
		GridBagConstraints gbc_textFieldDisplay = new GridBagConstraints();
		gbc_textFieldDisplay.anchor = GridBagConstraints.NORTH;
		gbc_textFieldDisplay.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldDisplay.gridwidth = 4;
		gbc_textFieldDisplay.gridx = 0;
		gbc_textFieldDisplay.gridy = 0;
		contentPane.add(textFieldDisplay, gbc_textFieldDisplay);
		textFieldDisplay.setColumns(10);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 1;
		contentPane.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 1;
		contentPane.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 1;
		contentPane.add(button_3, gbc_button_3);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_buttonPlus = new GridBagConstraints();
		gbc_buttonPlus.anchor = GridBagConstraints.NORTHWEST;
		gbc_buttonPlus.insets = new Insets(0, 0, 5, 0);
		gbc_buttonPlus.gridx = 3;
		gbc_buttonPlus.gridy = 1;
		contentPane.add(buttonPlus, gbc_buttonPlus);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 2;
		contentPane.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 2;
		contentPane.add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 2;
		gbc_button_6.gridy = 2;
		contentPane.add(button_6, gbc_button_6);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_buttonMinus = new GridBagConstraints();
		gbc_buttonMinus.anchor = GridBagConstraints.NORTH;
		gbc_buttonMinus.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonMinus.insets = new Insets(0, 0, 5, 0);
		gbc_buttonMinus.gridx = 3;
		gbc_buttonMinus.gridy = 2;
		contentPane.add(buttonMinus, gbc_buttonMinus);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 3;
		contentPane.add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 1;
		gbc_button_8.gridy = 3;
		contentPane.add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 3;
		contentPane.add(button_9, gbc_button_9);
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_buttonMultiply = new GridBagConstraints();
		gbc_buttonMultiply.anchor = GridBagConstraints.NORTH;
		gbc_buttonMultiply.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonMultiply.insets = new Insets(0, 0, 5, 0);
		gbc_buttonMultiply.gridx = 3;
		gbc_buttonMultiply.gridy = 3;
		contentPane.add(buttonMultiply, gbc_buttonMultiply);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_0 = new GridBagConstraints();
		gbc_button_0.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_0.insets = new Insets(0, 0, 5, 5);
		gbc_button_0.gridx = 1;
		gbc_button_0.gridy = 4;
		contentPane.add(button_0, gbc_button_0);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_buttonDivide = new GridBagConstraints();
		gbc_buttonDivide.anchor = GridBagConstraints.NORTH;
		gbc_buttonDivide.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonDivide.insets = new Insets(0, 0, 5, 0);
		gbc_buttonDivide.gridx = 3;
		gbc_buttonDivide.gridy = 4;
		contentPane.add(buttonDivide, gbc_buttonDivide);
		
		JButton buttonResult = new JButton("=");
		buttonResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_buttonResult = new GridBagConstraints();
		gbc_buttonResult.anchor = GridBagConstraints.NORTHWEST;
		gbc_buttonResult.gridx = 3;
		gbc_buttonResult.gridy = 5;
		contentPane.add(buttonResult, gbc_buttonResult);
	}

}
