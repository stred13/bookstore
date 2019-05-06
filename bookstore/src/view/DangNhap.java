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
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtSdsd;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap frame = new DangNhap();
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
	public DangNhap() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EAn \u0111\u0103ng nh\u1EADp:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(32, 63, 116, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("M\u1EADt kh\u1EA9u:");
		lblMtKhu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMtKhu.setBounds(32, 114, 116, 22);
		contentPane.add(lblMtKhu);
		
		txtSdsd = new JTextField();
		txtSdsd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtSdsd.setBounds(158, 61, 197, 25);
		contentPane.add(txtSdsd);
		txtSdsd.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		passwordField.setBounds(158, 112, 197, 25);
		contentPane.add(passwordField);
		
		JButton btnngNhp = new JButton("\u0110\u0103ng Nh\u1EADp");
		btnngNhp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnngNhp.setBounds(158, 150, 105, 25);
		contentPane.add(btnngNhp);
	}
}
