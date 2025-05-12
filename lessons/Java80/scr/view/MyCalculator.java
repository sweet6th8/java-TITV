package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My Calculator");
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField jTextField = new JTextField(150);
		JPanel jPanel_head = new JPanel();// vat chua
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);

		JPanel jPanel_button = new JPanel();
		jPanel_button.setLayout(new GridLayout(5, 3));

		for (int i = 0; i < 10; i++) {
			JButton jButton = new JButton(i+"");
			jPanel_button.add(jButton);
		}
		JButton congBtn = new JButton("+"); 
		JButton jB_tru = new JButton("-");
		JButton jB_nhan = new JButton("*");
		JButton jB_chia = new JButton("/");
		JButton jB_bang = new JButton("=");

		jPanel_button.add(congBtn);
		jPanel_button.add(jB_tru);
		jPanel_button.add(jB_nhan);
		jPanel_button.add(jB_chia);
		jPanel_button.add(jB_bang);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_button, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyCalculator();
	}
}
