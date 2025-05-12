/**
 * 
 */
package main;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuQueue {
public static void main(String[] args) {
	Queue<String> danhSachSV = new LinkedList<String>();
	 danhSachSV.offer("Nguyen Van A");
	 danhSachSV.offer("Nguyen Van B");
	 danhSachSV.offer("Nguyen Van C");
	 danhSachSV.offer("Nguyen Van D");
	 
	 while(true) {
		String ten = danhSachSV.poll();
		if(ten==null) {
			break;
		}
		System.out.println(ten);
	 }
	
}
}
