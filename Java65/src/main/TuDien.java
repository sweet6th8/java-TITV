/**
 * 
 */
package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author NGUYEN THI LANG
 *
 */
public class TuDien {
private Map<String, String> duLieu = new TreeMap<String, String>();//co the dung HashMap(nhung khong sap xep theo trat tu

public String themTu(String tuKhoa, String yNghia) {
	return this.duLieu.put(tuKhoa, yNghia);
}

public String xoaTu(String tuKhoa) {
	return this.duLieu.remove(tuKhoa);
}

public String traTu(String tuKhoa) {
	 String yNghia = this.duLieu.get(tuKhoa); 
	 return yNghia;
}

public void inDanhSach() {
	Set tapHopTuKhoa = this.duLieu.keySet();
	System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
}

public int soLuong() {
	return this.duLieu.size();
}

public void xoaTatCa() {
	 this.duLieu.clear();
}
public static void main(String[] args) {
	TuDien td = new TuDien();
	int luaChon = 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("--------------------------");
		System.out.println("MENU");
		System.out.println("Tra từ điển Anh - Việt:\n"
				+ "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
				+ "2. Xóa từ\n"
				+ "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
				+ "4. In ra danh sách từ khóa\n"
				+ "5. Lấy số lượng từ\n"
				+ "6. Xóa tất cả các từ khóa\n"
				+ "0. Thoát khỏi chương trình\n");
		luaChon = sc.nextInt();
		sc.nextLine();
		 if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
			 System.out.println("Nhap vao tu khoa: ");
			 String tuKhoa = sc.nextLine();
			 
			 if(luaChon == 1) {
				 System.out.println("Nhap vao y nghia: ");
				 String yNghia = sc.nextLine();
				 td.themTu(tuKhoa, yNghia);
			 }else if(luaChon == 2) {
				 td.xoaTu(tuKhoa);
			 }else {
				 System.out.println("Y nghia la: "+td.traTu(tuKhoa));
			 }
			 
		 }else if(luaChon == 4) {
			 td.inDanhSach();
		 }else if(luaChon == 5) {
			System.out.println("So luong tu la: " +  td.soLuong());
		 }else if(luaChon == 6) {
			 td.xoaTatCa();
		 }
		 
	
	}while(luaChon !=0 );

	
}

}
