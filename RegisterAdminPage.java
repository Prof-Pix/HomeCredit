package AuthFrames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;

public class RegisterAdminPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField raUserField;
	private JTextField raFNameField;
	private JTextField raMiddleNameField;
	private JLabel raLastNameLabel;
	private JTextField raLastNameField;
	private JLabel raAgeLabel;
	private JTextField raPhoneNumberField;
	private JLabel raEmailLabel;
	private JTextField raAgeField;
	private JLabel raPhoneNumberLabel;
	private JTextField raEmailField;
	private JLabel raPasswordLabel;
	private JTextField raPasswordField;
	private JButton registerAdminButton;
	private JLabel raMonthLabel;
	private JLabel raDayLabel;
	private JLabel raYearLabel;
	private JTextField raDayField;
	private JTextField raYearField;
	private JLabel lblAccountDetails;
	private JSeparator separator;
	private JLabel lblPersonalInformation;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterAdminPage frame = new RegisterAdminPage();
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
	public RegisterAdminPage() {
		setTitle("Admin Registration Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(434, 0, 450, 461);
		panel.setBackground(new Color(128, 0, 0));
		contentPane.add(panel);
		
		JLabel raUserLabel = new JLabel("Username:");
		raUserLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		raUserLabel.setBounds(40, 53, 107, 14);
		contentPane.add(raUserLabel);
		
		raUserField = new JTextField();
		raUserField.setBounds(147, 51, 192, 20);
		contentPane.add(raUserField);
		raUserField.setColumns(10);
		
		JLabel raFNameLabel = new JLabel("First Name:");
		raFNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		raFNameLabel.setBounds(40, 154, 97, 14);
		contentPane.add(raFNameLabel);
		
		raFNameField = new JTextField();
		raFNameField.setBounds(147, 152, 192, 20);
		raFNameField.setColumns(10);
		contentPane.add(raFNameField);
		
		JLabel lblMiddlename = new JLabel("Middle Name:");
		lblMiddlename.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMiddlename.setBounds(40, 185, 97, 14);
		contentPane.add(lblMiddlename);
		
		raMiddleNameField = new JTextField();
		raMiddleNameField.setBounds(147, 183, 192, 20);
		raMiddleNameField.setColumns(10);
		contentPane.add(raMiddleNameField);
		
		raLastNameLabel = new JLabel("Last Name:");
		raLastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		raLastNameLabel.setBounds(40, 216, 97, 14);
		contentPane.add(raLastNameLabel);
		
		raLastNameField = new JTextField();
		raLastNameField.setBounds(147, 214, 192, 20);
		raLastNameField.setColumns(10);
		contentPane.add(raLastNameField);
		
		raAgeLabel = new JLabel("Age:");
		raAgeLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		raAgeLabel.setBounds(40, 276, 97, 18);
		contentPane.add(raAgeLabel);
		
		raPhoneNumberField = new JTextField();
		raPhoneNumberField.setBounds(147, 339, 192, 20);
		raPhoneNumberField.setColumns(10);
		contentPane.add(raPhoneNumberField);
		
		raEmailLabel = new JLabel("Email:");
		raEmailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		raEmailLabel.setBounds(40, 311, 97, 14);
		contentPane.add(raEmailLabel);
		
		raAgeField = new JTextField();
		raAgeField.setBounds(147, 276, 46, 20);
		raAgeField.setColumns(10);
		contentPane.add(raAgeField);
		
		raPhoneNumberLabel = new JLabel("Phone Number:");
		raPhoneNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		raPhoneNumberLabel.setBounds(40, 341, 97, 14);
		contentPane.add(raPhoneNumberLabel);
		
		raEmailField = new JTextField();
		raEmailField.setBounds(147, 307, 192, 20);
		raEmailField.setColumns(10);
		contentPane.add(raEmailField);
		
		raPasswordLabel = new JLabel("Password:");
		raPasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		raPasswordLabel.setBounds(40, 84, 107, 14);
		contentPane.add(raPasswordLabel);
		
		raPasswordField = new JTextField();
		raPasswordField.setColumns(10);
		raPasswordField.setBounds(147, 82, 192, 20);
		contentPane.add(raPasswordField);
		
		registerAdminButton = new JButton("Register Admin Account");
		registerAdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registerAdminButton.setBounds(147, 376, 192, 48);
		contentPane.add(registerAdminButton);
		
		JLabel lblBirthday = new JLabel("Birthday:");
		lblBirthday.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBirthday.setBounds(40, 248, 97, 14);
		contentPane.add(lblBirthday);
		
		raMonthLabel = new JLabel("MM");
		raMonthLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		raMonthLabel.setBounds(147, 248, 16, 14);
		contentPane.add(raMonthLabel);
		
		raDayLabel = new JLabel("DD");
		raDayLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		raDayLabel.setBounds(215, 249, 16, 14);
		contentPane.add(raDayLabel);
		
		raYearLabel = new JLabel("YY");
		raYearLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		raYearLabel.setBounds(283, 248, 16, 14);
		contentPane.add(raYearLabel);
		
		JTextField raMonthField = new JTextField();
		raMonthField.setBounds(167, 245, 38, 20);
		contentPane.add(raMonthField);
		raMonthField.setColumns(10);
		
		raDayField = new JTextField();
		raDayField.setColumns(10);
		raDayField.setBounds(235, 245, 38, 20);
		contentPane.add(raDayField);
		
		raYearField = new JTextField();
		raYearField.setColumns(10);
		raYearField.setBounds(303, 245, 38, 20);
		contentPane.add(raYearField);
		
		lblAccountDetails = new JLabel("Account Details");
		lblAccountDetails.setFont(new Font("Dialog", Font.BOLD, 15));
		lblAccountDetails.setBounds(20, 26, 153, 14);
		contentPane.add(lblAccountDetails);
		
		separator = new JSeparator();
		separator.setBounds(20, 114, 335, 2);
		contentPane.add(separator);
		
		lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPersonalInformation.setBounds(20, 127, 153, 14);
		contentPane.add(lblPersonalInformation);
		
		lblNewLabel = new JLabel("Already a member? Login");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setBounds(172, 430, 147, 14);
		contentPane.add(lblNewLabel);
	}
}
