/**
 * 
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author NGUYEN THI LANG
 *
 */
public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

//1.Them sinh vien:
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

//2.In dssv:
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

//3.Kiem tra dssv co rong khong?
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}

//4.Lay ra so luong sinh vien:
	public int soLuongSinhVien() {
		return this.danhSach.size();
	}

//5.Lam rong dssv:
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

//6.Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

//7.Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}

//8.Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
	public void timSinhVienTuTen(String hoVaTen) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(hoVaTen) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}

//9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp. 
	public void sapXepSVGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				// TODO Auto-generated method stub
				if (sv1.getDiemTB() > sv2.getDiemTB()) {
					return -1;

				} else if (sv1.getDiemTB() < sv2.getDiemTB()) {
					return 1;

				} else {
					return 0;
				}
			}
		});
	}
//10. Ghi xuong file
	public void ghiDuLieuXuongFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
		for(SinhVien sinhVien : danhSach) {
			oos.writeObject(sinhVien);
		}
			
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//11. Doc tu file
	public void docDuLieuTuFile(File f) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			SinhVien sv = null;
		while(true) {
			Object obj = ois.readObject();
			if(obj == null) {
				break;
			}if(obj != null) {
				 sv = (SinhVien) obj;
				this.danhSach.add(sv);
			}
		}
			
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



}
