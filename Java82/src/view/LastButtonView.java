package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private JLabel jlabel;

	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();

		this.init();
	}

	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 300);

		JPanel jpanel_Center = new JPanel();
		jpanel_Center.setLayout(new GridLayout(2, 2));

		// Tao Listener
		LastButtonListener lastButtonListener = new LastButtonListener(this);

		// Tao font
		Font font = new Font("Arial", Font.BOLD, 30);

		JButton jb1 = new JButton("1");
		jb1.setFont(font);
		jb1.addActionListener(lastButtonListener);
		JButton jb2 = new JButton("2");
		jb2.setFont(font);
		jb2.addActionListener(lastButtonListener);
		JButton jb3 = new JButton("3");
		jb3.setFont(font);
		jb3.addActionListener(lastButtonListener);
		JButton jb4 = new JButton("4");
		jb4.setFont(font);
		jb4.addActionListener(lastButtonListener);

		jpanel_Center.add(jb1);
		jpanel_Center.add(jb2);
		jpanel_Center.add(jb3);
		jpanel_Center.add(jb4);

		JPanel jpanel_footer = new JPanel();
		jlabel = new JLabel("------------");
		// jlabel.setText("------------");
		jlabel.setFont(font);
		jpanel_footer.add(jlabel);

		this.setLayout(new BorderLayout());

		this.add(jpanel_Center, BorderLayout.CENTER);
		this.add(jpanel_footer, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void changeTo_1() {
		this.lastButtonModel.setValue_1();
		jlabel.setText("Last Button: " + this.lastButtonModel.getValue());
	}

	public void changeTo_2() {
		this.lastButtonModel.setValue_2();
		jlabel.setText("Last Button: " + this.lastButtonModel.getValue());
	}

	public void changeTo_3() {
		this.lastButtonModel.setValue_3();
		jlabel.setText("Last Button: " + this.lastButtonModel.getValue());
	}

	public void changeTo_4() {
		this.lastButtonModel.setValue_4();
		jlabel.setText("Last Button: " + this.lastButtonModel.getValue());
	}
}
