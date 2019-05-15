package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;

public class ChinhSuaThongTinSach_frm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChinhSuaThongTinSach_frm frame = new ChinhSuaThongTinSach_frm();
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
	public ChinhSuaThongTinSach_frm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("T\u00EAn S\u00E1ch");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(52, 93, 66, 16);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(131, 90, 193, 22);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Th\u1EC3 lo\u1EA1i");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(62, 121, 56, 16);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 118, 193, 22);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("T\u00E1c Gi\u1EA3");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(41, 150, 77, 16);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 147, 193, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(131, 174, 193, 22);
		contentPane.add(textField_3);
		
		JLabel label_3 = new JLabel("N\u0103m Xu\u1EA5t B\u1EA3n");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(27, 177, 92, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u0110\u01A1n Gi\u00E1 ");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(62, 207, 56, 16);
		contentPane.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 204, 193, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 233, 193, 22);
		contentPane.add(textField_5);
		
		JLabel label_5 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(62, 236, 56, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("M\u00F4 T\u1EA3");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(62, 265, 56, 16);
		contentPane.add(label_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(130, 262, 193, 100);
		contentPane.add(textArea);
		
		JButton btnChnhSa = new JButton("Ch\u1EC9nh S\u1EEDa");
		btnChnhSa.setBounds(194, 375, 97, 25);
		contentPane.add(btnChnhSa);
		
		JButton button_1 = new JButton("H\u1EE7y");
		button_1.setBounds(85, 375, 97, 25);
		contentPane.add(button_1);
		
		JLabel lblChnhSaThng = new JLabel("Ch\u1EC9nh S\u1EEDa Th\u00F4ng Tin S\u00E1ch");
		lblChnhSaThng.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblChnhSaThng.setBounds(44, 13, 299, 40);
		contentPane.add(lblChnhSaThng);
		
		JLabel lblMSch = new JLabel("M\u00E3 S\u00E1ch");
		lblMSch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMSch.setBounds(52, 61, 66, 16);
		contentPane.add(lblMSch);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(131, 58, 193, 22);
		contentPane.add(textField_6);
	}

}
