package models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "chitiethoadon")
public class ChiTietHoaDon implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaCTHD")
	private int macthd;

	@ManyToOne
	@JoinColumn(name = "MaSach")
	private Sach sach;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "MaHD")
	private HoaDonBanSach hoadon;

	@Column(name = "SoLuong")
	private int soluong;

	@Column(name = "DonGia")
	private long dongia;

	public int getMacthd() {
		return macthd;
	}

	public void setMacthd(int macthd) {
		this.macthd = macthd;
	}

	public Sach getSach() {
		return sach;
	}

	public void setSach(Sach sach) {
		this.sach = sach;
	}

	public HoaDonBanSach getHoadon() {
		return hoadon;
	}

	public void setHoadon(HoaDonBanSach hoadon) {
		this.hoadon = hoadon;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public long getDongia() {
		return dongia;
	}

	public void setDongia(long dongia) {
		this.dongia = dongia;
	}

	public ChiTietHoaDon() {
		super();
	}

}
