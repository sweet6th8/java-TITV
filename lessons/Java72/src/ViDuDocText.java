import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuDocText {
public static void main(String[] args) {
	/* Cach 1:
	File f1 = new File("D:\\LTCB_LuyenTap\\Java71\\f1.txt");
	try {
		BufferedReader br = Files.newBufferedReader(f1.toPath(), StandardCharsets.UTF_8);
		String line = null;
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}else 
				System.out.println(line);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	*/
	
	//Cach 2:
	File f2 = new File("D:\\LTCB_LuyenTap\\Java71\\f1.txt");
	try {
		List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
		for(String line : allText) {
		System.out.println(line);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
