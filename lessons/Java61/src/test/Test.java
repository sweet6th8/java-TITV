/**
 * 
 */
package test;

import java.io.File;
import java.util.Scanner;
import main.DanhSachSinhVien;
import main.SinhVien;

/**
 * @author NGUYEN THI LANG
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("--------MENU--------");
			System.out.println("Vui long chon chuc nang:");
			System.out.println(
					  "1.	Thêm sinh viên vào danh sách.\n" 
			        + "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n" 
					+ "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
					+ "10.  Luu danh sach sinh vien xuonng tap tin.\n"
					+ "11.  Đọc sách sinh viên từ tập tin.\n"
					+ "0.   Thoát khỏi chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1) {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				System.out.println("Nhap ho va ten: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhap nam sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Nhap diem trung binh: ");
				double diemTB = sc.nextDouble();

				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTB);
				dssv.themSinhVien(sv);

			} else if (luaChon == 2) {
				dssv.inDanhSachSinhVien();

			} else if (luaChon == 3) {
				System.out.println("Kiem tra danh sach rong:" + dssv.kiemTraDanhSachRong());

			} else if (luaChon == 4) {
				System.out.println("So luong sinh vien: " + dssv.soLuongSinhVien());

			} else if (luaChon == 5) {
				dssv.lamRongDanhSach();

			} else if (luaChon == 6) {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Kiem tra sv co trong danh sach: " + dssv.kiemTraTonTai(sv));
			} else if (luaChon == 7) {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Xoa sv ra khoi danh sach: " + dssv.xoaSinhVien(sv));
			} else if (luaChon == 8) {
				System.out.println("Nhap vao ho va ten: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Ket qua tim kiem: ");
				dssv.timSinhVienTuTen(hoVaTen);
			} else if (luaChon == 9) {
				dssv.sapXepSVGiamDanTheoDiem();
				dssv.inDanhSachSinhVien();
			} else if (luaChon == 10) {
				System.out.println("Nhap ten file: ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				dssv.ghiDuLieuXuongFile(f);
			} else if (luaChon == 11) {
				System.out.println("Nhap ten file: ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				dssv.docDuLieuTuFile(f);
			}

		} while (luaChon != 0);
	}

}