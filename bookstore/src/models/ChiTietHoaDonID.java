package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonID implements Serializable {
	@Column
	private int MaHD;
	
	@Column
	private int MaSach;

	public int getMaHD() {
		return MaHD;
	}

	public void setMaHD(int maHD) {
		MaHD = maHD;
	}

	public int getMaSach() {
		return MaSach;
	}

	public void setMaSach(int maSach) {
		MaSach = maSach;
	}

	public ChiTietHoaDonID() {
		super();
	}
	
}
