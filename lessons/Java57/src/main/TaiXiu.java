/**
 * 
 */
package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000;
		Scanner sc = new Scanner(System.in);

		Locale lc = new Locale("en", "US");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

		int luaChon = 0;
		do {
			System.out.println("-------------Mời bạn lựa chọn-------------");
			System.out.println("Nhấn (1) để bắt đầu chơi");
			System.out.println("Nhấn phím bất kì để thoát");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				System.out.println("--------Bắt đầu chơi---------");

				// đặt cược:
				System.out.println(
						"Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi) + ", bạn muốn đặt cược bao nhiêu?");
				double datCuoc = 0;
				do {
					System.out.println("******Đặt cược (0 < số tiền cược < " + numf.format(taiKhoanNguoiChoi) + "): ");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

				// chọn tài xỉu:
				int luaChonTaiXiu = 0;
				do {
					System.out.println("********* Chọn (1) -> Tài hoặc chọn (2) -> Xỉu **********");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

				// Tung xúc xắc:
				Random xucXac = new Random();
				int giaTri1 = xucXac.nextInt(6) + 1;
				int giaTri2 = xucXac.nextInt(6) + 1;
				int giaTri3 = xucXac.nextInt(6) + 1;

				// Tính Tổng:
				System.out.println("********** Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
				int Tong = giaTri1 + giaTri2 + giaTri3;

				if (Tong == 3 || Tong == 18) {
					System.out.println("********* Tổng là:" + Tong + "-----> Nhà cái ăn hết, bạn đã thua heheh:)");
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("Tài khoản hiện tại của bạn là: " + numf.format(taiKhoanNguoiChoi));

				} else if (Tong >= 4 && Tong <= 10) {
					System.out.println("********* Tổng là:" + Tong + "-----> Xỉu");
					if (luaChonTaiXiu == 2) {
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("********* Bạn đã thắng cược **********");
						System.out.println("Tài khoản hiện tại của bạn là: " + numf.format(taiKhoanNguoiChoi));
					} else {
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("********* Bạn đã thua cược **********");
						System.out.println("Tài khoản hiện tại của bạn là: " + numf.format(taiKhoanNguoiChoi));
					}
				} else {
					System.out.println("********* Tổng là:" + Tong + "-----> Tài");
					if (luaChonTaiXiu == 1) {
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("********* Bạn đã thắng cược **********");
						System.out.println("Tài khoản hiện tại của bạn là: " + numf.format(taiKhoanNguoiChoi));
					} else {
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("********* Bạn đã thua cược **********");
						System.out.println("Tài khoản hiện tại của bạn là: " + numf.format(taiKhoanNguoiChoi));
					}

				}

			}

		} while (luaChon == 1);
	}
}
