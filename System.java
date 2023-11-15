package payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class System extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Name;
	private JTextField Rate;
	private JTextField Hours;
	private JTextField Days;
	private JTextField Tax;
	private JTextField Phealth;
	private JTextField sss;
	private JTextField Gross;
	private JTextField Deduction;
	private JTextField GrossSal;
	private JTextField TotalDeductions;
	private JTextField NetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System frame = new System();
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
	public System() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Employee Name:");
		lblName.setBounds(34, 61, 90, 19);
		contentPane.add(lblName);
		
		Name = new JTextField();
		Name.setBounds(134, 60, 86, 20);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Rate Per Hour:");
		lblNewLabel.setBounds(34, 99, 76, 17);
		contentPane.add(lblNewLabel);
		
		Rate = new JTextField();
		Rate.setBounds(134, 96, 86, 20);
		contentPane.add(Rate);
		Rate.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Hour Per Day:");
		lblNewLabel_1.setBounds(34, 138, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		Hours = new JTextField();
		Hours.setBounds(134, 135, 86, 20);
		contentPane.add(Hours);
		Hours.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Number of days worked:");
		lblNewLabel_2.setBounds(10, 182, 100, 19);
		contentPane.add(lblNewLabel_2);
		
		Days = new JTextField();
		Days.setBounds(134, 181, 86, 20);
		contentPane.add(Days);
		Days.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(244, 63, 142, 17);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tax 15% of Monthly Wage:");
		lblNewLabel_4.setBounds(254, 100, 142, 14);
		contentPane.add(lblNewLabel_4);
		
		Tax = new JTextField();
		Tax.setEnabled(false);
		Tax.setEditable(false);
		Tax.setBounds(398, 97, 86, 20);
		contentPane.add(Tax);
		Tax.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Philhealth 5%:");
		lblNewLabel_5.setBounds(315, 138, 76, 14);
		contentPane.add(lblNewLabel_5);
		
		Phealth = new JTextField();
		Phealth.setEditable(false);
		Phealth.setEnabled(false);
		Phealth.setBounds(398, 135, 86, 20);
		contentPane.add(Phealth);
		Phealth.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("sss 2%:");
		lblNewLabel_6.setBounds(340, 182, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		sss = new JTextField();
		sss.setEditable(false);
		sss.setEnabled(false);
		sss.setBounds(398, 181, 86, 20);
		contentPane.add(sss);
		sss.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Gross salary:");
		lblNewLabel_7.setBounds(528, 100, 70, 19);
		contentPane.add(lblNewLabel_7);
		
		Gross = new JTextField();
		Gross.setEnabled(false);
		Gross.setEditable(false);
		Gross.setBounds(608, 97, 86, 20);
		contentPane.add(Gross);
		Gross.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Deduction:");
		lblNewLabel_8.setBounds(538, 138, 60, 14);
		contentPane.add(lblNewLabel_8);
		
		Deduction = new JTextField();
		Deduction.setEditable(false);
		Deduction.setEnabled(false);
		Deduction.setBounds(608, 135, 86, 20);
		contentPane.add(Deduction);
		Deduction.setColumns(10);
		
		JLabel GrossSalary = new JLabel("GROSS SALARY:");
		GrossSalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		GrossSalary.setBounds(10, 254, 129, 14);
		contentPane.add(GrossSalary);
		
		GrossSal = new JTextField();
		GrossSal.setEnabled(false);
		GrossSal.setEditable(false);
		GrossSal.setBounds(134, 253, 86, 20);
		contentPane.add(GrossSal);
		GrossSal.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10.setBounds(223, 254, 173, 14);
		contentPane.add(lblNewLabel_10);
		
		TotalDeductions = new JTextField();
		TotalDeductions.setEnabled(false);
		TotalDeductions.setEditable(false);
		TotalDeductions.setBounds(398, 253, 86, 20);
		contentPane.add(TotalDeductions);
		TotalDeductions.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("NET SALARY:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11.setBounds(494, 254, 120, 14);
		contentPane.add(lblNewLabel_11);
		
		NetSalary = new JTextField();
		NetSalary.setEditable(false);
		NetSalary.setEnabled(false);
		NetSalary.setBounds(608, 253, 86, 20);
		contentPane.add(NetSalary);
		NetSalary.setColumns(10);
		
		JButton btnNewButton = new JButton("COMPUTE");
		btnNewButton.setBackground(new Color(64, 128, 128));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(307, 310, 144, 23);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_12 = new JLabel("Simple Payroll System");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_12.setBounds(268, 23, 216, 26);
		contentPane.add(lblNewLabel_12);
	}
}
