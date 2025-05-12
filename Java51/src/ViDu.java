/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 * Phương thức lập chỉ mục lớp String
 * indexOf(), lastIndexOf()
 */
public class ViDu {
   public static void main(String[] args) {
	String s1 = "Nguyen Thi Lang, nguyen, Nguyen Hoai An";
	String s2 = "Nguyen";
	String s3 = "Nguyen An";
	//Ham indexOf(): tim vi tri xuat hien dau tien
	//(neu kq<0 thi chuoi khong chứa)
	System.out.println("Vi tri cua s2 trong s1 la: "+s1.indexOf(s2));//0
	System.out.println("Vi tri cua s3 trong s1 la: "+s1.indexOf(s3));//-1
	
	//Sd vi tri bat dau:
	System.out.println("Vi tri cua s2 trong s1 la: "+s1.indexOf(s2, 10));
	
	
	//Ham lastIndexOf(): giong indexOf nhung tim tu phai sang trai
	System.out.println("Vi tri cua s2 trong s1 la: "+s1.lastIndexOf(s2));
}
}
