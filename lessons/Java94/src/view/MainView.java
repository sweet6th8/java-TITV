package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class MainView extends JFrame {
	private JMenu menu, subMenu;
	private JMenuItem i1, i2, i3, i4, i5;
	private JMenuBar mb;
	private JButton jButton;
	private JLabel jLabel;

	public MainView() {
		this.setTitle("Lang dthww");
		this.setSize(600, 900);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		Font font = new Font("Arial", Font.BOLD, 40);

		// Set Icon => JFrame
		URL url_IconPig = MainView.class.getResource("pig.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_IconPig);
		this.setIconImage(img);

		// JMenuBar
		menu = new JMenu("Menu");
		subMenu = new JMenu("Sub Menu");
		i1 = new JMenu("New");
		i1.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("New-file-icon.png"))));
		i2 = new JMenu("Save");
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("Save-icon.png"))));
		i3 = new JMenu("Save As");
		i3.setIcon(
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("Save-as-icon.png"))));
		i4 = new JMenu("Exit");
		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("exit-icon.png"))));
		i5 = new JMenu("Test");
		i5.setIcon(
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("Tests-icon.png"))));
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		subMenu.add(i4);
		subMenu.add(i5);
		menu.add(subMenu);

		mb = new JMenuBar();
		mb.add(menu);
		// JLabel
		jLabel = new JLabel();

		jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("Lang.jpg"))));

		// JButton
		jButton = new JButton("TEST BUTTON");
		jButton.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("TestButton-icon.png"))));
		jButton.setFont(font);
		jButton.setSize(50, 50);

		this.setJMenuBar(mb);
		this.add(jLabel, BorderLayout.CENTER);
		this.add(jButton, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MainView();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}