/**
 * 
 */
package main;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author NGUYEN THI LANG
 *
 */
public class SinhVien implements Comparable<SinhVien>, Serializable{//Serializable: de ghi Dl xun taptin
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private double diemTB;

	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, double diemTB) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}

	public SinhVien(String maSinhVien) {
		// TODO Auto-generated constructor stub
		this.maSinhVien=maSinhVien;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTB="
				+ diemTB + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemTB, hoVaTen, maSinhVien, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien);
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

}
