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

import controllers.phieunhapController;
import models.ChiTietPhieuNhap;
import models.PhieuNhap;
import models.Sach;
import viewmodels.NhanVienTableModel;
import viewmodels.QLyNhapTableModel;
import viewmodels.SachTableModel;
import viewmodels.nhapSachTablemodel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.util.Date;

import javax.swing.ScrollPaneConstants;

public class MainView extends JFrame {
	public static JFrame frame;
	private JPanel contentPane;
	private JTextField txtSLMua;
	private JTable table_1;
	private JTextField txtTimKiem;
	private JTextField txtSearchNameNV;
	private JTextField textField_5;
	private JTable tbNhapsach;
	private JTextField txtMapn;
	private JTextField txtNgaynhap;
	private JTextField txtManv;
	private JTextField txtSoluong;
	private JTable tbctpn;
	private JTextField textField_13;
	private JTextField txtSLNhap;
	private JTextField txtMaSachN;
	private JTextField txtTenSachN;
	private JTextField txtSoLuongConN;
	private JTextField txtGiaNhapN;
	private JTextField txtSearchHDBanSach;
	private JTextField txtMaHDBanSach;
	private JTextField txtNgayLapHDBanSach;
	private JTextField txtMaNVLapHD;
	private JTextField textField_24;
	private JTable table_3;
	private JTextField txtMaSach;
	private JTextField txtTenSach;
	private JTextField txtTheLoai;
	private JTextField txtDonGia;
	private JTextField txtSLCon;
	public static JTable tbSach;
	private JTextField txtTheLoaiN;
	private JTable tbctpN;
	public static JTable tbListNhanVien;

	public static JTable tblListSach;
	public static DefaultTableModel tbSachModel;
	public static DefaultTableModel tbNhapsachModel;
	public static DefaultTableModel tblDSNVModel;
	private DefaultTableModel tbCTnsModel;

	public static int manhanvien = 0;
	public static int maSach = 0;
	private JTextField txtTimSach;
	public static JTabbedPane tabbedPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainView();
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
		nhapSachTablemodel sachtbModel = new nhapSachTablemodel();
		QLyNhapTableModel qlNhapSachtbmd = new QLyNhapTableModel();
		NhanVienTableModel nvtblModel= new NhanVienTableModel();
		SachTableModel sachTblModel = new SachTableModel();
		
		tbSachModel = sachtbModel.sachTablmodel();
		tbNhapsachModel = qlNhapSachtbmd.getTbmdPhieuNhap();
		tblDSNVModel = nvtblModel.nhanVienTablmodel();
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(tabbedPane);

		JPanel BanSach = new JPanel();
		tabbedPane.addTab("Bán Sách", null, BanSach, null);
		BanSach.setLayout(null);

		JPanel pnlThongTinSach = new JPanel();
		pnlThongTinSach.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlThongTinSach.setBounds(519, 11, 440, 345);
		BanSach.add(pnlThongTinSach);
		pnlThongTinSach.setLayout(null);

		JLabel lblMaSach = new JLabel("Mã Sách");
		lblMaSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMaSach.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMaSach.setBounds(40, 10, 102, 25);
		pnlThongTinSach.add(lblMaSach);

		JLabel lblTenSach = new JLabel("Tên Sách");
		lblTenSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTenSach.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTenSach.setBounds(40, 40, 102, 25);
		pnlThongTinSach.add(lblTenSach);

		JLabel lblTheLoai = new JLabel("Thể Loại");
		lblTheLoai.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTheLoai.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTheLoai.setBounds(40, 70, 102, 25);
		pnlThongTinSach.add(lblTheLoai);

		JLabel lblSLMua = new JLabel("Số Lượng Mua");
		lblSLMua.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLMua.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSLMua.setBounds(40, 160, 102, 25);
		pnlThongTinSach.add(lblSLMua);

		txtSLMua = new JTextField();
		txtSLMua.setFont(new Font("Arial", Font.PLAIN, 15));
		txtSLMua.setColumns(10);
		txtSLMua.setBounds(155, 160, 241, 25);
		pnlThongTinSach.add(txtSLMua);

		JLabel lblSLSach = new JLabel("Số Lượng Còn");
		lblSLSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLSach.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSLSach.setBounds(40, 130, 102, 25);
		pnlThongTinSach.add(lblSLSach);

