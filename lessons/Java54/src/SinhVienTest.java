import junit.framework.TestCase;

/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 *
 */
public class SinhVienTest extends TestCase {
	public static void main(String[] args) {
		SinhVien s1 = new SinhVien(100, "Lang", "DH22DTA", 9.0);
		SinhVien s2 = new SinhVien(150, "Nguyen Hoai Lang", "DH22DTB", 8.0);
		SinhVien s3 = new SinhVien(50, "    Chi Phong   ", "DH22DTC", 7.0);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1.compareTo1(s2));
		System.out.println(s1.compareTo1(s3));
	}

}
