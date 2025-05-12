/**
 * 
 */
package main;

import java.io.File;
import java.io.IOException;

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuTaoTapTinVaThuMuc {
	public static void main(String[] args) {
		// Lưu ý:
		// MS Windows: \ => \\ | Ví dụ: "C:\\Thu muc 1\\Thuc muc\\Ten tap tin.xxx";
		// Linux, MacOS: / | Ví dụ: /Thu muc 1/Thuc muc 2 /Ten tap tin.xxx"

		// Kiểm tra thư mục hoặc tập tin có tồn tại hay không?
		File folder1 = new File("D:\\LTCB_LuyenTap\\Java67");
		File folder2 = new File("D:\\LTCB_LuyenTap\\Java68");
		System.out.println("Kiem tre folder1 co ton tai hay ko: " + folder1.exists());
		System.out.println("Kiem tre folder1 co ton tai hay ko: " + folder2.exists());

		// Tao thu muc:
		// Phuong thuc mkdir() -> Tao 1 thu muc
		File d1 = new File("D:\\LTCB_LuyenTap\\Java67\\Directory_1");
		d1.mkdir();

		// Phuong thuc mkdir() -> Tao 1 thu muc
		File d2 = new File("D:\\LTCB_LuyenTap\\Java67\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
		d2.mkdirs();
		
		//Tao tap tin( co phan mo rong: .exe, .txt, .doc, .xls,...)
		File file1 = new File("D:\\LTCB_LuyenTap\\Java67\\Directory_1\\ViDu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// Khong co quyen tao tap tin
			// O cung bi day
			// Duong dan sai
			e.printStackTrace();
		}
	}
}
