package testproject;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class test {
	
	public static void main(String []args)
	{
		// ALL UI Components
		JFrame frame= new JFrame();	
	
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("Test");
		label.setBounds(500, 500, 500, 60);
		panel.add(label);		
		
		JTextField textfield = new JTextField();
		textfield.setLocation(700, 700);
		textfield.setPreferredSize(new Dimension(200,22));
		panel.add(textfield);
		
		JButton buttom = new JButton("buttom");
		panel.add(buttom);		
		
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Search Engine Test");
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
