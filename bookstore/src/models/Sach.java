package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Entity
@Table(name = "sach")
public class Sach {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaSach")
	private int masach;

	@Column(name = "TenSach")
	private String tensach;

	@Column(name = "TacGia")
	private String tacgia;

	@Column(name = "GiaBan")
	private long giaban;
	
	@Column(name="mota")
	private String mota;

	@ManyToOne
	@JoinColumn(name = "TheLoai", nullable = false)
	private TheLoai TLSach;

	@OneToMany(mappedBy = "sach", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<ChiTietPhieuNhap> ctpn = new HashSet<>();

	@OneToMany(mappedBy = "sach", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<ChiTietHoaDon> cthd = new HashSet<>();

	public int getMasach() {
		return masach;
	}

	public void setMasach(int masach) {
		this.masach = masach;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public long getGiaban() {
		return giaban;
	}
	
	

	public void setGiaban(long giaban) {
		this.giaban = giaban;
	}
	
	

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public TheLoai getTLSach() {
		return TLSach;
	}

	public void setTLSach(TheLoai tLSach) {
		TLSach = tLSach;
	}

	public Set<ChiTietPhieuNhap> getCtpn() {
		return ctpn;
	}

	public void setCtpn(Set<ChiTietPhieuNhap> ctpn) {
		this.ctpn = ctpn;
	}

	public Set<ChiTietHoaDon> getCthd() {
		return cthd;
	}

	public void setCthd(Set<ChiTietHoaDon> cthd) {
		this.cthd = cthd;
	}

	

	public Sach(String tensach, String tacgia, long giaban, String mota, TheLoai tLSach) {
		super();
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.giaban = giaban;
		this.mota = mota;
		TLSach = tLSach;
	}

	public Sach() {

	}

}
