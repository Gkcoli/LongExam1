

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import logiiin.wegoo;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.DebugGraphics;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class DiscountSystem {

	 JFrame frmDiscountSystem;
	 JTextField txtIDNumber;
	 JTextField txtFirstName;
	 JTextField txtLastName;
	 JTextField txtTuitionFee;
	 JTextField txtMiscellaneousFee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiscountSystem window2 = new DiscountSystem();
					window2.frmDiscountSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiscountSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[][] feesPerCourse = {{null, null}, 
				{"10000.00", "22500.00"}, 
				{"15000.00", "15000.00"}, 
				{"25000.00", "23000.00"}, 
				{"30000.00", "25000.00"}, 
				{"20000.00", "11000.00"}};
		frmDiscountSystem = new JFrame();
		frmDiscountSystem.setForeground(new Color(51, 51, 51));
		frmDiscountSystem.getContentPane().setBackground(new Color(38, 38, 38));
		frmDiscountSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ryujin\\Downloads\\twich_icon_30x30.png"));
		frmDiscountSystem.setTitle("Honorata National School - Online Enrollment");
		frmDiscountSystem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		frmDiscountSystem.setBounds(100, 100, 350, 604);
		frmDiscountSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDiscountSystem.getContentPane().setLayout(null);
		
		JLabel lblidNumber = new JLabel("ID Number");
		lblidNumber.setForeground(new Color(255, 255, 255));
		lblidNumber.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblidNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblidNumber.setBounds(10, 80, 130, 21);
		frmDiscountSystem.getContentPane().add(lblidNumber);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(48, 139, 90, 21);
		frmDiscountSystem.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(48, 200, 87, 21);
		frmDiscountSystem.getContentPane().add(lblLastName);
		
		JLabel lblStudentType = new JLabel("Student Type");
		lblStudentType.setForeground(new Color(255, 255, 255));
		lblStudentType.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblStudentType.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentType.setBounds(32, 260, 125, 21);
		frmDiscountSystem.getContentPane().add(lblStudentType);
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setForeground(new Color(255, 255, 255));
		lblCourseName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblCourseName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCourseName.setBounds(48, 320, 112, 21);
		frmDiscountSystem.getContentPane().add(lblCourseName);
		
		JLabel lblTuitionFee = new JLabel("Tuition Fee");
		lblTuitionFee.setForeground(new Color(255, 255, 255));
		lblTuitionFee.setBackground(new Color(51, 51, 51));
		lblTuitionFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblTuitionFee.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTuitionFee.setBounds(10, 380, 130, 21);
		frmDiscountSystem.getContentPane().add(lblTuitionFee);
		
		JLabel lblMiscellaneous = new JLabel("Miscellaneous");
		lblMiscellaneous.setForeground(new Color(255, 255, 255));
		lblMiscellaneous.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblMiscellaneous.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiscellaneous.setBounds(-9, 442, 169, 21);
		frmDiscountSystem.getContentPane().add(lblMiscellaneous);
		
		JLabel lblTitle = new JLabel("HONORATA NATIONAL SCHOOL");
		lblTitle.setIcon(new ImageIcon("C:\\Users\\Ryujin\\Downloads\\twich_icon_30x30.png"));
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblTitle.setBounds(32, 31, 317, 29);
		frmDiscountSystem.getContentPane().add(lblTitle);
		
		txtIDNumber = new JTextField();
		txtIDNumber.setForeground(new Color(255, 255, 255));
		txtIDNumber.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		txtIDNumber.setBounds(48, 110, 243, 20);
		txtIDNumber.setBackground(Color.decode("#666666"));
		frmDiscountSystem.getContentPane().add(txtIDNumber);
		txtIDNumber.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(new Color(255, 255, 255));
		txtFirstName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtFirstName.setBounds(48, 170, 243, 20);
		txtFirstName.setBackground(Color.decode("#666666"));
		frmDiscountSystem.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setForeground(new Color(255, 255, 255));
		txtLastName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtLastName.setBounds(48, 230, 243, 20);
		txtLastName.setBackground(Color.decode("#666666"));
		frmDiscountSystem.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		txtTuitionFee = new JTextField();
		txtTuitionFee.setForeground(new Color(255, 255, 255));
		txtTuitionFee.setEditable(false);
		txtTuitionFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtTuitionFee.setBounds(48, 411, 243, 20);
		txtTuitionFee.setBackground(Color.decode("#666666"));
		frmDiscountSystem.getContentPane().add(txtTuitionFee);
		txtTuitionFee.setColumns(10);
		
		txtMiscellaneousFee = new JTextField();
		txtMiscellaneousFee.setForeground(new Color(255, 255, 255));
		txtMiscellaneousFee.setEditable(false);
		txtMiscellaneousFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtMiscellaneousFee.setBounds(48, 471, 243, 20);
		txtMiscellaneousFee.setBackground(Color.decode("#666666"));
		frmDiscountSystem.getContentPane().add(txtMiscellaneousFee);
		txtMiscellaneousFee.setColumns(10);
		
		JComboBox cmbStudentType = new JComboBox();
		cmbStudentType.setForeground(new Color(255, 255, 255));
		cmbStudentType.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cmbStudentType.setBackground(Color.decode("#666666"));;
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cmbStudentType.setBackground(Color.decode("#666666"));;
			}
		});
		
		cmbStudentType.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbStudentType.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		cmbStudentType.setModel(new DefaultComboBoxModel(new String[] {"- Select Student Type -", "GOLD", "WHITE", "BLUE", "WALK-IN", "CONTINUING"}));
		cmbStudentType.setSelectedIndex(0);
		cmbStudentType.setBounds(48, 288, 243, 22);
		cmbStudentType.setBackground(Color.decode("#666666"));
		frmDiscountSystem.getContentPane().add(cmbStudentType);
		
		JComboBox cmbCourseName = new JComboBox();
		cmbCourseName.setForeground(new Color(255, 255, 255));
		cmbCourseName.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				txtTuitionFee.setText(feesPerCourse[cmbCourseName.getSelectedIndex()][0]);
				txtMiscellaneousFee.setText(feesPerCourse[cmbCourseName.getSelectedIndex()][1]);
			}
		});
		cmbCourseName.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbCourseName.setModel(new DefaultComboBoxModel(new String[] {"- Select Course Name -", "TOURISM", "NURSING", "ARCHITECTURE", "ENGINEERING", "COMPUTER SCIENCE"}));
		cmbCourseName.setSelectedIndex(0);
		cmbCourseName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		cmbCourseName.setBounds(48, 348, 243, 22);
		cmbCourseName.setBackground(Color.decode("#666666"));
		frmDiscountSystem.getContentPane().add(cmbCourseName);
		
		JButton btnNewButton = new JButton("COMPUTE");
		btnNewButton.setBackground(Color.decode("#666666"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtIDNumber.getText().trim().length() == 0 || txtFirstName.getText().trim().length() == 0 || txtLastName.getText().trim().length() == 0)
					JOptionPane.showMessageDialog(frmDiscountSystem, "Fill empty fields", "Empty Fields Detected", JOptionPane.INFORMATION_MESSAGE);
				if(cmbCourseName.getSelectedIndex() == 0 || cmbStudentType.getSelectedIndex() == 0)
					JOptionPane.showMessageDialog(frmDiscountSystem, "Please select your course/student type", "Unselected Fields Detected", JOptionPane.INFORMATION_MESSAGE);
				else {
					double tuitionFee = Double.parseDouble(txtTuitionFee.getText());
					double miscellaneousFee = Double.parseDouble(txtMiscellaneousFee.getText());
					double discount = 0;
					double total = 0;
					switch(cmbStudentType.getSelectedItem().toString()) {
						case "GOLD":
							discount = 0.5;
							break;
						case "WHITE":
							discount = 0.1;
							break;
						case "BLUE":
							discount = 0.3;
							break;
						case "CONTINUING":
							discount = 0.1;
							break;
					}
					if(cmbStudentType.getSelectedItem().toString() == "CONTINUING")
						total = tuitionFee * (1 - discount) + miscellaneousFee;
					else
						total = (tuitionFee + miscellaneousFee) * (1 - discount);
					
					JOptionPane.showMessageDialog(frmDiscountSystem, "Tuition (Computed): PHP " + String.format("%.2f", total), "Breakdown of Fees", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(48, 502, 109, 23);
		frmDiscountSystem.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setBackground(Color.decode("#666666"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIDNumber.setText(null);
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtTuitionFee.setText(null);
				txtMiscellaneousFee.setText(null);
				cmbStudentType.setSelectedIndex(0);
				cmbCourseName.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(182, 502, 109, 23);
		frmDiscountSystem.getContentPane().add(btnNewButton_1);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				frmDiscountSystem.dispose();
				login.frmLogin.setVisible(true);
				
			}
		});
		btnLogOut.setBounds(129, 536, 85, 21);
		frmDiscountSystem.getContentPane().add(btnLogOut);
	}
}
