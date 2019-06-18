package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.nhanvienController;
import models.NhanVien;
import viewmodels.NhanVienTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class ChinhSuaThongTinNhanVien_frm extends JFrame {
	private JTextField txtHoTen;
	private JTextField txtEmail;
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
					ChinhSuaThongTinNhanVien_frm frameEditNV = new ChinhSuaThongTinNhanVien_frm();
					frameEditNV.setVisible(true);
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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MainView.frame.setEnabled(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 430, 348);
		getContentPane().setLayout(null);
		nvTblModel = new NhanVienTableModel();
		nv = nvTblModel.getThongTinNhanVien(MainView.manhanvien);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 412, 318);
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
		
		JLabel label_5 = new JLabel("S\u0110T");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(85, 181, 56, 16);
		panel.add(label_5);
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(154, 178, 193, 22);
		panel.add(txtSDT);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(153, 207, 194, 22);
		panel.add(txtDiaChi);
		
		JLabel label_6 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(85, 210, 56, 16);
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
		
		rdbtnNam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnNam.setSelected(true);
				rdbtnNu.setSelected(false);
			}
		});
		rdbtnNu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnNam.setSelected(false);
				rdbtnNu.setSelected(true);
			}
		});

		
		JButton btnChinhSua = new JButton("Ch\u1EC9nh S\u1EEDa");
		btnChinhSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pattern patternPhone = Pattern.compile("^\\d{10,11}$");
				Pattern patternEmail = Pattern.compile("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
				if (!patternEmail.matcher(txtEmail.getText().toString()).matches()) {
					JOptionPane.showMessageDialog(null, "Email không hợp lệ");
				} else if (!patternPhone.matcher(txtSDT.getText().toString()).matches()) {
			        JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ (phải từ 10 đến 11 số)");
			    } else {
			    	nv.setTennv(txtHoTen.getText());
			    	nv.setEmail(txtEmail.getText());
			    	nv.setDiachi(txtDiaChi.getText());
			    	nv.setSdt(txtSDT.getText());
			    	nv.setNgaysinh(new Date());
			    	if(rdbtnNam.isSelected()) {
			    		nv.setGioitinh(1);
			    	}else {
			    		nv.setGioitinh(0);
			    	}
			    	nvTblModel.updateNhanVien(nv);
			    	MainView.tblDSNVModel.setRowCount(0);
			    	MainView.tblDSNVModel = nvTblModel.nhanVienTablmodel();
			    	MainView.tbListNhanVien.setModel(MainView.tblDSNVModel);
			    	MainView.frame.setEnabled(true);
			    	JOptionPane.showMessageDialog(null, "Chỉnh Sửa Thành Công");
			    	dispose();						    	
			    }
			}
		});
		btnChinhSua.setBounds(115, 254, 210, 25);
		panel.add(btnChinhSua);
		
		JLabel lblMThnhVin = new JLabel("M\u00E3 Nh\u00E2nVi\u00EAn");
		lblMThnhVin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMThnhVin.setBounds(50, 58, 91, 16);
		panel.add(lblMThnhVin);
		
		txtMaNV.setText(String.valueOf(nv.getManv()));
		txtHoTen.setText(nv.getTennv());
		txtEmail.setText(nv.getEmail());
		txtDiaChi.setText(nv.getDiachi());
		txtSDT.setText(nv.getSdt());
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
