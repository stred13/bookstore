package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ThemSach_frm extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemSach_frm frame = new ThemSach_frm();
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
	public ThemSach_frm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 430);
		getContentPane().setLayout(null);
		
		JLabel lblThmSchMi = new JLabel("Th\u00EAm S\u00E1ch M\u1EDBi");
		lblThmSchMi.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblThmSchMi.setBounds(105, 11, 182, 40);
		getContentPane().add(lblThmSchMi);
		
		JLabel lblTnSch = new JLabel("T\u00EAn S\u00E1ch");
		lblTnSch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnSch.setBounds(48, 63, 66, 16);
		getContentPane().add(lblTnSch);
		
		JLabel lblNmXutBn = new JLabel("N\u0103m Xu\u1EA5t B\u1EA3n");
		lblNmXutBn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNmXutBn.setBounds(23, 147, 92, 16);
		getContentPane().add(lblNmXutBn);
		
		JLabel lblTcGi = new JLabel("T\u00E1c Gi\u1EA3");
		lblTcGi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTcGi.setBounds(37, 120, 77, 16);
		getContentPane().add(lblTcGi);
		
		JLabel lblThLoi = new JLabel("Th\u1EC3 lo\u1EA1i");
		lblThLoi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThLoi.setBounds(58, 91, 56, 16);
		getContentPane().add(lblThLoi);
		
		JLabel lblMTSch = new JLabel("M\u00F4 T\u1EA3");
		lblMTSch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMTSch.setBounds(58, 235, 56, 16);
		getContentPane().add(lblMTSch);
		
		JLabel lblSLng = new JLabel("S\u1ED1 l\u01B0\u1EE3ng");
		lblSLng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLng.setBounds(58, 206, 56, 16);
		getContentPane().add(lblSLng);
		
		JLabel lblnGi = new JLabel("\u0110\u01A1n Gi\u00E1 ");
		lblnGi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGi.setBounds(58, 177, 56, 16);
		getContentPane().add(lblnGi);
		
		JButton btnThm = new JButton("Th\u00EAm");
		btnThm.setBounds(190, 345, 97, 25);
		getContentPane().add(btnThm);
		
		JButton btnHy = new JButton("H\u1EE7y");
		btnHy.setBounds(81, 345, 97, 25);
		getContentPane().add(btnHy);
		
		textField = new JTextField();
		textField.setBounds(127, 60, 193, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 88, 193, 22);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 117, 193, 22);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(127, 144, 193, 22);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(126, 174, 193, 22);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(126, 203, 193, 22);
		getContentPane().add(textField_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(126, 232, 193, 100);
		getContentPane().add(textArea);
	}
}
