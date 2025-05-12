/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 *
 */
public class SinhVien implements Comparable<SinhVien> {
	private int MaSinhVien;
	private String HoVaTen;
	private String TenLop;
	private double DiemTrungBinh;

	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		super();
		MaSinhVien = maSinhVien;
		HoVaTen = hoVaTen;
		TenLop = tenLop;
		DiemTrungBinh = diemTrungBinh;

	}

	public int getMaSinhVien() {
		return MaSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		MaSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return HoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return TenLop;
	}

	public void setTenLop(String tenLop) {
		TenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return DiemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		DiemTrungBinh = diemTrungBinh;
	}
    public String getTen() {
    	String s = this.HoVaTen.trim();
    	if(s.indexOf(" ")>=0) {
    		int vt = s.lastIndexOf(" ");
    		return s.substring(vt+1);
    	}
    		else {
    			return s;
    		}
    	}
    
	@Override
	public int compareTo(SinhVien o) {
		// <0
		// =0 
		// >0
		//So Sanh Ten:
		//Ten: Lang, Nguyen Hoai An,    Chi Phong   , Nguyen Thi Lang
		String tenThis = this.getTen();
		String tenO = o.getTen();
		return tenThis.compareTo(tenO);
		
		
	}
	
	
	//VD:
	//Sap xep theo diem trung binh
	public double compareTo1(SinhVien o) {
		return this.DiemTrungBinh - o.DiemTrungBinh;
}
}