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
public class hoadonbansach {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MaHD;
	
	@Column
	Date NgayLap;

	public int getMaHD() {
		return MaHD;
	}

	public void setMaHD(int maHD) {
		MaHD = maHD;
	}

	public Date getNgayLap() {
		return NgayLap;
	}

	public void setNgayLap(Date ngayLap) {
		NgayLap = ngayLap;
	}


	public hoadonbansach(int maHD, Date ngayLap) {
		super();
		MaHD = maHD;
		NgayLap = ngayLap;
	}


	public hoadonbansach(Date ngayLap) {
		super();
		NgayLap = ngayLap;
	}

	public hoadonbansach() {
		super();
	}
	
	
}
