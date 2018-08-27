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
	private Double num1=null;
	private Double num2=null;
	private short neg1=1;
	private short neg2=1;
	private Op op=null;
	private int pointCount=0;
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
		setBounds(100, 100, 210, 232);
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
		textFieldDisplay.setEditable(false);
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
				numberPress(1);
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
				numberPress(2);
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
				numberPress(3);
				
				
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
				opPress(Op.plus);
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
				numberPress(4);
				
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
				numberPress(5);
				
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
				numberPress(6);
				
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
				opPress(Op.minus);

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
				numberPress(7);
				
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
				numberPress(8);
				
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
				numberPress(9);
				
			}
		});
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 3;
		contentPane.add(button_9, gbc_button_9);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberPress(0);
			}
		});
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opPress(Op.multiply);

			}
		});
		GridBagConstraints gbc_buttonMultiply = new GridBagConstraints();
		gbc_buttonMultiply.insets = new Insets(0, 0, 5, 0);
		gbc_buttonMultiply.anchor = GridBagConstraints.NORTH;
		gbc_buttonMultiply.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonMultiply.gridx = 3;
		gbc_buttonMultiply.gridy = 3;
		contentPane.add(buttonMultiply, gbc_buttonMultiply);
		GridBagConstraints gbc_button_0 = new GridBagConstraints();
		gbc_button_0.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_0.insets = new Insets(0, 0, 5, 5);
		gbc_button_0.gridx = 1;
		gbc_button_0.gridy = 4;
		contentPane.add(button_0, gbc_button_0);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opPress(Op.divide);

			}
		});
		
		JButton button = new JButton(".");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dotPress();
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 4;
		contentPane.add(button, gbc_button);
		GridBagConstraints gbc_buttonDivide = new GridBagConstraints();
		gbc_buttonDivide.anchor = GridBagConstraints.NORTH;
		gbc_buttonDivide.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonDivide.insets = new Insets(0, 0, 5, 0);
		gbc_buttonDivide.gridx = 3;
		gbc_buttonDivide.gridy = 4;
		contentPane.add(buttonDivide, gbc_buttonDivide);
		
		JButton buttonCe = new JButton("ce");
		buttonCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				opPress(Op.ce);

			}
		});
		
		JButton buttonResult = new JButton("=");
		buttonResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opPress(Op.equals);
			}
		});
		GridBagConstraints gbc_buttonResult = new GridBagConstraints();
		gbc_buttonResult.insets = new Insets(0, 0, 0, 5);
		gbc_buttonResult.anchor = GridBagConstraints.NORTHWEST;
		gbc_buttonResult.gridx = 2;
		gbc_buttonResult.gridy = 5;
		contentPane.add(buttonResult, gbc_buttonResult);
		GridBagConstraints gbc_buttonCe = new GridBagConstraints();
		gbc_buttonCe.gridx = 3;
		gbc_buttonCe.gridy = 5;
		contentPane.add(buttonCe, gbc_buttonCe);
	}
	 void dotPress() {
		 if(op!=null||op==Op.equals) {
		if (num1==null) {
			num1=0d;
			pointCount=1;
					
		}else if(pointCount>0) {
			return;
		}else {
			pointCount=1;
		}
		}else{
			if (num1==null) {
				num1=0d;
				pointCount=1;
						
			}else if(pointCount>0) {
				return;
			}else {
				pointCount=1;
			}
			
		}
		
	}

	void numberPress(double number) {
		if(num1==null || op==Op.equals) {
			num1=number;
			op=null;
		}else if(op==null) {
			num1=append(num1,number);
		}else if(num2==null) {
			this.pointCount=0;
			num2=number;
		}else {
			num2=append(num2,number);
		}
		updateText();
		
	}
	void opPress(Op op) {
		if(op==Op.ce) {
			this.num1=null;
			this.op=null;
			this.num2=null;
			this.pointCount=0;
			neg1=1;
			neg2=1;
			updateText();
			return;
		}
		if(	 num1!=null && num2!=null && op!=null) {
			solve();
			this.op=op;
			updateText();
			return;
		}
		if (op==Op.minus) {
			if(	 num1==null ) {
				neg1 = -1;
				return;
			}else if(op == null||op==Op.plus||op==Op.minus) {
				this.op =op;
			}else if (num2==null) {
				neg2 = -1;
			}
			updateText();
			return;
		} 
		if(	 num1==null ) {
				return;
		}else if(op==Op.equals){
			return;
		}else {
			this.op=op;
		}

		updateText();
	}
	
	private void updateText() {
		String s="";
		if( neg1==-1) {
			s=s+"-";
		}
		if( num1!=null) {
			s=s+fmt(num1);
		}
		if( op!=null) {
			s=s+op.toString();
		}
		if( neg2==-1) {
			s=s+"-";
		}
		if( num2!=null) {
			s=s+fmt(num2);
		}
			
			textFieldDisplay.setText(s);
	}
	public static String fmt(double d)
	{
	    if(d == (long) d)
	        return String.format("%d",(long)d);
	    else
	        return String.format("%s",d);
	}


	void solve() {
			switch (op) {
		case plus:
			num1=(num1*neg1)+(num2*neg2);
			break;
			
		case minus:
			num1=(num1*neg1)-(num2*neg2);
			break;
			
		case divide:
			num1=(num1*neg1)/(num2*neg2);
			break;
			
		case multiply:
			num1=(num1*neg1)*(num2*neg2);
			break;
		
				default:
					break;
		}
		
		
		this.op=null;
		this.num2=null;
		this.pointCount=0;
		neg1=1;
		neg2=1;
		if (num1<0) {
			neg1=-1;
			num1=-num1;
		}
	}
	Double append(Double in,Double append) {
		if(pointCount>0) {
			double re = in+(append*Math.pow(10,-pointCount));
			pointCount++;
			return re;
		}else {
			return  (in*10)+append;
		}
		
		
		
	}

}
