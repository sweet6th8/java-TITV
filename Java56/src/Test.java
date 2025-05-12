import java.util.Arrays;

/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 * Cach phan tach chuoi thanh mang
 */
public class Test {
public static void main(String[] args) {
	String s = "Xin chao, minh la Lang, heheh!";
	String[] a = s.split("");
	System.out.println(Arrays.toString(a));
	
	String[] b = s.split(",");
	System.out.println(Arrays.toString(b));
	
	String s1 = "Hellu, tui la Khoai hehhe. Paipai:))";
	String[] c = s1.split("\\,|\\.");
	System.out.println(Arrays.toString(c));
	
	String s2 = "Nguyen Thi Lang";
	String[] d = s2.split(" ");
	System.out.println(Arrays.toString(d));
	System.out.println("Ten: "+d[d.length-1]);
	System.out.println("Ho: "+d[0]);
}
}
