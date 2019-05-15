package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class ChonThanhVien_frm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChonThanhVien_frm frame = new ChonThanhVien_frm();
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
	public ChonThanhVien_frm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 14, 327, 22);
		contentPane.add(textField);
		
		JButton button = new JButton("Tìm Kiếm");
		button.setBounds(476, 13, 97, 25);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 49, 561, 291);
		contentPane.add(scrollPane);
		
		JButton btnChn = new JButton("Ch\u1ECDn");
		btnChn.setBounds(476, 354, 97, 25);
		contentPane.add(btnChn);
		
		JButton btnHy = new JButton("H\u1EE7y");
		btnHy.setBounds(356, 354, 97, 25);
		contentPane.add(btnHy);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(351, 14, 113, 22);
		contentPane.add(comboBox);
	}
}
