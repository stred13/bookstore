package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.sachController;
import controllers.theloaisachController;
import daos.sachDao;
import models.Sach;
import models.TheLoai;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmThemSachMoi extends JFrame {

	private JPanel contentPane;
	private JTextField txtTacGia;
	private JTextField txtTenSach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmThemSachMoi frame = new frmThemSachMoi();
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
	public frmThemSachMoi() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 426, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("T\u00EAn S\u00E1ch");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(0, 27, 88, 26);
		contentPane.add(lblNewLabel);

		JLabel lblThLoi = new JLabel("Th\u1EC3 Lo\u1EA1i");
		lblThLoi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThLoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblThLoi.setBounds(0, 75, 88, 26);
		contentPane.add(lblThLoi);

		JLabel lblTcGi = new JLabel("T\u00E1c Gi\u1EA3");
		lblTcGi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTcGi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTcGi.setBounds(0, 122, 88, 26);
		contentPane.add(lblTcGi);

		JLabel lblMT = new JLabel("M\u00F4 t\u1EA3");
		lblMT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMT.setBounds(0, 171, 88, 26);
		contentPane.add(lblMT);

		JTextArea txaMoTa = new JTextArea();
		txaMoTa.setBounds(112, 174, 244, 116);
		contentPane.add(txaMoTa);

		txtTacGia = new JTextField();
		txtTacGia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTacGia.setBounds(112, 127, 207, 25);
		contentPane.add(txtTacGia);
		txtTacGia.setColumns(10);

		theloaisachController tlsCon = new theloaisachController();
		DefaultComboBoxModel cbbModel = new DefaultComboBoxModel<>();
		tlsCon.getAllTLsach().forEach(tl -> {
			cbbModel.addElement(tl);
		});
		JComboBox cbbTl = new JComboBox(cbbModel);
		cbbTl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cbbTl.setBounds(112, 80, 157, 25);
		contentPane.add(cbbTl);

		JButton btnAddSach = new JButton("Th\u00EAm S\u00E1ch");
		btnAddSach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sachController sCon = new sachController();
				
				String tensach = txtTenSach.getText();
				TheLoai theloai = (TheLoai) cbbTl.getSelectedItem();
				String tg = txtTacGia.getText();
				String mota = txaMoTa.getText();

				Sach s = new Sach();
				s.setTacgia(tg);
				s.setGiaban(20000);
				s.setTensach(tensach);
				s.setTLSach(theloai);
				s.setMota(mota);
				
				sCon.insertSach(s);
			}
		});
		btnAddSach.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnAddSach.setBounds(240, 313, 115, 23);
		contentPane.add(btnAddSach);

		txtTenSach = new JTextField();
		txtTenSach.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTenSach.setColumns(10);
		txtTenSach.setBounds(112, 29, 207, 25);
		contentPane.add(txtTenSach);
	}
}
