package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import viewmodels.NhanVienTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
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

	JButton btnLogin;
	private JTextField txtName;
	private JPasswordField txtPassWord;
	private JButton btnForgetPass;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap frame = new DangNhap("Login");
					frame.showWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DangNhap(String title) {
		super(title);

		addControls();
		addEvents();
	}
//	public DangNhap() {
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 394, 252);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("T\u00EAn \u0111\u0103ng nh\u1EADp:");
//		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
//		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		lblNewLabel.setBounds(32, 63, 116, 22);
//		contentPane.add(lblNewLabel);
//		
//		JLabel lblMtKhu = new JLabel("M\u1EADt kh\u1EA9u:");
//		lblMtKhu.setHorizontalAlignment(SwingConstants.RIGHT);
//		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		lblMtKhu.setBounds(32, 98, 116, 22);
//		contentPane.add(lblMtKhu);
//		
//		txtTaiKhoan = new JTextField();
//		txtTaiKhoan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		txtTaiKhoan.setBounds(160, 61, 195, 25);
//		contentPane.add(txtTaiKhoan);
//		txtTaiKhoan.setColumns(10);
//		
//		txtMatKhau = new JPasswordField();
//		txtMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		txtMatKhau.setBounds(160, 96, 195, 25);
//		contentPane.add(txtMatKhau);
		
//		btnngNhp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
//		btnngNhp.setBounds(129, 149, 122, 25);
//		contentPane.add(btnngNhp);
//	}
	
	public void addEvents() {

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name=txtName.getText();
				String pass=txtPassWord.getText();
				
				Pattern patternUsername = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9._-]{5,40}$");
				Pattern patternPassword = Pattern.compile("^[a-zA-Z0-9]{6,40}$");
				
				if (!patternUsername.matcher(name.toString()).matches()) {
			        JOptionPane.showMessageDialog(null, "Tài khoản không hợp lệ \nbắt đầu là chữ \ntừ 6 đến 40 ký tự \nký tự không dấu \nkhông chứa ký tự đặc biệt ngoại trừ ._-");
			    } else if (!patternPassword.matcher(pass.toString()).matches()) {
			        JOptionPane.showMessageDialog(null, "Mật khẩu không hợp lệ \ntừ 6 đến 40 ký tự \nký tự không dấu");
			    } else {
			    	NhanVienTableModel nvTblModel = new NhanVienTableModel();
			    	nvTblModel.NhanVienLogin(name.toString(), pass.toString());
			    	MainView mv = new MainView();
			    	mv.setVisible(true);
			    	dispose();
			    }
			}
		});
	}
	
	public void addControls() {
		getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("Systems Management Books");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		lblTitle.setBounds(0, 11, 434, 30);
		getContentPane().add(lblTitle);
		// label name
		JLabel lblName = new JLabel("Tên Đăng Nhập");
		lblName.setFont(new Font("Arial", Font.PLAIN, 13));
		lblName.setBounds(63, 68, 100, 30);
		getContentPane().add(lblName);
		// text name
		txtName = new JTextField();
		txtName.setBounds(173, 68, 212, 30);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		// label password
		JLabel lblPass = new JLabel("Mật Khẩu");
		lblPass.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPass.setBounds(63, 132, 100, 30);
		getContentPane().add(lblPass);
		
		// text pass
		txtPassWord = new JPasswordField();
		txtPassWord.setBounds(173, 132, 212, 30);
		getContentPane().add(txtPassWord);
		
		// button login
		btnLogin = new JButton("Đăng Nhập");
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		btnLogin.setBounds(276, 197, 109, 30);
		btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnLogin);
		
		btnForgetPass = new JButton("Quên mật khẩu ?");
		btnForgetPass.setFont(new Font("Arial", Font.ITALIC, 11));
		btnForgetPass.setText("<html><u>Quên mật khẩu ?</u></html>");
		btnForgetPass.setBorder(null);
		btnForgetPass.setContentAreaFilled(false);
		btnForgetPass.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnForgetPass.setBounds(179, 197, 92, 30);
		getContentPane().add(btnForgetPass);
	}

	public void showWindow() {
		this.setBounds(200, 200, 500, 300);
		this.setSize(450, 300);
		this.setResizable ( false );
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

}
