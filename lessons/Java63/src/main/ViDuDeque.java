/**
 * 
 */
package main;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuDeque {
	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		
		 danhSachSV.offer("Nguyen Van C");
		 danhSachSV.offerLast("Nguyen Van B");
		 danhSachSV.offer("Nguyen Van A");
		 danhSachSV.offerFirst("Nguyen Van D");
		 
		 //=> D-C-A-B
		 
		 while(true) {
			 String ten = danhSachSV.poll();
			 if(ten == null) {
				 break;
			 }
			 System.out.println(ten);
		 }
	}
}
