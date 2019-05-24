package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import models.ChiTietPhieuNhap;
import models.Sach;
import viewmodels.nhapSachTablemodel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.List;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField txtSLMua;
	private JTextField txtMaKH;
	private JTextField txtTenKH;
	private JTable table_1;
	private JTextField txtTimKiem;
	private JTextField textField_8;
	private JTextField txtSdt;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField txtNgheNghiep;
	private JTextField textField_5;
	private JTable table_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_12;
	private JTable table;
	private JTextField textField_13;
	private JTextField txtSLNhap;
	private JTextField txtMaSachN;
	private JTextField txtTenSachN;
	private JTextField txtSoLuongConN;
	private JTextField txtGiaNhapN;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTable table_3;
	private JTextField txtMaSach;
	private JTextField txtTenSach;
	private JTextField txtTheLoai;
	private JTextField txtDonGia;
	private JTextField txtSLCon;
	private JTable tbSach;
	private JTextField txtTheLoaiN;
	private JTable tbctpN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel pnlMuonSach = new JPanel();
		pnlMuonSach.setLayout(null);
		tabbedPane.addTab("Mượn Sách", null, pnlMuonSach, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 411, 916, 226);
		pnlMuonSach.add(scrollPane_2);
		
		JLabel lblDanhSchSch_2 = new JLabel("Danh sách Sách mượn");
		lblDanhSchSch_2.setBounds(12, 394, 145, 16);
		pnlMuonSach.add(lblDanhSchSch_2);
		
		JButton btnLpHan = new JButton("Lập Hóa Đơn");
		btnLpHan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLpHan.setBounds(774, 680, 154, 25);
		pnlMuonSach.add(btnLpHan);
		
		JLabel label_3 = new JLabel("Tổng Tiền:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_3.setBounds(732, 650, 67, 20);
		pnlMuonSach.add(label_3);
		
		JLabel label_4 = new JLabel("100000 VNĐ");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(811, 650, 117, 20);
		pnlMuonSach.add(label_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(12, 199, 916, 182);
		panel_1.setLayout(null);
		pnlMuonSach.add(panel_1);
		
		JLabel lblNhpMSch = new JLabel("Nhập Mã Sách");
		lblNhpMSch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNhpMSch.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNhpMSch.setBounds(63, 13, 102, 25);
		panel_1.add(lblNhpMSch);
		
		JLabel label_9 = new JLabel("Tên Sách");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_9.setBounds(63, 45, 102, 25);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(177, 49, 180, 16);
		panel_1.add(label_10);
		
		JLabel lblnGiMn = new JLabel("Đơn Giá Mượn");
		lblnGiMn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGiMn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblnGiMn.setBounds(413, 13, 90, 25);
		panel_1.add(lblnGiMn);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(515, 17, 208, 16);
		panel_1.add(label_14);
		
		JLabel lblSLngMn = new JLabel("Thời Gian Mượn");
		lblSLngMn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLngMn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLngMn.setBounds(63, 102, 102, 25);
		panel_1.add(lblSLngMn);
		
		textField_2 = new JTextField();
		textField_2.setBounds(177, 14, 180, 22);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Thêm");
		btnNewButton_3.setBounds(763, 144, 141, 25);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Chỉnh Sửa");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(610, 144, 141, 25);
		panel_1.add(btnNewButton_4);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setBounds(457, 144, 141, 25);
		panel_1.add(btnXa);
		
		JLabel label_33 = new JLabel("Số Lượng Mượn");
		label_33.setHorizontalAlignment(SwingConstants.RIGHT);
		label_33.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_33.setBounds(63, 74, 102, 25);
		panel_1.add(label_33);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(177, 77, 90, 20);
		panel_1.add(textField_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(177, 103, 180, 22);
		panel_1.add(comboBox_3);
		
		JLabel lblnGiTr = new JLabel("Đơn Giá Trả");
		lblnGiTr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGiTr.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblnGiTr.setBounds(401, 45, 102, 25);
		panel_1.add(lblnGiTr);
		
		JLabel label_41 = new JLabel("");
		label_41.setBounds(515, 49, 208, 16);
		panel_1.add(label_41);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(12, 13, 916, 182);
		panel_2.setLayout(null);
		pnlMuonSach.add(panel_2);
		
		JLabel lblMThnhVin = new JLabel("Mã Thành Viên");
		lblMThnhVin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMThnhVin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMThnhVin.setBounds(67, 13, 102, 25);
		panel_2.add(lblMThnhVin);
		
		JLabel label_18 = new JLabel("");
		label_18.setBounds(181, 75, 180, 16);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setBounds(181, 47, 180, 16);
		panel_2.add(label_19);
		
		JLabel lblTnThnhVin = new JLabel("Tên Thành Viên");
		lblTnThnhVin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnThnhVin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTnThnhVin.setBounds(67, 43, 102, 25);
		panel_2.add(lblTnThnhVin);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính");
		lblGiiTnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiiTnh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGiiTnh.setBounds(67, 71, 102, 25);
		panel_2.add(lblGiiTnh);
		
		JLabel label_17 = new JLabel("");
		label_17.setBounds(181, 17, 180, 16);
		panel_2.add(label_17);
		
		JLabel lblaCh = new JLabel("Địa Chỉ");
		lblaCh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblaCh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblaCh.setBounds(399, 43, 102, 25);
		panel_2.add(lblaCh);
		
		JLabel label_25 = new JLabel("");
		label_25.setBounds(513, 47, 180, 16);
		panel_2.add(label_25);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEmail.setBounds(399, 71, 102, 25);
		panel_2.add(lblEmail);
		
		JLabel label_27 = new JLabel("");
		label_27.setBounds(513, 75, 180, 16);
		panel_2.add(label_27);
		
		JLabel lblNmSinh = new JLabel("Năm Sinh");
		lblNmSinh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNmSinh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNmSinh.setBounds(67, 98, 102, 25);
		panel_2.add(lblNmSinh);
		
		JLabel label_23 = new JLabel("");
		label_23.setBounds(181, 102, 180, 16);
		panel_2.add(label_23);
		
		JLabel lblSt_1 = new JLabel("SĐT");
		lblSt_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSt_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSt_1.setBounds(399, 13, 102, 25);
		panel_2.add(lblSt_1);
		
		JLabel label_21 = new JLabel("");
		label_21.setBounds(513, 22, 180, 16);
		panel_2.add(label_21);
		
		JButton btnNewButton_2 = new JButton("Chọn Thành Viên");
		btnNewButton_2.setBounds(763, 144, 141, 25);
		panel_2.add(btnNewButton_2);
		
		JButton btnThmThnhVin = new JButton("Thêm thành Viên Mới");
		btnThmThnhVin.setBounds(559, 144, 180, 25);
		panel_2.add(btnThmThnhVin);
		
		JLabel lblNghNghip = new JLabel("Nghề Nghiệp");
		lblNghNghip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNghNghip.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNghNghip.setBounds(399, 98, 102, 25);
		panel_2.add(lblNghNghip);
		
		JLabel label_37 = new JLabel("");
		label_37.setBounds(513, 102, 180, 16);
		panel_2.add(label_37);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Trả Sách", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(12, 13, 916, 183);
		panel_4.setLayout(null);
		panel_3.add(panel_4);
		
		JLabel label_5 = new JLabel("Mã Thành Viên");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_5.setBounds(63, 13, 102, 25);
		panel_4.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(193, 17, 222, 16);
		panel_4.add(label_6);
		
		JLabel label_11 = new JLabel("Tên Thành Viên");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_11.setBounds(63, 43, 102, 25);
		panel_4.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(193, 47, 222, 16);
		panel_4.add(label_12);
		
		JLabel label_13 = new JLabel("Giới Tính");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_13.setBounds(63, 71, 102, 25);
		panel_4.add(label_13);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(193, 75, 222, 16);
		panel_4.add(label_15);
		
		JLabel label_16 = new JLabel("Năm Sinh");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_16.setBounds(63, 98, 102, 25);
		panel_4.add(label_16);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(193, 102, 222, 16);
		panel_4.add(label_20);
		
		JLabel label_22 = new JLabel("Email");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_22.setBounds(399, 13, 102, 25);
		panel_4.add(label_22);
		
		JLabel label_24 = new JLabel("");
		label_24.setBounds(529, 75, 250, 16);
		panel_4.add(label_24);
		
		JLabel label_26 = new JLabel("Địa Chỉ");
		label_26.setHorizontalAlignment(SwingConstants.RIGHT);
		label_26.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_26.setBounds(399, 43, 102, 25);
		panel_4.add(label_26);
		
		JLabel label_28 = new JLabel("");
		label_28.setBounds(529, 47, 250, 16);
		panel_4.add(label_28);
		
		JLabel label_29 = new JLabel("SĐT");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_29.setBounds(399, 71, 102, 25);
		panel_4.add(label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setBounds(529, 17, 250, 16);
		panel_4.add(label_30);
		
		JButton button_7 = new JButton("Chọn Thành Viên");
		button_7.setBounds(763, 145, 141, 25);
		panel_4.add(button_7);
		
		JLabel label_34 = new JLabel("Nghề Nghiệp");
		label_34.setHorizontalAlignment(SwingConstants.RIGHT);
		label_34.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_34.setBounds(399, 98, 102, 25);
		panel_4.add(label_34);
		
		JLabel label_42 = new JLabel("");
		label_42.setBounds(513, 102, 180, 16);
		panel_4.add(label_42);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(12, 416, 916, 221);
		panel_3.add(scrollPane_4);
		
		JLabel label_31 = new JLabel("Tổng Tiền:");
		label_31.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_31.setBounds(732, 650, 67, 20);
		panel_3.add(label_31);
		
		JLabel label_32 = new JLabel("100000 VNĐ");
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setBounds(811, 650, 117, 20);
		panel_3.add(label_32);
		
		JButton button_8 = new JButton("Lập Hóa Đơn");
		button_8.setBounds(774, 680, 154, 25);
		panel_3.add(button_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(12, 198, 916, 194);
		panel_3.add(panel_5);
		
		JLabel lblChnSchTr = new JLabel("Chọn Sách Trả");
		lblChnSchTr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChnSchTr.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblChnSchTr.setBounds(62, 13, 102, 25);
		panel_5.add(lblChnSchTr);
		
		JLabel lblThiGianMn = new JLabel("Thời Gian Mượn");
		lblThiGianMn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThiGianMn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblThiGianMn.setBounds(62, 42, 102, 25);
		panel_5.add(lblThiGianMn);
		
		JLabel label_38 = new JLabel("Số Lượng Mượn");
		label_38.setHorizontalAlignment(SwingConstants.RIGHT);
		label_38.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_38.setBounds(62, 69, 102, 25);
		panel_5.add(label_38);
		
		JButton button_9 = new JButton("Thêm");
		button_9.setBounds(763, 144, 141, 25);
		panel_5.add(button_9);
		
		JButton button_10 = new JButton("Chỉnh Sửa");
		button_10.setBounds(610, 144, 141, 25);
		panel_5.add(button_10);
		
		JButton button_11 = new JButton("Xóa");
		button_11.setBounds(457, 144, 141, 25);
		panel_5.add(button_11);
		
		JLabel label_39 = new JLabel("");
		label_39.setBounds(176, 73, 196, 16);
		panel_5.add(label_39);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(176, 14, 196, 22);
		panel_5.add(comboBox);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(176, 42, 196, 22);
		panel_5.add(comboBox_4);
		
		JLabel lblnGiMn_1 = new JLabel("Đơn Giá Mượn");
		lblnGiMn_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGiMn_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblnGiMn_1.setBounds(62, 101, 102, 25);
		panel_5.add(lblnGiMn_1);
		
		JLabel label_35 = new JLabel("");
		label_35.setBounds(176, 105, 196, 16);
		panel_5.add(label_35);
		
		JLabel lblnGiTr_1 = new JLabel("Đơn Giá Trả");
		lblnGiTr_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGiTr_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblnGiTr_1.setBounds(62, 127, 102, 25);
		panel_5.add(lblnGiTr_1);
		
		JLabel label_36 = new JLabel("");
		label_36.setBounds(176, 131, 196, 16);
		panel_5.add(label_36);
		
		JLabel lblSLngTr = new JLabel("Số Lượng Trả");
		lblSLngTr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLngTr.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLngTr.setBounds(404, 13, 102, 25);
		panel_5.add(lblSLngTr);
		
		JLabel lblPhPhPht = new JLabel("Phụ Phí Phát Sinh");
		lblPhPhPht.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhPhPht.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPhPhPht.setBounds(384, 42, 122, 25);
		panel_5.add(lblPhPhPht);
		
		JLabel label_40 = new JLabel("");
		label_40.setBounds(518, 45, 196, 16);
		panel_5.add(label_40);
		
		textField_1 = new JTextField();
		textField_1.setBounds(518, 13, 90, 22);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDanhSchSch_3 = new JLabel("Danh sách Sách Trả");
		lblDanhSchSch_3.setBounds(12, 395, 164, 16);
		panel_3.add(lblDanhSchSch_3);
		
		JPanel pnlBanSach = new JPanel();
		tabbedPane.addTab("Bán Sách", null, pnlBanSach, null);
		pnlBanSach.setLayout(null);
		
		JPanel pnlThongTinSach = new JPanel();
		pnlThongTinSach.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlThongTinSach.setBounds(519, 190, 440, 225);
		pnlBanSach.add(pnlThongTinSach);
		pnlThongTinSach.setLayout(null);
		
		JLabel lblMaSach = new JLabel("Mã Sách");
		lblMaSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMaSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMaSach.setBounds(25, 13, 102, 25);
		pnlThongTinSach.add(lblMaSach);
		
		JLabel lblTenSach = new JLabel("Tên Sách");
		lblTenSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTenSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTenSach.setBounds(25, 36, 102, 25);
		pnlThongTinSach.add(lblTenSach);
		
		JLabel lblTheLoai = new JLabel("Thể Loại");
		lblTheLoai.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTheLoai.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTheLoai.setBounds(25, 63, 102, 25);
		pnlThongTinSach.add(lblTheLoai);
		
		JLabel lblSLMua = new JLabel("Số Lượng Mua");
		lblSLMua.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLMua.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLMua.setBounds(25, 151, 102, 25);
		pnlThongTinSach.add(lblSLMua);
		
		txtSLMua = new JTextField();
		txtSLMua.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSLMua.setColumns(10);
		txtSLMua.setBounds(155, 154, 104, 20);
		pnlThongTinSach.add(txtSLMua);
		
		JLabel lblSLSach = new JLabel("Số Lượng Còn");
		lblSLSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLSach.setBounds(25, 117, 102, 25);
		pnlThongTinSach.add(lblSLSach);
		
		JButton btnMua = new JButton("Chọn Mua");
		btnMua.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnMua.setBounds(296, 187, 102, 25);
		pnlThongTinSach.add(btnMua);
		
		JButton btnThayi = new JButton("Thay Đổi");
		btnThayi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThayi.setBounds(182, 188, 102, 25);
		pnlThongTinSach.add(btnThayi);
		
		JButton btnBoSach = new JButton("Bỏ Chọn");
		btnBoSach.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnBoSach.setBounds(68, 188, 102, 25);
		pnlThongTinSach.add(btnBoSach);
		
		JLabel lblnGi = new JLabel("Đơn Giá Bán");
		lblnGi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblnGi.setBounds(25, 92, 102, 25);
		pnlThongTinSach.add(lblnGi);
		
		txtMaSach = new JTextField();
		txtMaSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtMaSach.setEditable(false);
		txtMaSach.setColumns(10);
		txtMaSach.setBounds(155, 15, 180, 20);
		pnlThongTinSach.add(txtMaSach);
		
		txtTenSach = new JTextField();
		txtTenSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTenSach.setEditable(false);
		txtTenSach.setColumns(10);
		txtTenSach.setBounds(155, 39, 180, 20);
		pnlThongTinSach.add(txtTenSach);
		
		txtTheLoai = new JTextField();
		txtTheLoai.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTheLoai.setEditable(false);
		txtTheLoai.setColumns(10);
		txtTheLoai.setBounds(155, 66, 180, 20);
		pnlThongTinSach.add(txtTheLoai);
		
		txtDonGia = new JTextField();
		txtDonGia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtDonGia.setEditable(false);
		txtDonGia.setColumns(10);
		txtDonGia.setBounds(155, 95, 180, 20);
		pnlThongTinSach.add(txtDonGia);
		
		txtSLCon = new JTextField();
		txtSLCon.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSLCon.setEditable(false);
		txtSLCon.setColumns(10);
		txtSLCon.setBounds(155, 120, 180, 20);
		pnlThongTinSach.add(txtSLCon);
		
		JPanel pnlThongTinKhachHang = new JPanel();
		pnlThongTinKhachHang.setLayout(null);
		pnlThongTinKhachHang.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlThongTinKhachHang.setBounds(519, 11, 440, 174);
		pnlBanSach.add(pnlThongTinKhachHang);
		
		JLabel lblMKhchHng = new JLabel("M\u00E3 Kh\u00E1ch H\u00E0ng");
		lblMKhchHng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMKhchHng.setBounds(29, 32, 102, 25);
		pnlThongTinKhachHang.add(lblMKhchHng);
		
		JLabel lblTnKhchHng = new JLabel("T\u00EAn Kh\u00E1ch H\u00E0ng");
		lblTnKhchHng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTnKhchHng.setBounds(29, 55, 102, 25);
		pnlThongTinKhachHang.add(lblTnKhchHng);
		
		txtMaKH = new JTextField();
		txtMaKH.setEditable(false);
		txtMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtMaKH.setColumns(10);
		txtMaKH.setBounds(150, 34, 180, 20);
		pnlThongTinKhachHang.add(txtMaKH);
		
		txtTenKH = new JTextField();
		txtTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTenKH.setColumns(10);
		txtTenKH.setBounds(150, 57, 180, 20);
		pnlThongTinKhachHang.add(txtTenKH);
		
		JLabel lblSt = new JLabel("SĐT");
		lblSt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSt.setBounds(29, 85, 102, 16);
		pnlThongTinKhachHang.add(lblSt);
		
		txtSdt = new JTextField();
		txtSdt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSdt.setColumns(10);
		txtSdt.setBounds(150, 81, 180, 20);
		pnlThongTinKhachHang.add(txtSdt);
		
		JButton btnChonKH = new JButton("Chọn Thành Viên");
		btnChonKH.setBounds(264, 134, 154, 25);
		pnlThongTinKhachHang.add(btnChonKH);
		
		JCheckBox checkBox = new JCheckBox("Khách hàng vãng lai");
		checkBox.setBounds(8, 7, 156, 25);
		pnlThongTinKhachHang.add(checkBox);
		
		JLabel lblNghNghip_1 = new JLabel("Nghề Nghiệp");
		lblNghNghip_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNghNghip_1.setBounds(29, 107, 102, 16);
		pnlThongTinKhachHang.add(lblNghNghip_1);
		
		txtNgheNghiep = new JTextField();
		txtNgheNghiep.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtNgheNghiep.setColumns(10);
		txtNgheNghiep.setBounds(150, 103, 180, 20);
		pnlThongTinKhachHang.add(txtNgheNghiep);
		
		JButton btnThemKH = new JButton("Thêm Thành Viên");
		btnThemKH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnThemKH.setBounds(50, 136, 154, 25);
		pnlThongTinKhachHang.add(btnThemKH);
		
		JPanel pnlTimKiemSach = new JPanel();
		pnlTimKiemSach.setLayout(null);
		pnlTimKiemSach.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlTimKiemSach.setBounds(10, 11, 497, 404);
		pnlBanSach.add(pnlTimKiemSach);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTimKiem.setColumns(10);
		txtTimKiem.setBounds(10, 44, 236, 20);
		pnlTimKiemSach.add(txtTimKiem);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setBounds(385, 44, 100, 20);
		pnlTimKiemSach.add(btnTimKiem);
		
		JComboBox cbbTheLoai = new JComboBox();
		cbbTheLoai.setModel(new DefaultComboBoxModel(new String[] {"Thể Loại"}));
		cbbTheLoai.setBounds(258, 44, 118, 20);
		pnlTimKiemSach.add(cbbTheLoai);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 71, 475, 320);
		pnlTimKiemSach.add(scrollPane_1);
		
		JLabel lblDanhSchSch_1 = new JLabel("Danh Sách Sách");
		lblDanhSchSch_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDanhSchSch_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchSch_1.setBounds(10, 13, 475, 16);
		pnlTimKiemSach.add(lblDanhSchSch_1);
		
		JScrollPane lstSachMua = new JScrollPane();
		lstSachMua.setBounds(10, 443, 949, 161);
		pnlBanSach.add(lstSachMua);
		
		table_3 = new JTable();
		lstSachMua.setViewportView(table_3);
		
		JLabel lblDanhSchSch = new JLabel("Danh sách Sách Chọn Mua");
		lblDanhSchSch.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDanhSchSch.setBounds(10, 418, 198, 16);
		pnlBanSach.add(lblDanhSchSch);
		
		JLabel label_7 = new JLabel("Tổng Tiền:");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_7.setBounds(729, 418, 67, 20);
		pnlBanSach.add(label_7);
		
		JLabel label_47 = new JLabel("100000 VNĐ");
		label_47.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_47.setBounds(813, 418, 117, 20);
		pnlBanSach.add(label_47);
		
		JButton btnXuatHD = new JButton("Xuất Hóa Đơn");
		btnXuatHD.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnXuatHD.setBounds(842, 608, 117, 25);
		pnlBanSach.add(btnXuatHD);
		
		JPanel panel_12 = new JPanel();
		tabbedPane.addTab("Hóa Đơn", null, panel_12, null);
		panel_12.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(10, 11, 495, 625);
		panel_12.add(panel_13);
		
		JLabel lblDanhSchHa = new JLabel("Danh Sách Hóa Đơn");
		lblDanhSchHa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchHa.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblDanhSchHa.setBounds(148, 11, 213, 34);
		panel_13.add(lblDanhSchHa);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_19.setColumns(10);
		textField_19.setBounds(10, 76, 239, 25);
		panel_13.add(textField_19);
		
		JButton button_1 = new JButton("Tìm Kiếm");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_1.setBounds(385, 76, 100, 25);
		panel_13.add(button_1);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(10, 113, 475, 474);
		panel_13.add(scrollPane_8);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_7.setBounds(258, 76, 120, 25);
		panel_13.add(comboBox_7);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_14.setBounds(515, 11, 450, 196);
		panel_12.add(panel_14);
		
		JLabel lblMH = new JLabel("Mã HĐ:");
		lblMH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMH.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMH.setBounds(40, 12, 72, 17);
		panel_14.add(lblMH);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(138, 9, 86, 20);
		panel_14.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(138, 38, 214, 20);
		panel_14.add(textField_21);
		
		JLabel lblNgyLp = new JLabel("Ngày Lập:");
		lblNgyLp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgyLp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNgyLp.setBounds(40, 41, 72, 17);
		panel_14.add(lblNgyLp);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(138, 69, 101, 20);
		panel_14.add(textField_22);
		
		JLabel label_51 = new JLabel("Mã NV:");
		label_51.setHorizontalAlignment(SwingConstants.RIGHT);
		label_51.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_51.setBounds(40, 72, 72, 17);
		panel_14.add(label_51);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(138, 130, 101, 20);
		panel_14.add(textField_23);
		
		JLabel label_52 = new JLabel("Số lượng:");
		label_52.setHorizontalAlignment(SwingConstants.RIGHT);
		label_52.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_52.setBounds(40, 133, 72, 17);
		panel_14.add(label_52);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(138, 161, 101, 20);
		panel_14.add(textField_24);
		
		JLabel lblTngTin = new JLabel("Tổng Tiền:");
		lblTngTin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTngTin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTngTin.setBounds(40, 164, 72, 17);
		panel_14.add(lblTngTin);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(138, 99, 101, 20);
		panel_14.add(textField_25);
		
		JLabel lblMKh = new JLabel("Mã KH:");
		lblMKh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMKh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMKh.setBounds(40, 102, 72, 17);
		panel_14.add(lblMKh);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_15.setBounds(515, 254, 450, 347);
		panel_12.add(panel_15);
		
		JLabel lblChiTitHa = new JLabel("Chi Tiết Hóa Đơn");
		lblChiTitHa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChiTitHa.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblChiTitHa.setBounds(10, 11, 139, 17);
		panel_15.add(lblChiTitHa);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(0, 36, 450, 311);
		panel_15.add(scrollPane_9);
		
		JButton btnNewButton_6 = new JButton("Xuất Báo Cáo");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_6.setBounds(838, 608, 121, 27);
		panel_12.add(btnNewButton_6);
		
		JButton btnXemChiTit = new JButton("Xem Chi Tiết");
		btnXemChiTit.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnXemChiTit.setBounds(844, 216, 121, 27);
		panel_12.add(btnXemChiTit);
		
		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("Nhập Sách", null, panel_9, null);
		panel_9.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setBounds(10, 11, 533, 374);
		panel_9.add(panel_10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(49, 42, 236, 25);
		panel_10.add(textField_13);
		
		JButton button = new JButton("Tìm Kiếm");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.setBounds(423, 42, 100, 25);
		panel_10.add(button);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_1.setBounds(295, 42, 118, 25);
		panel_10.add(comboBox_1);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 71, 513, 295);
		panel_10.add(scrollPane_6);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBounds(553, 11, 406, 337);
		panel_9.add(panel_11);
		
		JTextArea txaMoTaN = new JTextArea();
		txaMoTaN.setText("");
		txaMoTaN.setBounds(152, 226, 244, 100);
		panel_11.add(txaMoTaN);
		
		nhapSachTablemodel sachtbModel = new nhapSachTablemodel();
		tbSach = new JTable();
		
		tbSach.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ms = Integer.parseInt(tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 0).toString());
				String tenSach = tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 1).toString();
				String tacGia = tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 2).toString();
				String theloai = tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 3).toString();
				int sl = Integer.parseInt(tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 4).toString());
				
				if(tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 5)!=null) {
					String mota = tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 5).toString();
					System.out.println("mota: "+mota);
				}
				txtMaSachN.setText(String.valueOf(ms));
				txtTenSachN.setText(tenSach);
				txtSoLuongConN.setText(String.valueOf(sl));
				txtTheLoaiN.setText(theloai);
				
			}
		});
		tbSach.setModel(sachtbModel.sachTablmodel());
		scrollPane_6.setViewportView(tbSach);
		
		JLabel label_43 = new JLabel("Danh Sách Sách");
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		label_43.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_43.setBounds(10, 13, 475, 16);
		panel_10.add(label_43);
		
		JLabel lblDanhSchSch_4 = new JLabel("Danh sách Sách Nhập");
		lblDanhSchSch_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDanhSchSch_4.setBounds(10, 385, 198, 16);
		panel_9.add(lblDanhSchSch_4);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 412, 949, 200);
		panel_9.add(scrollPane_7);
		
		tbctpN = new JTable();
		DefaultTableModel ctpnModel = new DefaultTableModel();
		tbctpN.setModel(ctpnModel);
		scrollPane_7.setViewportView(tbctpN);
		
		
		
		JLabel label_44 = new JLabel("Mã Sách");
		label_44.setHorizontalAlignment(SwingConstants.RIGHT);
		label_44.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_44.setBounds(25, 13, 102, 25);
		panel_11.add(label_44);
		
		JLabel label_45 = new JLabel("Tên Sách");
		label_45.setHorizontalAlignment(SwingConstants.RIGHT);
		label_45.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_45.setBounds(25, 49, 102, 25);
		panel_11.add(label_45);
		
		JLabel label_46 = new JLabel("Thể Loại");
		label_46.setHorizontalAlignment(SwingConstants.RIGHT);
		label_46.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_46.setBounds(25, 85, 102, 25);
		panel_11.add(label_46);
		
		JLabel lblSLngNhp = new JLabel("Số Lượng Nhập");
		lblSLngNhp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLngNhp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLngNhp.setBounds(25, 193, 102, 25);
		panel_11.add(lblSLngNhp);
		
		txtSLNhap = new JTextField();
		txtSLNhap.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSLNhap.setColumns(10);
		txtSLNhap.setBounds(152, 195, 116, 25);
		panel_11.add(txtSLNhap);
		
		JLabel label_48 = new JLabel("Số Lượng Còn");
		label_48.setHorizontalAlignment(SwingConstants.RIGHT);
		label_48.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_48.setBounds(25, 157, 102, 25);
		panel_11.add(label_48);
		
		JLabel lblGiNhp = new JLabel("Giá Nhập");
		lblGiNhp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiNhp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGiNhp.setBounds(25, 121, 102, 25);
		panel_11.add(lblGiNhp);
		
		JLabel lblMT = new JLabel("Mô Tả");
		lblMT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMT.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMT.setBounds(25, 229, 102, 25);
		panel_11.add(lblMT);
		
		txtMaSachN = new JTextField();
		txtMaSachN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtMaSachN.setColumns(10);
		txtMaSachN.setBounds(152, 16, 116, 25);
		panel_11.add(txtMaSachN);
		
		txtTenSachN = new JTextField();
		txtTenSachN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTenSachN.setColumns(10);
		txtTenSachN.setBounds(152, 52, 244, 25);
		panel_11.add(txtTenSachN);
		
		
		
		txtSoLuongConN = new JTextField();
		txtSoLuongConN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSoLuongConN.setColumns(10);
		txtSoLuongConN.setBounds(152, 160, 116, 25);
		panel_11.add(txtSoLuongConN);
		
		txtGiaNhapN = new JTextField();
		txtGiaNhapN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtGiaNhapN.setColumns(10);
		txtGiaNhapN.setBounds(152, 124, 157, 25);
		panel_11.add(txtGiaNhapN);
		
		txtTheLoaiN = new JTextField();
		txtTheLoaiN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTheLoaiN.setColumns(10);
		txtTheLoaiN.setBounds(152, 88, 157, 25);
		panel_11.add(txtTheLoaiN);
		
		JButton btnNhpSch = new JButton("Nhập tất cả");
		btnNhpSch.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNhpSch.setBounds(857, 614, 102, 28);
		panel_9.add(btnNhpSch);
		
		JButton button_3 = new JButton("Bỏ Chọn");
		button_3.setBounds(596, 362, 102, 25);
		panel_9.add(button_3);
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		nhapSachTablemodel nstbmodel= new nhapSachTablemodel(ctpnModel);
		JButton txtChonN = new JButton("Chọn");
		txtChonN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sach s = new Sach();
				
				
				
				ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
				ctpn.setGianhap(Long.parseLong(txtGiaNhapN.getText()));
				ctpn.setSoluong(Integer.parseInt(txtSLNhap.getText()));
				//nstbmodel.getCtpns().add
				nstbmodel.addchipntableModel(s,ctpn);
			}
		});
		txtChonN.setBounds(716, 362, 102, 25);
		panel_9.add(txtChonN);
		txtChonN.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JButton btnThm = new JButton("Thêm Sách mới");
		btnThm.setBounds(830, 362, 129, 25);
		panel_9.add(btnThm);
		btnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmThemSachMoi frmthemsach = new frmThemSachMoi();
				frmthemsach.setVisible(true);
			}
		});
		btnThm.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JPanel pnl_QLSach = new JPanel();
		tabbedPane.addTab("Quản Lí Nhập Sách", null, pnl_QLSach, null);
		pnl_QLSach.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 8, 495, 625);
		pnl_QLSach.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblThongTinNhap = new JLabel("Thông Tin Phiếu Nhập");
		lblThongTinNhap.setHorizontalAlignment(SwingConstants.CENTER);
		lblThongTinNhap.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblThongTinNhap.setBounds(74, 11, 213, 25);
		panel_6.add(lblThongTinNhap);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_5.setBounds(10, 76, 239, 25);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Tìm Kiếm");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_5.setBounds(385, 76, 100, 25);
		panel_6.add(btnNewButton_5);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 113, 475, 474);
		panel_6.add(scrollPane_5);
		
		table_2 = new JTable();
		table_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane_5.setViewportView(table_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_2.setBounds(258, 76, 120, 25);
		panel_6.add(comboBox_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(505, 8, 454, 232);
		pnl_QLSach.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã PN:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 72, 17);
		panel_7.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(92, 10, 86, 20);
		panel_7.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(92, 56, 214, 20);
		panel_7.add(textField_7);
		
		JLabel lblNgyNhp = new JLabel("Ngày nhập:");
		lblNgyNhp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgyNhp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNgyNhp.setBounds(10, 57, 72, 17);
		panel_7.add(lblNgyNhp);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(92, 98, 86, 20);
		panel_7.add(textField_9);
		
		JLabel lblMNv = new JLabel("Mã NV:");
		lblMNv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMNv.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMNv.setBounds(10, 99, 72, 17);
		panel_7.add(lblMNv);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(92, 144, 86, 20);
		panel_7.add(textField_12);
		
		JLabel lblSLng = new JLabel("Số lượng:");
		lblSLng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLng.setBounds(10, 145, 72, 17);
		panel_7.add(lblSLng);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(505, 251, 450, 347);
		pnl_QLSach.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblChiTitPhiu = new JLabel("Chi Tiết Phiếu Nhập");
		lblChiTitPhiu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChiTitPhiu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblChiTitPhiu.setBounds(10, 11, 139, 17);
		panel_8.add(lblChiTitPhiu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 36, 450, 311);
		panel_8.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnBoCo = new JButton("Xuất Báo Cáo");
		btnBoCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoCo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnBoCo.setBounds(838, 609, 121, 25);
		pnl_QLSach.add(btnBoCo);
		
		JPanel pnlThanhVien = new JPanel();
		tabbedPane.addTab("Thành Viên", null, pnlThanhVien, null);
		pnlThanhVien.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 187, 916, 518);
		pnlThanhVien.add(scrollPane_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 101, 919, 83);
		panel.setLayout(null);
		pnlThanhVien.add(panel);
		
		JButton btnNewButton_1 = new JButton("Thêm Thành Viên");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(0, 13, 135, 28);
		panel.add(btnNewButton_1);
		
		JButton button_5 = new JButton("Chỉnh Sửa Thông Tin");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(147, 13, 153, 28);
		panel.add(button_5);
		
		textField_8 = new JTextField();
		textField_8.setBounds(314, 53, 371, 22);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnTmKim = new JButton("Tìm Kiếm");
		btnTmKim.setBounds(822, 52, 97, 25);
		panel.add(btnTmKim);
		
		JButton button_6 = new JButton("Xóa Thành Viên");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(314, 15, 153, 28);
		panel.add(button_6);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(697, 53, 113, 22);
		panel.add(comboBox_5);
		
		JLabel lblQunLThnh = new JLabel("Quản Lý Thành Viên");
		lblQunLThnh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQunLThnh.setBounds(367, 13, 192, 46);
		pnlThanhVien.add(lblQunLThnh);
	}
}
