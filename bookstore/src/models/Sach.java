package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name="sach")
public class Sach{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MaSach")
	private int masach;
	
	@Column(name="TenSach")
	private String tensach;
	
	@Column(name="TacGia")
	private String tacgia;
	
	@ManyToOne
	@JoinColumn(name="TheLoai",nullable=false)
	private TheLoai TLSach;
	
	@OneToMany(mappedBy="sach",cascade = CascadeType.ALL)
	private Set<ChiTietPhieuNhap> ctpn = new HashSet<>();
	
	@OneToMany(mappedBy="HoaDon")
	private Set<ChiTietHoaDon> HoaDons = new HashSet<>();

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

	public Set<ChiTietHoaDon> getHoaDons() {
		return HoaDons;
	}

	public void setHoaDons(Set<ChiTietHoaDon> hoaDons) {
		HoaDons = hoaDons;
	}

	public Sach(String tensach, String tacgia, TheLoai tLSach) {
		super();
		this.tensach = tensach;
		this.tacgia = tacgia;
		TLSach = tLSach;
	}

	public Sach() {
		
	}
	
}
