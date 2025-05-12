/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

/**
 * @author NGUYEN THI LANG
 *
 */
public class CounterListener implements ActionListener {

	private CounterView ctv;

	public CounterListener(CounterView ctv) {
		this.ctv = ctv;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Ban da nhan nut!");

		String src = e.getActionCommand();
		System.out.println("Ban da nhan nut: " + src);

		if (src.equals("UP")) {
			this.ctv.increment();
		} else if (src.equals("DOWN")) {
			this.ctv.decrement();

		} else if (src.equals("RESET")) {
			this.ctv.reset();
		}
	}

}
