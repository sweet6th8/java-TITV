import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDuGhiText {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("D:\\LTCB_LuyenTap\\Java71\\f1.txt", "UTF-8");
			pw.println("Hiluu, minh la Langggg!");
			pw.print(5.5);
			pw.print(' ');
			pw.print("la so thap phan");
			pw.println();
			
			Student st = new Student("Hoai An", 13);
			pw.println(st);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

}
}