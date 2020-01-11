import java.awt.EventQueue;

import javax.swing.JFrame;
//import java.awt.Dialog.ModalExclusionType;
import javax.swing.JPanel;
//import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class PaperlessVotingSystem {

	private JFrame frame;
	private JTextField studentNumberTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaperlessVotingSystem window = new PaperlessVotingSystem();
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
	public PaperlessVotingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panelCandidates = new JPanel();
		panelCandidates.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(panelCandidates);
		panelCandidates.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		initializePanelLogin();
		initializePanelWelcome();
	}
	
	private void initializePanelLogin()
	{
		cleanPanel();
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel label = new JLabel("Welcome to BB554C's Voting System");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		label.setBounds(150, 9, 500, 35);
		panelLogin.add(label);
		
		studentNumberTextField = new JTextField();
		studentNumberTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		studentNumberTextField.setBounds(250, 200, 400, 40);
		panelLogin.add(studentNumberTextField);
		studentNumberTextField.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				initializePanelWelcome();
			}
		});
		btnBack.setBackground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(10, 10, 110, 40);
		panelLogin.add(btnBack);
		
		JLabel lblStudentNumber = new JLabel("Student Number");
		lblStudentNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentNumber.setBounds(90, 200, 150, 40);
		panelLogin.add(lblStudentNumber);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(150, 280, 90, 40);
		panelLogin.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(250, 280, 400, 40);
		panelLogin.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBackground(Color.GREEN);
		btnLogin.setBounds(300, 370, 150, 60);
		panelLogin.add(btnLogin);
	}
	
	private void initializePanelWelcome()
	{
		cleanPanel();
		
		JPanel panelWelcome = new JPanel();
		panelWelcome.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(panelWelcome);
		panelWelcome.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to BB554C's Voting System");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 20, 766, 101);
		panelWelcome.add(lblNewLabel);
		
		JButton btnAdminLogin = new JButton("ADMIN LOGIN");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				initializePanelLogin();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdminLogin.setBounds(280, 450, 200, 50);
		panelWelcome.add(btnAdminLogin);
		
		JButton btnStartVoting = new JButton("START VOTING");
		btnStartVoting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStartVoting.setBackground(new Color(0, 255, 102));
		btnStartVoting.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStartVoting.setBounds(280, 200, 200, 100);
		panelWelcome.add(btnStartVoting);
		
		JButton btnStartMockVote = new JButton("Start Mock Vote");
		btnStartMockVote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStartMockVote.setBackground(new Color(255, 51, 0));
		btnStartMockVote.setForeground(Color.BLACK);
		btnStartMockVote.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStartMockVote.setBounds(576, 503, 200, 50);
		panelWelcome.add(btnStartMockVote);
	}
	
	private void cleanPanel()
	{
		frame.getContentPane().removeAll();
		frame.getContentPane().repaint();
		frame.getContentPane().revalidate();
	}
}
