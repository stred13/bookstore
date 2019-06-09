package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import viewmodels.NhanVienTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtTaiKhoan;
	private JPasswordField txtMatKhau;

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
		lblMtKhu.setBounds(32, 98, 116, 22);
		contentPane.add(lblMtKhu);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtTaiKhoan.setBounds(160, 61, 195, 25);
		contentPane.add(txtTaiKhoan);
		txtTaiKhoan.setColumns(10);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtMatKhau.setBounds(160, 96, 195, 25);
		contentPane.add(txtMatKhau);
		
		JButton btnngNhp = new JButton("\u0110\u0103ng Nh\u1EADp");
		btnngNhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pattern patternUsername = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9._-]{5,40}$");
				Pattern patternPassword = Pattern.compile("^[a-zA-Z0-9]{6,40}$");
				if (!patternUsername.matcher(txtTaiKhoan.getText().toString()).matches()) {
			        JOptionPane.showMessageDialog(null, "Tài khoản không hợp lệ \nbắt đầu là chữ \ntừ 6 đến 40 ký tự \nký tự không dấu \nkhông chứa ký tự đặc biệt ngoại trừ ._-");
			    } else if (!patternPassword.matcher(txtMatKhau.getText().toString()).matches()) {
			        JOptionPane.showMessageDialog(null, "Mật khẩu không hợp lệ \ntừ 6 đến 40 ký tự \nký tự không dấu");
			    } else {
			    	NhanVienTableModel nvTblModel = new NhanVienTableModel();
			    	nvTblModel.NhanVienLogin(txtTaiKhoan.getText().toString(), txtMatKhau.getText().toString());
			    	MainView mv = new MainView();
			    	mv.setVisible(true);
			    	dispose();
			    }
			}
		});
		btnngNhp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnngNhp.setBounds(129, 149, 122, 25);
		contentPane.add(btnngNhp);
	}
}