		JButton btnMua = new JButton("Chọn Mua");
		btnMua.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMua.setBounds(294, 309, 102, 25);
		pnlThongTinSach.add(btnMua);

		JLabel lblnGi = new JLabel("Đơn Giá Bán");
		lblnGi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGi.setFont(new Font("Arial", Font.PLAIN, 15));
		lblnGi.setBounds(40, 100, 102, 25);
		pnlThongTinSach.add(lblnGi);

		txtMaSach = new JTextField();
		txtMaSach.setFont(new Font("Arial", Font.PLAIN, 15));
		txtMaSach.setEditable(false);
		txtMaSach.setColumns(10);
		txtMaSach.setBounds(155, 10, 241, 25);
		pnlThongTinSach.add(txtMaSach);

		txtTenSach = new JTextField();
		txtTenSach.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTenSach.setEditable(false);
		txtTenSach.setColumns(10);
		txtTenSach.setBounds(155, 40, 241, 25);
		pnlThongTinSach.add(txtTenSach);

		txtTheLoai = new JTextField();
		txtTheLoai.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTheLoai.setEditable(false);
		txtTheLoai.setColumns(10);
		txtTheLoai.setBounds(155, 70, 241, 25);
		pnlThongTinSach.add(txtTheLoai);

		txtDonGia = new JTextField();
		txtDonGia.setFont(new Font("Arial", Font.PLAIN, 15));
		txtDonGia.setEditable(false);
		txtDonGia.setColumns(10);
		txtDonGia.setBounds(155, 100, 241, 25);
		pnlThongTinSach.add(txtDonGia);

		txtSLCon = new JTextField();
		txtSLCon.setFont(new Font("Arial", Font.PLAIN, 15));
		txtSLCon.setEditable(false);
		txtSLCon.setColumns(10);
		txtSLCon.setBounds(155, 130, 241, 25);
		pnlThongTinSach.add(txtSLCon);

		JLabel label = new JLabel("Mô Tả");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(40, 190, 102, 25);
		pnlThongTinSach.add(label);

		JTextArea textArea = new JTextArea();
		textArea.setText("");
		textArea.setEditable(false);
		textArea.setBounds(155, 190, 241, 105);
		pnlThongTinSach.add(textArea);

		JPanel pnlTimKiemSach = new JPanel();
		pnlTimKiemSach.setLayout(null);
		pnlTimKiemSach.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlTimKiemSach.setBounds(10, 11, 497, 345);
		BanSach.add(pnlTimKiemSach);

