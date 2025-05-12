package view;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();

		// gan ten
		jf.setTitle("Lang ne hheehhe");

		// gan kich co
		jf.setSize(500, 300);

		// gan vi tri hien thi
		jf.setLocation(400, 400);

		/*
		 * while(true) { System.out.println("Chuong trinh dang chay"); }
		 */

		// thoat ra khoi chuong trinh khi dong cua so JFrame
		// neu khong chuong trinh se chay mai khong dung
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Cho phep hien thi
		jf.setVisible(true);// true de hien ra, false khong hien, de dong nay o cuoi

	}

}
