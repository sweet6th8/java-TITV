package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonListener implements ActionListener {
	private LastButtonView lastButtonView;

	public LastButtonListener(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String srcEvent = e.getActionCommand();
		if (srcEvent.equals("1")) {
			this.lastButtonView.changeTo_1();
		} else if (srcEvent.equals("2")) {
			this.lastButtonView.changeTo_2();
		} else if (srcEvent.equals("3")) {
			this.lastButtonView.changeTo_3();
		} else if (srcEvent.equals("4")) {
			this.lastButtonView.changeTo_4();
		}
	}

}
