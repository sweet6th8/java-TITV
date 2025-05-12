/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

/**
 * @author NGUYEN THI LANG
 *
 */
public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jb_up;
	private JButton jb_down;
	private JLabel jlabel_value;
	private JButton jb_reset;

	public CounterView(CounterModel counterModel) {
		this.counterModel = counterModel;
		this.init(); // khoi tao

	}

	public void init() {
		this.setTitle("Counter");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener ac = new CounterListener(this);

		jb_up = new JButton("UP");
		jb_up.addActionListener(ac);
		jb_down = new JButton("DOWN");
		jb_down.addActionListener(ac);
		jb_reset = new JButton("RESET");
		jb_reset.addActionListener(ac);

		jlabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jb_up, BorderLayout.WEST);
		jPanel.add(jb_down, BorderLayout.EAST);
		jPanel.add(jlabel_value, BorderLayout.CENTER);
		jPanel.add(jb_reset, BorderLayout.SOUTH);

		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);

		this.setVisible(true);

	}

	public void increment() {
		this.counterModel.increment();
		this.jlabel_value.setText(this.counterModel.getValue() + "");
	}

	public void decrement() {
		this.counterModel.decrement();
		this.jlabel_value.setText(this.counterModel.getValue() + "");
	}

	public void reset() {
		this.counterModel.reset();
		this.jlabel_value.setText(this.counterModel.getValue() + "");
	}
}
