package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel{

	public JPanelDraw() {
		this.setBackground(Color.WHITE);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(10, 10, 500, 600);
		
		
		g.setColor(Color.BLUE);
		g.drawRect(50, 50, 100, 400);
		
		g.setColor(Color.BLACK);
		g.drawOval(200, 200, 100, 200);
		
		g.setColor(Color.BLACK);
		g.fillOval(500, 200, 100, 100);
		
		g.setColor(Color.RED);
		g.fillRect(300, 100, 100, 200);
		
		g.setColor(Color.RED);
		g.drawString("Thanh Dat khum", 300, 150);
	}
}