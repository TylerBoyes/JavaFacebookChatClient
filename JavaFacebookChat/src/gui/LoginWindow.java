package gui;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginWindow extends JFrame {
	
	public static final String TITLE = "Java Facebook Chat";
	public static final int SIZE_TEXT_FIELD = 25;
	
	LoginWindow() {
		setTitle(TITLE);
		setBounds(200, 200, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container contentPane = getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel label = new JLabel(TITLE);
		contentPane.add(label);
		contentPane.add(createEmailPanel());
		contentPane.add(createPasswordPanel());
		
	}
	
	private JPanel createEmailPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel ("Email or Phone");
		JTextField textField = new JTextField(SIZE_TEXT_FIELD);
		panel.add(label);
		panel.add(textField);
		return panel;
	}
	
	private JPanel createPasswordPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel ("Password");
		JTextField textField = new JTextField(SIZE_TEXT_FIELD);
		panel.add(label);
		panel.add(textField);
		return panel;
		
	}
	
}
