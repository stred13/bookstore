package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class ChinhSuaThongTinThanhVien_frm extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChinhSuaThongTinThanhVien_frm frame = new ChinhSuaThongTinThanhVien_frm();
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
	public ChinhSuaThongTinThanhVien_frm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 383);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 412, 336);
		getContentPane().add(panel);
		
		JLabel lblChnhSaThng = new JLabel("Ch\u1EC9nh S\u1EEDa Th\u00F4ng Tin Th\u00E0nh Vi\u00EAn");
		lblChnhSaThng.setHorizontalAlignment(SwingConstants.CENTER);
		lblChnhSaThng.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblChnhSaThng.setBounds(12, 13, 388, 40);
		panel.add(lblChnhSaThng);
		
		JLabel label_1 = new JLabel("T\u00EAn Th\u00E0nh Vi\u00EAn");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(50, 90, 91, 16);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(154, 87, 193, 22);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(154, 119, 193, 22);
		panel.add(textField_1);
		
		JLabel label_2 = new JLabel("Email");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(86, 122, 56, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Gi\u1EDBi T\u00EDnh");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(65, 149, 77, 16);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(154, 174, 193, 22);
		panel.add(textField_3);
		
		JLabel label_4 = new JLabel("Ng\u00E0y Sinh");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(49, 177, 92, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("S\u0110T");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(85, 207, 56, 16);
		panel.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(154, 204, 193, 22);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(153, 233, 194, 22);
		panel.add(textField_5);
		
		JLabel label_6 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(85, 236, 56, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Ngh\u1EC1 Nghi\u1EC7p");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(64, 265, 77, 16);
		panel.add(label_7);
		
		JButton button = new JButton("Th\u00EAm");
		button.setBounds(218, 298, 97, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("H\u1EE7y");
		button_1.setBounds(110, 298, 97, 25);
		panel.add(button_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(154, 262, 193, 22);
		panel.add(comboBox);
		
		JLabel lblMThnhVin = new JLabel("M\u00E3 Th\u00E0nh Vi\u00EAn");
		lblMThnhVin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMThnhVin.setBounds(50, 58, 91, 16);
		panel.add(lblMThnhVin);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(154, 55, 193, 22);
		panel.add(textField_6);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setBounds(154, 145, 63, 25);
		panel.add(rdbtnNam);
		
		JRadioButton rdbtnN = new JRadioButton("N\u1EEF");
		rdbtnN.setBounds(218, 145, 63, 25);
		panel.add(rdbtnN);
	}
}
