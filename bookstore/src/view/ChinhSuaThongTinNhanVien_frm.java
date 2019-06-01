package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.NhanVien;
import viewmodels.NhanVienTableModel;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChinhSuaThongTinNhanVien_frm extends JFrame {
	private JTextField txtHoTen;
	private JTextField txtEmail;
	private JTextField txtNgaySinh;
	private JTextField txtSDT;
	private JTextField txtDiaChi;
	private JTextField txtMaNV;
	private NhanVien nv;
	private NhanVienTableModel nvTblModel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChinhSuaThongTinNhanVien_frm frame = new ChinhSuaThongTinNhanVien_frm();
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
	public ChinhSuaThongTinNhanVien_frm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 430, 367);
		getContentPane().setLayout(null);
		nvTblModel = new NhanVienTableModel();
		nv = nvTblModel.getThongTinNhanVien(MainView.manhanvien);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 412, 336);
		getContentPane().add(panel);
		
		JLabel lblChnhSaThng = new JLabel("Ch\u1EC9nh S\u1EEDa Th\u00F4ng Tin Nh\u00E2n Vi\u00EAn");
		lblChnhSaThng.setHorizontalAlignment(SwingConstants.CENTER);
		lblChnhSaThng.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblChnhSaThng.setBounds(12, 13, 388, 40);
		panel.add(lblChnhSaThng);
		
		JLabel lblHTn = new JLabel("H\u1ECD T\u00EAn");
		lblHTn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHTn.setBounds(50, 90, 91, 16);
		panel.add(lblHTn);
		
		txtHoTen = new JTextField();
		txtHoTen.setColumns(10);
		txtHoTen.setBounds(154, 87, 193, 22);
		panel.add(txtHoTen);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(154, 119, 193, 22);
		panel.add(txtEmail);
		
		JLabel label_2 = new JLabel("Email");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(86, 122, 56, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Gi\u1EDBi T\u00EDnh");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(65, 149, 77, 16);
		panel.add(label_3);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setColumns(10);
		txtNgaySinh.setBounds(154, 174, 193, 22);
		panel.add(txtNgaySinh);
		
		JLabel label_4 = new JLabel("Ng\u00E0y Sinh");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(49, 177, 92, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("S\u0110T");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(85, 207, 56, 16);
		panel.add(label_5);
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(154, 204, 193, 22);
		panel.add(txtSDT);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(153, 233, 194, 22);
		panel.add(txtDiaChi);
		
		JLabel label_6 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(85, 236, 56, 16);
		panel.add(label_6);

		txtMaNV = new JTextField();
		txtMaNV.setEditable(false);
		txtMaNV.setColumns(10);
		txtMaNV.setBounds(154, 55, 193, 22);
		panel.add(txtMaNV);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setSelected(true);
		rdbtnNam.setBounds(154, 145, 63, 25);
		panel.add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("N\u1EEF");
		rdbtnNu.setBounds(218, 145, 63, 25);
		panel.add(rdbtnNu);
		
		JButton btnChinhSua = new JButton("Ch\u1EC9nh S\u1EEDa");
		btnChinhSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nv.setTennv(txtHoTen.getText());
				nv.setEmail(txtEmail.getText());
				nv.setDiachi(txtDiaChi.getText());
				nv.setSdt(txtSDT.getText());
				if(rdbtnNam.isSelected()) {
					nv.setGioitinh(1);
				}else {
					nv.setGioitinh(0);
				}
				nvTblModel.updateNhanVien(nv);
				
				
			}
		});
		btnChinhSua.setBounds(224, 268, 97, 25);
		panel.add(btnChinhSua);
		
		JButton btnHuy = new JButton("H\u1EE7y");
		btnHuy.setBounds(116, 268, 97, 25);
		panel.add(btnHuy);
		
		JLabel lblMThnhVin = new JLabel("M\u00E3 Nh\u00E2nVi\u00EAn");
		lblMThnhVin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMThnhVin.setBounds(50, 58, 91, 16);
		panel.add(lblMThnhVin);
		
		txtMaNV.setText(String.valueOf(nv.getManv()));
		txtHoTen.setText(nv.getTennv());
		txtEmail.setText(nv.getEmail());
		txtDiaChi.setText(nv.getDiachi());
		int gioitinh = nv.getGioitinh();
		if(gioitinh == 1) {
			rdbtnNam.setSelected(true);
			rdbtnNu.setSelected(false);
		}else {
			rdbtnNam.setSelected(false);
			rdbtnNu.setSelected(true);
		}
		

	}
}