package model;

public class FindModel {
	private String vanBan;
	private String tuKhoa;
	private String ketQua;

	public FindModel() {
		this.vanBan = "";
		this.tuKhoa = "";
		this.ketQua = "";

	}

	public String getVanBan() {
		return vanBan;
	}

	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

	public String getKetQua() {
		return ketQua;

	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}

	public void find() {
		int dem = 0;
		int viTri = 0;
		while (true) {
			int i = this.vanBan.indexOf(this.tuKhoa, viTri);
			if (i == -1) {
				// khong tim thay
				break;
			} else {
				dem++;
				viTri = i + 1;
			}
		}
		this.ketQua = "Ket qua co " + dem +" tu "+ this.tuKhoa;
		System.out.println(ketQua);
	}
}
