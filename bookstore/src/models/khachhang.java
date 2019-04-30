package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class khachhang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MaKH;
	
	@Column
	String TenKH;
	
	@Column
	String DiaChi;
	
	@Column
	String SDT;
	
	@Column
	String Email;

	public int getMaKH() {
		return MaKH;
	}

	public void setMaKH(int maKH) {
		MaKH = maKH;
	}

	public String getTenKH() {
		return TenKH;
	}

	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public khachhang(int maKH, String tenKH, String diaChi, String sDT, String email) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		DiaChi = diaChi;
		SDT = sDT;
		Email = email;
	}

	public khachhang(String tenKH, String diaChi, String sDT, String email) {
		super();
		TenKH = tenKH;
		DiaChi = diaChi;
		SDT = sDT;
		Email = email;
	}

	public khachhang() {
		super();
	}
	
	
}
