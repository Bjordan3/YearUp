import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GUIsDisplay {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblWhatIsYour;
	private JButton btnClear;
	private JLabel lblHowOldAre;
	private JTextField textField1;
	private JLabel lblAreYouAre;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIsDisplay window = new GUIsDisplay();
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
	public GUIsDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblWhatIsYour = new JLabel("What is your Name:");
		lblWhatIsYour.setBounds(10, 11, 155, 20);
		lblWhatIsYour.setFont(new Font("Ravie", Font.PLAIN, 11));
		frame.getContentPane().add(lblWhatIsYour);
		
		textField = new JTextField();
		textField.setBounds(204, 11, 195, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnEnter = new JButton("Enter:");
		btnEnter.setBounds(47, 151, 89, 23);
		btnEnter.addMouseListener(new MouseAdapter() {
			
		});
		
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				lblNewLabel.setText("Nice to meet you "+ textField.getText()+ " and you are " + textField1.getText()+ " years old "
						+ "and you said " + comboBox.getSelectedItem() +" to being in Year Up.");
			}
		});
		frame.getContentPane().add(btnEnter);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 217, 545, 85);
		frame.getContentPane().add(lblNewLabel);
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(272, 151, 89, 23);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField1.setText("");
				lblNewLabel.setText("");
				comboBox.setSelectedItem("Yes");
			}
		});
		frame.getContentPane().add(btnClear);
		
		lblHowOldAre = new JLabel("How Old are You:");
		lblHowOldAre.setBounds(10, 54, 141, 33);
		lblHowOldAre.setFont(new Font("Ravie", Font.PLAIN, 11));
		frame.getContentPane().add(lblHowOldAre);
		
		textField1 = new JTextField();
		textField1.setBounds(204, 60, 195, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		lblAreYouAre = new JLabel("Are you are in Year Up:");
		lblAreYouAre.setBounds(10, 98, 182, 33);
		lblAreYouAre.setFont(new Font("Ravie", Font.PLAIN, 11));
		frame.getContentPane().add(lblAreYouAre);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboBox.setBounds(204, 104, 187, 20);
		frame.getContentPane().add(comboBox);
	}
}