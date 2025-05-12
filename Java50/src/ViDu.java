/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 * Phương pháp so sánh lớp String:
 * equals(), equalsIgnoreCase(), compareTo(), compareToIgnoreCase(),
 * regionMatches(),startsWith(), endWith()
 */
public class ViDu {
public static void main(String[] args) {
	String s1 = "LANG";
	String s2 = "Lang";
	String s3 = "Lang";
	//Ham equals: so sánh 2 chuỗi giống nhau, co phan biet viet Hoa viet thuong
	System.out.println("s1 so sanh s2: "+s1.equals(s2));
	System.out.println("s2 so sanh s3: "+s2.equals(s3));
	
	//Ham equalsIgnoreCase(): khong phan biet 
	System.out.println("s1 so sanh s2: "+s1.equalsIgnoreCase(s2)); //=>true
	
	
	String a1 = "Nguyen Thi A";
	String a2 = "Nguyen Thi B";
	String a3 = "Nguyen Thi ";
	String a4 = "Nguyen Thi A";
	String a5 = "Nguyen Thi a";
	//Ham compareTo(): so sanh > < =  (dung de sap xep...)
	System.out.println("a1 so sanh a2: " + a1.compareTo(a2));//-1
	System.out.println("a1 so sanh a2: " + a1.compareTo(a3));//1
	System.out.println("a1 so sanh a2: " + a1.compareTo(a4));//0
	//Ham compareToIgnoreCase()
	System.out.println("a1 so sanh a2: " + a1.compareToIgnoreCase(a5));//0
	
	
	//Ham regionMatches(): so sanh 1 doan
	String b1 = "Thi.Lang";
	String b2 = ".Lan";
	System.out.println("b1 so sanh b2: " + b1.regionMatches(3, b2, 0, 4));//true
	
	
	//Ham startsWith(): kiem tra chuoi bat dau bang...
	String sdt = "0582969652";
    System.out.println(sdt.startsWith("058"));//true			
    System.out.println(sdt.startsWith("057"));//false	
    
    
    //Ham endWith(): kiem tra chuoi ket thuc bang...
    String tenFile = "I love u.JPG";
    String tenFile2 = "I love u.PDF";
    if (tenFile.endsWith("JPG")) {
    	 System.out.println("Day la file hinh anh!");
    	 }
    else if (tenFile.endsWith("PDF")) {
    	System.out.println("Day la file PDF!");
    }
} 
}
