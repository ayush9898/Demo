package firstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstProject {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstProject window = new FirstProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Enter here");
		button1.setFont(new Font("Algerian", Font.PLAIN, 13));
		button1.setBackground(Color.PINK);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Welcome to Ayush repository");
			}
		});
		button1.setBounds(167, 204, 97, 25);
		frame.getContentPane().add(button1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(79, 131, 257, -5);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 113, 408, 2);
		frame.getContentPane().add(separator_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("radio button");
		rdbtnNewRadioButton.setBounds(22, 131, 97, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("check box");
		chckbxNewCheckBox.setBounds(295, 131, 113, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(36, 13, 83, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblAyush = new JLabel("Ayush");
		lblAyush.setBounds(322, 16, 56, 16);
		frame.getContentPane().add(lblAyush);
		
		textField = new JTextField();
		textField.setBounds(167, 157, 97, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
