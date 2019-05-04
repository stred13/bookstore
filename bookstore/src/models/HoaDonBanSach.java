package models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jdk.nashorn.internal.ir.annotations.Ignore;


@Entity
@Table
public class HoaDonBanSach {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MaHD;
	
	@Column
	private Date NgayLap;
	
	@ManyToOne(targetEntity = KhachHang.class)
	@JoinColumn(name="khachhang")
	private KhachHang Khachhang;
	
	@ManyToOne
	@JoinColumn(name="nhanvien")
	private NhanVien NhanVien;
	
	@OneToMany(mappedBy="Sach")
	private Set<ChiTietHoaDon> Sachs;

	@Column
	private long TongTien;
	
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


	public NhanVien getNhanVien() {
		return NhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		NhanVien = nhanVien;
	}

	public KhachHang getKhachhang() {
		return Khachhang;
	}

	public void setKhachhang(KhachHang khachhang) {
		Khachhang = khachhang;
	}



	public long getTongTien() {
		return TongTien;
	}

	public void setTongTien(long tongTien) {
		TongTien = tongTien;
	}

	public HoaDonBanSach() {
		super();
	}
	
	
}
