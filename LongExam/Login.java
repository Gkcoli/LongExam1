

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Login {

	JFrame frmLogin;
	private JTextField txtField;
	JFrame frmDiscountSystem;
	JTextField txtIDNumber;
	JTextField txtFirstName;
	JTextField txtLastName;
	JTextField txtTuitionFee;
	JTextField txtMiscellaneousFee;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ryujin\\Downloads\\twich_icon_30x30.png"));
		frmLogin.setTitle("Twitch.tv");
		frmLogin.setBounds(100, 100, 785, 463);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBorderPaintedFlat(true);
		chckbxNewCheckBox.setBorderPainted(true);
		chckbxNewCheckBox.setBorder(null);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('*');
				}
			}
		});
		
		chckbxNewCheckBox.setBounds(533, 278, 29, 28);
		chckbxNewCheckBox.setIcon(new ImageIcon("C:\\Users\\Ryujin\\Downloads\\show_pw_20x20.png"));
		chckbxNewCheckBox.setBackground(Color.decode("#666666"));
		frmLogin.getContentPane().add(chckbxNewCheckBox);
		JLabel lblPass = new JLabel("Password");
		lblPass.setBounds(214, 239, 98, 29);
		lblPass.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblPass.setForeground(new Color(255, 255, 255));
		frmLogin.getContentPane().add(lblPass);
		
		JLabel lblNewLabel_5 = new JLabel("Log in");
		lblNewLabel_5.setBounds(214, 106, 74, 28);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_5.setForeground(Color.decode("#FFFFFF"));
		frmLogin.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					String userText;
					String pwdText;
					userText = txtField.getText();
	                pwdText = passwordField.getText();
	                    if (userText.equals("Admin1") && pwdText.equals("Pass123")) {
	                        JOptionPane.showMessageDialog(btnNewButton, "Redirecting to Next Page", "Login Successfully", 1);
	                        
	                        DiscountSystemPractice window2 = new DiscountSystemPractice();
	                        window2.frmDiscountSystem.setVisible(true);
	                        frmLogin.dispose();
	                    } else {
	                        if (!userText.equals("Admin1")) {
	                            JOptionPane.showMessageDialog(null, "Incorrect username. Please try again.");
	                        } else if(!pwdText.equals("Ryujin123")) {
	                            JOptionPane.showMessageDialog(null, "Incorrect password. Please try again.");
	                        
	                        }
	                      }
				}
			}
	});
	
		btnNewButton.setBackground(Color.decode("#666666"));
		frmLogin.getContentPane().add(btnNewButton);


		btnNewButton.setBounds(214, 338, 348, 28);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.decode("#666666"));
		frmLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Trouble logging in?");
		lblNewLabel_6.setBounds(214, 303, 287, 34);
		lblNewLabel_6.setForeground(Color.decode("#9b6ddf"));
		frmLogin.getContentPane().add(lblNewLabel_6);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setBounds(214, 150, 98, 29);
		lblUser.setForeground(new Color(255, 255, 255));
		lblUser.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblUser.setForeground(Color.decode("#FFFFFF"));
		frmLogin.getContentPane().add(lblUser);
		
		txtField = new JTextField();
		txtField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtField.setBackground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtField.setBackground(Color.gray);
			}
		});
		txtField.setBounds(214, 189, 348, 28);
		txtField.setBackground(Color.decode("#666666"));
		frmLogin.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Log in to Twitch");
		lblNewLabel_2.setBounds(290, 59, 186, 50);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Ryujin\\Downloads\\twich_icon_30x30.png"));
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		frmLogin.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(128, 128, 128));
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				passwordField.setBackground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				passwordField.setBackground(Color.gray);
			}
		});
		passwordField.setBounds(214, 278, 348, 28);
		frmLogin.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(187, 59, 401, 369);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ryujin\\Downloads\\output-onlinepngtools.png"));
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -53, 909, 529);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ryujin\\Downloads\\twitch.jpg"));
		frmLogin.getContentPane().add(lblNewLabel);
	}
}
