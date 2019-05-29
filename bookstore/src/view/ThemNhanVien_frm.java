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
import javax.swing.border.LineBorder;

import controllers.nhanvienController;
import models.NhanVien;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThemNhanVien_frm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField txtPassword;
	private JPasswordField txtRePassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemNhanVien_frm frame = new ThemNhanVien_frm();
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
	public ThemNhanVien_frm() {
		nhanvienController nvCons= new nhanvienController();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblThmThnhVin = new JLabel("Th\u00EAm Nh\u00E2n Vi\u00EAn M\u1EDBi");
		lblThmThnhVin.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblThmThnhVin.setBounds(73, 13, 262, 40);
		contentPane.add(lblThmThnhVin);
		
		JButton button = new JButton("Th\u00EAm");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NhanVien nv = new NhanVien();
				nv.setTaikhoan(txtUsername.getText());
				nv.setMatkhau(txtPassword.getText());
				nv.setTennv(txtName.getText());
				nv.setEmail(txtEmail.getText());
				nvCons.insertNhanVien(nv);
			}
		});
		button.setBounds(183, 400, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("H\u1EE7y");
		button_1.setBounds(74, 400, 97, 25);
		contentPane.add(button_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 53, 351, 118);
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel label = new JLabel("T\u00E0i Kho\u1EA3n");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(27, 16, 91, 16);
		panel.add(label);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(131, 13, 193, 22);
		panel.add(txtUsername);
		
		JLabel label_1 = new JLabel("M\u1EADt Kh\u1EA9u");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(63, 48, 56, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Nh\u1EADp L\u1EA1i M\u1EADt Kh\u1EA9u");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(12, 80, 107, 16);
		panel.add(label_2);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(131, 45, 193, 22);
		panel.add(txtPassword);
		
		txtRePassword = new JPasswordField();
		txtRePassword.setBounds(131, 77, 193, 22);
		panel.add(txtRePassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(12, 184, 351, 203);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_3 = new JLabel("H\u1ECD T\u00EAn:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(28, 16, 91, 16);
		panel_1.add(label_3);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(132, 13, 193, 22);
		panel_1.add(txtName);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(132, 45, 193, 22);
		panel_1.add(txtEmail);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(64, 48, 56, 16);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Gi\u1EDBi T\u00EDnh");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(43, 80, 77, 16);
		panel_1.add(label_5);
		
		JRadioButton rdName = new JRadioButton("Nam");
		rdName.setSelected(true);
		rdName.setBounds(132, 76, 63, 25);
		panel_1.add(rdName);
		
		JRadioButton rdNu = new JRadioButton("N\u1EEF");
		rdNu.setBounds(196, 76, 63, 25);
		panel_1.add(rdNu);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(132, 105, 193, 22);
		panel_1.add(textField_3);
		
		JLabel label_6 = new JLabel("Ng\u00E0y Sinh");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(27, 108, 92, 16);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("S\u0110T");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(63, 138, 56, 16);
		panel_1.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(132, 135, 193, 22);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(131, 164, 194, 22);
		panel_1.add(textField_5);
		
		JLabel label_8 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(63, 167, 56, 16);
		panel_1.add(label_8);
	}
}
