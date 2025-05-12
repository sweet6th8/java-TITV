/**
 * 
 */
package test;

import model.CounterModel;
import view.CounterView;

/**
 * @author NGUYEN THI LANG
 *
 */
public class Test {
	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		ct.increment();
		ct.increment();
		ct.increment();
		ct.increment();
		System.out.println(ct.getValue());
		ct.decrement();
		ct.decrement();
		System.out.println(ct.getValue());

		CounterView ctv = new CounterView(ct);

	}

}
