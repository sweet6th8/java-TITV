package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame {
	private MyColorModel myColorModel;
	private JLabel jLabel;

	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
	}

	private void init() {

		this.setTitle("My Color");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Font font_text = new Font("Arial", Font.BOLD, 100);
		jLabel = new JLabel("AAAA");

		jLabel.setFont(font_text);
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));

		Font font = new Font("Arial", Font.BOLD, 20);
		MyColorListener myColorListener = new MyColorListener(this);

		JButton redbtn = new JButton("Red Text");
		redbtn.setFont(font);
		redbtn.setForeground(Color.RED);// mau chu
		redbtn.addActionListener(myColorListener);

		JButton yellowbtn = new JButton("Yellow Text");
		yellowbtn.setFont(font);
		yellowbtn.setForeground(Color.YELLOW);
		yellowbtn.addActionListener(myColorListener);

		JButton greenbtn = new JButton("Green Text");
		greenbtn.setFont(font);
		greenbtn.setForeground(Color.GREEN);
		greenbtn.addActionListener(myColorListener);

		JButton redBGbtn = new JButton("Red BackGround");
		redBGbtn.setFont(font);
		redBGbtn.setBackground(Color.RED);// mau nen
		redBGbtn.setOpaque(true);// to mau vien
		redBGbtn.addActionListener(myColorListener);

		JButton yellowBGbtn = new JButton("Yellow BackGround");
		yellowBGbtn.setFont(font);
		yellowBGbtn.setBackground(Color.YELLOW);
		yellowBGbtn.addActionListener(myColorListener);

		JButton greenBGbtn = new JButton("Green BackGround");
		greenBGbtn.setFont(font);
		greenBGbtn.setBackground(Color.GREEN);
		greenBGbtn.addActionListener(myColorListener);

		jPanel.add(redbtn);
		jPanel.add(yellowbtn);
		jPanel.add(greenbtn);
		jPanel.add(redBGbtn);
		jPanel.add(yellowBGbtn);
		jPanel.add(greenBGbtn);

		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public void changeTextColor(Color color) {
		this.jLabel.setForeground(color);
	}

	public void changeBackGroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}

	
}
