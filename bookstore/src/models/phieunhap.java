package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Entity
@Table
public class phieunhap {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MaPN;
	
	@Column
	Date NgayNhap;

	public phieunhap(int maPN, Date ngayNhap) {
		super();
		MaPN = maPN;
		NgayNhap = ngayNhap;
	}


	public phieunhap(Date ngayNhap) {
		super();
		NgayNhap = ngayNhap;
	}

	public phieunhap() {
		super();
	}
	
	public int getMaPN() {
		return MaPN;
	}

	public void setMaPN(int maPN) {
		MaPN = maPN;
	}

	public Date getNgayNhap() {
		return NgayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		NgayNhap = ngayNhap;
	}
	
	
	
}
