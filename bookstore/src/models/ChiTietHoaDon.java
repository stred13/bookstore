package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table
public class ChiTietHoaDon implements Serializable{
	
	@EmbeddedId
	private ChiTietHoaDonID cthdId;
	
	@ManyToOne
	@MapsId("MaHD")
	private HoaDonBanSach HoaDon;
	
	@ManyToOne
	@MapsId("MaSach")
	private Sach Sach;
	
	@Column
	private int SoLuong;
	
	@Column
	private long DonGia;

	public ChiTietHoaDonID getCthdId() {
		return cthdId;
	}

	public void setCthdId(ChiTietHoaDonID cthdId) {
		this.cthdId = cthdId;
	}

	public HoaDonBanSach getHoaDon() {
		return HoaDon;
	}

	public void setHoaDon(HoaDonBanSach hoaDon) {
		HoaDon = hoaDon;
	}

	public Sach getSach() {
		return Sach;
	}

	public void setSach(Sach Sach) {
		Sach = Sach;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public long getDonGia() {
		return DonGia;
	}

	public void setDonGia(long donGia) {
		DonGia = donGia;
	}

	public ChiTietHoaDon() {
		super();
	}

}
