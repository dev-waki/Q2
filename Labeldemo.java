package swingexample;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Labeldemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textmessage;
    private JLabel lblmsg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Labeldemo frame = new Labeldemo();
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
	public Labeldemo() {
		setTitle("My First Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter something");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(30, 69, 102, 25);
		contentPane.add(lblNewLabel);
		
		textmessage = new JTextField();
		textmessage.setBounds(202, 71, 86, 20);
		contentPane.add(textmessage);
		textmessage.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblmsg.setText(textmessage.getText());
			}
		});
		btnNewButton.setBounds(92, 146, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textmessage.setText("");
				lblmsg.setText("");
			}
		});
		btnNewButton_1.setBounds(272, 146, 89, 23);
		contentPane.add(btnNewButton_1);
		
		lblmsg = new JLabel("");
		lblmsg.setBounds(202, 216, 46, 14);
		contentPane.add(lblmsg);
	}
}
