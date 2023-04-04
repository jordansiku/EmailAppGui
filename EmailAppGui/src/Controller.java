import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class Controller {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	Email email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller window = new Controller();
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
	public Controller() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Email App");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel Label1 = new JLabel("Name");
		panel.add(Label1);
		
		textField1 = new JTextField();
		panel.add(textField1);
		textField1.setColumns(10);
		
		JLabel Label2 = new JLabel("Surname");
		panel.add(Label2);
		
		textField2 = new JTextField();
		panel.add(textField2);
		textField2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		
		JComboBox <String> comboBox = new JComboBox <>();
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton Button1 = new JButton("Create Email");
		
		panel_2.add(Button1);
		
		// Populating the ComboBox
		
		comboBox.addItem("Sales");
		comboBox.addItem("Development");
		comboBox.addItem("Accounting");
		
		// Calling the constructor in a mouse click listener
		
		Button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				email = new Email(textField1.getText(),textField2.getText(),comboBox.getSelectedItem().toString());
				
				JOptionPane.showMessageDialog(null,email.showInfo());
				
				textField1.setText("");
				textField2.setText("");
				
			}
		});
	
		
	}

}
