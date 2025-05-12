/**
 * 
 */
package main;

/**
 * @author NGUYEN THI LANG
 *
 */
public class Test {
public static void main(String[] args) {
	Box b1 = new Box<Integer>(15);
	System.out.println("Gia tri la: " + b1.getValue());
	Box b2 = new Box<String>("Lang");
	System.out.println("Gia tri la: " + b2.getValue());
	Box b3 = new Box<Double>(15.3);
	System.out.println("Gia tri la: " + b3.getValue());
}
}
