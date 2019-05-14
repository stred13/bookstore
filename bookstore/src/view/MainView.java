package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
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

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtSLMua;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table_1;
	private JTextField txtTimKiem;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;

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
		setBounds(100, 100, 973, 805);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel pnl_NhapSach = new JPanel();
		tabbedPane.addTab("Quản Lý Sách", null, pnl_NhapSach, null);
		pnl_NhapSach.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 163, 918, 542);
		pnl_NhapSach.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 123, 918, 38);
		panel_8.setLayout(null);
		pnl_NhapSach.add(panel_8);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_6.setColumns(10);
		panel_8.add(textField_6);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_8.add(comboBox_1);
		
		JButton button_2 = new JButton("Tìm Kiếm");
		panel_8.add(button_2);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(449, 13, 305, 20);
		panel_8.add(textField_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(135, 13, 153, 20);
		panel_8.add(comboBox_2);
		
		JButton button_3 = new JButton("Tìm Kiếm");
		button_3.setBounds(806, 13, 100, 20);
		panel_8.add(button_3);
		
		JLabel lblLoiTmKim = new JLabel("Loại Tìm Kiếm");
		lblLoiTmKim.setBounds(29, 15, 92, 16);
		panel_8.add(lblLoiTmKim);
		
		JLabel lblTKhaTm = new JLabel("Từ Khóa Tìm Kiếm");
		lblTKhaTm.setBounds(335, 15, 119, 16);
		panel_8.add(lblTKhaTm);
		
		JLabel lblQunLSch = new JLabel("Quản Lý Sách");
		lblQunLSch.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblQunLSch.setBounds(370, 13, 201, 46);
		pnl_NhapSach.add(lblQunLSch);
		
		JButton button_4 = new JButton("Thêm Sách Mới");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(10, 87, 137, 31);
		pnl_NhapSach.add(button_4);
		
		JButton button = new JButton("Chỉnh sửa thông tin sách");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(167, 87, 178, 31);
		pnl_NhapSach.add(button);
		
		JButton button_1 = new JButton("Xóa sách");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(370, 87, 178, 31);
		pnl_NhapSach.add(button_1);
		
		JPanel pnlBanSach = new JPanel();
		tabbedPane.addTab("Bán Sách", null, pnlBanSach, null);
		pnlBanSach.setLayout(null);
		
		JPanel pnlThongTinSach = new JPanel();
		pnlThongTinSach.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlThongTinSach.setBounds(519, 145, 411, 236);
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
		txtSLMua.setBounds(155, 154, 172, 20);
		pnlThongTinSach.add(txtSLMua);
		
		JLabel lblSLSach = new JLabel("Số Lượng Còn");
		lblSLSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLSach.setBounds(25, 117, 102, 25);
		pnlThongTinSach.add(lblSLSach);
		
		JLabel txtTheLoai = new JLabel("");
		txtTheLoai.setBounds(155, 67, 180, 16);
		pnlThongTinSach.add(txtTheLoai);
		
		JButton btnChnMua = new JButton("Chọn Mua");
		btnChnMua.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnChnMua.setBounds(271, 189, 102, 25);
		pnlThongTinSach.add(btnChnMua);
		
		JButton btnThayi = new JButton("Thay Đổi");
		btnThayi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThayi.setBounds(157, 190, 102, 25);
		pnlThongTinSach.add(btnThayi);
		
		JButton btnXa_1 = new JButton("Bỏ Chọn");
		btnXa_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnXa_1.setBounds(43, 190, 102, 25);
		pnlThongTinSach.add(btnXa_1);
		
		JLabel lblnGi = new JLabel("Đơn Giá Bán");
		lblnGi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblnGi.setBounds(25, 92, 102, 25);
		pnlThongTinSach.add(lblnGi);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(155, 96, 180, 16);
		pnlThongTinSach.add(label_8);
		
		JLabel label = new JLabel("");
		label.setBounds(155, 125, 180, 16);
		pnlThongTinSach.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(155, 40, 180, 16);
		pnlThongTinSach.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(155, 17, 180, 16);
		pnlThongTinSach.add(label_2);
		
		JPanel pnlThongTinKhachHang = new JPanel();
		pnlThongTinKhachHang.setLayout(null);
		pnlThongTinKhachHang.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlThongTinKhachHang.setBounds(519, 13, 411, 124);
		pnlBanSach.add(pnlThongTinKhachHang);
		
		JLabel lblMKhchHng = new JLabel("M\u00E3 Kh\u00E1ch H\u00E0ng");
		lblMKhchHng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMKhchHng.setBounds(29, 14, 102, 25);
		pnlThongTinKhachHang.add(lblMKhchHng);
		
		JLabel lblTnKhchHng = new JLabel("T\u00EAn Kh\u00E1ch H\u00E0ng");
		lblTnKhchHng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTnKhchHng.setBounds(29, 37, 102, 25);
		pnlThongTinKhachHang.add(lblTnKhchHng);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(150, 16, 180, 20);
		pnlThongTinKhachHang.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(150, 39, 180, 20);
		pnlThongTinKhachHang.add(textField_11);
		
		JCheckBox checkBoxKhachHang = new JCheckBox("Khách hàng vãng lai");
		checkBoxKhachHang.setBounds(147, 90, 156, 25);
		pnlThongTinKhachHang.add(checkBoxKhachHang);
		
		JLabel lblSt = new JLabel("SĐT");
		lblSt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSt.setBounds(75, 67, 56, 16);
		pnlThongTinKhachHang.add(lblSt);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(150, 63, 180, 20);
		pnlThongTinKhachHang.add(textField);
		
		JPanel pnlTimKiemSach = new JPanel();
		pnlTimKiemSach.setLayout(null);
		pnlTimKiemSach.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlTimKiemSach.setBounds(10, 11, 497, 53);
		pnlBanSach.add(pnlTimKiemSach);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTimKiem.setColumns(10);
		txtTimKiem.setBounds(10, 14, 230, 20);
		pnlTimKiemSach.add(txtTimKiem);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setBounds(379, 14, 100, 20);
		pnlTimKiemSach.add(btnTimKiem);
		
		JComboBox cbbTheLoai = new JComboBox();
		cbbTheLoai.setModel(new DefaultComboBoxModel(new String[] {"Thể Loại"}));
		cbbTheLoai.setBounds(252, 14, 118, 20);
		pnlTimKiemSach.add(cbbTheLoai);
		
		JScrollPane lstSachMua = new JScrollPane();
		lstSachMua.setBounds(10, 417, 920, 209);
		pnlBanSach.add(lstSachMua);
		
		JButton btnNewButton = new JButton("Xuất hóa đơn");
		btnNewButton.setBounds(762, 664, 168, 36);
		pnlBanSach.add(btnNewButton);
		
		JLabel label_7 = new JLabel("Tổng Tiền:");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_7.setBounds(734, 631, 67, 20);
		pnlBanSach.add(label_7);
		
		JLabel lblVn = new JLabel("100000 VNĐ");
		lblVn.setBounds(813, 631, 117, 20);
		pnlBanSach.add(lblVn);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 95, 497, 286);
		pnlBanSach.add(scrollPane_1);
		
		JLabel lblDanhSchSch = new JLabel("Danh Sách Sách Chọn Mua");
		lblDanhSchSch.setBounds(10, 397, 168, 16);
		pnlBanSach.add(lblDanhSchSch);
		
		JLabel lblDanhSchSch_1 = new JLabel("Danh Sách Sách Tìm Kiếm");
		lblDanhSchSch_1.setBounds(10, 77, 168, 16);
		pnlBanSach.add(lblDanhSchSch_1);
		
		JPanel pnlMuonSach = new JPanel();
		pnlMuonSach.setLayout(null);
		tabbedPane.addTab("Mượn Sách", null, pnlMuonSach, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 386, 916, 251);
		pnlMuonSach.add(scrollPane_2);
		
		JLabel lblDanhSchSch_2 = new JLabel("Danh sách Sách mượn");
		lblDanhSchSch_2.setBounds(12, 363, 145, 16);
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
		panel_1.setBounds(12, 168, 916, 182);
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
		textField_3.setBounds(177, 77, 180, 20);
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
		panel_2.setBounds(12, 13, 916, 150);
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
		btnNewButton_2.setBounds(763, 112, 141, 25);
		panel_2.add(btnNewButton_2);
		
		JButton btnThmThnhVin = new JButton("Thêm thành Viên Mới");
		btnThmThnhVin.setBounds(559, 112, 180, 25);
		panel_2.add(btnThmThnhVin);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Trả Sách", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(12, 13, 916, 152);
		panel_4.setLayout(null);
		panel_3.add(panel_4);
		
		JLabel label_5 = new JLabel("Mã Thành Viên");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_5.setBounds(63, 13, 102, 25);
		panel_4.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(193, 17, 250, 16);
		panel_4.add(label_6);
		
		JLabel label_11 = new JLabel("Tên Thành Viên");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_11.setBounds(63, 43, 102, 25);
		panel_4.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(193, 47, 250, 16);
		panel_4.add(label_12);
		
		JLabel label_13 = new JLabel("Giới Tính");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_13.setBounds(63, 71, 102, 25);
		panel_4.add(label_13);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(193, 75, 250, 16);
		panel_4.add(label_15);
		
		JLabel label_16 = new JLabel("Năm Sinh");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_16.setBounds(63, 98, 102, 25);
		panel_4.add(label_16);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(193, 102, 250, 16);
		panel_4.add(label_20);
		
		JLabel label_22 = new JLabel("Email");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_22.setBounds(399, 71, 102, 25);
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
		label_29.setBounds(399, 13, 102, 25);
		panel_4.add(label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setBounds(529, 17, 250, 16);
		panel_4.add(label_30);
		
		JButton button_7 = new JButton("Chọn Thành Viên");
		button_7.setBounds(763, 112, 141, 25);
		panel_4.add(button_7);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(12, 389, 916, 248);
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
		panel_5.setBounds(12, 172, 916, 183);
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
		textField_1.setBounds(518, 13, 196, 22);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDanhSchSch_3 = new JLabel("Danh sách Sách Trả");
		lblDanhSchSch_3.setBounds(12, 367, 164, 16);
		panel_3.add(lblDanhSchSch_3);
		
		JPanel pnlThanhVien = new JPanel();
		tabbedPane.addTab("Thành Viên", null, pnlThanhVien, null);
		pnlThanhVien.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 188, 919, 517);
		pnlThanhVien.add(scrollPane_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 87, 919, 92);
		panel.setLayout(null);
		pnlThanhVien.add(panel);
		
		JButton btnNewButton_1 = new JButton("Thêm Thành Viên");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(0, 26, 135, 28);
		panel.add(btnNewButton_1);
		
		JButton button_5 = new JButton("Chỉnh Sửa Thông Tin");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(147, 26, 153, 28);
		panel.add(button_5);
		
		textField_8 = new JTextField();
		textField_8.setBounds(498, 66, 300, 22);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnTmKim = new JButton("Tìm Kiếm");
		btnTmKim.setBounds(810, 65, 97, 25);
		panel.add(btnTmKim);
		
		JButton button_6 = new JButton("Xóa Thành Viên");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(314, 28, 153, 28);
		panel.add(button_6);
		
		JLabel lblQunLThnh = new JLabel("Quản Lý Thành Viên");
		lblQunLThnh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQunLThnh.setBounds(367, 13, 192, 46);
		pnlThanhVien.add(lblQunLThnh);
	}
}
