package models;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "hoadonbansach")
public class HoaDonBanSach implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaHD")
	private int mahd;

	@Column(name = "NgayLap")
	private Date ngaylap;

	@ManyToOne
	@JoinColumn(name = "MaNhanVien")
	private NhanVien nhanvien;
	
	@OneToMany(mappedBy = "hoadon",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<ChiTietHoaDon> cthd = new HashSet<>();

	public int getMahd() {
		return mahd;
	}

	public void setMahd(int mahd) {
		this.mahd = mahd;
	}

	public Date getNgaylap() {
		return ngaylap;
	}

	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}


	public Set<ChiTietHoaDon> getCthd() {
		return cthd;
	}

	public void setCthd(Set<ChiTietHoaDon> cthd) {
		this.cthd = cthd;
	}

	public NhanVien getNhanvien() {
		return nhanvien;
	}

	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}

	public HoaDonBanSach() {
		super();
	}

}
