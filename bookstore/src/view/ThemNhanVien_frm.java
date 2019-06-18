package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import viewmodels.NhanVienTableModel;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class ThemNhanVien_frm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtAddress;
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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MainView.frame.setEnabled(true);
				
			
			}
		});
		NhanVienTableModel nvtblModel= new NhanVienTableModel();
		nhanvienController nvCons= new nhanvienController();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 393, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblThmThnhVin = new JLabel("Th\u00EAm Nh\u00E2n Vi\u00EAn M\u1EDBi");
		lblThmThnhVin.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblThmThnhVin.setBounds(73, 13, 262, 40);
		contentPane.add(lblThmThnhVin);
		
		JButton btnThem = new JButton("Th\u00EAm");
		btnThem.setBounds(182, 373, 97, 25);
		contentPane.add(btnThem);
		
		JButton btnClose = new JButton("\u0110\u00F3ng");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainView.frame.setEnabled(true);
				dispose();
			}
		});
		btnClose.setBounds(73, 373, 97, 25);
		contentPane.add(btnClose);
		
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
		panel_1.setBounds(12, 184, 351, 176);
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
		
		JRadioButton rdNam = new JRadioButton("Nam");
		rdNam.setSelected(true);
		rdNam.setBounds(132, 76, 63, 25);
		panel_1.add(rdNam);
		
		JRadioButton rdNu = new JRadioButton("N\u1EEF");
		rdNu.setBounds(196, 76, 63, 25);
		panel_1.add(rdNu);
		
		JLabel label_7 = new JLabel("S\u0110T");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(64, 112, 56, 16);
		panel_1.add(label_7);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(133, 109, 193, 22);
		panel_1.add(txtPhone);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(132, 138, 194, 22);
		panel_1.add(txtAddress);
		
		JLabel label_8 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(64, 141, 56, 16);
		panel_1.add(label_8);
		rdNam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdNam.setSelected(true);
				rdNu.setSelected(false);
			}
		});
		rdNu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdNam.setSelected(false);
				rdNu.setSelected(true);
			}
		});
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pattern patternPhone = Pattern.compile("^\\d{10,11}$");
				Pattern patternEmail = Pattern.compile("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
				Pattern patternUsername = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9._-]{5,40}$");
				Pattern patternPassword = Pattern.compile("^[a-zA-Z0-9]{6,40}$");
				if (!patternUsername.matcher(txtUsername.getText().toString()).matches()) {
			        JOptionPane.showMessageDialog(null, "Tài khoản không hợp lệ \nbắt đầu là chữ \ntừ 6 đến 40 ký tự \nký tự không dấu \nkhông chứa ký tự đặc biệt ngoại trừ ._-");
			    } else if (!patternPassword.matcher(txtPassword.getText().toString()).matches()) {
			        JOptionPane.showMessageDialog(null, "Mật khẩu không hợp lệ \ntừ 6 đến 40 ký tự \nký tự không dấu");
			    } else if(!(txtPassword.getText().toString().equals(txtRePassword.getText().toString()))) {
					JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không khớp");
			    } else if (!patternEmail.matcher(txtEmail.getText().toString()).matches()) {
			        JOptionPane.showMessageDialog(null, "Email không hợp lệ");
			    } else if (!patternPhone.matcher(txtPhone.getText().toString()).matches()) {
			    	JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ (phải từ 10 đến 11 số)");
			    } else {
			    	NhanVien nv = new NhanVien();
					nv.setTaikhoan(txtUsername.getText());
					nv.setMatkhau(txtPassword.getPassword().toString());
					nv.setTennv(txtName.getText());
					nv.setEmail(txtEmail.getText());
					if(rdNam.isSelected()) {
						nv.setGioitinh(1);
					}else {
						nv.setGioitinh(0);
					}
					nv.setSdt(txtPhone.getText());
					nv.setDiachi(txtAddress.getText());
					nv.setNgaysinh(new Date());
					nvCons.insertNhanVien(nv);
					MainView.tblDSNVModel.setRowCount(0);
					MainView.tblDSNVModel = nvtblModel.nhanVienTablmodel();
					MainView.tbListNhanVien.setModel(MainView.tblDSNVModel);
			    }
			}
		});
	}
}