		txtTimKiem = new JTextField();
		txtTimKiem.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTimKiem.setColumns(10);
		txtTimKiem.setBounds(10, 44, 365, 25);
		pnlTimKiemSach.add(txtTimKiem);

		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTimKiem.setBounds(378, 44, 107, 25);
		pnlTimKiemSach.add(btnTimKiem);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 77, 475, 257);
		pnlTimKiemSach.add(scrollPane_1);

		JLabel lblDanhSchSch_1 = new JLabel("Danh Sách Sách");
		lblDanhSchSch_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblDanhSchSch_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDanhSchSch_1.setBounds(10, 10, 475, 25);
		pnlTimKiemSach.add(lblDanhSchSch_1);

		JScrollPane lstSachMua = new JScrollPane();
		lstSachMua.setBounds(10, 393, 949, 215);
		BanSach.add(lstSachMua);

		table_3 = new JTable();
		lstSachMua.setViewportView(table_3);

		JLabel lblDanhSchSch = new JLabel("Danh sách Sách Chọn Mua");
		lblDanhSchSch.setFont(new Font("Arial", Font.BOLD, 16));
		lblDanhSchSch.setBounds(10, 363, 228, 25);
		BanSach.add(lblDanhSchSch);

		JLabel label_7 = new JLabel("Tổng Tiền:");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Arial", Font.PLAIN, 14));
		label_7.setBounds(728, 615, 96, 25);
		BanSach.add(label_7);

		JLabel label_47 = new JLabel("100000 VNĐ");
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		label_47.setFont(new Font("Arial", Font.PLAIN, 14));
		label_47.setBounds(827, 615, 132, 25);
		BanSach.add(label_47);

		JButton btnXuatHD = new JButton("Xuất Hóa Đơn");
		btnXuatHD.setFont(new Font("Arial", Font.PLAIN, 14));
		btnXuatHD.setBounds(827, 643, 133, 25);
		BanSach.add(btnXuatHD);

		JButton btnBoSach = new JButton("Bỏ Chọn");
		btnBoSach.setBounds(718, 643, 102, 25);
		BanSach.add(btnBoSach);
		btnBoSach.setFont(new Font("Arial", Font.PLAIN, 13));

		JPanel QLHDBanSach = new JPanel();
		tabbedPane.addTab("Quản Lý Hóa Đơn Bán Sách", null, QLHDBanSach, null);
		QLHDBanSach.setLayout(null);

		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_13.setLayout(null);
		panel_13.setBounds(10, 11, 495, 625);
		QLHDBanSach.add(panel_13);

		JLabel lblDanhSchHa = new JLabel("Danh Sách Hóa Đơn");
		lblDanhSchHa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchHa.setFont(new Font("Arial", Font.BOLD, 21));
		lblDanhSchHa.setBounds(148, 20, 213, 34);
		panel_13.add(lblDanhSchHa);

		txtSearchHDBanSach = new JTextField();
		txtSearchHDBanSach.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSearchHDBanSach.setColumns(10);
		txtSearchHDBanSach.setBounds(10, 80, 363, 25);
		panel_13.add(txtSearchHDBanSach);

		JButton btnSearchHDBanSach = new JButton("Tìm Kiếm");
		btnSearchHDBanSach.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSearchHDBanSach.setBounds(379, 80, 106, 25);
		panel_13.add(btnSearchHDBanSach);

		JScrollPane tblDSHDBanSach = new JScrollPane();
		tblDSHDBanSach.setBounds(10, 113, 475, 499);
		panel_13.add(tblDSHDBanSach);

		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_14.setBounds(515, 11, 450, 144);
		QLHDBanSach.add(panel_14);

		JLabel lblMH = new JLabel("Mã HĐ:");
		lblMH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMH.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMH.setBounds(50, 10, 72, 25);
		panel_14.add(lblMH);

		txtMaHDBanSach = new JTextField();
		txtMaHDBanSach.setColumns(10);
		txtMaHDBanSach.setBounds(138, 10, 290, 25);
		panel_14.add(txtMaHDBanSach);

		txtNgayLapHDBanSach = new JTextField();
		txtNgayLapHDBanSach.setColumns(10);
		txtNgayLapHDBanSach.setBounds(138, 40, 290, 25);
		panel_14.add(txtNgayLapHDBanSach);

		JLabel lblNgyLp = new JLabel("Ngày Lập:");
		lblNgyLp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgyLp.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNgyLp.setBounds(50, 40, 72, 25);
		panel_14.add(lblNgyLp);

		txtMaNVLapHD = new JTextField();
		txtMaNVLapHD.setColumns(10);
		txtMaNVLapHD.setBounds(138, 70, 290, 25);
		panel_14.add(txtMaNVLapHD);

		JLabel label_51 = new JLabel("Mã NV:");
		label_51.setHorizontalAlignment(SwingConstants.RIGHT);
		label_51.setFont(new Font("Arial", Font.PLAIN, 15));
		label_51.setBounds(50, 70, 72, 25);
		panel_14.add(label_51);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(138, 100, 290, 25);
		panel_14.add(textField_24);

		JLabel lblTngTin = new JLabel("Tổng Tiền:");
		lblTngTin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTngTin.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTngTin.setBounds(50, 100, 72, 25);
		panel_14.add(lblTngTin);

		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_15.setBounds(515, 168, 450, 468);
		QLHDBanSach.add(panel_15);

		JLabel lblChiTitHa = new JLabel("Chi Tiết Hóa Đơn");
		lblChiTitHa.setHorizontalAlignment(SwingConstants.LEFT);
		lblChiTitHa.setFont(new Font("Arial", Font.BOLD, 16));
		lblChiTitHa.setBounds(10, 11, 139, 25);
		panel_15.add(lblChiTitHa);

		JScrollPane tblChiTietHDBanSach = new JScrollPane();
		tblChiTietHDBanSach.setBounds(10, 41, 428, 414);
		panel_15.add(tblChiTietHDBanSach);

		JButton btnNewButton_6 = new JButton("Xuất Báo Cáo");
		btnNewButton_6.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_6.setBounds(815, 643, 140, 25);
		QLHDBanSach.add(btnNewButton_6);

		JPanel NhapSach = new JPanel();
		tabbedPane.addTab("Nhập Sách", null, NhapSach, null);
		NhapSach.setLayout(null);

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setBounds(10, 11, 533, 367);
		NhapSach.add(panel_10);

		textField_13 = new JTextField();
		textField_13.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(10, 42, 401, 25);
		panel_10.add(textField_13);

		JButton button = new JButton("Tìm Kiếm");
		button.setFont(new Font("Arial", Font.PLAIN, 15));
		button.setBounds(416, 42, 107, 25);
		panel_10.add(button);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_6.setBounds(10, 71, 513, 285);
		panel_10.add(scrollPane_6);

		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBounds(553, 11, 406, 367);
		NhapSach.add(panel_11);

		JTextArea txtMoTaN = new JTextArea();
		txtMoTaN.setEditable(false);
		txtMoTaN.setText("");
		txtMoTaN.setBounds(144, 211, 252, 100);
		panel_11.add(txtMoTaN);

		tbSach = new JTable() {
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

				if (tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 5) != null) {
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
		tbSach.setModel(tbSachModel);
		// System.out.println(tbSachModel.getRowCount());
		// JOptionPane.showMessageDialog(null, "sach
		// "+MainView.tbSachModel.getRowCount());

		scrollPane_6.setViewportView(tbSach);

		JLabel label_43 = new JLabel("Danh Sách Sách");
		label_43.setHorizontalAlignment(SwingConstants.LEFT);
		label_43.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_43.setBounds(10, 13, 475, 25);
		panel_10.add(label_43);

		JLabel lblDanhSchSch_4 = new JLabel("Danh sách Sách Nhập");
		lblDanhSchSch_4.setFont(new Font("Arial", Font.BOLD, 16));
		lblDanhSchSch_4.setBounds(10, 382, 198, 25);
		NhapSach.add(lblDanhSchSch_4);

		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 412, 949, 191);
		NhapSach.add(scrollPane_7);

		tbctpN = new JTable() {
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
		label_44.setFont(new Font("Arial", Font.PLAIN, 15));
		label_44.setBounds(32, 26, 102, 25);
		panel_11.add(label_44);

		JLabel label_45 = new JLabel("Tên Sách");
		label_45.setHorizontalAlignment(SwingConstants.RIGHT);
		label_45.setFont(new Font("Arial", Font.PLAIN, 15));
		label_45.setBounds(32, 61, 102, 25);
		panel_11.add(label_45);

		JLabel label_46 = new JLabel("Thể Loại");
		label_46.setHorizontalAlignment(SwingConstants.RIGHT);
		label_46.setFont(new Font("Arial", Font.PLAIN, 15));
		label_46.setBounds(32, 91, 102, 25);
		panel_11.add(label_46);

		JLabel lblSLngNhp = new JLabel("Số Lượng Nhập");
		lblSLngNhp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLngNhp.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSLngNhp.setBounds(27, 151, 110, 25);
		panel_11.add(lblSLngNhp);

		txtSLNhap = new JTextField();
		txtSLNhap.setFont(new Font("Arial", Font.PLAIN, 15));
		txtSLNhap.setColumns(10);
		txtSLNhap.setBounds(144, 151, 252, 25);
		panel_11.add(txtSLNhap);

		JLabel label_48 = new JLabel("Số Lượng Còn");
		label_48.setHorizontalAlignment(SwingConstants.RIGHT);
		label_48.setFont(new Font("Arial", Font.PLAIN, 15));
		label_48.setBounds(32, 121, 102, 25);
		panel_11.add(label_48);

		JLabel lblGiNhp = new JLabel("Giá Nhập");
		lblGiNhp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiNhp.setFont(new Font("Arial", Font.PLAIN, 15));
		lblGiNhp.setBounds(32, 181, 102, 25);
		panel_11.add(lblGiNhp);

		JLabel lblMT = new JLabel("Mô Tả");
		lblMT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMT.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMT.setBounds(32, 211, 102, 25);
		panel_11.add(lblMT);

		txtMaSachN = new JTextField();
		txtMaSachN.setEditable(false);
		txtMaSachN.setFont(new Font("Arial", Font.PLAIN, 15));
		txtMaSachN.setColumns(10);
		txtMaSachN.setBounds(144, 26, 252, 25);
		panel_11.add(txtMaSachN);

		txtTenSachN = new JTextField();
		txtTenSachN.setEditable(false);
		txtTenSachN.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTenSachN.setColumns(10);
		txtTenSachN.setBounds(144, 61, 252, 25);
		panel_11.add(txtTenSachN);

		txtSoLuongConN = new JTextField();
		txtSoLuongConN.setEditable(false);
		txtSoLuongConN.setFont(new Font("Arial", Font.PLAIN, 15));
		txtSoLuongConN.setColumns(10);
		txtSoLuongConN.setBounds(144, 121, 252, 25);
		panel_11.add(txtSoLuongConN);

		txtGiaNhapN = new JTextField();
		txtGiaNhapN.setFont(new Font("Arial", Font.PLAIN, 15));
		txtGiaNhapN.setColumns(10);
		txtGiaNhapN.setBounds(144, 181, 252, 25);
		panel_11.add(txtGiaNhapN);

		txtTheLoaiN = new JTextField();
		txtTheLoaiN.setEditable(false);
		txtTheLoaiN.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTheLoaiN.setColumns(10);
		txtTheLoaiN.setBounds(144, 91, 252, 25);
		panel_11.add(txtTheLoaiN);

		JButton btnThm = new JButton("Thêm Sách mới");
		btnThm.setBounds(253, 322, 143, 25);
		panel_11.add(btnThm);
		btnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmThemSachMoi frmthemsach = new frmThemSachMoi();
				frmthemsach.setVisible(true);
				frame.setEnabled(false);
			}
		});
		btnThm.setFont(new Font("Arial", Font.PLAIN, 14));

		JButton txtChonN = new JButton("Chọn Sách");
		txtChonN.setBounds(144, 322, 102, 25);
		panel_11.add(txtChonN);
		txtChonN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sachtbModel.ChonSach(Integer.parseInt(txtMaSachN.getText().toString()),
						Integer.parseInt(txtSLNhap.getText().toString()),
						Integer.parseInt(txtGiaNhapN.getText().toString()));
			}
		});
		txtChonN.setFont(new Font("Arial", Font.PLAIN, 14));

		JButton btnNhpSch = new JButton("Nhập tất cả");
		btnNhpSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int optNhap = JOptionPane.showConfirmDialog(null, "Bạn muốn nhập tất cả sách không ?", "Nhập sách",
						JOptionPane.YES_NO_OPTION);

				if (optNhap == 0) {
					sachtbModel.nhapSach();
					tbNhapsachModel = sachtbModel.sachTablmodel();
					tbSach.setModel(tbNhapsachModel);
				}
					
				
			}
		});
		btnNhpSch.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNhpSch.setBounds(834, 637, 125, 28);
		NhapSach.add(btnNhpSch);

		JButton button_3 = new JButton("Bỏ Chọn");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tbctpN.getSelectedRow() != -1) {
					sachtbModel.boChonSach(
							Integer.parseInt(tbctpN.getModel().getValueAt(tbctpN.getSelectedRow(), 0).toString()));
				}
			}
		});
		button_3.setBounds(726, 637, 102, 28);
		NhapSach.add(button_3);
		button_3.setFont(new Font("Arial", Font.PLAIN, 14));

		JLabel label_1 = new JLabel("Tổng Tiền:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 14));
		label_1.setBounds(716, 608, 109, 25);
		NhapSach.add(label_1);

		JLabel label_2 = new JLabel("100000 VNĐ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.PLAIN, 14));
		label_2.setBounds(842, 608, 117, 25);
		NhapSach.add(label_2);

		JPanel QLHDNhapSach = new JPanel();
		tabbedPane.addTab("Quản Lý Hóa Đơn Nhập Sách", null, QLHDNhapSach, null);
		QLHDNhapSach.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(0, 8, 495, 612);
		QLHDNhapSach.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblThongTinNhap = new JLabel("Quản Lý Hóa Đơn Nhập Sách");
		lblThongTinNhap.setHorizontalAlignment(SwingConstants.LEFT);
		lblThongTinNhap.setFont(new Font("Arial", Font.BOLD, 18));
		lblThongTinNhap.setBounds(10, 25, 475, 25);
		panel_6.add(lblThongTinNhap);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_5.setBounds(10, 76, 371, 25);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		JButton btnNewButton_5 = new JButton("Tìm Kiếm");
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_5.setBounds(385, 76, 100, 25);
		panel_6.add(btnNewButton_5);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 107, 475, 492);
		panel_6.add(scrollPane_5);

		tbNhapsach = new JTable();
		tbNhapsach.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// tbSach.getModel().getValueAt(tbSach.getSelectedRow(), 1).toString();
				phieunhapController pnCTL = new phieunhapController();

				int mapn = Integer
						.parseInt(tbNhapsach.getModel().getValueAt(tbNhapsach.getSelectedRow(), 0).toString());
				String dateCr = tbNhapsach.getModel().getValueAt(tbNhapsach.getSelectedRow(), 1).toString();
				int manv = Integer
						.parseInt(tbNhapsach.getModel().getValueAt(tbNhapsach.getSelectedRow(), 2).toString());
				int slSach = Integer
						.parseInt(tbNhapsach.getModel().getValueAt(tbNhapsach.getSelectedRow(), 3).toString());

				PhieuNhap pn = pnCTL.getPhieuNhapbyId(mapn);

				txtManv.setText(String.valueOf(manv));
				txtMapn.setText(String.valueOf(mapn));
				txtSoluong.setText(String.valueOf(slSach));
				txtNgaynhap.setText(dateCr);
				tbCTnsModel = qlNhapSachtbmd.getTbmdChiTietPN(pn);
				tbctpn.setModel(tbCTnsModel);
			}
		});
		tbNhapsach.setFont(new Font("Arial", Font.PLAIN, 14));
		scrollPane_5.setViewportView(tbNhapsach);
		tbNhapsach.setModel(tbNhapsachModel);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(505, 8, 454, 187);
		QLHDNhapSach.add(panel_7);
		panel_7.setLayout(null);

		JLabel lblNewLabel = new JLabel("Mã PN:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(43, 30, 72, 25);
		panel_7.add(lblNewLabel);

		txtMapn = new JTextField();
		txtMapn.setEnabled(false);
		txtMapn.setBounds(130, 30, 300, 25);
		panel_7.add(txtMapn);
		txtMapn.setColumns(10);

		txtNgaynhap = new JTextField();
		txtNgaynhap.setEnabled(false);
		txtNgaynhap.setColumns(10);
		txtNgaynhap.setBounds(130, 65, 300, 25);
		panel_7.add(txtNgaynhap);

		JLabel lblNgyNhp = new JLabel("Ngày nhập:");
		lblNgyNhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgyNhp.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNgyNhp.setBounds(28, 65, 100, 25);
		panel_7.add(lblNgyNhp);

		txtManv = new JTextField();
		txtManv.setEnabled(false);
		txtManv.setColumns(10);
		txtManv.setBounds(130, 100, 300, 25);
		panel_7.add(txtManv);

		JLabel lblMNv = new JLabel("Mã NV:");
		lblMNv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMNv.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMNv.setBounds(38, 100, 72, 25);
		panel_7.add(lblMNv);

		txtSoluong = new JTextField();
		txtSoluong.setEnabled(false);
		txtSoluong.setColumns(10);
		txtSoluong.setBounds(130, 135, 300, 25);
		panel_7.add(txtSoluong);

		JLabel lblSLng = new JLabel("Số lượng:");
		lblSLng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLng.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSLng.setBounds(38, 135, 72, 25);
		panel_7.add(lblSLng);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(505, 208, 454, 412);
		QLHDNhapSach.add(panel_8);
		panel_8.setLayout(null);

		JLabel lblChiTitPhiu = new JLabel("Chi Tiết Phiếu Nhập");
		lblChiTitPhiu.setHorizontalAlignment(SwingConstants.LEFT);
		lblChiTitPhiu.setFont(new Font("Arial", Font.BOLD, 15));
		lblChiTitPhiu.setBounds(10, 11, 139, 25);
		panel_8.add(lblChiTitPhiu);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 432, 359);
		panel_8.add(scrollPane);

		tbctpn = new JTable();
		scrollPane.setViewportView(tbctpn);

		JButton btnBoCo = new JButton("Xuất Báo Cáo");
		btnBoCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoCo.setFont(new Font("Arial", Font.PLAIN, 15));
		btnBoCo.setBounds(812, 631, 147, 25);
		QLHDNhapSach.add(btnBoCo);

		
		JPanel pnlQLSach = new JPanel();
		tabbedPane.addTab("Sách", null, pnlQLSach, null);
		pnlQLSach.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 967, 99);
		pnlQLSach.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Quản Lý Sách");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_1.setBounds(306, 18, 336, 55);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(11, 98, 944, 83);
		pnlQLSach.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnThemSach = new JButton("Thêm Sách");
		btnThemSach.setFont(new Font("Arial", Font.PLAIN, 15));
		btnThemSach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmThemSachMoi frmThemSach = new frmThemSachMoi();
				frmThemSach.setVisible(true);
				frame.setEnabled(false);
			}
		});
		btnThemSach.setBounds(0, 11, 133, 28);
		panel_2.add(btnThemSach);
		
		JButton btnChinhSuaSach = new JButton("Chỉnh Sửa Thông Tin Sách");
		btnChinhSuaSach.setFont(new Font("Arial", Font.PLAIN, 15));
		btnChinhSuaSach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowSelect = tblListSach.getSelectedRow();
				if (rowSelect > -1) {
					int maSachEdit = Integer.parseInt(tblListSach.getModel().getValueAt(rowSelect, 0).toString());
					maSach = maSachEdit;
					ChinhSuaThongTinSach_frm frmEditSach = new ChinhSuaThongTinSach_frm();
					frmEditSach.setVisible(true);
					frame.setEnabled(false);
				} else {
					JOptionPane.showMessageDialog(frame, "Chưa chọn Sách cần chỉnh sửa.");
				}

				
			}
		});
		btnChinhSuaSach.setBounds(143, 11, 223, 28);
		panel_2.add(btnChinhSuaSach);
		
		JButton btnXaSch = new JButton("Xóa Sách");
		btnXaSch.setFont(new Font("Arial", Font.PLAIN, 15));
		btnXaSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowSelect = tblListSach.getSelectedRow();
				if (rowSelect > -1) {
					int maSachXoa = Integer.parseInt(tblListSach.getModel().getValueAt(rowSelect, 0).toString());
					sachTblModel.deleteSach(maSachXoa);
					tblListSach.setModel(sachTblModel.getAllSachTableModel());

				} else {
					JOptionPane.showMessageDialog(frame, "Chưa chọn Sách cần Xóa.");
				}
			}
		});
		btnXaSch.setBounds(376, 13, 153, 25);
		panel_2.add(btnXaSch);
		
		txtTimSach = new JTextField();
		txtTimSach.setColumns(10);
		txtTimSach.setBounds(0, 51, 778, 25);
		panel_2.add(txtTimSach);
		
		JButton btnTimSach = new JButton("Tìm Kiếm");
		btnTimSach.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTimSach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txtSearch = txtTimSach.getText().toString();
				tblListSach.setModel(sachTblModel.getAllSachTablmodelSearch(txtSearch));
			}
		});
		btnTimSach.setBounds(788, 52, 156, 25);
		panel_2.add(btnTimSach);
		
		JScrollPane tblQLSach = new JScrollPane();
		tblQLSach.setBounds(12, 180, 943, 476);
		pnlQLSach.add(tblQLSach);
		tblListSach = new JTable(){
			public boolean isCellEditable(int rowIndex, int colIndex) {
				return false;
			}
		};
		tblListSach.setModel(sachTblModel.getAllSachTableModel());
		tblQLSach.setViewportView(tblListSach);

		JPanel QLTV = new JPanel();
		tabbedPane.addTab("Nhân Viên", null, QLTV, null);
		QLTV.setLayout(null);

		JScrollPane tblDSNV = new JScrollPane();
		tblDSNV.setBounds(12, 187, 943, 482);
		QLTV.add(tblDSNV);
		tbListNhanVien = new JTable() {
			public boolean isCellEditable(int rowIndex, int colIndex) {
				return false;
			}
		};
		tbListNhanVien.setModel(tblDSNVModel);
		tblDSNV.setViewportView(tbListNhanVien);

		JPanel panel = new JPanel();
		panel.setBounds(12, 101, 944, 83);
		panel.setLayout(null);
		QLTV.add(panel);

		txtSearchNameNV = new JTextField();
		txtSearchNameNV.setBounds(0, 52, 808, 25);
		panel.add(txtSearchNameNV);
		txtSearchNameNV.setColumns(10);

		JButton btnThemNhanVien = new JButton("Thêm Nhân Viên Mới");
		btnThemNhanVien.setFont(new Font("Arial", Font.PLAIN, 15));
		btnThemNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThemNhanVien_frm frmThemNhanVien = new ThemNhanVien_frm();
				frmThemNhanVien.setVisible(true);
				setEnabled(false);
				// dispose();
			}
		});
		btnThemNhanVien.setBounds(0, 17, 179, 25);
		panel.add(btnThemNhanVien);

		JButton btnChinhSuaNhanVien = new JButton("Chỉnh Sửa Thông Tin Nhân Viên");
		btnChinhSuaNhanVien.setFont(new Font("Arial", Font.PLAIN, 15));
		btnChinhSuaNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowSelect = tbListNhanVien.getSelectedRow();
				if (rowSelect > -1) {
					int maNV = Integer.parseInt(tbListNhanVien.getModel().getValueAt(rowSelect, 0).toString());
					manhanvien = maNV;
					ChinhSuaThongTinNhanVien_frm frmEditMember = new ChinhSuaThongTinNhanVien_frm();
					frmEditMember.setVisible(true);
					frame.setEnabled(false);
				} else {
					JOptionPane.showMessageDialog(frame, "Chưa chọn nhân viên cần chỉnh sửa.");
				}
			}
		});
		btnChinhSuaNhanVien.setBounds(189, 16, 250, 25);
		panel.add(btnChinhSuaNhanVien);

		JButton btnSearchNameNV = new JButton("Tìm Kiếm");
		btnSearchNameNV.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSearchNameNV.setBounds(816, 52, 127, 25);
		panel.add(btnSearchNameNV);

		JButton btnXoaNhanVien = new JButton("Xóa Nhân Viên");
		btnXoaNhanVien.setFont(new Font("Arial", Font.PLAIN, 15));
		btnXoaNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowSelect = tbListNhanVien.getSelectedRow();
				if (rowSelect > -1) {
					int maNV = Integer.parseInt(tbListNhanVien.getModel().getValueAt(rowSelect, 0).toString());
					nvtblModel.deleteNhanVien(maNV);
					tblDSNVModel.setRowCount(0);
					tblDSNVModel = nvtblModel.nhanVienTablmodel();
					tbListNhanVien.setModel(tblDSNVModel);
				} else {
					JOptionPane.showMessageDialog(frame, "Chưa chọn nhân viên cần chỉnh sửa.");
				}
			}
		});
		btnXoaNhanVien.setBounds(449, 16, 153, 25);
		panel.add(btnXoaNhanVien);
		btnSearchNameNV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtSearch = txtSearchNameNV.getText().toString();
				if (txtSearch.equals("")) {
					tblDSNVModel.setRowCount(0);
					tblDSNVModel = nvtblModel.nhanVienTablmodel();
					tbListNhanVien.setModel(tblDSNVModel);
				} else {
					tblDSNVModel.setRowCount(0);
					tblDSNVModel = nvtblModel.nhanVienTablmodelSearch(txtSearch);
					tbListNhanVien.setModel(tblDSNVModel);

				}
			}
		});

		JLabel lblQunLThnh = new JLabel("Quản Lý Tài Khoản Nhân Viên");
		lblQunLThnh.setFont(new Font("Arial", Font.BOLD, 25));
		lblQunLThnh.setBounds(315, 25, 375, 46);
		QLTV.add(lblQunLThnh);
	}
	
	
	public void showWindow() {
		this.setSize(1000, 750);
		this.setBounds(100, 100, 1000, 750);
		this.setResizable ( false );
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
