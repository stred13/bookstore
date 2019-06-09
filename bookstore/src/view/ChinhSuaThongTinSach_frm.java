package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.theloaisachController;
import models.Sach;
import models.TheLoai;
import viewmodels.SachTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ChinhSuaThongTinSach_frm extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenSach;
	private JTextField txtTacGia;
	private JTextField txtGiaBan;
	private JTextField txtSoLuong;
	private JTextField txtMaSach;
	private theloaisachController tlsCon;
	private Sach sach;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChinhSuaThongTinSach_frm frame = new ChinhSuaThongTinSach_frm();
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
	public ChinhSuaThongTinSach_frm() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MainView.frame.setEnabled(true);
				
			
			}
		});

		tlsCon = new theloaisachController();
		SachTableModel sachTblModel = new SachTableModel();
		sach = sachTblModel.getThongTinSach(MainView.maSach);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 390, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("T\u00EAn S\u00E1ch");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(52, 93, 66, 16);
		contentPane.add(label);
		
		txtTenSach = new JTextField();
		txtTenSach.setColumns(10);
		txtTenSach.setBounds(131, 90, 193, 22);
		contentPane.add(txtTenSach);
		
		JLabel label_1 = new JLabel("Th\u1EC3 lo\u1EA1i");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(62, 121, 56, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("T\u00E1c Gi\u1EA3");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(41, 150, 77, 16);
		contentPane.add(label_2);
		
		txtTacGia = new JTextField();
		txtTacGia.setColumns(10);
		txtTacGia.setBounds(130, 147, 193, 22);
		contentPane.add(txtTacGia);
		
		JLabel label_4 = new JLabel("\u0110\u01A1n Gi\u00E1 ");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(63, 182, 56, 16);
		contentPane.add(label_4);
		
		txtGiaBan = new JTextField();
		txtGiaBan.setColumns(10);
		txtGiaBan.setBounds(131, 179, 193, 22);
		contentPane.add(txtGiaBan);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(131, 211, 193, 22);
		contentPane.add(txtSoLuong);
		
		JLabel label_5 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(63, 214, 56, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("M\u00F4 T\u1EA3");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(63, 249, 56, 16);
		contentPane.add(label_6);
		
		JTextArea txtMoTa = new JTextArea();
		txtMoTa.setBounds(131, 246, 193, 100);
		contentPane.add(txtMoTa);
		
		JButton btnEditSach = new JButton("Ch\u1EC9nh S\u1EEDa");
		
		btnEditSach.setBounds(114, 368, 177, 32);
		contentPane.add(btnEditSach);
		
		JLabel lblChnhSaThng = new JLabel("Ch\u1EC9nh S\u1EEDa Th\u00F4ng Tin S\u00E1ch");
		lblChnhSaThng.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblChnhSaThng.setBounds(44, 13, 299, 40);
		contentPane.add(lblChnhSaThng);
		
		JLabel lblMSch = new JLabel("M\u00E3 S\u00E1ch");
		lblMSch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMSch.setBounds(52, 61, 66, 16);
		contentPane.add(lblMSch);
		
		txtMaSach = new JTextField();
		txtMaSach.setEditable(false);
		txtMaSach.setColumns(10);
		txtMaSach.setBounds(131, 58, 193, 22);
		contentPane.add(txtMaSach);
		
		DefaultComboBoxModel cbbModel = new DefaultComboBoxModel<>();
		tlsCon.getAllTLsach().forEach(tl -> {
			cbbModel.addElement(tl);
		});
		JComboBox cbbTLSach = new JComboBox(cbbModel);
		cbbTLSach.setBounds(131, 118, 193, 22);
		contentPane.add(cbbTLSach);
		
		txtMaSach.setText(String.valueOf(sach.getMasach()));
		txtTenSach.setText(sach.getTensach());
		cbbTLSach.setSelectedItem(sach.getTLSach());
		txtTacGia.setText(sach.getTacgia());
		txtGiaBan.setText(String.valueOf(sach.getGiaban()));
		txtSoLuong.setText(String.valueOf(sach.getSoluong()));
		txtMoTa.setText(sach.getMota());
		btnEditSach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pattern patternNum = Pattern.compile("^\\d+$");
				if (!patternNum.matcher(txtGiaBan.getText().toString()).matches()) {
					JOptionPane.showMessageDialog(null, "Giá Bán không hợp lệ");
				} else if (!patternNum.matcher(txtSoLuong.getText().toString()).matches()) {
					JOptionPane.showMessageDialog(null, "Số Lượng không hợp lệ");
				} else {
					sach.setTensach(txtTenSach.getText());
					sach.setTacgia(txtTacGia.getText());
					sach.setTLSach((TheLoai)cbbTLSach.getSelectedItem());
					sach.setGiaban(Integer.parseInt(txtGiaBan.getText()));
					sach.setSoluong(Integer.parseInt(txtSoLuong.getText()));
					sach.setMota(txtMoTa.getText());
					sachTblModel.updateSach(sach);
					MainView.tblListSach.setModel(sachTblModel.getAllSachTableModel());
					MainView.frame.setEnabled(true);
					dispose();
				}
			}
		});
	}
}
