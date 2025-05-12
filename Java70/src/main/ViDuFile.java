/**
 * 
 */
package main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuFile {
public static void main(String[] args) {
	File f1 = new File("D:\\LTCB_LuyenTap\\Java70\\f1.txt");
	File f2 = new File("D:\\LTCB_LuyenTap\\Java70\\f2.txt");
	File fxyz = new File("D:\\LTCB_LuyenTap\\Java70\\fxyz.txt");

	//1.Thay doi ten tap tin or thu muc________
	//Sd File de thay doi ten
	//f1.renameTo(f2);
	
	
	//Sd Files de thay doi ten
	/*try {
		Files.move(fxyz.toPath(), f1.toPath(), StandardCopyOption.REPLACE_EXISTING);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	*/
	
	
	//2.Di chuyen file__________________________
	/*File f2_new = new File("D:\\LTCB_LuyenTap\\Java70\\f0\\f2.txt");
	try {
		Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}*/
	
	//3.Copy file________________________________
	/*File f0 = new File("D:\\LTCB_LuyenTap\\Java70\\f0");
	File f0_copy = new File("D:\\LTCB_LuyenTap\\Java70\\f0_copy");
	try {
		Files.copy(f0.toPath(), f0_copy.toPath(),StandardCopyOption.REPLACE_EXISTING);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}*/
	
	
	//CopyAll
	File f_lang = new File("D:\\LTCB_LuyenTap\\Java70\\f_lang");//chi can tao truoc f_lang trong thu muc,
	File f_lang_new  = new File("D:\\LTCB_LuyenTap\\Java70\\f_lang_new"); //sau khi run f_lang_new se tu duoc copy tao ra
	
	ViDuFile.copyAll(f_lang, f_lang_new);
}
public static void copyAll(File f1, File f2) {
	try {
	    Files.copy(f1.toPath(),f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	if(f1.isDirectory()){
	    File[] mangCon = f1.listFiles();
	   for(File file : mangCon) {
		   File file_new = new File(f2.getAbsoluteFile()+"/"+file.getName());
		   copyAll(file, file_new);
	   }
	}
}
}
