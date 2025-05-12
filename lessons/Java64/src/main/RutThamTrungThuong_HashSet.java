package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong = new HashSet<String>();
	// TreeSet: sap xep ma du thuong theo trat tu nhat dinh

	public RutThamTrungThuong_HashSet() {
	}

	public boolean themMaSo(String giaTri) {
		return thungPhieuDuThuong.add(giaTri);
	}

	public boolean xoaMaSo(String giaTri) {
		return thungPhieuDuThuong.remove(giaTri);
	}

	public boolean kiemTraTonTai(String giaTri) {
		return thungPhieuDuThuong.contains(giaTri);
	}

	public void xoaTatCa() {
		thungPhieuDuThuong.clear();
	}

	public int soLuongPhieu() {
		return thungPhieuDuThuong.size();
	}

	public String rutMotPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(thungPhieuDuThuong.size());
		ketQua = (String) thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}

	public void inTatCaPhieu() {
		System.out.println(Arrays.toString(thungPhieuDuThuong.toArray()));
	}

	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();

		do {
			System.out.println("--------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("0. Thoát khỏi chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();

			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhap vao ma du thuong:");
				String giaTri = sc.nextLine();
				if (luaChon == 1) {
					rt.themMaSo(giaTri);
				} else if (luaChon == 2) {
					rt.xoaMaSo(giaTri);
				} else if (luaChon == 3) {

					System.out.println("Kiem tra phieu co ton tai:" + rt.kiemTraTonTai(giaTri));
				}

			} else if (luaChon == 4) {
				rt.xoaTatCa();
			} else if (luaChon == 5) {
				System.out.println("So luong phieu du thuong la: " + rt.soLuongPhieu());
			} else if (luaChon == 6) {
				System.out.println("Ma so trung thuong la: " + rt.rutMotPhieu());
			} else if (luaChon == 7) {
				rt.inTatCaPhieu();

			}

		} while (luaChon != 0);

	}
}
