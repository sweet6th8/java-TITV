
public class ViDu {
/*
 * Phuong thuc chuyen doi lop String:
 *  concat(), replace(), toLowerCase(), toUpperCase(),
 *  trim(), toCharArray(), substring()
 * 
 */
	public static void main(String[] args) {
		String s1 = "Sweet";
		String s2 = "6th8";
		String s3 = s1 + s2;
		System.out.println("s3 la: " +s3);	
		//Ham concat(): noi 2 string lai
		System.out.println("s4 la: " + s1.concat(s2));
		
		//Ham replace: chuyen doi
		System.out.println(s3.replace(s2, "_6th8_"));
		
		//Ham trim: xoa bo khoang trang du thua(o dau va o cuoi, khong xoa o giua)
		String a1 = "  Nguyen Thi Lang    ";
		System.out.println(a1.trim());
		
		//Ham toLowerCase: dua tat ca ve chu thuong
		//Ham toUpperCase: dua tat ca ve chu Hoa
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		//Ham substring:  cat chuoi con
		String s5 = "Nguyen Thi Lang";
		String s6 = s5.substring(7);
		System.out.println("s6 la: "  +s6);
		String s7 = s5.substring(7, 10);//chi lay den vi tri thu9
		System.out.println("s7 la: "  +s7); 
	}
}
