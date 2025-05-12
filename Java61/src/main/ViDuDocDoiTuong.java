/**
 * 
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuDocDoiTuong {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\LTCB_LuyenTap\\Java74\\file.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);

			SinhVien sv = (SinhVien) ois.readObject();
			System.out.println(sv);

			ois.close();// dong lai
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
