/**
 * 
 */
package main;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuXoaFile {
	public static void xoaFile(File fx) {
		if (fx.isFile()) {
			// Xoa neu la tap tin
			System.out.println("Da xoa file:" + fx.getAbsolutePath());
			fx.delete();
		} else if (fx.isDirectory()) {
			// Lay cac file con
			File[] mangCon = fx.listFiles();
			for (File f : mangCon) {
				// xoa cac file con
				xoaFile(f);
			}
			// xoa thu muc lon sau khi da xoa cac file con
			System.out.println("Da xoa file:" + fx.getAbsolutePath());
			fx.delete();

		}

	}

	public static void main(String[] args) {
		File f0 = new File("D:\\LTCB_LuyenTap\\Java69\\f0");
		File f0_1 = new File("D:\\LTCB_LuyenTap\\Java69\\f0_1");
		File f_vidu = new File("D:\\LTCB_LuyenTap\\Java69\\vd.txt");

		// deleteOnExit: xoa ma khong can kiem tra file co ton tai hay khong
		// delete: co kiem tra ton tai

		/*
		 * f0.deleteOnExit(); // khong xoa duoc vi f0 co chua thu muc con
		 * f0_1.deleteOnExit(); f_vidu.deleteOnExit();
		 * System.out.println(f0_1.delete()); // neu co ton tai->true, nguoc lai ->false
		 * 
		 * ViDuXoaFile.xoaFile(f0);
		 */

		// Sd class Files xoa tap tin va thu muc:
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_vidu = f_vidu.toPath();
		try {
			// Files.deleteIfExists(p0); // khong xoa duoc vi f0 co chua thu muc con
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_vidu);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
