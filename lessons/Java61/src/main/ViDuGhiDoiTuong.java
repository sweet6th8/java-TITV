/**
 * 
 */
package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuGhiDoiTuong {
public static void main(String[] args) {
	try {
		File file = new File("D:\\LTCB_LuyenTap\\Java73\\file.data");
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		SinhVien sv = new SinhVien("01", "Lang", 2004, 9.9);
		oos.writeObject(sv);
		
		oos.flush();//day du lieu di
		oos.close();//dong lai
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
