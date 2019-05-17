package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class frmThemSachMoi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel label = new JLabel("T\u00EAn S\u00E1ch");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label.setBounds(0, 122, 88, 26);
		contentPane.add(label);
		
		JLabel lblMT = new JLabel("M\u00F4 t\u1EA3");
		lblMT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMT.setBounds(0, 171, 88, 26);
		contentPane.add(lblMT);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(112, 174, 244, 116);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(112, 127, 207, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setBounds(112, 80, 157, 25);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Th\u00EAm S\u00E1ch");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(240, 313, 115, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(112, 29, 207, 25);
		contentPane.add(textField_1);
	}
}
