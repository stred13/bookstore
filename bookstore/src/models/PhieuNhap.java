package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Converts;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Entity
@Table(name="phieunhap")
public class PhieuNhap{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MaPN")
	int mapn;
	
	@Column(name="NgayNhap")
	@Temporal(TemporalType.TIMESTAMP)
	Date ngaynhap;
	
	@OneToMany(mappedBy = "phieunhap",cascade = CascadeType.ALL)
	private Set<ChiTietPhieuNhap> ctpn = new HashSet<>();

	public PhieuNhap(Date ngayNhap) {
		super();
		this.ngaynhap = ngayNhap;
	}
	
	public PhieuNhap() {
		
	}

	public int getMapn() {
		return mapn;
	}

	public void setMapn(int mapn) {
		this.mapn = mapn;
	}

	public Date getNgaynhap() {
		return ngaynhap;
	}

	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	public Set<ChiTietPhieuNhap> getCtpn() {
		return ctpn;
	}

	public void setCtpn(Set<ChiTietPhieuNhap> ctpn) {
		this.ctpn = ctpn;
	}
	
	
	
	
}
