package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FindView;

public class FindListener implements ActionListener {
	private FindView findView;

	public FindListener(FindView findView) {
		this.findView = findView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.findView.find();
	}

}
