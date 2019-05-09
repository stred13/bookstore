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

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField_12;

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
		setBounds(100, 100, 970, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Quản lý bán sách", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(471, 102, 446, 207);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Sách");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 102, 25);
		panel_3.add(lblNewLabel);
		
		JLabel lblTngTin = new JLabel("Tên Sách");
		lblTngTin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTngTin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTngTin.setBounds(10, 38, 102, 25);
		panel_3.add(lblTngTin);
		
		JLabel lblSLngSch = new JLabel("Thể Loại");
		lblSLngSch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLngSch.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSLngSch.setBounds(10, 67, 102, 25);
		panel_3.add(lblSLngSch);
		
		JLabel lblMNhnVin = new JLabel("Số Lượng Mua");
		lblMNhnVin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMNhnVin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMNhnVin.setBounds(10, 135, 102, 25);
		panel_3.add(lblMNhnVin);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_6.setBounds(140, 14, 153, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(140, 41, 153, 20);
		panel_3.add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBounds(140, 138, 187, 20);
		panel_3.add(textField_9);
		
		JLabel label_7 = new JLabel("Số Lượng Còn");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_7.setBounds(10, 101, 102, 25);
		panel_3.add(label_7);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_12.setColumns(10);
		textField_12.setBounds(140, 104, 116, 20);
		panel_3.add(textField_12);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(471, 11, 446, 83);
		panel_1.add(panel_4);
		
		JLabel lblMKhchHng = new JLabel("M\u00E3 Kh\u00E1ch H\u00E0ng");
		lblMKhchHng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMKhchHng.setBounds(10, 11, 102, 25);
		panel_4.add(lblMKhchHng);
		
		JLabel lblTnKhchHng = new JLabel("T\u00EAn Kh\u00E1ch H\u00E0ng");
		lblTnKhchHng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTnKhchHng.setBounds(10, 47, 102, 25);
		panel_4.add(lblTnKhchHng);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(140, 14, 102, 20);
		panel_4.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(140, 50, 226, 20);
		panel_4.add(textField_11);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 102, 446, 207);
		panel_1.add(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);
		
		JButton btnToHan = new JButton("Mua Sách");
		btnToHan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnToHan.setBounds(815, 320, 102, 25);
		panel_1.add(btnToHan);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(10, 11, 446, 83);
		panel_1.add(panel_7);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(10, 14, 226, 20);
		panel_7.add(textField_3);
		
		JButton btnNewButton_2 = new JButton("Tìm Kiếm");
		btnNewButton_2.setBounds(335, 14, 101, 23);
		panel_7.add(btnNewButton_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Thể Loại"}));
		comboBox_1.setBounds(246, 15, 79, 20);
		panel_7.add(comboBox_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 356, 907, 219);
		panel_1.add(scrollPane_1);
		
		JLabel lblNewLabel_2 = new JLabel("Số lượng:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 325, 67, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblTngTin_1 = new JLabel("Tổng Tiền:");
		lblTngTin_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTngTin_1.setBounds(140, 325, 67, 20);
		panel_1.add(lblTngTin_1);
		
		JButton btnNewButton = new JButton("Xuất hóa đơn");
		btnNewButton.setBounds(815, 586, 102, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Quản lý sách", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(420, 47, 509, 392);
		panel.add(panel_2);
		
		JLabel label = new JLabel("T\u00EAn S\u00E1ch");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label.setBounds(34, 60, 81, 17);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("T\u00E1c Gi\u1EA3");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_1.setBounds(34, 102, 81, 17);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Th\u1EC3 Lo\u1EA1i");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_2.setBounds(34, 145, 81, 17);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("S\u1ED1 L\u01B0\u1EE3ng T\u1ED3n");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_3.setBounds(10, 236, 105, 17);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Gi\u00E1 B\u00E1n");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_4.setBounds(34, 192, 81, 17);
		panel_2.add(label_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(125, 53, 245, 28);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(125, 95, 373, 28);
		panel_2.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setBounds(125, 140, 140, 25);
		panel_2.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(125, 183, 140, 28);
		panel_2.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(125, 229, 140, 28);
		panel_2.add(textField_4);
		
		JLabel label_6 = new JLabel("M\u00E3 S\u00E1ch");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_6.setBounds(34, 17, 81, 17);
		panel_2.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(125, 10, 96, 28);
		panel_2.add(textField_5);
		
		JLabel lblMT = new JLabel("Mô Tả");
		lblMT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMT.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMT.setBounds(10, 277, 105, 17);
		panel_2.add(lblMT);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(125, 274, 362, 92);
		panel_2.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 141, 400, 430);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnCpNht = new JButton("C\u1EADp nh\u1EADt");
		btnCpNht.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCpNht.setBounds(832, 450, 97, 27);
		panel.add(btnCpNht);
		
		JButton btnXa = new JButton("X\u00F3a");
		btnXa.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnXa.setBounds(700, 450, 97, 27);
		panel.add(btnXa);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(10, 47, 400, 72);
		panel.add(panel_8);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Khách hàng", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(10, 25, 919, 227);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Khách Hàng");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(28, 11, 99, 18);
		panel_6.add(lblNewLabel_1);
		
		JLabel lblTnKhchHng_1 = new JLabel("Tên Khách Hàng");
		lblTnKhchHng_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTnKhchHng_1.setBounds(10, 61, 117, 18);
		panel_6.add(lblTnKhchHng_1);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính");
		lblGiiTnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiiTnh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGiiTnh.setBounds(10, 113, 117, 18);
		panel_6.add(lblGiiTnh);
		
		JLabel lblNmSinh = new JLabel("Năm Sinh");
		lblNmSinh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNmSinh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNmSinh.setBounds(10, 160, 117, 18);
		panel_6.add(lblNmSinh);
		
		JLabel label_5 = new JLabel("Tên Khách Hàng");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_5.setBounds(270, 11, 117, 18);
		panel_6.add(label_5);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 334, 919, 270);
		panel_5.add(scrollPane_3);
	}
}
