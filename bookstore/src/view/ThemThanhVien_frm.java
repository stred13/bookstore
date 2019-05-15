package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class ThemThanhVien_frm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
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
					ThemThanhVien_frm frame = new ThemThanhVien_frm();
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
	public ThemThanhVien_frm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblThmThnhVin = new JLabel("Th\u00EAm Th\u00E0nh Vi\u00EAn M\u1EDBi");
		lblThmThnhVin.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblThmThnhVin.setBounds(73, 13, 262, 40);
		contentPane.add(lblThmThnhVin);
		
		JLabel lblTnThnhVin = new JLabel("T\u00EAn Th\u00E0nh Vi\u00EAn");
		lblTnThnhVin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnThnhVin.setBounds(26, 69, 91, 16);
		contentPane.add(lblTnThnhVin);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 66, 193, 22);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 98, 193, 22);
		contentPane.add(textField_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(62, 101, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblGiiTnh = new JLabel("Gi\u1EDBi T\u00EDnh");
		lblGiiTnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiiTnh.setBounds(41, 128, 77, 16);
		contentPane.add(lblGiiTnh);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 153, 193, 22);
		contentPane.add(textField_3);
		
		JLabel lblNgySinh = new JLabel("Ng\u00E0y Sinh");
		lblNgySinh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgySinh.setBounds(25, 156, 92, 16);
		contentPane.add(lblNgySinh);
		
		JLabel lblSt = new JLabel("S\u0110T");
		lblSt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSt.setBounds(61, 186, 56, 16);
		contentPane.add(lblSt);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 183, 193, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(129, 212, 194, 22);
		contentPane.add(textField_5);
		
		JLabel lblaCh = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lblaCh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblaCh.setBounds(61, 215, 56, 16);
		contentPane.add(lblaCh);
		
		JLabel lblNghNghip = new JLabel("Ngh\u1EC1 Nghi\u1EC7p");
		lblNghNghip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNghNghip.setBounds(40, 244, 77, 16);
		contentPane.add(lblNghNghip);
		
		JButton button = new JButton("Th\u00EAm");
		button.setBounds(196, 286, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("H\u1EE7y");
		button_1.setBounds(87, 286, 97, 25);
		contentPane.add(button_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 241, 193, 22);
		contentPane.add(comboBox);
		
		JRadioButton radioButton = new JRadioButton("Nam");
		radioButton.setBounds(130, 124, 63, 25);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("N\u1EEF");
		radioButton_1.setBounds(194, 124, 63, 25);
		contentPane.add(radioButton_1);
	}
}
