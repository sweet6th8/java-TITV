package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.MenuExampleView;

public class MenuExampleMouseListener implements MouseListener{
	MenuExampleView menuExampleView;
	
	public MenuExampleMouseListener(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) { //nhan chuot
		if (e.isPopupTrigger()) {
			this.menuExampleView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger()) {
			this.menuExampleView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
