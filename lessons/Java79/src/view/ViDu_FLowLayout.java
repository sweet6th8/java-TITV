package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FLowLayout extends JFrame{
	
	public ViDu_FLowLayout() {
		this.setTitle("ViDu_FLowLayout");
		this.setSize(600, 400);
		//can o giua
		this.setLocationRelativeTo(null);
		
		//Set Layout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 50 ,50);
		
		this.setLayout(flowLayout_2);
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		
		//add thanh phan
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
public static void main(String[] args) {
	new ViDu_FLowLayout();
}

}
