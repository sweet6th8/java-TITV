/**
 * 
 */
package main;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuPriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();

		
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Nguyen Van C");
		danhSachSV.offer("Nguyen Van D");
		danhSachSV.offer("Nguyen Van 1");
		danhSachSV.offer("Nguyen Van A");
		
		while(true) {
			String ten = danhSachSV.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}

	}
}
