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
import viewmodels.NhanVienTableModel;
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
import javax.swing.ScrollPaneConstants;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField txtSLMua;
	private JTextField txtMaKH;
	private JTextField txtTenKH;
	private JTable table_1;
	private JTextField txtTimKiem;
	private JTextField textField_8;
	private JTextField txtSdt;
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
	private JTable tbListNhanVien;

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
		setBounds(100, 100, 1000, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel BanSach = new JPanel();
		tabbedPane.addTab("Bán Sách", null, BanSach, null);
		BanSach.setLayout(null);
		
		JPanel pnlThongTinSach = new JPanel();
		pnlThongTinSach.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlThongTinSach.setBounds(519, 190, 440, 225);
		BanSach.add(pnlThongTinSach);
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
		BanSach.add(pnlThongTinKhachHang);
		
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
		BanSach.add(pnlTimKiemSach);
		
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
		BanSach.add(lstSachMua);
		
		table_3 = new JTable();
		lstSachMua.setViewportView(table_3);
		
		JLabel lblDanhSchSch = new JLabel("Danh sách Sách Chọn Mua");
		lblDanhSchSch.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDanhSchSch.setBounds(10, 418, 198, 16);
		BanSach.add(lblDanhSchSch);
		
		JLabel label_7 = new JLabel("Tổng Tiền:");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_7.setBounds(729, 418, 67, 20);
		BanSach.add(label_7);
		
		JLabel label_47 = new JLabel("100000 VNĐ");
		label_47.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_47.setBounds(813, 418, 117, 20);
		BanSach.add(label_47);
		
		JButton btnXuatHD = new JButton("Xuất Hóa Đơn");
		btnXuatHD.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnXuatHD.setBounds(842, 608, 117, 25);
		BanSach.add(btnXuatHD);
		
		JPanel QLHDBanSach = new JPanel();
		tabbedPane.addTab("Hóa Đơn", null, QLHDBanSach, null);
		QLHDBanSach.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(10, 11, 495, 625);
		QLHDBanSach.add(panel_13);
		
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
		QLHDBanSach.add(panel_14);
		
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
		QLHDBanSach.add(panel_15);
		
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
		QLHDBanSach.add(btnNewButton_6);
		
		JButton btnXemChiTit = new JButton("Xem Chi Tiết");
		btnXemChiTit.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnXemChiTit.setBounds(844, 216, 121, 27);
		QLHDBanSach.add(btnXemChiTit);
		
		JPanel NhapSach = new JPanel();
		tabbedPane.addTab("Nhập Sách", null, NhapSach, null);
		NhapSach.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setBounds(10, 11, 533, 374);
		NhapSach.add(panel_10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(10, 42, 275, 25);
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
		scrollPane_6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_6.setBounds(10, 71, 513, 295);
		panel_10.add(scrollPane_6);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBounds(553, 11, 406, 337);
		NhapSach.add(panel_11);
		
		JTextArea txtMoTaN = new JTextArea();
		txtMoTaN.setEditable(false);
		txtMoTaN.setText("");
		txtMoTaN.setBounds(152, 226, 244, 100);
		panel_11.add(txtMoTaN);
		
		nhapSachTablemodel sachtbModel = new nhapSachTablemodel();
		tbSach = new JTable(){
			public boolean isCellEditable(int rowIndex, int colIndex) {
				return false;
			}
		};
		
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
					txtMoTaN.setText(mota);
				}
				txtMaSachN.setText(String.valueOf(ms));
				txtTenSachN.setText(tenSach);
				txtSoLuongConN.setText(String.valueOf(sl));
				txtSLNhap.setText("0");
				txtGiaNhapN.setText("0");
				txtTheLoaiN.setText(theloai);
				tbSach.getSelectionModel().clearSelection();
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
		NhapSach.add(lblDanhSchSch_4);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 412, 949, 216);
		NhapSach.add(scrollPane_7);
		
		tbctpN = new JTable(){
			public boolean isCellEditable(int rowIndex, int colIndex) {
				return false;
			}
		};
		tbctpN.setModel(sachtbModel.sachNhapTablmodel());
		tbctpN.getColumnModel().getColumn(0).setMinWidth(0);
		tbctpN.getColumnModel().getColumn(0).setMaxWidth(0);
		tbctpN.getColumnModel().getColumn(0).setWidth(0);
		tbctpN.getColumnModel().getColumn(7).setMinWidth(0);
		tbctpN.getColumnModel().getColumn(7).setMaxWidth(0);
		tbctpN.getColumnModel().getColumn(7).setWidth(0);
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
		lblSLngNhp.setBounds(25, 153, 102, 25);
		panel_11.add(lblSLngNhp);
		
		txtSLNhap = new JTextField();
		txtSLNhap.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSLNhap.setColumns(10);
		txtSLNhap.setBounds(152, 153, 78, 25);
		panel_11.add(txtSLNhap);
		
		JLabel label_48 = new JLabel("Số Lượng Còn");
		label_48.setHorizontalAlignment(SwingConstants.RIGHT);
		label_48.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_48.setBounds(25, 120, 102, 25);
		panel_11.add(label_48);
		
		JLabel lblGiNhp = new JLabel("Giá Nhập");
		lblGiNhp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiNhp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGiNhp.setBounds(25, 188, 102, 25);
		panel_11.add(lblGiNhp);
		
		JLabel lblMT = new JLabel("Mô Tả");
		lblMT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMT.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMT.setBounds(25, 225, 102, 25);
		panel_11.add(lblMT);
		
		txtMaSachN = new JTextField();
		txtMaSachN.setEditable(false);
		txtMaSachN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtMaSachN.setColumns(10);
		txtMaSachN.setBounds(152, 16, 157, 25);
		panel_11.add(txtMaSachN);
		
		txtTenSachN = new JTextField();
		txtTenSachN.setEditable(false);
		txtTenSachN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTenSachN.setColumns(10);
		txtTenSachN.setBounds(152, 52, 157, 25);
		panel_11.add(txtTenSachN);
		
		
		
		txtSoLuongConN = new JTextField();
		txtSoLuongConN.setEditable(false);
		txtSoLuongConN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSoLuongConN.setColumns(10);
		txtSoLuongConN.setBounds(152, 120, 78, 25);
		panel_11.add(txtSoLuongConN);
		
		txtGiaNhapN = new JTextField();
		txtGiaNhapN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtGiaNhapN.setColumns(10);
		txtGiaNhapN.setBounds(152, 188, 157, 25);
		panel_11.add(txtGiaNhapN);
		
		txtTheLoaiN = new JTextField();
		txtTheLoaiN.setEditable(false);
		txtTheLoaiN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTheLoaiN.setColumns(10);
		txtTheLoaiN.setBounds(152, 88, 157, 25);
		panel_11.add(txtTheLoaiN);
		
		JButton btnNhpSch = new JButton("Nhập tất cả");
		btnNhpSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sachtbModel.nhapSach();
			}
		});
		btnNhpSch.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNhpSch.setBounds(830, 641, 125, 28);
		NhapSach.add(btnNhpSch);
		
		JButton button_3 = new JButton("Bỏ Chọn");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tbctpN.getSelectedRow() != -1) {
					sachtbModel.boChonSach(Integer.parseInt(tbctpN.getModel().getValueAt(tbctpN.getSelectedRow(), 0).toString()));					
				}
			}
		});
		button_3.setBounds(716, 641, 102, 28);
		NhapSach.add(button_3);
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JButton txtChonN = new JButton("Chọn");
		txtChonN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sachtbModel.ChonSach(
						Integer.parseInt(txtMaSachN.getText().toString()),
						Integer.parseInt(txtSLNhap.getText().toString()),
						Integer.parseInt(txtGiaNhapN.getText().toString())
						);
			}
		});
		txtChonN.setBounds(716, 362, 102, 25);
		NhapSach.add(txtChonN);
		txtChonN.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JButton btnThm = new JButton("Thêm Sách mới");
		btnThm.setBounds(830, 362, 129, 25);
		NhapSach.add(btnThm);
		btnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmThemSachMoi frmthemsach = new frmThemSachMoi();
				frmthemsach.setVisible(true);
			}
		});
		btnThm.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JPanel QLHDNhapSach = new JPanel();
		tabbedPane.addTab("Quản Lí Nhập Sách", null, QLHDNhapSach, null);
		QLHDNhapSach.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 8, 495, 625);
		QLHDNhapSach.add(panel_6);
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
		QLHDNhapSach.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã PN:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 72, 17);
		panel_7.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setBounds(92, 10, 86, 20);
		panel_7.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(92, 56, 214, 20);
		panel_7.add(textField_7);
		
		JLabel lblNgyNhp = new JLabel("Ngày nhập:");
		lblNgyNhp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgyNhp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNgyNhp.setBounds(10, 57, 72, 17);
		panel_7.add(lblNgyNhp);
		
		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setColumns(10);
		textField_9.setBounds(92, 98, 86, 20);
		panel_7.add(textField_9);
		
		JLabel lblMNv = new JLabel("Mã NV:");
		lblMNv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMNv.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMNv.setBounds(10, 99, 72, 17);
		panel_7.add(lblMNv);
		
		textField_12 = new JTextField();
		textField_12.setEnabled(false);
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
		QLHDNhapSach.add(panel_8);
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
		QLHDNhapSach.add(btnBoCo);
		
		JPanel QLTV = new JPanel();
		tabbedPane.addTab("Nhân Viên", null, QLTV, null);
		QLTV.setLayout(null);
		
		JScrollPane tblDSNV = new JScrollPane();
		tblDSNV.setBounds(12, 187, 943, 482);
		QLTV.add(tblDSNV);
		
		NhanVienTableModel nvtblModel= new NhanVienTableModel();
		tbListNhanVien = new JTable(){
			public boolean isCellEditable(int rowIndex, int colIndex) {
				return false;
			}
		};
		tbListNhanVien.setModel(nvtblModel.nhanVienTablmodel());
		tblDSNV.setViewportView(tbListNhanVien);
		

		
		JPanel panel = new JPanel();
		panel.setBounds(10, 101, 945, 83);
		panel.setLayout(null);
		QLTV.add(panel);
		
		JButton btnNewButton_1 = new JButton("Thêm Nhân Viên Mới");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThemNhanVien_frm frmThemNhanVien = new ThemNhanVien_frm();
				frmThemNhanVien.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(0, 13, 174, 28);
		panel.add(btnNewButton_1);
		
		JButton button_5 = new JButton("Chỉnh Sửa Thông Tin");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(187, 13, 153, 28);
		panel.add(button_5);
		
		textField_8 = new JTextField();
		textField_8.setBounds(328, 55, 371, 22);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnTmKim = new JButton("Tìm Kiếm");
		btnTmKim.setBounds(836, 54, 97, 25);
		panel.add(btnTmKim);
		
		JButton button_6 = new JButton("Xóa Thành Viên");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(521, 13, 153, 28);
		panel.add(button_6);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(711, 55, 113, 22);
		panel.add(comboBox_5);
		
		JButton btnXtQuynAdmin = new JButton("Cấp quyền Admin");
		btnXtQuynAdmin.setBounds(356, 13, 153, 28);
		panel.add(btnXtQuynAdmin);
		
		JLabel lblQunLThnh = new JLabel("Quản Lý Tài Khoản Nhân Viên");
		lblQunLThnh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQunLThnh.setBounds(315, 13, 283, 46);
		QLTV.add(lblQunLThnh);
	}
}
