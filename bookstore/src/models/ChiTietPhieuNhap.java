package models;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="chitietphieunhap")
public class ChiTietPhieuNhap {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MaCTNH")
	private int mactpn;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MaSach")
	private Sach sach;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MaPN")
	private PhieuNhap phieunhap;
	
	@Column(name = "DonGia")
	private long dongia;
	
	@Column(name = "SoLuong")
	private int soluong;

	public int getMactpn() {
		return mactpn;
	}

	public void setMactpn(int mactpn) {
		this.mactpn = mactpn;
	}

	public Sach getSach() {
		return sach;
	}

	public void setSach(Sach sach) {
		this.sach = sach;
	}

	public PhieuNhap getPhieunhap() {
		return phieunhap;
	}

	public void setPhieunhap(PhieuNhap phieunhap) {
		this.phieunhap = phieunhap;
	}

	public long getDongia() {
		return dongia;
	}

	public void setDongia(long dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public ChiTietPhieuNhap() {
		super();
	}
}
