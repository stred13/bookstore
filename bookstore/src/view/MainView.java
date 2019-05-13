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
		button_4.setBounds(24, 87, 137, 31);
		pnl_NhapSach.add(button_4);
		
		JButton button = new JButton("Chỉnh sửa thông tin sách");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(173, 87, 178, 31);
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
		pnlThongTinSach.setBounds(519, 131, 411, 250);
		pnlBanSach.add(pnlThongTinSach);
		pnlThongTinSach.setLayout(null);
		
		JLabel lblMaSach = new JLabel("Mã Sách");
		lblMaSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMaSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMaSach.setBounds(10, 11, 102, 25);
		pnlThongTinSach.add(lblMaSach);
		
		JLabel lblTenSach = new JLabel("Tên Sách");
		lblTenSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTenSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTenSach.setBounds(10, 38, 102, 25);
		pnlThongTinSach.add(lblTenSach);
		
		JLabel lblTheLoai = new JLabel("Thể Loại");
		lblTheLoai.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTheLoai.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTheLoai.setBounds(10, 67, 102, 25);
		pnlThongTinSach.add(lblTheLoai);
		
		JLabel lblSLMua = new JLabel("Số Lượng Mua");
		lblSLMua.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLMua.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLMua.setBounds(10, 164, 102, 25);
		pnlThongTinSach.add(lblSLMua);
		
		txtSLMua = new JTextField();
		txtSLMua.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSLMua.setColumns(10);
		txtSLMua.setBounds(140, 167, 89, 20);
		pnlThongTinSach.add(txtSLMua);
		
		JLabel lblSLSach = new JLabel("Số Lượng Còn");
		lblSLSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLSach.setBounds(10, 130, 102, 25);
		pnlThongTinSach.add(lblSLSach);
		
		JLabel txtTheLoai = new JLabel("");
		txtTheLoai.setBounds(140, 71, 180, 16);
		pnlThongTinSach.add(txtTheLoai);
		
		JButton btnChnMua = new JButton("Chọn Mua");
		btnChnMua.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnChnMua.setBounds(256, 202, 102, 25);
		pnlThongTinSach.add(btnChnMua);
		
		JButton btnThayi = new JButton("Thay Đổi");
		btnThayi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThayi.setBounds(142, 203, 102, 25);
		pnlThongTinSach.add(btnThayi);
		
		JButton btnXa_1 = new JButton("Bỏ Chọn");
		btnXa_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnXa_1.setBounds(28, 203, 102, 25);
		pnlThongTinSach.add(btnXa_1);
		
		JLabel lblnGi = new JLabel("Đơn Giá");
		lblnGi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnGi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblnGi.setBounds(10, 92, 102, 25);
		pnlThongTinSach.add(lblnGi);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(140, 96, 180, 16);
		pnlThongTinSach.add(label_8);
		
		JLabel label = new JLabel("");
		label.setBounds(140, 138, 180, 16);
		pnlThongTinSach.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(140, 42, 180, 16);
		pnlThongTinSach.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(140, 15, 180, 16);
		pnlThongTinSach.add(label_2);
		
		JPanel pnlThongTinKhachHang = new JPanel();
		pnlThongTinKhachHang.setLayout(null);
		pnlThongTinKhachHang.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlThongTinKhachHang.setBounds(519, 13, 411, 105);
		pnlBanSach.add(pnlThongTinKhachHang);
		
		JLabel lblMKhchHng = new JLabel("M\u00E3 Kh\u00E1ch H\u00E0ng");
		lblMKhchHng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMKhchHng.setBounds(44, 13, 102, 25);
		pnlThongTinKhachHang.add(lblMKhchHng);
		
		JLabel lblTnKhchHng = new JLabel("T\u00EAn Kh\u00E1ch H\u00E0ng");
		lblTnKhchHng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTnKhchHng.setBounds(44, 36, 102, 25);
		pnlThongTinKhachHang.add(lblTnKhchHng);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(174, 16, 180, 20);
		pnlThongTinKhachHang.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(174, 39, 180, 20);
		pnlThongTinKhachHang.add(textField_11);
		
		JCheckBox checkBoxKhachHang = new JCheckBox("Khách hàng vãng lai");
		checkBoxKhachHang.setBounds(44, 71, 310, 25);
		pnlThongTinKhachHang.add(checkBoxKhachHang);
		
		JPanel pnlTimKiemSach = new JPanel();
		pnlTimKiemSach.setLayout(null);
		pnlTimKiemSach.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlTimKiemSach.setBounds(10, 11, 500, 53);
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
		
		JPanel pnl_MuonSach = new JPanel();
		tabbedPane.addTab("Mượn Sách", null, pnl_MuonSach, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Thành Viên", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 188, 919, 517);
		panel_5.add(scrollPane_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 87, 919, 92);
		panel.setLayout(null);
		panel_5.add(panel);
		
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
		panel_5.add(lblQunLThnh);
	}
}
