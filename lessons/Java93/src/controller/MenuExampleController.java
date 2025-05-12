package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
	private MenuExampleView menuExampleView;

	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();// e.getActionCommand la chuoi,
		if (button.equals("Exit")) {
			System.exit(0);
		}  if (button.equals("Toolbar")) {
			System.out.println("Toolbar");
			AbstractButton checkBox = (AbstractButton) e.getSource();//e.getSource() la 1 doi tuong minh vua click or enter
			boolean check = checkBox.getModel().isSelected();
			if (check) {
				System.out.println("check");
				this.menuExampleView.enableToolbar();
			} else {
				System.out.println("uncheck");
				this.menuExampleView.disableToolbar();
			}
		} else {
			this.menuExampleView.setTextJLabel("Ban da click:" + button);

		}
	}

}
