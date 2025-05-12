import java.util.Scanner;

/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 * Phương pháp kiểm tra lớp String:
 * length(), charAt(), getChars(), getBytes(), hashCode()
 */
public class ViDu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String s;
    System.out.println("Nhap vao chuoi");
    s = sc.nextLine();
    
    //Ham length() : lay do dai chuoi 
    System.out.println(s.length());
    
    //Ham charAt(vi tri): lay ra 1 ki tu tai vi tri
    int Dodai = s.length();
    for(int i=0; i<Dodai; i++) {
    	System.out.println("Vi tri thu "+i+" la:"+s.charAt(i));
    }
    		
    //Ham getChars(vi tri bat dau, vitri ket thuc, mang luu du lieu, vi tri bat dau luu du lieu cua mang)
    char []arrayChar = new char[100];
    s.getChars(3, 6, arrayChar, 2);
    for( int i=0; i<arrayChar.length;i++) {
    	System.out.println("Gia tri tai vi tri "+i+" la:"+arrayChar[i]);
    }
    
    //Ham getBytes: co 3 cach, lay ra gia tri cua cac ki tu thanh 1 mang
    byte [] arrayBytes = s.getBytes();
    for(byte b : arrayBytes) {
    System.out.println(b);
}
}
}