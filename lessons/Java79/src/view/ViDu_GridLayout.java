package view;

import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame{
	
		public ViDu_GridLayout() {
			this.setTitle("ViDu_GridLayout");
			this.setSize(600, 400);
			//can o giua
			this.setLocationRelativeTo(null);
			
			//Set Layout
			GridLayout GridLayout = new GridLayout();
			GridLayout GridLayout_1 = new GridLayout(4, 3);//dong, cot
			GridLayout GridLayout_2 = new GridLayout(4, 3, 50 ,50);
			
			this.setLayout(GridLayout_2);
			
			for (int i = 1; i <=12; i++) {
				JButton jb = new JButton(i +"");
				this.add(jb);
			}			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
	public static void main(String[] args) {
		new ViDu_GridLayout();
	}

	}

